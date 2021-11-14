/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SysLockConfigRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class SysLockConfig extends TableImpl<SysLockConfigRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sys_lock_config</code>
     */
    public static final SysLockConfig SYS_LOCK_CONFIG = new SysLockConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysLockConfigRecord> getRecordType() {
        return SysLockConfigRecord.class;
    }

    /**
     * The column <code>public.sys_lock_config.id</code>.
     */
    public final TableField<SysLockConfigRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.sys_lock_config.create_ts</code>.
     */
    public final TableField<SysLockConfigRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sys_lock_config.created_by</code>.
     */
    public final TableField<SysLockConfigRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sys_lock_config.name</code>.
     */
    public final TableField<SysLockConfigRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.sys_lock_config.timeout_sec</code>.
     */
    public final TableField<SysLockConfigRecord, Integer> TIMEOUT_SEC = createField(DSL.name("timeout_sec"), SQLDataType.INTEGER, this, "");

    private SysLockConfig(Name alias, Table<SysLockConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysLockConfig(Name alias, Table<SysLockConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.sys_lock_config</code> table reference
     */
    public SysLockConfig(String alias) {
        this(DSL.name(alias), SYS_LOCK_CONFIG);
    }

    /**
     * Create an aliased <code>public.sys_lock_config</code> table reference
     */
    public SysLockConfig(Name alias) {
        this(alias, SYS_LOCK_CONFIG);
    }

    /**
     * Create a <code>public.sys_lock_config</code> table reference
     */
    public SysLockConfig() {
        this(DSL.name("sys_lock_config"), null);
    }

    public <O extends Record> SysLockConfig(Table<O> child, ForeignKey<O, SysLockConfigRecord> key) {
        super(child, key, SYS_LOCK_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<SysLockConfigRecord> getPrimaryKey() {
        return Keys.SYS_LOCK_CONFIG_PKEY;
    }

    @Override
    public SysLockConfig as(String alias) {
        return new SysLockConfig(DSL.name(alias), this);
    }

    @Override
    public SysLockConfig as(Name alias) {
        return new SysLockConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysLockConfig rename(String name) {
        return new SysLockConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysLockConfig rename(Name name) {
        return new SysLockConfig(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, LocalDateTime, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}