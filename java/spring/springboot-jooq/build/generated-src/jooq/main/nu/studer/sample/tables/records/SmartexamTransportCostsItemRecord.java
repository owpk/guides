/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartexamTransportCostsItem;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamTransportCostsItemRecord extends UpdatableRecordImpl<SmartexamTransportCostsItemRecord> implements Record13<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, UUID, String, Double, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.smartexam_transport_costs_item.id</code>.
     */
    public SmartexamTransportCostsItemRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.version</code>.
     */
    public SmartexamTransportCostsItemRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.create_ts</code>.
     */
    public SmartexamTransportCostsItemRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.created_by</code>.
     */
    public SmartexamTransportCostsItemRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.update_ts</code>.
     */
    public SmartexamTransportCostsItemRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.updated_by</code>.
     */
    public SmartexamTransportCostsItemRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.delete_ts</code>.
     */
    public SmartexamTransportCostsItemRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.deleted_by</code>.
     */
    public SmartexamTransportCostsItemRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.cost_id</code>.
     */
    public SmartexamTransportCostsItemRecord setCostId(UUID value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.cost_id</code>.
     */
    public UUID getCostId() {
        return (UUID) get(8);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.name</code>.
     */
    public SmartexamTransportCostsItemRecord setName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.name</code>.
     */
    public String getName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.price</code>.
     */
    public SmartexamTransportCostsItemRecord setPrice(Double value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.price</code>.
     */
    public Double getPrice() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.amount</code>.
     */
    public SmartexamTransportCostsItemRecord setAmount(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.amount</code>.
     */
    public Integer getAmount() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs_item.units</code>.
     */
    public SmartexamTransportCostsItemRecord setUnits(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs_item.units</code>.
     */
    public String getUnits() {
        return (String) get(12);
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
    public Row13<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, UUID, String, Double, Integer, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, UUID, String, Double, Integer, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.DELETED_BY;
    }

    @Override
    public Field<UUID> field9() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.COST_ID;
    }

    @Override
    public Field<String> field10() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.NAME;
    }

    @Override
    public Field<Double> field11() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.PRICE;
    }

    @Override
    public Field<Integer> field12() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.AMOUNT;
    }

    @Override
    public Field<String> field13() {
        return SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM.UNITS;
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
        return getCostId();
    }

    @Override
    public String component10() {
        return getName();
    }

    @Override
    public Double component11() {
        return getPrice();
    }

    @Override
    public Integer component12() {
        return getAmount();
    }

    @Override
    public String component13() {
        return getUnits();
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
        return getCostId();
    }

    @Override
    public String value10() {
        return getName();
    }

    @Override
    public Double value11() {
        return getPrice();
    }

    @Override
    public Integer value12() {
        return getAmount();
    }

    @Override
    public String value13() {
        return getUnits();
    }

    @Override
    public SmartexamTransportCostsItemRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value9(UUID value) {
        setCostId(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value10(String value) {
        setName(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value11(Double value) {
        setPrice(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value12(Integer value) {
        setAmount(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord value13(String value) {
        setUnits(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsItemRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, UUID value9, String value10, Double value11, Integer value12, String value13) {
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
     * Create a detached SmartexamTransportCostsItemRecord
     */
    public SmartexamTransportCostsItemRecord() {
        super(SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM);
    }

    /**
     * Create a detached, initialised SmartexamTransportCostsItemRecord
     */
    public SmartexamTransportCostsItemRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, UUID costId, String name, Double price, Integer amount, String units) {
        super(SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setCostId(costId);
        setName(name);
        setPrice(price);
        setAmount(amount);
        setUnits(units);
    }

    /**
     * Create a detached, initialised SmartexamTransportCostsItemRecord
     */
    public SmartexamTransportCostsItemRecord(nu.studer.sample.tables.pojos.SmartexamTransportCostsItem value) {
        super(SmartexamTransportCostsItem.SMARTEXAM_TRANSPORT_COSTS_ITEM);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setCostId(value.getCostId());
            setName(value.getName());
            setPrice(value.getPrice());
            setAmount(value.getAmount());
            setUnits(value.getUnits());
        }
    }
}