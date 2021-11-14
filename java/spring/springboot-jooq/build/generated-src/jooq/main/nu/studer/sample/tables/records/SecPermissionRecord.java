/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SecPermission;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SecPermissionRecord extends UpdatableRecordImpl<SecPermissionRecord> implements Record12<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, Integer, String, Integer, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sec_permission.id</code>.
     */
    public SecPermissionRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sec_permission.create_ts</code>.
     */
    public SecPermissionRecord setCreateTs(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.sec_permission.created_by</code>.
     */
    public SecPermissionRecord setCreatedBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sec_permission.version</code>.
     */
    public SecPermissionRecord setVersion(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.sec_permission.update_ts</code>.
     */
    public SecPermissionRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.sec_permission.updated_by</code>.
     */
    public SecPermissionRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.sec_permission.delete_ts</code>.
     */
    public SecPermissionRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.sec_permission.deleted_by</code>.
     */
    public SecPermissionRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.sec_permission.permission_type</code>.
     */
    public SecPermissionRecord setPermissionType(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.permission_type</code>.
     */
    public Integer getPermissionType() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.sec_permission.target</code>.
     */
    public SecPermissionRecord setTarget(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.target</code>.
     */
    public String getTarget() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.sec_permission.value_</code>.
     */
    public SecPermissionRecord setValue_(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.value_</code>.
     */
    public Integer getValue_() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.sec_permission.role_id</code>.
     */
    public SecPermissionRecord setRoleId(UUID value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.sec_permission.role_id</code>.
     */
    public UUID getRoleId() {
        return (UUID) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, Integer, String, Integer, UUID> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, Integer, String, Integer, UUID> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SecPermission.SEC_PERMISSION.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SecPermission.SEC_PERMISSION.CREATE_TS;
    }

    @Override
    public Field<String> field3() {
        return SecPermission.SEC_PERMISSION.CREATED_BY;
    }

    @Override
    public Field<Integer> field4() {
        return SecPermission.SEC_PERMISSION.VERSION;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SecPermission.SEC_PERMISSION.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SecPermission.SEC_PERMISSION.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SecPermission.SEC_PERMISSION.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SecPermission.SEC_PERMISSION.DELETED_BY;
    }

    @Override
    public Field<Integer> field9() {
        return SecPermission.SEC_PERMISSION.PERMISSION_TYPE;
    }

    @Override
    public Field<String> field10() {
        return SecPermission.SEC_PERMISSION.TARGET;
    }

    @Override
    public Field<Integer> field11() {
        return SecPermission.SEC_PERMISSION.VALUE_;
    }

    @Override
    public Field<UUID> field12() {
        return SecPermission.SEC_PERMISSION.ROLE_ID;
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
    public Integer component9() {
        return getPermissionType();
    }

    @Override
    public String component10() {
        return getTarget();
    }

    @Override
    public Integer component11() {
        return getValue_();
    }

    @Override
    public UUID component12() {
        return getRoleId();
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
    public Integer value9() {
        return getPermissionType();
    }

    @Override
    public String value10() {
        return getTarget();
    }

    @Override
    public Integer value11() {
        return getValue_();
    }

    @Override
    public UUID value12() {
        return getRoleId();
    }

    @Override
    public SecPermissionRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SecPermissionRecord value2(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SecPermissionRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SecPermissionRecord value4(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SecPermissionRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SecPermissionRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SecPermissionRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SecPermissionRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SecPermissionRecord value9(Integer value) {
        setPermissionType(value);
        return this;
    }

    @Override
    public SecPermissionRecord value10(String value) {
        setTarget(value);
        return this;
    }

    @Override
    public SecPermissionRecord value11(Integer value) {
        setValue_(value);
        return this;
    }

    @Override
    public SecPermissionRecord value12(UUID value) {
        setRoleId(value);
        return this;
    }

    @Override
    public SecPermissionRecord values(UUID value1, LocalDateTime value2, String value3, Integer value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, Integer value9, String value10, Integer value11, UUID value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SecPermissionRecord
     */
    public SecPermissionRecord() {
        super(SecPermission.SEC_PERMISSION);
    }

    /**
     * Create a detached, initialised SecPermissionRecord
     */
    public SecPermissionRecord(UUID id, LocalDateTime createTs, String createdBy, Integer version, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, Integer permissionType, String target, Integer value_, UUID roleId) {
        super(SecPermission.SEC_PERMISSION);

        setId(id);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setVersion(version);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setPermissionType(permissionType);
        setTarget(target);
        setValue_(value_);
        setRoleId(roleId);
    }

    /**
     * Create a detached, initialised SecPermissionRecord
     */
    public SecPermissionRecord(nu.studer.sample.tables.pojos.SecPermission value) {
        super(SecPermission.SEC_PERMISSION);

        if (value != null) {
            setId(value.getId());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setVersion(value.getVersion());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setPermissionType(value.getPermissionType());
            setTarget(value.getTarget());
            setValue_(value.getValue_());
            setRoleId(value.getRoleId());
        }
    }
}
