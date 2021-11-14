/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartexamRepairRequestSpareParts;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamRepairRequestSparePartsRecord extends UpdatableRecordImpl<SmartexamRepairRequestSparePartsRecord> implements Record14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, Boolean, UUID, Double, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.smartexam_repair_request_spare_parts.id</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_spare_parts.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.version</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.create_ts</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.created_by</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.update_ts</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.updated_by</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.delete_ts</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.deleted_by</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.smartexam_repair_request_spare_parts.name</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_spare_parts.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.quantity</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setQuantity(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.quantity</code>.
     */
    public String getQuantity() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.spisano_vitk</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setSpisanoVitk(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.spisano_vitk</code>.
     */
    public Boolean getSpisanoVitk() {
        return (Boolean) get(10);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.repair_request_id</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setRepairRequestId(UUID value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.repair_request_id</code>.
     */
    public UUID getRepairRequestId() {
        return (UUID) get(11);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.price</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setPrice(Double value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.price</code>.
     */
    public Double getPrice() {
        return (Double) get(12);
    }

    /**
     * Setter for
     * <code>public.smartexam_repair_request_spare_parts.repair_request_instance_id</code>.
     */
    public SmartexamRepairRequestSparePartsRecord setRepairRequestInstanceId(UUID value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_spare_parts.repair_request_instance_id</code>.
     */
    public UUID getRepairRequestInstanceId() {
        return (UUID) get(13);
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
    public Row14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, Boolean, UUID, Double, UUID> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, Boolean, UUID, Double, UUID> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.DELETED_BY;
    }

    @Override
    public Field<String> field9() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.NAME;
    }

    @Override
    public Field<String> field10() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.QUANTITY;
    }

    @Override
    public Field<Boolean> field11() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.SPISANO_VITK;
    }

    @Override
    public Field<UUID> field12() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.REPAIR_REQUEST_ID;
    }

    @Override
    public Field<Double> field13() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.PRICE;
    }

    @Override
    public Field<UUID> field14() {
        return SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS.REPAIR_REQUEST_INSTANCE_ID;
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
    public String component9() {
        return getName();
    }

    @Override
    public String component10() {
        return getQuantity();
    }

    @Override
    public Boolean component11() {
        return getSpisanoVitk();
    }

    @Override
    public UUID component12() {
        return getRepairRequestId();
    }

    @Override
    public Double component13() {
        return getPrice();
    }

    @Override
    public UUID component14() {
        return getRepairRequestInstanceId();
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
    public String value9() {
        return getName();
    }

    @Override
    public String value10() {
        return getQuantity();
    }

    @Override
    public Boolean value11() {
        return getSpisanoVitk();
    }

    @Override
    public UUID value12() {
        return getRepairRequestId();
    }

    @Override
    public Double value13() {
        return getPrice();
    }

    @Override
    public UUID value14() {
        return getRepairRequestInstanceId();
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value9(String value) {
        setName(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value10(String value) {
        setQuantity(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value11(Boolean value) {
        setSpisanoVitk(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value12(UUID value) {
        setRepairRequestId(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value13(Double value) {
        setPrice(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord value14(UUID value) {
        setRepairRequestInstanceId(value);
        return this;
    }

    @Override
    public SmartexamRepairRequestSparePartsRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, String value9, String value10, Boolean value11, UUID value12, Double value13, UUID value14) {
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
     * Create a detached SmartexamRepairRequestSparePartsRecord
     */
    public SmartexamRepairRequestSparePartsRecord() {
        super(SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS);
    }

    /**
     * Create a detached, initialised SmartexamRepairRequestSparePartsRecord
     */
    public SmartexamRepairRequestSparePartsRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String name, String quantity, Boolean spisanoVitk, UUID repairRequestId, Double price, UUID repairRequestInstanceId) {
        super(SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setName(name);
        setQuantity(quantity);
        setSpisanoVitk(spisanoVitk);
        setRepairRequestId(repairRequestId);
        setPrice(price);
        setRepairRequestInstanceId(repairRequestInstanceId);
    }

    /**
     * Create a detached, initialised SmartexamRepairRequestSparePartsRecord
     */
    public SmartexamRepairRequestSparePartsRecord(nu.studer.sample.tables.pojos.SmartexamRepairRequestSpareParts value) {
        super(SmartexamRepairRequestSpareParts.SMARTEXAM_REPAIR_REQUEST_SPARE_PARTS);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setName(value.getName());
            setQuantity(value.getQuantity());
            setSpisanoVitk(value.getSpisanoVitk());
            setRepairRequestId(value.getRepairRequestId());
            setPrice(value.getPrice());
            setRepairRequestInstanceId(value.getRepairRequestInstanceId());
        }
    }
}