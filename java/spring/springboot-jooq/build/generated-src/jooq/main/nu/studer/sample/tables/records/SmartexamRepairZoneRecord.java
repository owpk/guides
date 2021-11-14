/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartexamRepairZone;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamRepairZoneRecord extends UpdatableRecordImpl<SmartexamRepairZoneRecord> implements Record11<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, UUID, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.smartexam_repair_zone.id</code>.
     */
    public SmartexamRepairZoneRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_zone.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.smartexam_repair_zone.version</code>.
     */
    public SmartexamRepairZoneRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_zone.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.smartexam_repair_zone.create_ts</code>.
     */
    public SmartexamRepairZoneRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_zone.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.smartexam_repair_zone.created_by</code>.
     */
    public SmartexamRepairZoneRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_zone.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.smartexam_repair_zone.update_ts</code>.
     */
    public SmartexamRepairZoneRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_zone.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.smartexam_repair_zone.updated_by</code>.
     */
    public SmartexamRepairZoneRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_zone.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.smartexam_repair_zone.delete_ts</code>.
     */
    public SmartexamRepairZoneRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_zone.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.smartexam_repair_zone.deleted_by</code>.
     */
    public SmartexamRepairZoneRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_zone.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.smartexam_repair_zone.name</code>.
     */
    public SmartexamRepairZoneRecord setName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_zone.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.smartexam_repair_zone.exp_uuid</code>.
     */
    public SmartexamRepairZoneRecord setExpUuid(UUID value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_zone.exp_uuid</code>.
     */
    public UUID getExpUuid() {
        return (UUID) get(9);
    }

    /**
     * Setter for <code>public.smartexam_repair_zone.organization_id</code>.
     */
    public SmartexamRepairZoneRecord setOrganizationId(UUID value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_repair_zone.organization_id</code>.
     */
    public UUID getOrganizationId() {
        return (UUID) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, UUID, UUID> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, UUID, UUID> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE.DELETED_BY;
    }

    @Override
    public Field<String> field9() {
        return SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE.NAME;
    }

    @Override
    public Field<UUID> field10() {
        return SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE.EXP_UUID;
    }

    @Override
    public Field<UUID> field11() {
        return SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE.ORGANIZATION_ID;
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
    public UUID component10() {
        return getExpUuid();
    }

    @Override
    public UUID component11() {
        return getOrganizationId();
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
    public UUID value10() {
        return getExpUuid();
    }

    @Override
    public UUID value11() {
        return getOrganizationId();
    }

    @Override
    public SmartexamRepairZoneRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SmartexamRepairZoneRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SmartexamRepairZoneRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SmartexamRepairZoneRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SmartexamRepairZoneRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SmartexamRepairZoneRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SmartexamRepairZoneRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SmartexamRepairZoneRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SmartexamRepairZoneRecord value9(String value) {
        setName(value);
        return this;
    }

    @Override
    public SmartexamRepairZoneRecord value10(UUID value) {
        setExpUuid(value);
        return this;
    }

    @Override
    public SmartexamRepairZoneRecord value11(UUID value) {
        setOrganizationId(value);
        return this;
    }

    @Override
    public SmartexamRepairZoneRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, String value9, UUID value10, UUID value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SmartexamRepairZoneRecord
     */
    public SmartexamRepairZoneRecord() {
        super(SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE);
    }

    /**
     * Create a detached, initialised SmartexamRepairZoneRecord
     */
    public SmartexamRepairZoneRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String name, UUID expUuid, UUID organizationId) {
        super(SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setName(name);
        setExpUuid(expUuid);
        setOrganizationId(organizationId);
    }

    /**
     * Create a detached, initialised SmartexamRepairZoneRecord
     */
    public SmartexamRepairZoneRecord(nu.studer.sample.tables.pojos.SmartexamRepairZone value) {
        super(SmartexamRepairZone.SMARTEXAM_REPAIR_ZONE);

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
            setExpUuid(value.getExpUuid());
            setOrganizationId(value.getOrganizationId());
        }
    }
}
