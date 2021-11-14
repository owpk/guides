/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import nu.studer.sample.Indexes;
import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SysConfigRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class SysConfig extends TableImpl<SysConfigRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sys_config</code>
     */
    public static final SysConfig SYS_CONFIG = new SysConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysConfigRecord> getRecordType() {
        return SysConfigRecord.class;
    }

    /**
     * The column <code>public.sys_config.id</code>.
     */
    public final TableField<SysConfigRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.sys_config.create_ts</code>.
     */
    public final TableField<SysConfigRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sys_config.created_by</code>.
     */
    public final TableField<SysConfigRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sys_config.version</code>.
     */
    public final TableField<SysConfigRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.sys_config.update_ts</code>.
     */
    public final TableField<SysConfigRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sys_config.updated_by</code>.
     */
    public final TableField<SysConfigRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sys_config.name</code>.
     */
    public final TableField<SysConfigRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.sys_config.value_</code>.
     */
    public final TableField<SysConfigRecord, String> VALUE_ = createField(DSL.name("value_"), SQLDataType.CLOB.nullable(false), this, "");

    private SysConfig(Name alias, Table<SysConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysConfig(Name alias, Table<SysConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.sys_config</code> table reference
     */
    public SysConfig(String alias) {
        this(DSL.name(alias), SYS_CONFIG);
    }

    /**
     * Create an aliased <code>public.sys_config</code> table reference
     */
    public SysConfig(Name alias) {
        this(alias, SYS_CONFIG);
    }

    /**
     * Create a <code>public.sys_config</code> table reference
     */
    public SysConfig() {
        this(DSL.name("sys_config"), null);
    }

    public <O extends Record> SysConfig(Table<O> child, ForeignKey<O, SysConfigRecord> key) {
        super(child, key, SYS_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SYS_CONFIG_UNIQ_NAME);
    }

    @Override
    public UniqueKey<SysConfigRecord> getPrimaryKey() {
        return Keys.SYS_CONFIG_PKEY;
    }

    @Override
    public SysConfig as(String alias) {
        return new SysConfig(DSL.name(alias), this);
    }

    @Override
    public SysConfig as(Name alias) {
        return new SysConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysConfig rename(String name) {
        return new SysConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysConfig rename(Name name) {
        return new SysConfig(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<UUID, LocalDateTime, String, Integer, LocalDateTime, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
