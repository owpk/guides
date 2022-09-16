package test;

import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.TableImpl;

/**
 * @author Vorobyev Vyacheslav
 */
public interface JooqRepositoryInitializer<R extends Record> {

    String initIdFieldName();

    TableImpl<R> initTable();

    R mapRecordToPojo(Result<R> result);
}
