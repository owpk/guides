package test;

import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.TableImpl;

import java.util.Optional;

/**
 * @author Vorobyev Vyacheslav
 */
public abstract class JooqDomainCrudRepository<L, E, R extends Record>
        implements CrudRepository<L, E>, JooqRepositoryInitializer<R> {

    protected TableImpl<R> table;
    protected JooqCrudRepositoryImpl<L, R> jooqCrudRepository;
    protected JooqEntityConverter<E, R> ec;

    protected void init() {
        this.init(new JooqEntityConverterImpl<>());
    }

    protected void init(JooqEntityConverter<E, R> ec) {
        this.table = jooqCrudRepository.table;
        this.ec = ec;
        jooqCrudRepository = new JooqCrudRepositoryImpl<>() {
            @Override
            public R mapRecordToPojo(Result<R> result) {
                return JooqDomainCrudRepository.this.mapRecordToPojo(result);
            }

            @Override
            public String initIdFieldName() {
                return JooqDomainCrudRepository.this.initIdFieldName();
            }

            @Override
            public TableImpl<R> initTable() {
                return JooqDomainCrudRepository.this.initTable();
            }
        };
    }

    @Override
    public Optional<E> insert(E e) {
        return mapAndReturn(jooqCrudRepository.insert(
                ec.convertToRecord(e)));
    }

    @Override
    public Integer update(E e) {
        return jooqCrudRepository.update(ec.convertToRecord(e));
    }

    @Override
    public Optional<E> get(L id) {
        return mapAndReturn(jooqCrudRepository.get(id));
    }

    @Override
    public Boolean delete(L id) {
        return jooqCrudRepository.delete(id);
    }

    protected Optional<E> mapAndReturn(Optional<R> result) {
        return result.map(r -> ec.convertToEntity(r));
    }
}