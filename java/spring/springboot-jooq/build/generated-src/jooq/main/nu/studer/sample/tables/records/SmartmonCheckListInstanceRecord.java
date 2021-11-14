/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartmonCheckListInstance;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartmonCheckListInstanceRecord extends UpdatableRecordImpl<SmartmonCheckListInstanceRecord> implements Record19<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, LocalDateTime, UUID, UUID, String, String, UUID, String, UUID, String, Boolean, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.smartmon_check_list_instance.id</code>.
     */
    public SmartmonCheckListInstanceRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.version</code>.
     */
    public SmartmonCheckListInstanceRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.create_ts</code>.
     */
    public SmartmonCheckListInstanceRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.created_by</code>.
     */
    public SmartmonCheckListInstanceRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.update_ts</code>.
     */
    public SmartmonCheckListInstanceRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.updated_by</code>.
     */
    public SmartmonCheckListInstanceRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.delete_ts</code>.
     */
    public SmartmonCheckListInstanceRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.deleted_by</code>.
     */
    public SmartmonCheckListInstanceRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.date_</code>.
     */
    public SmartmonCheckListInstanceRecord setDate_(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.date_</code>.
     */
    public LocalDateTime getDate_() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for
     * <code>public.smartmon_check_list_instance.responsible_id</code>.
     */
    public SmartmonCheckListInstanceRecord setResponsibleId(UUID value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartmon_check_list_instance.responsible_id</code>.
     */
    public UUID getResponsibleId() {
        return (UUID) get(9);
    }

    /**
     * Setter for
     * <code>public.smartmon_check_list_instance.check_list_id</code>.
     */
    public SmartmonCheckListInstanceRecord setCheckListId(UUID value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartmon_check_list_instance.check_list_id</code>.
     */
    public UUID getCheckListId() {
        return (UUID) get(10);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.status</code>.
     */
    public SmartmonCheckListInstanceRecord setStatus(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.status</code>.
     */
    public String getStatus() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.comment_</code>.
     */
    public SmartmonCheckListInstanceRecord setComment_(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.comment_</code>.
     */
    public String getComment_() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.employee_id</code>.
     */
    public SmartmonCheckListInstanceRecord setEmployeeId(UUID value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.employee_id</code>.
     */
    public UUID getEmployeeId() {
        return (UUID) get(13);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.sync_id</code>.
     */
    public SmartmonCheckListInstanceRecord setSyncId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.sync_id</code>.
     */
    public String getSyncId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.division_id</code>.
     */
    public SmartmonCheckListInstanceRecord setDivisionId(UUID value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.division_id</code>.
     */
    public UUID getDivisionId() {
        return (UUID) get(15);
    }

    /**
     * Setter for
     * <code>public.smartmon_check_list_instance.instance_status</code>.
     */
    public SmartmonCheckListInstanceRecord setInstanceStatus(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartmon_check_list_instance.instance_status</code>.
     */
    public String getInstanceStatus() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.foreign_list</code>.
     */
    public SmartmonCheckListInstanceRecord setForeignList(Boolean value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.foreign_list</code>.
     */
    public Boolean getForeignList() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>public.smartmon_check_list_instance.transport_id</code>.
     */
    public SmartmonCheckListInstanceRecord setTransportId(UUID value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.transport_id</code>.
     */
    public UUID getTransportId() {
        return (UUID) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, LocalDateTime, UUID, UUID, String, String, UUID, String, UUID, String, Boolean, UUID> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, LocalDateTime, UUID, UUID, String, String, UUID, String, UUID, String, Boolean, UUID> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.DELETED_BY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.DATE_;
    }

    @Override
    public Field<UUID> field10() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.RESPONSIBLE_ID;
    }

    @Override
    public Field<UUID> field11() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.CHECK_LIST_ID;
    }

    @Override
    public Field<String> field12() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.STATUS;
    }

    @Override
    public Field<String> field13() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.COMMENT_;
    }

    @Override
    public Field<UUID> field14() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.EMPLOYEE_ID;
    }

    @Override
    public Field<String> field15() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.SYNC_ID;
    }

    @Override
    public Field<UUID> field16() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.DIVISION_ID;
    }

    @Override
    public Field<String> field17() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.INSTANCE_STATUS;
    }

    @Override
    public Field<Boolean> field18() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.FOREIGN_LIST;
    }

    @Override
    public Field<UUID> field19() {
        return SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE.TRANSPORT_ID;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getVersion();
    }

    @Override
    public LocalDateTime component3() {
        return getCreateTs();
    }

    @Override
    public String component4() {
        return getCreatedBy();
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
    public LocalDateTime component9() {
        return getDate_();
    }

    @Override
    public UUID component10() {
        return getResponsibleId();
    }

    @Override
    public UUID component11() {
        return getCheckListId();
    }

    @Override
    public String component12() {
        return getStatus();
    }

    @Override
    public String component13() {
        return getComment_();
    }

    @Override
    public UUID component14() {
        return getEmployeeId();
    }

    @Override
    public String component15() {
        return getSyncId();
    }

    @Override
    public UUID component16() {
        return getDivisionId();
    }

    @Override
    public String component17() {
        return getInstanceStatus();
    }

    @Override
    public Boolean component18() {
        return getForeignList();
    }

    @Override
    public UUID component19() {
        return getTransportId();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getVersion();
    }

    @Override
    public LocalDateTime value3() {
        return getCreateTs();
    }

    @Override
    public String value4() {
        return getCreatedBy();
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
    public LocalDateTime value9() {
        return getDate_();
    }

    @Override
    public UUID value10() {
        return getResponsibleId();
    }

    @Override
    public UUID value11() {
        return getCheckListId();
    }

    @Override
    public String value12() {
        return getStatus();
    }

    @Override
    public String value13() {
        return getComment_();
    }

    @Override
    public UUID value14() {
        return getEmployeeId();
    }

    @Override
    public String value15() {
        return getSyncId();
    }

    @Override
    public UUID value16() {
        return getDivisionId();
    }

    @Override
    public String value17() {
        return getInstanceStatus();
    }

    @Override
    public Boolean value18() {
        return getForeignList();
    }

    @Override
    public UUID value19() {
        return getTransportId();
    }

    @Override
    public SmartmonCheckListInstanceRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value9(LocalDateTime value) {
        setDate_(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value10(UUID value) {
        setResponsibleId(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value11(UUID value) {
        setCheckListId(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value12(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value13(String value) {
        setComment_(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value14(UUID value) {
        setEmployeeId(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value15(String value) {
        setSyncId(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value16(UUID value) {
        setDivisionId(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value17(String value) {
        setInstanceStatus(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value18(Boolean value) {
        setForeignList(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord value19(UUID value) {
        setTransportId(value);
        return this;
    }

    @Override
    public SmartmonCheckListInstanceRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, LocalDateTime value9, UUID value10, UUID value11, String value12, String value13, UUID value14, String value15, UUID value16, String value17, Boolean value18, UUID value19) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SmartmonCheckListInstanceRecord
     */
    public SmartmonCheckListInstanceRecord() {
        super(SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE);
    }

    /**
     * Create a detached, initialised SmartmonCheckListInstanceRecord
     */
    public SmartmonCheckListInstanceRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, LocalDateTime date_, UUID responsibleId, UUID checkListId, String status, String comment_, UUID employeeId, String syncId, UUID divisionId, String instanceStatus, Boolean foreignList, UUID transportId) {
        super(SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setDate_(date_);
        setResponsibleId(responsibleId);
        setCheckListId(checkListId);
        setStatus(status);
        setComment_(comment_);
        setEmployeeId(employeeId);
        setSyncId(syncId);
        setDivisionId(divisionId);
        setInstanceStatus(instanceStatus);
        setForeignList(foreignList);
        setTransportId(transportId);
    }

    /**
     * Create a detached, initialised SmartmonCheckListInstanceRecord
     */
    public SmartmonCheckListInstanceRecord(nu.studer.sample.tables.pojos.SmartmonCheckListInstance value) {
        super(SmartmonCheckListInstance.SMARTMON_CHECK_LIST_INSTANCE);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setDate_(value.getDate_());
            setResponsibleId(value.getResponsibleId());
            setCheckListId(value.getCheckListId());
            setStatus(value.getStatus());
            setComment_(value.getComment_());
            setEmployeeId(value.getEmployeeId());
            setSyncId(value.getSyncId());
            setDivisionId(value.getDivisionId());
            setInstanceStatus(value.getInstanceStatus());
            setForeignList(value.getForeignList());
            setTransportId(value.getTransportId());
        }
    }
}