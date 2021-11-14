/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import nu.studer.sample.Indexes;
import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SysScheduledExecutionRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class SysScheduledExecution extends TableImpl<SysScheduledExecutionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sys_scheduled_execution</code>
     */
    public static final SysScheduledExecution SYS_SCHEDULED_EXECUTION = new SysScheduledExecution();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysScheduledExecutionRecord> getRecordType() {
        return SysScheduledExecutionRecord.class;
    }

    /**
     * The column <code>public.sys_scheduled_execution.id</code>.
     */
    public final TableField<SysScheduledExecutionRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.sys_scheduled_execution.create_ts</code>.
     */
    public final TableField<SysScheduledExecutionRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sys_scheduled_execution.created_by</code>.
     */
    public final TableField<SysScheduledExecutionRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sys_scheduled_execution.sys_tenant_id</code>.
     */
    public final TableField<SysScheduledExecutionRecord, String> SYS_TENANT_ID = createField(DSL.name("sys_tenant_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.sys_scheduled_execution.task_id</code>.
     */
    public final TableField<SysScheduledExecutionRecord, UUID> TASK_ID = createField(DSL.name("task_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.sys_scheduled_execution.server</code>.
     */
    public final TableField<SysScheduledExecutionRecord, String> SERVER = createField(DSL.name("server"), SQLDataType.VARCHAR(512), this, "");

    /**
     * The column <code>public.sys_scheduled_execution.start_time</code>.
     */
    public final TableField<SysScheduledExecutionRecord, OffsetDateTime> START_TIME = createField(DSL.name("start_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>public.sys_scheduled_execution.finish_time</code>.
     */
    public final TableField<SysScheduledExecutionRecord, OffsetDateTime> FINISH_TIME = createField(DSL.name("finish_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>public.sys_scheduled_execution.result</code>.
     */
    public final TableField<SysScheduledExecutionRecord, String> RESULT = createField(DSL.name("result"), SQLDataType.CLOB, this, "");

    private SysScheduledExecution(Name alias, Table<SysScheduledExecutionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysScheduledExecution(Name alias, Table<SysScheduledExecutionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.sys_scheduled_execution</code> table
     * reference
     */
    public SysScheduledExecution(String alias) {
        this(DSL.name(alias), SYS_SCHEDULED_EXECUTION);
    }

    /**
     * Create an aliased <code>public.sys_scheduled_execution</code> table
     * reference
     */
    public SysScheduledExecution(Name alias) {
        this(alias, SYS_SCHEDULED_EXECUTION);
    }

    /**
     * Create a <code>public.sys_scheduled_execution</code> table reference
     */
    public SysScheduledExecution() {
        this(DSL.name("sys_scheduled_execution"), null);
    }

    public <O extends Record> SysScheduledExecution(Table<O> child, ForeignKey<O, SysScheduledExecutionRecord> key) {
        super(child, key, SYS_SCHEDULED_EXECUTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SYS_SCHEDULED_EXECUTION_TASK_FINISH_TIME, Indexes.IDX_SYS_SCHEDULED_EXECUTION_TASK_START_TIME);
    }

    @Override
    public UniqueKey<SysScheduledExecutionRecord> getPrimaryKey() {
        return Keys.SYS_SCHEDULED_EXECUTION_PKEY;
    }

    @Override
    public List<ForeignKey<SysScheduledExecutionRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SYS_SCHEDULED_EXECUTION__SYS_SCHEDULED_EXECUTION_TASK);
    }

    private transient SysScheduledTask _sysScheduledTask;

    public SysScheduledTask sysScheduledTask() {
        if (_sysScheduledTask == null)
            _sysScheduledTask = new SysScheduledTask(this, Keys.SYS_SCHEDULED_EXECUTION__SYS_SCHEDULED_EXECUTION_TASK);

        return _sysScheduledTask;
    }

    @Override
    public SysScheduledExecution as(String alias) {
        return new SysScheduledExecution(DSL.name(alias), this);
    }

    @Override
    public SysScheduledExecution as(Name alias) {
        return new SysScheduledExecution(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysScheduledExecution rename(String name) {
        return new SysScheduledExecution(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysScheduledExecution rename(Name name) {
        return new SysScheduledExecution(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, LocalDateTime, String, String, UUID, String, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
