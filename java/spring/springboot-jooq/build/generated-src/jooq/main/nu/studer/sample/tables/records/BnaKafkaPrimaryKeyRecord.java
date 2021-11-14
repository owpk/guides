/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.BnaKafkaPrimaryKey;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BnaKafkaPrimaryKeyRecord extends UpdatableRecordImpl<BnaKafkaPrimaryKeyRecord> implements Record10<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.bna_kafka_primary_key.id</code>.
     */
    public BnaKafkaPrimaryKeyRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.bna_kafka_primary_key.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.bna_kafka_primary_key.version</code>.
     */
    public BnaKafkaPrimaryKeyRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.bna_kafka_primary_key.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.bna_kafka_primary_key.create_ts</code>.
     */
    public BnaKafkaPrimaryKeyRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.bna_kafka_primary_key.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.bna_kafka_primary_key.created_by</code>.
     */
    public BnaKafkaPrimaryKeyRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.bna_kafka_primary_key.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.bna_kafka_primary_key.update_ts</code>.
     */
    public BnaKafkaPrimaryKeyRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.bna_kafka_primary_key.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.bna_kafka_primary_key.updated_by</code>.
     */
    public BnaKafkaPrimaryKeyRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.bna_kafka_primary_key.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.bna_kafka_primary_key.delete_ts</code>.
     */
    public BnaKafkaPrimaryKeyRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.bna_kafka_primary_key.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.bna_kafka_primary_key.deleted_by</code>.
     */
    public BnaKafkaPrimaryKeyRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.bna_kafka_primary_key.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.bna_kafka_primary_key.entity_name</code>.
     */
    public BnaKafkaPrimaryKeyRecord setEntityName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.bna_kafka_primary_key.entity_name</code>.
     */
    public String getEntityName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.bna_kafka_primary_key.query</code>.
     */
    public BnaKafkaPrimaryKeyRecord setQuery(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.bna_kafka_primary_key.query</code>.
     */
    public String getQuery() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY.ID;
    }

    @Override
    public Field<Integer> field2() {
        return BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY.DELETED_BY;
    }

    @Override
    public Field<String> field9() {
        return BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY.ENTITY_NAME;
    }

    @Override
    public Field<String> field10() {
        return BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY.QUERY;
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
        return getEntityName();
    }

    @Override
    public String component10() {
        return getQuery();
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
        return getEntityName();
    }

    @Override
    public String value10() {
        return getQuery();
    }

    @Override
    public BnaKafkaPrimaryKeyRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public BnaKafkaPrimaryKeyRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public BnaKafkaPrimaryKeyRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public BnaKafkaPrimaryKeyRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public BnaKafkaPrimaryKeyRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public BnaKafkaPrimaryKeyRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public BnaKafkaPrimaryKeyRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public BnaKafkaPrimaryKeyRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public BnaKafkaPrimaryKeyRecord value9(String value) {
        setEntityName(value);
        return this;
    }

    @Override
    public BnaKafkaPrimaryKeyRecord value10(String value) {
        setQuery(value);
        return this;
    }

    @Override
    public BnaKafkaPrimaryKeyRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, String value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BnaKafkaPrimaryKeyRecord
     */
    public BnaKafkaPrimaryKeyRecord() {
        super(BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY);
    }

    /**
     * Create a detached, initialised BnaKafkaPrimaryKeyRecord
     */
    public BnaKafkaPrimaryKeyRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String entityName, String query) {
        super(BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setEntityName(entityName);
        setQuery(query);
    }

    /**
     * Create a detached, initialised BnaKafkaPrimaryKeyRecord
     */
    public BnaKafkaPrimaryKeyRecord(nu.studer.sample.tables.pojos.BnaKafkaPrimaryKey value) {
        super(BnaKafkaPrimaryKey.BNA_KAFKA_PRIMARY_KEY);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setEntityName(value.getEntityName());
            setQuery(value.getQuery());
        }
    }
}