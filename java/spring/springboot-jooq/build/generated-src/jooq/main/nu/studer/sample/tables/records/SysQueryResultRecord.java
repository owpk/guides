/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.util.UUID;

import nu.studer.sample.tables.SysQueryResult;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysQueryResultRecord extends UpdatableRecordImpl<SysQueryResultRecord> implements Record7<Long, UUID, Integer, UUID, String, Integer, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sys_query_result.id</code>.
     */
    public SysQueryResultRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_query_result.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.sys_query_result.session_id</code>.
     */
    public SysQueryResultRecord setSessionId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_query_result.session_id</code>.
     */
    public UUID getSessionId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.sys_query_result.query_key</code>.
     */
    public SysQueryResultRecord setQueryKey(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_query_result.query_key</code>.
     */
    public Integer getQueryKey() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.sys_query_result.entity_id</code>.
     */
    public SysQueryResultRecord setEntityId(UUID value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_query_result.entity_id</code>.
     */
    public UUID getEntityId() {
        return (UUID) get(3);
    }

    /**
     * Setter for <code>public.sys_query_result.string_entity_id</code>.
     */
    public SysQueryResultRecord setStringEntityId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_query_result.string_entity_id</code>.
     */
    public String getStringEntityId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.sys_query_result.int_entity_id</code>.
     */
    public SysQueryResultRecord setIntEntityId(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_query_result.int_entity_id</code>.
     */
    public Integer getIntEntityId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.sys_query_result.long_entity_id</code>.
     */
    public SysQueryResultRecord setLongEntityId(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_query_result.long_entity_id</code>.
     */
    public Long getLongEntityId() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, UUID, Integer, UUID, String, Integer, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, UUID, Integer, UUID, String, Integer, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SysQueryResult.SYS_QUERY_RESULT.ID;
    }

    @Override
    public Field<UUID> field2() {
        return SysQueryResult.SYS_QUERY_RESULT.SESSION_ID;
    }

    @Override
    public Field<Integer> field3() {
        return SysQueryResult.SYS_QUERY_RESULT.QUERY_KEY;
    }

    @Override
    public Field<UUID> field4() {
        return SysQueryResult.SYS_QUERY_RESULT.ENTITY_ID;
    }

    @Override
    public Field<String> field5() {
        return SysQueryResult.SYS_QUERY_RESULT.STRING_ENTITY_ID;
    }

    @Override
    public Field<Integer> field6() {
        return SysQueryResult.SYS_QUERY_RESULT.INT_ENTITY_ID;
    }

    @Override
    public Field<Long> field7() {
        return SysQueryResult.SYS_QUERY_RESULT.LONG_ENTITY_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getSessionId();
    }

    @Override
    public Integer component3() {
        return getQueryKey();
    }

    @Override
    public UUID component4() {
        return getEntityId();
    }

    @Override
    public String component5() {
        return getStringEntityId();
    }

    @Override
    public Integer component6() {
        return getIntEntityId();
    }

    @Override
    public Long component7() {
        return getLongEntityId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getSessionId();
    }

    @Override
    public Integer value3() {
        return getQueryKey();
    }

    @Override
    public UUID value4() {
        return getEntityId();
    }

    @Override
    public String value5() {
        return getStringEntityId();
    }

    @Override
    public Integer value6() {
        return getIntEntityId();
    }

    @Override
    public Long value7() {
        return getLongEntityId();
    }

    @Override
    public SysQueryResultRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SysQueryResultRecord value2(UUID value) {
        setSessionId(value);
        return this;
    }

    @Override
    public SysQueryResultRecord value3(Integer value) {
        setQueryKey(value);
        return this;
    }

    @Override
    public SysQueryResultRecord value4(UUID value) {
        setEntityId(value);
        return this;
    }

    @Override
    public SysQueryResultRecord value5(String value) {
        setStringEntityId(value);
        return this;
    }

    @Override
    public SysQueryResultRecord value6(Integer value) {
        setIntEntityId(value);
        return this;
    }

    @Override
    public SysQueryResultRecord value7(Long value) {
        setLongEntityId(value);
        return this;
    }

    @Override
    public SysQueryResultRecord values(Long value1, UUID value2, Integer value3, UUID value4, String value5, Integer value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysQueryResultRecord
     */
    public SysQueryResultRecord() {
        super(SysQueryResult.SYS_QUERY_RESULT);
    }

    /**
     * Create a detached, initialised SysQueryResultRecord
     */
    public SysQueryResultRecord(Long id, UUID sessionId, Integer queryKey, UUID entityId, String stringEntityId, Integer intEntityId, Long longEntityId) {
        super(SysQueryResult.SYS_QUERY_RESULT);

        setId(id);
        setSessionId(sessionId);
        setQueryKey(queryKey);
        setEntityId(entityId);
        setStringEntityId(stringEntityId);
        setIntEntityId(intEntityId);
        setLongEntityId(longEntityId);
    }

    /**
     * Create a detached, initialised SysQueryResultRecord
     */
    public SysQueryResultRecord(nu.studer.sample.tables.pojos.SysQueryResult value) {
        super(SysQueryResult.SYS_QUERY_RESULT);

        if (value != null) {
            setId(value.getId());
            setSessionId(value.getSessionId());
            setQueryKey(value.getQueryKey());
            setEntityId(value.getEntityId());
            setStringEntityId(value.getStringEntityId());
            setIntEntityId(value.getIntEntityId());
            setLongEntityId(value.getLongEntityId());
        }
    }
}