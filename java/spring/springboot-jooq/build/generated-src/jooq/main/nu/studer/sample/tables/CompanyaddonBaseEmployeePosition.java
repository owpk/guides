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
import nu.studer.sample.tables.records.CompanyaddonBaseEmployeePositionRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class CompanyaddonBaseEmployeePosition extends TableImpl<CompanyaddonBaseEmployeePositionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.companyaddon_base_employee_position</code>
     */
    public static final CompanyaddonBaseEmployeePosition COMPANYADDON_BASE_EMPLOYEE_POSITION = new CompanyaddonBaseEmployeePosition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompanyaddonBaseEmployeePositionRecord> getRecordType() {
        return CompanyaddonBaseEmployeePositionRecord.class;
    }

    /**
     * The column <code>public.companyaddon_base_employee_position.id</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column
     * <code>public.companyaddon_base_employee_position.version</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>public.companyaddon_base_employee_position.create_ts</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.companyaddon_base_employee_position.created_by</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.companyaddon_base_employee_position.update_ts</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.companyaddon_base_employee_position.updated_by</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.companyaddon_base_employee_position.delete_ts</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.companyaddon_base_employee_position.deleted_by</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.companyaddon_base_employee_position.received</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, Boolean> RECEIVED = createField(DSL.name("received"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>public.companyaddon_base_employee_position.kafka_key</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, String> KAFKA_KEY = createField(DSL.name("kafka_key"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>public.companyaddon_base_employee_position.position_</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, String> POSITION_ = createField(DSL.name("position_"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.companyaddon_base_employee_position.code</code>.
     */
    public final TableField<CompanyaddonBaseEmployeePositionRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(255), this, "");

    private CompanyaddonBaseEmployeePosition(Name alias, Table<CompanyaddonBaseEmployeePositionRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompanyaddonBaseEmployeePosition(Name alias, Table<CompanyaddonBaseEmployeePositionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.companyaddon_base_employee_position</code>
     * table reference
     */
    public CompanyaddonBaseEmployeePosition(String alias) {
        this(DSL.name(alias), COMPANYADDON_BASE_EMPLOYEE_POSITION);
    }

    /**
     * Create an aliased <code>public.companyaddon_base_employee_position</code>
     * table reference
     */
    public CompanyaddonBaseEmployeePosition(Name alias) {
        this(alias, COMPANYADDON_BASE_EMPLOYEE_POSITION);
    }

    /**
     * Create a <code>public.companyaddon_base_employee_position</code> table
     * reference
     */
    public CompanyaddonBaseEmployeePosition() {
        this(DSL.name("companyaddon_base_employee_position"), null);
    }

    public <O extends Record> CompanyaddonBaseEmployeePosition(Table<O> child, ForeignKey<O, CompanyaddonBaseEmployeePositionRecord> key) {
        super(child, key, COMPANYADDON_BASE_EMPLOYEE_POSITION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_COMPANYADDON_BASE_EMPLOYEE_POSITION_UK_KAFKA_KEY);
    }

    @Override
    public UniqueKey<CompanyaddonBaseEmployeePositionRecord> getPrimaryKey() {
        return Keys.COMPANYADDON_BASE_EMPLOYEE_POSITION_PKEY;
    }

    @Override
    public CompanyaddonBaseEmployeePosition as(String alias) {
        return new CompanyaddonBaseEmployeePosition(DSL.name(alias), this);
    }

    @Override
    public CompanyaddonBaseEmployeePosition as(Name alias) {
        return new CompanyaddonBaseEmployeePosition(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanyaddonBaseEmployeePosition rename(String name) {
        return new CompanyaddonBaseEmployeePosition(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanyaddonBaseEmployeePosition rename(Name name) {
        return new CompanyaddonBaseEmployeePosition(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
