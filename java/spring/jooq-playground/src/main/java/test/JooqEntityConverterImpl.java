package test;

import org.jooq.Record;

/**
 * @author Vorobyev Vyacheslav
 */
public class JooqEntityConverterImpl<E,R extends Record> implements JooqEntityConverter<E,R> {

    @Override
    public R convertToRecord(E entity) {
        return null;
    }

    @Override
    public E convertToEntity(R record) {
        return null;
    }
}
