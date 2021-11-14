/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import nu.studer.sample.Indexes;
import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SmartexamKpiInstanceValueRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class SmartexamKpiInstanceValue extends TableImpl<SmartexamKpiInstanceValueRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.smartexam_kpi_instance_value</code>
     */
    public static final SmartexamKpiInstanceValue SMARTEXAM_KPI_INSTANCE_VALUE = new SmartexamKpiInstanceValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmartexamKpiInstanceValueRecord> getRecordType() {
        return SmartexamKpiInstanceValueRecord.class;
    }

    /**
     * The column <code>public.smartexam_kpi_instance_value.id</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.smartexam_kpi_instance_value.version</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.smartexam_kpi_instance_value.create_ts</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_kpi_instance_value.created_by</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_kpi_instance_value.update_ts</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_kpi_instance_value.updated_by</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_kpi_instance_value.delete_ts</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_kpi_instance_value.deleted_by</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.smartexam_kpi_instance_value.kpi_instance_id</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, UUID> KPI_INSTANCE_ID = createField(DSL.name("kpi_instance_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.smartexam_kpi_instance_value.name</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.smartexam_kpi_instance_value.value_</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, Double> VALUE_ = createField(DSL.name("value_"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.smartexam_kpi_instance_value.date_</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, LocalDate> DATE_ = createField(DSL.name("date_"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>public.smartexam_kpi_instance_value.type_</code>.
     */
    public final TableField<SmartexamKpiInstanceValueRecord, Integer> TYPE_ = createField(DSL.name("type_"), SQLDataType.INTEGER, this, "");

    private SmartexamKpiInstanceValue(Name alias, Table<SmartexamKpiInstanceValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmartexamKpiInstanceValue(Name alias, Table<SmartexamKpiInstanceValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.smartexam_kpi_instance_value</code> table
     * reference
     */
    public SmartexamKpiInstanceValue(String alias) {
        this(DSL.name(alias), SMARTEXAM_KPI_INSTANCE_VALUE);
    }

    /**
     * Create an aliased <code>public.smartexam_kpi_instance_value</code> table
     * reference
     */
    public SmartexamKpiInstanceValue(Name alias) {
        this(alias, SMARTEXAM_KPI_INSTANCE_VALUE);
    }

    /**
     * Create a <code>public.smartexam_kpi_instance_value</code> table reference
     */
    public SmartexamKpiInstanceValue() {
        this(DSL.name("smartexam_kpi_instance_value"), null);
    }

    public <O extends Record> SmartexamKpiInstanceValue(Table<O> child, ForeignKey<O, SmartexamKpiInstanceValueRecord> key) {
        super(child, key, SMARTEXAM_KPI_INSTANCE_VALUE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SMARTEXAM_KPI_INSTANCE_VALUE_ON_KPI_INSTANCE);
    }

    @Override
    public UniqueKey<SmartexamKpiInstanceValueRecord> getPrimaryKey() {
        return Keys.SMARTEXAM_KPI_INSTANCE_VALUE_PKEY;
    }

    @Override
    public List<ForeignKey<SmartexamKpiInstanceValueRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SMARTEXAM_KPI_INSTANCE_VALUE__FK_SMARTEXAM_KPI_INSTANCE_VALUE_ON_KPI_INSTANCE);
    }

    private transient SmartexamKpiInstance _smartexamKpiInstance;

    public SmartexamKpiInstance smartexamKpiInstance() {
        if (_smartexamKpiInstance == null)
            _smartexamKpiInstance = new SmartexamKpiInstance(this, Keys.SMARTEXAM_KPI_INSTANCE_VALUE__FK_SMARTEXAM_KPI_INSTANCE_VALUE_ON_KPI_INSTANCE);

        return _smartexamKpiInstance;
    }

    @Override
    public SmartexamKpiInstanceValue as(String alias) {
        return new SmartexamKpiInstanceValue(DSL.name(alias), this);
    }

    @Override
    public SmartexamKpiInstanceValue as(Name alias) {
        return new SmartexamKpiInstanceValue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamKpiInstanceValue rename(String name) {
        return new SmartexamKpiInstanceValue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamKpiInstanceValue rename(Name name) {
        return new SmartexamKpiInstanceValue(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, UUID, String, Double, LocalDate, Integer> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
