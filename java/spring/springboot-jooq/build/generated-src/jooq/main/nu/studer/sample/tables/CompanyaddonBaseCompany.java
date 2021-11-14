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
import nu.studer.sample.tables.records.CompanyaddonBaseCompanyRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
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
public class CompanyaddonBaseCompany extends TableImpl<CompanyaddonBaseCompanyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.companyaddon_base_company</code>
     */
    public static final CompanyaddonBaseCompany COMPANYADDON_BASE_COMPANY = new CompanyaddonBaseCompany();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompanyaddonBaseCompanyRecord> getRecordType() {
        return CompanyaddonBaseCompanyRecord.class;
    }

    /**
     * The column <code>public.companyaddon_base_company.id</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.companyaddon_base_company.version</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.companyaddon_base_company.create_ts</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.companyaddon_base_company.created_by</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.companyaddon_base_company.update_ts</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.companyaddon_base_company.updated_by</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.companyaddon_base_company.delete_ts</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.companyaddon_base_company.deleted_by</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.companyaddon_base_company.received</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, Boolean> RECEIVED = createField(DSL.name("received"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.companyaddon_base_company.kafka_key</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, String> KAFKA_KEY = createField(DSL.name("kafka_key"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.companyaddon_base_company.code</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, String> CODE = createField(DSL.name("code"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.companyaddon_base_company.name</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.companyaddon_base_company.full_name</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, String> FULL_NAME = createField(DSL.name("full_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.companyaddon_base_company.tax_number</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, String> TAX_NUMBER = createField(DSL.name("tax_number"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.companyaddon_base_company.tax_code</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, String> TAX_CODE = createField(DSL.name("tax_code"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.companyaddon_base_company.comment_</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, String> COMMENT_ = createField(DSL.name("comment_"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.companyaddon_base_company.head_person</code>.
     */
    public final TableField<CompanyaddonBaseCompanyRecord, UUID> HEAD_PERSON = createField(DSL.name("head_person"), SQLDataType.UUID, this, "");

    private CompanyaddonBaseCompany(Name alias, Table<CompanyaddonBaseCompanyRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompanyaddonBaseCompany(Name alias, Table<CompanyaddonBaseCompanyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.companyaddon_base_company</code> table
     * reference
     */
    public CompanyaddonBaseCompany(String alias) {
        this(DSL.name(alias), COMPANYADDON_BASE_COMPANY);
    }

    /**
     * Create an aliased <code>public.companyaddon_base_company</code> table
     * reference
     */
    public CompanyaddonBaseCompany(Name alias) {
        this(alias, COMPANYADDON_BASE_COMPANY);
    }

    /**
     * Create a <code>public.companyaddon_base_company</code> table reference
     */
    public CompanyaddonBaseCompany() {
        this(DSL.name("companyaddon_base_company"), null);
    }

    public <O extends Record> CompanyaddonBaseCompany(Table<O> child, ForeignKey<O, CompanyaddonBaseCompanyRecord> key) {
        super(child, key, COMPANYADDON_BASE_COMPANY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_COMPANYADDON_BASE_COMPANY_ON_HEAD_PERSON, Indexes.IDX_COMPANYADDON_BASE_COMPANY_UK_KAFKA_KEY);
    }

    @Override
    public UniqueKey<CompanyaddonBaseCompanyRecord> getPrimaryKey() {
        return Keys.COMPANYADDON_BASE_COMPANY_PKEY;
    }

    @Override
    public List<ForeignKey<CompanyaddonBaseCompanyRecord, ?>> getReferences() {
        return Arrays.asList(Keys.COMPANYADDON_BASE_COMPANY__FK_COMPANYADDON_BASE_COMPANY_ON_HEAD_PERSON);
    }

    private transient CompanyaddonBaseEmployee _companyaddonBaseEmployee;

    public CompanyaddonBaseEmployee companyaddonBaseEmployee() {
        if (_companyaddonBaseEmployee == null)
            _companyaddonBaseEmployee = new CompanyaddonBaseEmployee(this, Keys.COMPANYADDON_BASE_COMPANY__FK_COMPANYADDON_BASE_COMPANY_ON_HEAD_PERSON);

        return _companyaddonBaseEmployee;
    }

    @Override
    public CompanyaddonBaseCompany as(String alias) {
        return new CompanyaddonBaseCompany(DSL.name(alias), this);
    }

    @Override
    public CompanyaddonBaseCompany as(Name alias) {
        return new CompanyaddonBaseCompany(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanyaddonBaseCompany rename(String name) {
        return new CompanyaddonBaseCompany(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanyaddonBaseCompany rename(Name name) {
        return new CompanyaddonBaseCompany(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, String, String, String, String, String, UUID> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}
