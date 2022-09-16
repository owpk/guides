package test;

import org.jooq.Record;
import org.jooq.SelectJoinStep;
import org.jooq.SelectOnConditionStep;

/**
 * @author Vorobyev Vyacheslav
 */
public interface SelectOnConditionExtractor<R extends Record> {
    SelectOnConditionStep<R> extractJoins(SelectJoinStep<Record> selectStep);
}