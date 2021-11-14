/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartexamNomenclature;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamNomenclatureRecord extends UpdatableRecordImpl<SmartexamNomenclatureRecord> implements Record11<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.smartexam_nomenclature.id</code>.
     */
    public SmartexamNomenclatureRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_nomenclature.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.smartexam_nomenclature.version</code>.
     */
    public SmartexamNomenclatureRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_nomenclature.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.smartexam_nomenclature.create_ts</code>.
     */
    public SmartexamNomenclatureRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_nomenclature.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.smartexam_nomenclature.created_by</code>.
     */
    public SmartexamNomenclatureRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_nomenclature.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.smartexam_nomenclature.update_ts</code>.
     */
    public SmartexamNomenclatureRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_nomenclature.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.smartexam_nomenclature.updated_by</code>.
     */
    public SmartexamNomenclatureRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_nomenclature.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.smartexam_nomenclature.delete_ts</code>.
     */
    public SmartexamNomenclatureRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_nomenclature.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.smartexam_nomenclature.deleted_by</code>.
     */
    public SmartexamNomenclatureRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_nomenclature.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.smartexam_nomenclature.name</code>.
     */
    public SmartexamNomenclatureRecord setName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_nomenclature.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.smartexam_nomenclature.article</code>.
     */
    public SmartexamNomenclatureRecord setArticle(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_nomenclature.article</code>.
     */
    public String getArticle() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.smartexam_nomenclature.unit</code>.
     */
    public SmartexamNomenclatureRecord setUnit(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_nomenclature.unit</code>.
     */
    public String getUnit() {
        return (String) get(10);
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
    public Row11<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SmartexamNomenclature.SMARTEXAM_NOMENCLATURE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SmartexamNomenclature.SMARTEXAM_NOMENCLATURE.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SmartexamNomenclature.SMARTEXAM_NOMENCLATURE.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return SmartexamNomenclature.SMARTEXAM_NOMENCLATURE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmartexamNomenclature.SMARTEXAM_NOMENCLATURE.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SmartexamNomenclature.SMARTEXAM_NOMENCLATURE.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SmartexamNomenclature.SMARTEXAM_NOMENCLATURE.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SmartexamNomenclature.SMARTEXAM_NOMENCLATURE.DELETED_BY;
    }

    @Override
    public Field<String> field9() {
        return SmartexamNomenclature.SMARTEXAM_NOMENCLATURE.NAME;
    }

    @Override
    public Field<String> field10() {
        return SmartexamNomenclature.SMARTEXAM_NOMENCLATURE.ARTICLE;
    }

    @Override
    public Field<String> field11() {
        return SmartexamNomenclature.SMARTEXAM_NOMENCLATURE.UNIT;
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
        return getArticle();
    }

    @Override
    public String component11() {
        return getUnit();
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
        return getArticle();
    }

    @Override
    public String value11() {
        return getUnit();
    }

    @Override
    public SmartexamNomenclatureRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SmartexamNomenclatureRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SmartexamNomenclatureRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SmartexamNomenclatureRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SmartexamNomenclatureRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SmartexamNomenclatureRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SmartexamNomenclatureRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SmartexamNomenclatureRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SmartexamNomenclatureRecord value9(String value) {
        setName(value);
        return this;
    }

    @Override
    public SmartexamNomenclatureRecord value10(String value) {
        setArticle(value);
        return this;
    }

    @Override
    public SmartexamNomenclatureRecord value11(String value) {
        setUnit(value);
        return this;
    }

    @Override
    public SmartexamNomenclatureRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, String value9, String value10, String value11) {
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
     * Create a detached SmartexamNomenclatureRecord
     */
    public SmartexamNomenclatureRecord() {
        super(SmartexamNomenclature.SMARTEXAM_NOMENCLATURE);
    }

    /**
     * Create a detached, initialised SmartexamNomenclatureRecord
     */
    public SmartexamNomenclatureRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String name, String article, String unit) {
        super(SmartexamNomenclature.SMARTEXAM_NOMENCLATURE);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setName(name);
        setArticle(article);
        setUnit(unit);
    }

    /**
     * Create a detached, initialised SmartexamNomenclatureRecord
     */
    public SmartexamNomenclatureRecord(nu.studer.sample.tables.pojos.SmartexamNomenclature value) {
        super(SmartexamNomenclature.SMARTEXAM_NOMENCLATURE);

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
            setArticle(value.getArticle());
            setUnit(value.getUnit());
        }
    }
}