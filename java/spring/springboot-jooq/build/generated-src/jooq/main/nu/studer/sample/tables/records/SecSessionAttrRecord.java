/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SecSessionAttr;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SecSessionAttrRecord extends UpdatableRecordImpl<SecSessionAttrRecord> implements Record13<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, String, String, String, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sec_session_attr.id</code>.
     */
    public SecSessionAttrRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sec_session_attr.create_ts</code>.
     */
    public SecSessionAttrRecord setCreateTs(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.sec_session_attr.created_by</code>.
     */
    public SecSessionAttrRecord setCreatedBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sec_session_attr.version</code>.
     */
    public SecSessionAttrRecord setVersion(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.sec_session_attr.update_ts</code>.
     */
    public SecSessionAttrRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.sec_session_attr.updated_by</code>.
     */
    public SecSessionAttrRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.sec_session_attr.delete_ts</code>.
     */
    public SecSessionAttrRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.sec_session_attr.deleted_by</code>.
     */
    public SecSessionAttrRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.sec_session_attr.sys_tenant_id</code>.
     */
    public SecSessionAttrRecord setSysTenantId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.sys_tenant_id</code>.
     */
    public String getSysTenantId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.sec_session_attr.name</code>.
     */
    public SecSessionAttrRecord setName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.name</code>.
     */
    public String getName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.sec_session_attr.str_value</code>.
     */
    public SecSessionAttrRecord setStrValue(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.str_value</code>.
     */
    public String getStrValue() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.sec_session_attr.datatype</code>.
     */
    public SecSessionAttrRecord setDatatype(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.datatype</code>.
     */
    public String getDatatype() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.sec_session_attr.group_id</code>.
     */
    public SecSessionAttrRecord setGroupId(UUID value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_session_attr.group_id</code>.
     */
    public UUID getGroupId() {
        return (UUID) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, String, String, String, UUID> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, String, String, String, UUID> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SecSessionAttr.SEC_SESSION_ATTR.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SecSessionAttr.SEC_SESSION_ATTR.CREATE_TS;
    }

    @Override
    public Field<String> field3() {
        return SecSessionAttr.SEC_SESSION_ATTR.CREATED_BY;
    }

    @Override
    public Field<Integer> field4() {
        return SecSessionAttr.SEC_SESSION_ATTR.VERSION;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SecSessionAttr.SEC_SESSION_ATTR.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SecSessionAttr.SEC_SESSION_ATTR.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SecSessionAttr.SEC_SESSION_ATTR.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SecSessionAttr.SEC_SESSION_ATTR.DELETED_BY;
    }

    @Override
    public Field<String> field9() {
        return SecSessionAttr.SEC_SESSION_ATTR.SYS_TENANT_ID;
    }

    @Override
    public Field<String> field10() {
        return SecSessionAttr.SEC_SESSION_ATTR.NAME;
    }

    @Override
    public Field<String> field11() {
        return SecSessionAttr.SEC_SESSION_ATTR.STR_VALUE;
    }

    @Override
    public Field<String> field12() {
        return SecSessionAttr.SEC_SESSION_ATTR.DATATYPE;
    }

    @Override
    public Field<UUID> field13() {
        return SecSessionAttr.SEC_SESSION_ATTR.GROUP_ID;
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
    public LocalDateTime component5() {
        return getUpdateTs();
    }

    @Override
    public String component6() {
        return getUpdatedBy();
    }

    @Override
    public LocalDateTime component7() {
        return getDeleteTs();
    }

    @Override
    public String component8() {
        return getDeletedBy();
    }

    @Override
    public String component9() {
        return getSysTenantId();
    }

    @Override
    public String component10() {
        return getName();
    }

    @Override
    public String component11() {
        return getStrValue();
    }

    @Override
    public String component12() {
        return getDatatype();
    }

    @Override
    public UUID component13() {
        return getGroupId();
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
    public LocalDateTime value5() {
        return getUpdateTs();
    }

    @Override
    public String value6() {
        return getUpdatedBy();
    }

    @Override
    public LocalDateTime value7() {
        return getDeleteTs();
    }

    @Override
    public String value8() {
        return getDeletedBy();
    }

    @Override
    public String value9() {
        return getSysTenantId();
    }

    @Override
    public String value10() {
        return getName();
    }

    @Override
    public String value11() {
        return getStrValue();
    }

    @Override
    public String value12() {
        return getDatatype();
    }

    @Override
    public UUID value13() {
        return getGroupId();
    }

    @Override
    public SecSessionAttrRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value2(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value4(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value9(String value) {
        setSysTenantId(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value10(String value) {
        setName(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value11(String value) {
        setStrValue(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value12(String value) {
        setDatatype(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord value13(UUID value) {
        setGroupId(value);
        return this;
    }

    @Override
    public SecSessionAttrRecord values(UUID value1, LocalDateTime value2, String value3, Integer value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, String value9, String value10, String value11, String value12, UUID value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SecSessionAttrRecord
     */
    public SecSessionAttrRecord() {
        super(SecSessionAttr.SEC_SESSION_ATTR);
    }

    /**
     * Create a detached, initialised SecSessionAttrRecord
     */
    public SecSessionAttrRecord(UUID id, LocalDateTime createTs, String createdBy, Integer version, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String sysTenantId, String name, String strValue, String datatype, UUID groupId) {
        super(SecSessionAttr.SEC_SESSION_ATTR);

        setId(id);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setVersion(version);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setSysTenantId(sysTenantId);
        setName(name);
        setStrValue(strValue);
        setDatatype(datatype);
        setGroupId(groupId);
    }

    /**
     * Create a detached, initialised SecSessionAttrRecord
     */
    public SecSessionAttrRecord(nu.studer.sample.tables.pojos.SecSessionAttr value) {
        super(SecSessionAttr.SEC_SESSION_ATTR);

        if (value != null) {
            setId(value.getId());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setVersion(value.getVersion());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setSysTenantId(value.getSysTenantId());
            setName(value.getName());
            setStrValue(value.getStrValue());
            setDatatype(value.getDatatype());
            setGroupId(value.getGroupId());
        }
    }
}