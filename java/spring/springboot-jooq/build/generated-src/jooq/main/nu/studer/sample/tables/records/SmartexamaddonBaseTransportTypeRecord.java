/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartexamaddonBaseTransportType;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamaddonBaseTransportTypeRecord extends UpdatableRecordImpl<SmartexamaddonBaseTransportTypeRecord> implements Record12<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.smartexamaddon_base_transport_type.id</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport_type.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport_type.version</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport_type.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport_type.create_ts</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport_type.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport_type.created_by</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport_type.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport_type.update_ts</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport_type.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport_type.updated_by</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport_type.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport_type.delete_ts</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport_type.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport_type.deleted_by</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport_type.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport_type.received</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setReceived(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport_type.received</code>.
     */
    public Boolean getReceived() {
        return (Boolean) get(8);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport_type.kafka_key</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setKafkaKey(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport_type.kafka_key</code>.
     */
    public String getKafkaKey() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport_type.name</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport_type.name</code>.
     */
    public String getName() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport_type.parent_id</code>.
     */
    public SmartexamaddonBaseTransportTypeRecord setParentId(UUID value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport_type.parent_id</code>.
     */
    public UUID getParentId() {
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
    public Row12<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, UUID> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, UUID> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.DELETED_BY;
    }

    @Override
    public Field<Boolean> field9() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.RECEIVED;
    }

    @Override
    public Field<String> field10() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.KAFKA_KEY;
    }

    @Override
    public Field<String> field11() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.NAME;
    }

    @Override
    public Field<UUID> field12() {
        return SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE.PARENT_ID;
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
    public Boolean component9() {
        return getReceived();
    }

    @Override
    public String component10() {
        return getKafkaKey();
    }

    @Override
    public String component11() {
        return getName();
    }

    @Override
    public UUID component12() {
        return getParentId();
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
    public Boolean value9() {
        return getReceived();
    }

    @Override
    public String value10() {
        return getKafkaKey();
    }

    @Override
    public String value11() {
        return getName();
    }

    @Override
    public UUID value12() {
        return getParentId();
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value9(Boolean value) {
        setReceived(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value10(String value) {
        setKafkaKey(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value11(String value) {
        setName(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord value12(UUID value) {
        setParentId(value);
        return this;
    }

    @Override
    public SmartexamaddonBaseTransportTypeRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, Boolean value9, String value10, String value11, UUID value12) {
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
     * Create a detached SmartexamaddonBaseTransportTypeRecord
     */
    public SmartexamaddonBaseTransportTypeRecord() {
        super(SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE);
    }

    /**
     * Create a detached, initialised SmartexamaddonBaseTransportTypeRecord
     */
    public SmartexamaddonBaseTransportTypeRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, Boolean received, String kafkaKey, String name, UUID parentId) {
        super(SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setReceived(received);
        setKafkaKey(kafkaKey);
        setName(name);
        setParentId(parentId);
    }

    /**
     * Create a detached, initialised SmartexamaddonBaseTransportTypeRecord
     */
    public SmartexamaddonBaseTransportTypeRecord(nu.studer.sample.tables.pojos.SmartexamaddonBaseTransportType value) {
        super(SmartexamaddonBaseTransportType.SMARTEXAMADDON_BASE_TRANSPORT_TYPE);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setReceived(value.getReceived());
            setKafkaKey(value.getKafkaKey());
            setName(value.getName());
            setParentId(value.getParentId());
        }
    }
}