/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SecRememberMe;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SecRememberMeRecord extends UpdatableRecordImpl<SecRememberMeRecord> implements Record6<UUID, LocalDateTime, String, Integer, UUID, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sec_remember_me.id</code>.
     */
    public SecRememberMeRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_remember_me.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sec_remember_me.create_ts</code>.
     */
    public SecRememberMeRecord setCreateTs(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_remember_me.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.sec_remember_me.created_by</code>.
     */
    public SecRememberMeRecord setCreatedBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_remember_me.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sec_remember_me.version</code>.
     */
    public SecRememberMeRecord setVersion(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_remember_me.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.sec_remember_me.user_id</code>.
     */
    public SecRememberMeRecord setUserId(UUID value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_remember_me.user_id</code>.
     */
    public UUID getUserId() {
        return (UUID) get(4);
    }

    /**
     * Setter for <code>public.sec_remember_me.token</code>.
     */
    public SecRememberMeRecord setToken(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_remember_me.token</code>.
     */
    public String getToken() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, LocalDateTime, String, Integer, UUID, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UUID, LocalDateTime, String, Integer, UUID, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SecRememberMe.SEC_REMEMBER_ME.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SecRememberMe.SEC_REMEMBER_ME.CREATE_TS;
    }

    @Override
    public Field<String> field3() {
        return SecRememberMe.SEC_REMEMBER_ME.CREATED_BY;
    }

    @Override
    public Field<Integer> field4() {
        return SecRememberMe.SEC_REMEMBER_ME.VERSION;
    }

    @Override
    public Field<UUID> field5() {
        return SecRememberMe.SEC_REMEMBER_ME.USER_ID;
    }

    @Override
    public Field<String> field6() {
        return SecRememberMe.SEC_REMEMBER_ME.TOKEN;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreateTs();
    }

    @Override
    public String component3() {
        return getCreatedBy();
    }

    @Override
    public Integer component4() {
        return getVersion();
    }

    @Override
    public UUID component5() {
        return getUserId();
    }

    @Override
    public String component6() {
        return getToken();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreateTs();
    }

    @Override
    public String value3() {
        return getCreatedBy();
    }

    @Override
    public Integer value4() {
        return getVersion();
    }

    @Override
    public UUID value5() {
        return getUserId();
    }

    @Override
    public String value6() {
        return getToken();
    }

    @Override
    public SecRememberMeRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SecRememberMeRecord value2(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SecRememberMeRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SecRememberMeRecord value4(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SecRememberMeRecord value5(UUID value) {
        setUserId(value);
        return this;
    }

    @Override
    public SecRememberMeRecord value6(String value) {
        setToken(value);
        return this;
    }

    @Override
    public SecRememberMeRecord values(UUID value1, LocalDateTime value2, String value3, Integer value4, UUID value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SecRememberMeRecord
     */
    public SecRememberMeRecord() {
        super(SecRememberMe.SEC_REMEMBER_ME);
    }

    /**
     * Create a detached, initialised SecRememberMeRecord
     */
    public SecRememberMeRecord(UUID id, LocalDateTime createTs, String createdBy, Integer version, UUID userId, String token) {
        super(SecRememberMe.SEC_REMEMBER_ME);

        setId(id);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setVersion(version);
        setUserId(userId);
        setToken(token);
    }

    /**
     * Create a detached, initialised SecRememberMeRecord
     */
    public SecRememberMeRecord(nu.studer.sample.tables.pojos.SecRememberMe value) {
        super(SecRememberMe.SEC_REMEMBER_ME);

        if (value != null) {
            setId(value.getId());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setVersion(value.getVersion());
            setUserId(value.getUserId());
            setToken(value.getToken());
        }
    }
}
