/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.time.LocalDateTime;

import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SysDbChangelogRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class SysDbChangelog extends TableImpl<SysDbChangelogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sys_db_changelog</code>
     */
    public static final SysDbChangelog SYS_DB_CHANGELOG = new SysDbChangelog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysDbChangelogRecord> getRecordType() {
        return SysDbChangelogRecord.class;
    }

    /**
     * The column <code>public.sys_db_changelog.script_name</code>.
     */
    public final TableField<SysDbChangelogRecord, String> SCRIPT_NAME = createField(DSL.name("script_name"), SQLDataType.VARCHAR(300).nullable(false), this, "");

    /**
     * The column <code>public.sys_db_changelog.create_ts</code>.
     */
    public final TableField<SysDbChangelogRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.sys_db_changelog.is_init</code>.
     */
    public final TableField<SysDbChangelogRecord, Integer> IS_INIT = createField(DSL.name("is_init"), SQLDataType.INTEGER.defaultValue(DSL.field("0", SQLDataType.INTEGER)), this, "");

    private SysDbChangelog(Name alias, Table<SysDbChangelogRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysDbChangelog(Name alias, Table<SysDbChangelogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.sys_db_changelog</code> table reference
     */
    public SysDbChangelog(String alias) {
        this(DSL.name(alias), SYS_DB_CHANGELOG);
    }

    /**
     * Create an aliased <code>public.sys_db_changelog</code> table reference
     */
    public SysDbChangelog(Name alias) {
        this(alias, SYS_DB_CHANGELOG);
    }

    /**
     * Create a <code>public.sys_db_changelog</code> table reference
     */
    public SysDbChangelog() {
        this(DSL.name("sys_db_changelog"), null);
    }

    public <O extends Record> SysDbChangelog(Table<O> child, ForeignKey<O, SysDbChangelogRecord> key) {
        super(child, key, SYS_DB_CHANGELOG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<SysDbChangelogRecord> getPrimaryKey() {
        return Keys.SYS_DB_CHANGELOG_PKEY;
    }

    @Override
    public SysDbChangelog as(String alias) {
        return new SysDbChangelog(DSL.name(alias), this);
    }

    @Override
    public SysDbChangelog as(Name alias) {
        return new SysDbChangelog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysDbChangelog rename(String name) {
        return new SysDbChangelog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysDbChangelog rename(Name name) {
        return new SysDbChangelog(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, LocalDateTime, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}