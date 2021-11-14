/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SysCategory;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysCategoryRecord extends UpdatableRecordImpl<SysCategoryRecord> implements Record14<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, String, String, Boolean, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sys_category.id</code>.
     */
    public SysCategoryRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sys_category.create_ts</code>.
     */
    public SysCategoryRecord setCreateTs(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.sys_category.created_by</code>.
     */
    public SysCategoryRecord setCreatedBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sys_category.version</code>.
     */
    public SysCategoryRecord setVersion(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.sys_category.update_ts</code>.
     */
    public SysCategoryRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.sys_category.updated_by</code>.
     */
    public SysCategoryRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.sys_category.delete_ts</code>.
     */
    public SysCategoryRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.sys_category.deleted_by</code>.
     */
    public SysCategoryRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.sys_category.name</code>.
     */
    public SysCategoryRecord setName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.sys_category.special</code>.
     */
    public SysCategoryRecord setSpecial(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.special</code>.
     */
    public String getSpecial() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.sys_category.entity_type</code>.
     */
    public SysCategoryRecord setEntityType(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.entity_type</code>.
     */
    public String getEntityType() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.sys_category.is_default</code>.
     */
    public SysCategoryRecord setIsDefault(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.is_default</code>.
     */
    public Boolean getIsDefault() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>public.sys_category.discriminator</code>.
     */
    public SysCategoryRecord setDiscriminator(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.discriminator</code>.
     */
    public Integer getDiscriminator() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>public.sys_category.locale_names</code>.
     */
    public SysCategoryRecord setLocaleNames(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category.locale_names</code>.
     */
    public String getLocaleNames() {
        return (String) get(13);
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
    public Row14<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, String, String, Boolean, Integer, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, String, String, Boolean, Integer, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SysCategory.SYS_CATEGORY.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SysCategory.SYS_CATEGORY.CREATE_TS;
    }

    @Override
    public Field<String> field3() {
        return SysCategory.SYS_CATEGORY.CREATED_BY;
    }

    @Override
    public Field<Integer> field4() {
        return SysCategory.SYS_CATEGORY.VERSION;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SysCategory.SYS_CATEGORY.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SysCategory.SYS_CATEGORY.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SysCategory.SYS_CATEGORY.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SysCategory.SYS_CATEGORY.DELETED_BY;
    }

    @Override
    public Field<String> field9() {
        return SysCategory.SYS_CATEGORY.NAME;
    }

    @Override
    public Field<String> field10() {
        return SysCategory.SYS_CATEGORY.SPECIAL;
    }

    @Override
    public Field<String> field11() {
        return SysCategory.SYS_CATEGORY.ENTITY_TYPE;
    }

    @Override
    public Field<Boolean> field12() {
        return SysCategory.SYS_CATEGORY.IS_DEFAULT;
    }

    @Override
    public Field<Integer> field13() {
        return SysCategory.SYS_CATEGORY.DISCRIMINATOR;
    }

    @Override
    public Field<String> field14() {
        return SysCategory.SYS_CATEGORY.LOCALE_NAMES;
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
    public String component9() {
        return getName();
    }

    @Override
    public String component10() {
        return getSpecial();
    }

    @Override
    public String component11() {
        return getEntityType();
    }

    @Override
    public Boolean component12() {
        return getIsDefault();
    }

    @Override
    public Integer component13() {
        return getDiscriminator();
    }

    @Override
    public String component14() {
        return getLocaleNames();
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
    public String value9() {
        return getName();
    }

    @Override
    public String value10() {
        return getSpecial();
    }

    @Override
    public String value11() {
        return getEntityType();
    }

    @Override
    public Boolean value12() {
        return getIsDefault();
    }

    @Override
    public Integer value13() {
        return getDiscriminator();
    }

    @Override
    public String value14() {
        return getLocaleNames();
    }

    @Override
    public SysCategoryRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SysCategoryRecord value2(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SysCategoryRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SysCategoryRecord value4(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SysCategoryRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SysCategoryRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SysCategoryRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SysCategoryRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SysCategoryRecord value9(String value) {
        setName(value);
        return this;
    }

    @Override
    public SysCategoryRecord value10(String value) {
        setSpecial(value);
        return this;
    }

    @Override
    public SysCategoryRecord value11(String value) {
        setEntityType(value);
        return this;
    }

    @Override
    public SysCategoryRecord value12(Boolean value) {
        setIsDefault(value);
        return this;
    }

    @Override
    public SysCategoryRecord value13(Integer value) {
        setDiscriminator(value);
        return this;
    }

    @Override
    public SysCategoryRecord value14(String value) {
        setLocaleNames(value);
        return this;
    }

    @Override
    public SysCategoryRecord values(UUID value1, LocalDateTime value2, String value3, Integer value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, String value9, String value10, String value11, Boolean value12, Integer value13, String value14) {
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
     * Create a detached SysCategoryRecord
     */
    public SysCategoryRecord() {
        super(SysCategory.SYS_CATEGORY);
    }

    /**
     * Create a detached, initialised SysCategoryRecord
     */
    public SysCategoryRecord(UUID id, LocalDateTime createTs, String createdBy, Integer version, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String name, String special, String entityType, Boolean isDefault, Integer discriminator, String localeNames) {
        super(SysCategory.SYS_CATEGORY);

        setId(id);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setVersion(version);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setName(name);
        setSpecial(special);
        setEntityType(entityType);
        setIsDefault(isDefault);
        setDiscriminator(discriminator);
        setLocaleNames(localeNames);
    }

    /**
     * Create a detached, initialised SysCategoryRecord
     */
    public SysCategoryRecord(nu.studer.sample.tables.pojos.SysCategory value) {
        super(SysCategory.SYS_CATEGORY);

        if (value != null) {
            setId(value.getId());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setVersion(value.getVersion());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setName(value.getName());
            setSpecial(value.getSpecial());
            setEntityType(value.getEntityType());
            setIsDefault(value.getIsDefault());
            setDiscriminator(value.getDiscriminator());
            setLocaleNames(value.getLocaleNames());
        }
    }
}
