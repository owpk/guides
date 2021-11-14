/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartexamShop;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamShopRecord extends UpdatableRecordImpl<SmartexamShopRecord> implements Record11<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, UUID, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.smartexam_shop.id</code>.
     */
    public SmartexamShopRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_shop.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.smartexam_shop.version</code>.
     */
    public SmartexamShopRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_shop.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.smartexam_shop.create_ts</code>.
     */
    public SmartexamShopRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_shop.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.smartexam_shop.created_by</code>.
     */
    public SmartexamShopRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_shop.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.smartexam_shop.update_ts</code>.
     */
    public SmartexamShopRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_shop.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.smartexam_shop.updated_by</code>.
     */
    public SmartexamShopRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_shop.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.smartexam_shop.delete_ts</code>.
     */
    public SmartexamShopRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_shop.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.smartexam_shop.deleted_by</code>.
     */
    public SmartexamShopRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_shop.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.smartexam_shop.name</code>.
     */
    public SmartexamShopRecord setName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_shop.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.smartexam_shop.ext_uuid</code>.
     */
    public SmartexamShopRecord setExtUuid(UUID value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_shop.ext_uuid</code>.
     */
    public UUID getExtUuid() {
        return (UUID) get(9);
    }

    /**
     * Setter for <code>public.smartexam_shop.parent_shop_id</code>.
     */
    public SmartexamShopRecord setParentShopId(UUID value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_shop.parent_shop_id</code>.
     */
    public UUID getParentShopId() {
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
        return SmartexamShop.SMARTEXAM_SHOP.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SmartexamShop.SMARTEXAM_SHOP.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SmartexamShop.SMARTEXAM_SHOP.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return SmartexamShop.SMARTEXAM_SHOP.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmartexamShop.SMARTEXAM_SHOP.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SmartexamShop.SMARTEXAM_SHOP.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SmartexamShop.SMARTEXAM_SHOP.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SmartexamShop.SMARTEXAM_SHOP.DELETED_BY;
    }

    @Override
    public Field<String> field9() {
        return SmartexamShop.SMARTEXAM_SHOP.NAME;
    }

    @Override
    public Field<UUID> field10() {
        return SmartexamShop.SMARTEXAM_SHOP.EXT_UUID;
    }

    @Override
    public Field<UUID> field11() {
        return SmartexamShop.SMARTEXAM_SHOP.PARENT_SHOP_ID;
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
        return getExtUuid();
    }

    @Override
    public UUID component11() {
        return getParentShopId();
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
        return getExtUuid();
    }

    @Override
    public UUID value11() {
        return getParentShopId();
    }

    @Override
    public SmartexamShopRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SmartexamShopRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SmartexamShopRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SmartexamShopRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SmartexamShopRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SmartexamShopRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SmartexamShopRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SmartexamShopRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SmartexamShopRecord value9(String value) {
        setName(value);
        return this;
    }

    @Override
    public SmartexamShopRecord value10(UUID value) {
        setExtUuid(value);
        return this;
    }

    @Override
    public SmartexamShopRecord value11(UUID value) {
        setParentShopId(value);
        return this;
    }

    @Override
    public SmartexamShopRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, String value9, UUID value10, UUID value11) {
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
     * Create a detached SmartexamShopRecord
     */
    public SmartexamShopRecord() {
        super(SmartexamShop.SMARTEXAM_SHOP);
    }

    /**
     * Create a detached, initialised SmartexamShopRecord
     */
    public SmartexamShopRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String name, UUID extUuid, UUID parentShopId) {
        super(SmartexamShop.SMARTEXAM_SHOP);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setName(name);
        setExtUuid(extUuid);
        setParentShopId(parentShopId);
    }

    /**
     * Create a detached, initialised SmartexamShopRecord
     */
    public SmartexamShopRecord(nu.studer.sample.tables.pojos.SmartexamShop value) {
        super(SmartexamShop.SMARTEXAM_SHOP);

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
            setExtUuid(value.getExtUuid());
            setParentShopId(value.getParentShopId());
        }
    }
}
