/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SmartexamCheckListListTypeTemplateRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamCheckListListTypeTemplate extends TableImpl<SmartexamCheckListListTypeTemplateRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.smartexam_check_list_list_type_template</code>
     */
    public static final SmartexamCheckListListTypeTemplate SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE = new SmartexamCheckListListTypeTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmartexamCheckListListTypeTemplateRecord> getRecordType() {
        return SmartexamCheckListListTypeTemplateRecord.class;
    }

    /**
     * The column
     * <code>public.smartexam_check_list_list_type_template.id</code>.
     */
    public final TableField<SmartexamCheckListListTypeTemplateRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column
     * <code>public.smartexam_check_list_list_type_template.version</code>.
     */
    public final TableField<SmartexamCheckListListTypeTemplateRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>public.smartexam_check_list_list_type_template.create_ts</code>.
     */
    public final TableField<SmartexamCheckListListTypeTemplateRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_check_list_list_type_template.created_by</code>.
     */
    public final TableField<SmartexamCheckListListTypeTemplateRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.smartexam_check_list_list_type_template.update_ts</code>.
     */
    public final TableField<SmartexamCheckListListTypeTemplateRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_check_list_list_type_template.updated_by</code>.
     */
    public final TableField<SmartexamCheckListListTypeTemplateRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.smartexam_check_list_list_type_template.delete_ts</code>.
     */
    public final TableField<SmartexamCheckListListTypeTemplateRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_check_list_list_type_template.deleted_by</code>.
     */
    public final TableField<SmartexamCheckListListTypeTemplateRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.smartexam_check_list_list_type_template.name</code>.
     */
    public final TableField<SmartexamCheckListListTypeTemplateRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>public.smartexam_check_list_list_type_template.tempalte</code>.
     */
    public final TableField<SmartexamCheckListListTypeTemplateRecord, String> TEMPALTE = createField(DSL.name("tempalte"), SQLDataType.CLOB, this, "");

    private SmartexamCheckListListTypeTemplate(Name alias, Table<SmartexamCheckListListTypeTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmartexamCheckListListTypeTemplate(Name alias, Table<SmartexamCheckListListTypeTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>public.smartexam_check_list_list_type_template</code> table
     * reference
     */
    public SmartexamCheckListListTypeTemplate(String alias) {
        this(DSL.name(alias), SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE);
    }

    /**
     * Create an aliased
     * <code>public.smartexam_check_list_list_type_template</code> table
     * reference
     */
    public SmartexamCheckListListTypeTemplate(Name alias) {
        this(alias, SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE);
    }

    /**
     * Create a <code>public.smartexam_check_list_list_type_template</code>
     * table reference
     */
    public SmartexamCheckListListTypeTemplate() {
        this(DSL.name("smartexam_check_list_list_type_template"), null);
    }

    public <O extends Record> SmartexamCheckListListTypeTemplate(Table<O> child, ForeignKey<O, SmartexamCheckListListTypeTemplateRecord> key) {
        super(child, key, SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<SmartexamCheckListListTypeTemplateRecord> getPrimaryKey() {
        return Keys.SMARTEXAM_CHECK_LIST_LIST_TYPE_TEMPLATE_PKEY;
    }

    @Override
    public SmartexamCheckListListTypeTemplate as(String alias) {
        return new SmartexamCheckListListTypeTemplate(DSL.name(alias), this);
    }

    @Override
    public SmartexamCheckListListTypeTemplate as(Name alias) {
        return new SmartexamCheckListListTypeTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamCheckListListTypeTemplate rename(String name) {
        return new SmartexamCheckListListTypeTemplate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamCheckListListTypeTemplate rename(Name name) {
        return new SmartexamCheckListListTypeTemplate(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}