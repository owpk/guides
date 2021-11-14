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
import nu.studer.sample.tables.records.SysEntityStatisticsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class SysEntityStatistics extends TableImpl<SysEntityStatisticsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sys_entity_statistics</code>
     */
    public static final SysEntityStatistics SYS_ENTITY_STATISTICS = new SysEntityStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysEntityStatisticsRecord> getRecordType() {
        return SysEntityStatisticsRecord.class;
    }

    /**
     * The column <code>public.sys_entity_statistics.id</code>.
     */
    public final TableField<SysEntityStatisticsRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.sys_entity_statistics.create_ts</code>.
     */
    public final TableField<SysEntityStatisticsRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sys_entity_statistics.created_by</code>.
     */
    public final TableField<SysEntityStatisticsRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sys_entity_statistics.update_ts</code>.
     */
    public final TableField<SysEntityStatisticsRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sys_entity_statistics.updated_by</code>.
     */
    public final TableField<SysEntityStatisticsRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sys_entity_statistics.name</code>.
     */
    public final TableField<SysEntityStatisticsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sys_entity_statistics.instance_count</code>.
     */
    public final TableField<SysEntityStatisticsRecord, Long> INSTANCE_COUNT = createField(DSL.name("instance_count"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.sys_entity_statistics.fetch_ui</code>.
     */
    public final TableField<SysEntityStatisticsRecord, Integer> FETCH_UI = createField(DSL.name("fetch_ui"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.sys_entity_statistics.max_fetch_ui</code>.
     */
    public final TableField<SysEntityStatisticsRecord, Integer> MAX_FETCH_UI = createField(DSL.name("max_fetch_ui"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>public.sys_entity_statistics.lazy_collection_threshold</code>.
     */
    public final TableField<SysEntityStatisticsRecord, Integer> LAZY_COLLECTION_THRESHOLD = createField(DSL.name("lazy_collection_threshold"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>public.sys_entity_statistics.lookup_screen_threshold</code>.
     */
    public final TableField<SysEntityStatisticsRecord, Integer> LOOKUP_SCREEN_THRESHOLD = createField(DSL.name("lookup_screen_threshold"), SQLDataType.INTEGER, this, "");

    private SysEntityStatistics(Name alias, Table<SysEntityStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysEntityStatistics(Name alias, Table<SysEntityStatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.sys_entity_statistics</code> table
     * reference
     */
    public SysEntityStatistics(String alias) {
        this(DSL.name(alias), SYS_ENTITY_STATISTICS);
    }

    /**
     * Create an aliased <code>public.sys_entity_statistics</code> table
     * reference
     */
    public SysEntityStatistics(Name alias) {
        this(alias, SYS_ENTITY_STATISTICS);
    }

    /**
     * Create a <code>public.sys_entity_statistics</code> table reference
     */
    public SysEntityStatistics() {
        this(DSL.name("sys_entity_statistics"), null);
    }

    public <O extends Record> SysEntityStatistics(Table<O> child, ForeignKey<O, SysEntityStatisticsRecord> key) {
        super(child, key, SYS_ENTITY_STATISTICS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SYS_ENTITY_STATISTICS_UNIQ_NAME);
    }

    @Override
    public UniqueKey<SysEntityStatisticsRecord> getPrimaryKey() {
        return Keys.SYS_ENTITY_STATISTICS_PKEY;
    }

    @Override
    public SysEntityStatistics as(String alias) {
        return new SysEntityStatistics(DSL.name(alias), this);
    }

    @Override
    public SysEntityStatistics as(Name alias) {
        return new SysEntityStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysEntityStatistics rename(String name) {
        return new SysEntityStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysEntityStatistics rename(Name name) {
        return new SysEntityStatistics(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<UUID, LocalDateTime, String, LocalDateTime, String, String, Long, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}