/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SmartexamTransportTypeGroupingRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class SmartexamTransportTypeGrouping extends TableImpl<SmartexamTransportTypeGroupingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.smartexam_transport_type_grouping</code>
     */
    public static final SmartexamTransportTypeGrouping SMARTEXAM_TRANSPORT_TYPE_GROUPING = new SmartexamTransportTypeGrouping();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmartexamTransportTypeGroupingRecord> getRecordType() {
        return SmartexamTransportTypeGroupingRecord.class;
    }

    /**
     * The column <code>public.smartexam_transport_type_grouping.id</code>.
     */
    public final TableField<SmartexamTransportTypeGroupingRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.smartexam_transport_type_grouping.version</code>.
     */
    public final TableField<SmartexamTransportTypeGroupingRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_type_grouping.create_ts</code>.
     */
    public final TableField<SmartexamTransportTypeGroupingRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_type_grouping.created_by</code>.
     */
    public final TableField<SmartexamTransportTypeGroupingRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_type_grouping.update_ts</code>.
     */
    public final TableField<SmartexamTransportTypeGroupingRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_type_grouping.updated_by</code>.
     */
    public final TableField<SmartexamTransportTypeGroupingRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_type_grouping.delete_ts</code>.
     */
    public final TableField<SmartexamTransportTypeGroupingRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_type_grouping.deleted_by</code>.
     */
    public final TableField<SmartexamTransportTypeGroupingRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_transport_type_grouping.name</code>.
     */
    public final TableField<SmartexamTransportTypeGroupingRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    private SmartexamTransportTypeGrouping(Name alias, Table<SmartexamTransportTypeGroupingRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmartexamTransportTypeGrouping(Name alias, Table<SmartexamTransportTypeGroupingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.smartexam_transport_type_grouping</code>
     * table reference
     */
    public SmartexamTransportTypeGrouping(String alias) {
        this(DSL.name(alias), SMARTEXAM_TRANSPORT_TYPE_GROUPING);
    }

    /**
     * Create an aliased <code>public.smartexam_transport_type_grouping</code>
     * table reference
     */
    public SmartexamTransportTypeGrouping(Name alias) {
        this(alias, SMARTEXAM_TRANSPORT_TYPE_GROUPING);
    }

    /**
     * Create a <code>public.smartexam_transport_type_grouping</code> table
     * reference
     */
    public SmartexamTransportTypeGrouping() {
        this(DSL.name("smartexam_transport_type_grouping"), null);
    }

    public <O extends Record> SmartexamTransportTypeGrouping(Table<O> child, ForeignKey<O, SmartexamTransportTypeGroupingRecord> key) {
        super(child, key, SMARTEXAM_TRANSPORT_TYPE_GROUPING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<SmartexamTransportTypeGroupingRecord> getPrimaryKey() {
        return Keys.SMARTEXAM_TRANSPORT_TYPE_GROUPING_PKEY;
    }

    @Override
    public SmartexamTransportTypeGrouping as(String alias) {
        return new SmartexamTransportTypeGrouping(DSL.name(alias), this);
    }

    @Override
    public SmartexamTransportTypeGrouping as(Name alias) {
        return new SmartexamTransportTypeGrouping(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamTransportTypeGrouping rename(String name) {
        return new SmartexamTransportTypeGrouping(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamTransportTypeGrouping rename(Name name) {
        return new SmartexamTransportTypeGrouping(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
