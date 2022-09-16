package test;

import lombok.AllArgsConstructor;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Vorobyev Vyacheslav
 */
public abstract class JooqCrudRepositoryImpl<L, R extends Record>
        implements CrudRepository<L, R>, JooqRepositoryInitializer<R> {

    protected DSLContext dsl;
    protected TableImpl<R> table;
    protected String idFieldName;
    protected Map<String, UniqueKey<R>> uniqueKeyList;
    protected Map<String, Field<Object>> uniqueFields;
    protected Field[] uniques;

    protected SelectOnConditionExtractor<R> selectOnConditionExtractor;

    public void setDslContext(DSLContext dslContext) {
        this.dsl = dslContext;
    }

    private void init() {
        uniqueKeyList = new HashMap<>();
        table = initTable();
        idFieldName = initIdFieldName();
        var primaryKey = table.getPrimaryKey();
        if (primaryKey != null)
            uniqueKeyList.put(idFieldName, primaryKey);
        var keys = table.getUniqueKeys();
        uniqueKeyList.putAll(keys.stream()
                .collect(Collectors.toMap(
                        x -> x.getFields()
                                .stream()
                                .map(Field::getName)
                                .collect(Collectors.toList()),
                        x -> x)).entrySet()
                .stream()
                .flatMap(x -> x.getKey().stream().map(i -> new ConstraintEntry<>(i, x.getValue())))
                .collect(Collectors.toMap(x -> x.referenceColumnName, x -> x.uniqueKey)));
        uniqueFields = keys.stream().map(x -> DSL.field(x.getQualifiedName()))
                .collect(Collectors.toMap(Field::getName, x -> x));
        uniques = new Field[uniqueFields.size()];
        var uFields = new ArrayList<>(uniqueFields.values());
        for (int i = 0; i < uFields.size(); i++) {
            uniques[i] = uFields.get(i);
        }
    }

    @Override
    public Optional<R> insert(R t) {
        var insertStep = dsl.insertInto(table)
                .set(t).returningResult();
        var res = insertStep.fetchOne();
        return returnKey(t, res);
    }

    public Optional<R> saveOrUpdate(R t) {
        var insertStep = dsl.insertInto(table)
                .set(t)
                .onConflict(uniques)
                .doUpdate()
                .set(t)
                .returningResult();
        var res = insert(insertStep);
        return returnKey(t, res);
    }

    private Record insert(InsertResultStep<Record> insertStep) {
        return insertStep.fetchOne();
    }

    @SuppressWarnings("unchecked")
    private Optional<R> returnKey(R t, Record record) {
        if (record != null) {
            L val = (L) record.getValue(idFieldName);
            t.set(DSL.field(idFieldName), val);
            return Optional.of(t);
        }
        return Optional.empty();
    }

    @Override
    public Integer update(R t) {
        return dsl.update(table)
                .set(t)
                .execute();
    }

    @Override
    public Optional<R> get(L id) {
        var selectStep = dsl.select()
                .from(table);
        var ex = selectOnConditionExtractor
                .extractJoins(selectStep);
        return ex.where(DSL.field(idFieldName).eq(id))
                .fetch().intoGroups(table)
                .values().stream()
                .map(this::mapRecordToPojo)
                .findFirst();
    }

    @Override
    public Boolean delete(L id) {
        return dsl.delete(table)
                .where(DSL.field(idFieldName).eq(id))
                .execute() == 1;
    }

    public R createRecord() {
        return dsl.newRecord(table);
    }

    @AllArgsConstructor
    private static class ConstraintEntry<R extends Record> {
        private String referenceColumnName;
        private UniqueKey<R> uniqueKey;
    }
}