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
import nu.studer.sample.tables.records.CompanyaddonBaseEmailRecord;

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
public class CompanyaddonBaseEmail extends TableImpl<CompanyaddonBaseEmailRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.companyaddon_base_email</code>
     */
    public static final CompanyaddonBaseEmail COMPANYADDON_BASE_EMAIL = new CompanyaddonBaseEmail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompanyaddonBaseEmailRecord> getRecordType() {
        return CompanyaddonBaseEmailRecord.class;
    }

    /**
     * The column <code>public.companyaddon_base_email.id</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.companyaddon_base_email.version</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.companyaddon_base_email.create_ts</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.companyaddon_base_email.created_by</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.companyaddon_base_email.update_ts</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.companyaddon_base_email.updated_by</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.companyaddon_base_email.delete_ts</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.companyaddon_base_email.deleted_by</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.companyaddon_base_email.received</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, Boolean> RECEIVED = createField(DSL.name("received"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.companyaddon_base_email.kafka_key</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, String> KAFKA_KEY = createField(DSL.name("kafka_key"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.companyaddon_base_email.email</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.companyaddon_base_email.is_main</code>.
     */
    public final TableField<CompanyaddonBaseEmailRecord, Boolean> IS_MAIN = createField(DSL.name("is_main"), SQLDataType.BOOLEAN, this, "");

    private CompanyaddonBaseEmail(Name alias, Table<CompanyaddonBaseEmailRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompanyaddonBaseEmail(Name alias, Table<CompanyaddonBaseEmailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.companyaddon_base_email</code> table
     * reference
     */
    public CompanyaddonBaseEmail(String alias) {
        this(DSL.name(alias), COMPANYADDON_BASE_EMAIL);
    }

    /**
     * Create an aliased <code>public.companyaddon_base_email</code> table
     * reference
     */
    public CompanyaddonBaseEmail(Name alias) {
        this(alias, COMPANYADDON_BASE_EMAIL);
    }

    /**
     * Create a <code>public.companyaddon_base_email</code> table reference
     */
    public CompanyaddonBaseEmail() {
        this(DSL.name("companyaddon_base_email"), null);
    }

    public <O extends Record> CompanyaddonBaseEmail(Table<O> child, ForeignKey<O, CompanyaddonBaseEmailRecord> key) {
        super(child, key, COMPANYADDON_BASE_EMAIL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_COMPANYADDON_BASE_EMAIL_UK_KAFKA_KEY);
    }

    @Override
    public UniqueKey<CompanyaddonBaseEmailRecord> getPrimaryKey() {
        return Keys.COMPANYADDON_BASE_EMAIL_PKEY;
    }

    @Override
    public CompanyaddonBaseEmail as(String alias) {
        return new CompanyaddonBaseEmail(DSL.name(alias), this);
    }

    @Override
    public CompanyaddonBaseEmail as(Name alias) {
        return new CompanyaddonBaseEmail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanyaddonBaseEmail rename(String name) {
        return new CompanyaddonBaseEmail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanyaddonBaseEmail rename(Name name) {
        return new CompanyaddonBaseEmail(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
