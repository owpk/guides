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
import nu.studer.sample.tables.records.SmartexamPositionsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class SmartexamPositions extends TableImpl<SmartexamPositionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.smartexam_positions</code>
     */
    public static final SmartexamPositions SMARTEXAM_POSITIONS = new SmartexamPositions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmartexamPositionsRecord> getRecordType() {
        return SmartexamPositionsRecord.class;
    }

    /**
     * The column <code>public.smartexam_positions.id</code>.
     */
    public final TableField<SmartexamPositionsRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.smartexam_positions.version</code>.
     */
    public final TableField<SmartexamPositionsRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.smartexam_positions.create_ts</code>.
     */
    public final TableField<SmartexamPositionsRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_positions.created_by</code>.
     */
    public final TableField<SmartexamPositionsRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_positions.update_ts</code>.
     */
    public final TableField<SmartexamPositionsRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_positions.updated_by</code>.
     */
    public final TableField<SmartexamPositionsRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_positions.delete_ts</code>.
     */
    public final TableField<SmartexamPositionsRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_positions.deleted_by</code>.
     */
    public final TableField<SmartexamPositionsRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_positions.name</code>.
     */
    public final TableField<SmartexamPositionsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.smartexam_positions.ext_uuid</code>.
     */
    public final TableField<SmartexamPositionsRecord, String> EXT_UUID = createField(DSL.name("ext_uuid"), SQLDataType.VARCHAR(255), this, "");

    private SmartexamPositions(Name alias, Table<SmartexamPositionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmartexamPositions(Name alias, Table<SmartexamPositionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.smartexam_positions</code> table reference
     */
    public SmartexamPositions(String alias) {
        this(DSL.name(alias), SMARTEXAM_POSITIONS);
    }

    /**
     * Create an aliased <code>public.smartexam_positions</code> table reference
     */
    public SmartexamPositions(Name alias) {
        this(alias, SMARTEXAM_POSITIONS);
    }

    /**
     * Create a <code>public.smartexam_positions</code> table reference
     */
    public SmartexamPositions() {
        this(DSL.name("smartexam_positions"), null);
    }

    public <O extends Record> SmartexamPositions(Table<O> child, ForeignKey<O, SmartexamPositionsRecord> key) {
        super(child, key, SMARTEXAM_POSITIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SMARTEXAM_POSITIONS_UK_EXT_UUID);
    }

    @Override
    public UniqueKey<SmartexamPositionsRecord> getPrimaryKey() {
        return Keys.SMARTEXAM_POSITIONS_PKEY;
    }

    @Override
    public SmartexamPositions as(String alias) {
        return new SmartexamPositions(DSL.name(alias), this);
    }

    @Override
    public SmartexamPositions as(Name alias) {
        return new SmartexamPositions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamPositions rename(String name) {
        return new SmartexamPositions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamPositions rename(Name name) {
        return new SmartexamPositions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
