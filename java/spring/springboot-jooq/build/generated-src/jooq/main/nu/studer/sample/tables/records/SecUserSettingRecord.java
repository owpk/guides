/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SecUserSetting;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SecUserSettingRecord extends UpdatableRecordImpl<SecUserSettingRecord> implements Record7<UUID, LocalDateTime, String, UUID, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sec_user_setting.id</code>.
     */
    public SecUserSettingRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_user_setting.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sec_user_setting.create_ts</code>.
     */
    public SecUserSettingRecord setCreateTs(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_user_setting.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.sec_user_setting.created_by</code>.
     */
    public SecUserSettingRecord setCreatedBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_user_setting.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sec_user_setting.user_id</code>.
     */
    public SecUserSettingRecord setUserId(UUID value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_user_setting.user_id</code>.
     */
    public UUID getUserId() {
        return (UUID) get(3);
    }

    /**
     * Setter for <code>public.sec_user_setting.client_type</code>.
     */
    public SecUserSettingRecord setClientType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_user_setting.client_type</code>.
     */
    public String getClientType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.sec_user_setting.name</code>.
     */
    public SecUserSettingRecord setName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_user_setting.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.sec_user_setting.value_</code>.
     */
    public SecUserSettingRecord setValue_(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_user_setting.value_</code>.
     */
    public String getValue_() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<UUID, LocalDateTime, String, UUID, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<UUID, LocalDateTime, String, UUID, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SecUserSetting.SEC_USER_SETTING.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SecUserSetting.SEC_USER_SETTING.CREATE_TS;
    }

    @Override
    public Field<String> field3() {
        return SecUserSetting.SEC_USER_SETTING.CREATED_BY;
    }

    @Override
    public Field<UUID> field4() {
        return SecUserSetting.SEC_USER_SETTING.USER_ID;
    }

    @Override
    public Field<String> field5() {
        return SecUserSetting.SEC_USER_SETTING.CLIENT_TYPE;
    }

    @Override
    public Field<String> field6() {
        return SecUserSetting.SEC_USER_SETTING.NAME;
    }

    @Override
    public Field<String> field7() {
        return SecUserSetting.SEC_USER_SETTING.VALUE_;
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
    public UUID component4() {
        return getUserId();
    }

    @Override
    public String component5() {
        return getClientType();
    }

    @Override
    public String component6() {
        return getName();
    }

    @Override
    public String component7() {
        return getValue_();
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
    public UUID value4() {
        return getUserId();
    }

    @Override
    public String value5() {
        return getClientType();
    }

    @Override
    public String value6() {
        return getName();
    }

    @Override
    public String value7() {
        return getValue_();
    }

    @Override
    public SecUserSettingRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SecUserSettingRecord value2(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SecUserSettingRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SecUserSettingRecord value4(UUID value) {
        setUserId(value);
        return this;
    }

    @Override
    public SecUserSettingRecord value5(String value) {
        setClientType(value);
        return this;
    }

    @Override
    public SecUserSettingRecord value6(String value) {
        setName(value);
        return this;
    }

    @Override
    public SecUserSettingRecord value7(String value) {
        setValue_(value);
        return this;
    }

    @Override
    public SecUserSettingRecord values(UUID value1, LocalDateTime value2, String value3, UUID value4, String value5, String value6, String value7) {
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
     * Create a detached SecUserSettingRecord
     */
    public SecUserSettingRecord() {
        super(SecUserSetting.SEC_USER_SETTING);
    }

    /**
     * Create a detached, initialised SecUserSettingRecord
     */
    public SecUserSettingRecord(UUID id, LocalDateTime createTs, String createdBy, UUID userId, String clientType, String name, String value_) {
        super(SecUserSetting.SEC_USER_SETTING);

        setId(id);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUserId(userId);
        setClientType(clientType);
        setName(name);
        setValue_(value_);
    }

    /**
     * Create a detached, initialised SecUserSettingRecord
     */
    public SecUserSettingRecord(nu.studer.sample.tables.pojos.SecUserSetting value) {
        super(SecUserSetting.SEC_USER_SETTING);

        if (value != null) {
            setId(value.getId());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setUserId(value.getUserId());
            setClientType(value.getClientType());
            setName(value.getName());
            setValue_(value.getValue_());
        }
    }
}
