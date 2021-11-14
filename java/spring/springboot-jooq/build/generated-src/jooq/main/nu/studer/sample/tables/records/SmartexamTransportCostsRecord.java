/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartexamTransportCosts;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamTransportCostsRecord extends UpdatableRecordImpl<SmartexamTransportCostsRecord> implements Record14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Integer, Integer, Double, String, LocalDate, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.smartexam_transport_costs.id</code>.
     */
    public SmartexamTransportCostsRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.version</code>.
     */
    public SmartexamTransportCostsRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.create_ts</code>.
     */
    public SmartexamTransportCostsRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.created_by</code>.
     */
    public SmartexamTransportCostsRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.update_ts</code>.
     */
    public SmartexamTransportCostsRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.updated_by</code>.
     */
    public SmartexamTransportCostsRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.delete_ts</code>.
     */
    public SmartexamTransportCostsRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.deleted_by</code>.
     */
    public SmartexamTransportCostsRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.month</code>.
     */
    public SmartexamTransportCostsRecord setMonth(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.month</code>.
     */
    public Integer getMonth() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.year</code>.
     */
    public SmartexamTransportCostsRecord setYear(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.year</code>.
     */
    public Integer getYear() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.cost</code>.
     */
    public SmartexamTransportCostsRecord setCost(Double value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.cost</code>.
     */
    public Double getCost() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.comment</code>.
     */
    public SmartexamTransportCostsRecord setComment(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.comment</code>.
     */
    public String getComment() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.date_</code>.
     */
    public SmartexamTransportCostsRecord setDate_(LocalDate value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.date_</code>.
     */
    public LocalDate getDate_() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for <code>public.smartexam_transport_costs.transport_id</code>.
     */
    public SmartexamTransportCostsRecord setTransportId(UUID value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_transport_costs.transport_id</code>.
     */
    public UUID getTransportId() {
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
    public Row14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Integer, Integer, Double, String, LocalDate, UUID> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Integer, Integer, Double, String, LocalDate, UUID> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.DELETED_BY;
    }

    @Override
    public Field<Integer> field9() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.MONTH;
    }

    @Override
    public Field<Integer> field10() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.YEAR;
    }

    @Override
    public Field<Double> field11() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.COST;
    }

    @Override
    public Field<String> field12() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.COMMENT;
    }

    @Override
    public Field<LocalDate> field13() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.DATE_;
    }

    @Override
    public Field<UUID> field14() {
        return SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS.TRANSPORT_ID;
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
    public Integer component9() {
        return getMonth();
    }

    @Override
    public Integer component10() {
        return getYear();
    }

    @Override
    public Double component11() {
        return getCost();
    }

    @Override
    public String component12() {
        return getComment();
    }

    @Override
    public LocalDate component13() {
        return getDate_();
    }

    @Override
    public UUID component14() {
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
    public Integer value9() {
        return getMonth();
    }

    @Override
    public Integer value10() {
        return getYear();
    }

    @Override
    public Double value11() {
        return getCost();
    }

    @Override
    public String value12() {
        return getComment();
    }

    @Override
    public LocalDate value13() {
        return getDate_();
    }

    @Override
    public UUID value14() {
        return getTransportId();
    }

    @Override
    public SmartexamTransportCostsRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value9(Integer value) {
        setMonth(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value10(Integer value) {
        setYear(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value11(Double value) {
        setCost(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value12(String value) {
        setComment(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value13(LocalDate value) {
        setDate_(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord value14(UUID value) {
        setTransportId(value);
        return this;
    }

    @Override
    public SmartexamTransportCostsRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, Integer value9, Integer value10, Double value11, String value12, LocalDate value13, UUID value14) {
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
     * Create a detached SmartexamTransportCostsRecord
     */
    public SmartexamTransportCostsRecord() {
        super(SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS);
    }

    /**
     * Create a detached, initialised SmartexamTransportCostsRecord
     */
    public SmartexamTransportCostsRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, Integer month, Integer year, Double cost, String comment, LocalDate date_, UUID transportId) {
        super(SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setMonth(month);
        setYear(year);
        setCost(cost);
        setComment(comment);
        setDate_(date_);
        setTransportId(transportId);
    }

    /**
     * Create a detached, initialised SmartexamTransportCostsRecord
     */
    public SmartexamTransportCostsRecord(nu.studer.sample.tables.pojos.SmartexamTransportCosts value) {
        super(SmartexamTransportCosts.SMARTEXAM_TRANSPORT_COSTS);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setMonth(value.getMonth());
            setYear(value.getYear());
            setCost(value.getCost());
            setComment(value.getComment());
            setDate_(value.getDate_());
            setTransportId(value.getTransportId());
        }
    }
}
