/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartexamRepairRequestInstance;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamRepairRequestInstanceRecord extends UpdatableRecordImpl<SmartexamRepairRequestInstanceRecord> implements Record14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, UUID, UUID, String, UUID, String, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.smartexam_repair_request_instance.id</code>.
     */
    public SmartexamRepairRequestInstanceRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_instance.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.smartexam_repair_request_instance.version</code>.
     */
    public SmartexamRepairRequestInstanceRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_instance.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_instance.create_ts</code>.
     */
    public SmartexamRepairRequestInstanceRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_instance.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_instance.created_by</code>.
     */
    public SmartexamRepairRequestInstanceRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_instance.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_instance.update_ts</code>.
     */
    public SmartexamRepairRequestInstanceRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_instance.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_instance.updated_by</code>.
     */
    public SmartexamRepairRequestInstanceRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_instance.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_instance.delete_ts</code>.
     */
    public SmartexamRepairRequestInstanceRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_instance.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_instance.deleted_by</code>.
     */
    public SmartexamRepairRequestInstanceRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_instance.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.smartexam_repair_request_instance.work_id</code>.
     */
    public SmartexamRepairRequestInstanceRecord setWorkId(UUID value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_instance.work_id</code>.
     */
    public UUID getWorkId() {
        return (UUID) get(8);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_instance.parent_instance_id</code>.
     */
    public SmartexamRepairRequestInstanceRecord setParentInstanceId(UUID value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_instance.parent_instance_id</code>.
     */
    public UUID getParentInstanceId() {
        return (UUID) get(9);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_instance.quantity</code>.
     */
    public SmartexamRepairRequestInstanceRecord setQuantity(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_instance.quantity</code>.
     */
    public String getQuantity() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_instance.repair_request_id</code>.
     */
    public SmartexamRepairRequestInstanceRecord setRepairRequestId(UUID value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_instance.repair_request_id</code>.
     */
    public UUID getRepairRequestId() {
        return (UUID) get(11);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_instance.agreement</code>.
     */
    public SmartexamRepairRequestInstanceRecord setAgreement(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_instance.agreement</code>.
     */
    public String getAgreement() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_instance.standard</code>.
     */
    public SmartexamRepairRequestInstanceRecord setStandard(Double value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_instance.standard</code>.
     */
    public Double getStandard() {
        return (Double) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, UUID, UUID, String, UUID, String, Double> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, UUID, UUID, String, UUID, String, Double> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.DELETED_BY;
    }

    @Override
    public Field<UUID> field9() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.WORK_ID;
    }

    @Override
    public Field<UUID> field10() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.PARENT_INSTANCE_ID;
    }

    @Override
    public Field<String> field11() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.QUANTITY;
    }

    @Override
    public Field<UUID> field12() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.REPAIR_REQUEST_ID;
    }

    @Override
    public Field<String> field13() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.AGREEMENT;
    }

    @Override
    public Field<Double> field14() {
        return SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE.STANDARD;
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
    public UUID component9() {
        return getWorkId();
    }

    @Override
    public UUID component10() {
        return getParentInstanceId();
    }

    @Override
    public String component11() {
        return getQuantity();
    }

    @Override
    public UUID component12() {
        return getRepairRequestId();
    }

    @Override
    public String component13() {
        return getAgreement();
    }

    @Override
    public Double component14() {
        return getStandard();
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
    public UUID value9() {
        return getWorkId();
    }

    @Override
    public UUID value10() {
        return getParentInstanceId();
    }

    @Override
    public String value11() {
        return getQuantity();
    }

    @Override
    public UUID value12() {
        return getRepairRequestId();
    }

    @Override
    public String value13() {
        return getAgreement();
    }

    @Override
    public Double value14() {
        return getStandard();
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value9(UUID value) {
        setWorkId(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value10(UUID value) {
        setParentInstanceId(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value11(String value) {
        setQuantity(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value12(UUID value) {
        setRepairRequestId(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value13(String value) {
        setAgreement(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord value14(Double value) {
        setStandard(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestInstanceRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, UUID value9, UUID value10, String value11, UUID value12, String value13, Double value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SmartexamRepairRequestInstanceRecord
     */
    public SmartexamRepairRequestInstanceRecord() {
        super(SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE);
    }

    /**
     * Create a detached, initialised SmartexamRepairRequestInstanceRecord
     */
    public SmartexamRepairRequestInstanceRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, UUID workId, UUID parentInstanceId, String quantity, UUID repairRequestId, String agreement, Double standard) {
        super(SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setWorkId(workId);
        setParentInstanceId(parentInstanceId);
        setQuantity(quantity);
        setRepairRequestId(repairRequestId);
        setAgreement(agreement);
        setStandard(standard);
    }

    /**
     * Create a detached, initialised SmartexamRepairRequestInstanceRecord
     */
    public SmartexamRepairRequestInstanceRecord(nu.studer.sample.tables.pojos.SmartexamRepairRequestInstance value) {
        super(SmartexamRepairRequestInstance.SMARTEXAM_REPAIR_REQUEST_INSTANCE);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setWorkId(value.getWorkId());
            setParentInstanceId(value.getParentInstanceId());
            setQuantity(value.getQuantity());
            setRepairRequestId(value.getRepairRequestId());
            setAgreement(value.getAgreement());
            setStandard(value.getStandard());
        }
    }
}
