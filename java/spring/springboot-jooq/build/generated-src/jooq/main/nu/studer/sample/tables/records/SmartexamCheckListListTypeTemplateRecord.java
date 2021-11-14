/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartexamCheckListListTypeTemplate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamCheckListListTypeTemplateRecord extends UpdatableRecordImpl<SmartexamCheckListListTypeTemplateRecord> implements Record10<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>public.smartexam_check_list_list_type_template.id</code>.
     */
    public SmartexamCheckListListTypeTemplateRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_list_type_template.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for
     * <code>public.smartexam_check_list_list_type_template.version</code>.
     */
    public SmartexamCheckListListTypeTemplateRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_list_type_template.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>public.smartexam_check_list_list_type_template.create_ts</code>.
     */
    public SmartexamCheckListListTypeTemplateRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_list_type_template.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for
     * <code>public.smartexam_check_list_list_type_template.created_by</code>.
     */
    public SmartexamCheckListListTypeTemplateRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_list_type_template.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>public.smartexam_check_list_list_type_template.update_ts</code>.
     */
    public SmartexamCheckListListTypeTemplateRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_list_type_template.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for
     * <code>public.smartexam_check_list_list_type_template.updated_by</code>.
     */
    public SmartexamCheckListListTypeTemplateRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_list_type_template.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>public.smartexam_check_list_list_type_template.delete_ts</code>.
     */
    public SmartexamCheckListListTypeTemplateRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_list_type_template.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for
     * <code>public.smartexam_check_list_list_type_template.deleted_by</code>.
     */
    public SmartexamCheckListListTypeTemplateRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_list_type_template.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>public.smartexam_check_list_list_type_template.name</code>.
     */
    public SmartexamCheckListListTypeTemplateRecord setName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_list_type_template.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>public.smartexam_check_list_list_type_template.tempalte</code>.
     */
    public SmartexamCheckListListTypeTemplateRecord setTempalte(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_list_type_template.tempalte</code>.
     */
    public String getTempalte() {
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
        return SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE.DELETED_BY;
    }

    @Override
    public Field<String> field9() {
        return SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE.NAME;
    }

    @Override
    public Field<String> field10() {
        return SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE.TEMPALTE;
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
        return getTempalte();
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
        return getTempalte();
    }

    @Override
    public SmartexamCheckListListTypeTemplateRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SmartexamCheckListListTypeTemplateRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SmartexamCheckListListTypeTemplateRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SmartexamCheckListListTypeTemplateRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SmartexamCheckListListTypeTemplateRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SmartexamCheckListListTypeTemplateRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SmartexamCheckListListTypeTemplateRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SmartexamCheckListListTypeTemplateRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SmartexamCheckListListTypeTemplateRecord value9(String value) {
        setName(value);
        return this;
    }

    @Override
    public SmartexamCheckListListTypeTemplateRecord value10(String value) {
        setTempalte(value);
        return this;
    }

    @Override
    public SmartexamCheckListListTypeTemplateRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, String value9, String value10) {
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
     * Create a detached SmartexamCheckListListTypeTemplateRecord
     */
    public SmartexamCheckListListTypeTemplateRecord() {
        super(SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE);
    }

    /**
     * Create a detached, initialised SmartexamCheckListListTypeTemplateRecord
     */
    public SmartexamCheckListListTypeTemplateRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String name, String tempalte) {
        super(SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setName(name);
        setTempalte(tempalte);
    }

    /**
     * Create a detached, initialised SmartexamCheckListListTypeTemplateRecord
     */
    public SmartexamCheckListListTypeTemplateRecord(nu.studer.sample.tables.pojos.SmartexamCheckListListTypeTemplate value) {
        super(SmartexamCheckListListTypeTemplate.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE);

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
            setTempalte(value.getTempalte());
        }
    }
}
