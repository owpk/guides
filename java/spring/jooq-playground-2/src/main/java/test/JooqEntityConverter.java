package test;

import org.jooq.Record;

/**
 * @author Vorobyev Vyacheslav
 */
public interface JooqEntityConverter<E, R extends Record> {
    R convertToRecord(E entity);
    E convertToEntity(R record);
}
