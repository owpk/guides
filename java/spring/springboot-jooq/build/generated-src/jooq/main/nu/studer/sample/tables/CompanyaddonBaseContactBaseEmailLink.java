/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.CompanyaddonBaseContactBaseEmailLinkRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class CompanyaddonBaseContactBaseEmailLink extends TableImpl<CompanyaddonBaseContactBaseEmailLinkRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.companyaddon_base_contact_base_email_link</code>
     */
    public static final CompanyaddonBaseContactBaseEmailLink COMPANYADDON_BASE_CONTACT_BASE_EMAIL_LINK = new CompanyaddonBaseContactBaseEmailLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompanyaddonBaseContactBaseEmailLinkRecord> getRecordType() {
        return CompanyaddonBaseContactBaseEmailLinkRecord.class;
    }

    /**
     * The column
     * <code>public.companyaddon_base_contact_base_email_link.base_contact_id</code>.
     */
    public final TableField<CompanyaddonBaseContactBaseEmailLinkRecord, UUID> BASE_CONTACT_ID = createField(DSL.name("base_contact_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column
     * <code>public.companyaddon_base_contact_base_email_link.base_email_id</code>.
     */
    public final TableField<CompanyaddonBaseContactBaseEmailLinkRecord, UUID> BASE_EMAIL_ID = createField(DSL.name("base_email_id"), SQLDataType.UUID.nullable(false), this, "");

    private CompanyaddonBaseContactBaseEmailLink(Name alias, Table<CompanyaddonBaseContactBaseEmailLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompanyaddonBaseContactBaseEmailLink(Name alias, Table<CompanyaddonBaseContactBaseEmailLinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>public.companyaddon_base_contact_base_email_link</code> table
     * reference
     */
    public CompanyaddonBaseContactBaseEmailLink(String alias) {
        this(DSL.name(alias), COMPANYADDON_BASE_CONTACT_BASE_EMAIL_LINK);
    }

    /**
     * Create an aliased
     * <code>public.companyaddon_base_contact_base_email_link</code> table
     * reference
     */
    public CompanyaddonBaseContactBaseEmailLink(Name alias) {
        this(alias, COMPANYADDON_BASE_CONTACT_BASE_EMAIL_LINK);
    }

    /**
     * Create a <code>public.companyaddon_base_contact_base_email_link</code>
     * table reference
     */
    public CompanyaddonBaseContactBaseEmailLink() {
        this(DSL.name("companyaddon_base_contact_base_email_link"), null);
    }

    public <O extends Record> CompanyaddonBaseContactBaseEmailLink(Table<O> child, ForeignKey<O, CompanyaddonBaseContactBaseEmailLinkRecord> key) {
        super(child, key, COMPANYADDON_BASE_CONTACT_BASE_EMAIL_LINK);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<CompanyaddonBaseContactBaseEmailLinkRecord> getPrimaryKey() {
        return Keys.COMPANYADDON_BASE_CONTACT_BASE_EMAIL_LINK_PKEY;
    }

    @Override
    public List<ForeignKey<CompanyaddonBaseContactBaseEmailLinkRecord, ?>> getReferences() {
        return Arrays.asList(Keys.COMPANYADDON_BASE_CONTACT_BASE_EMAIL_LINK__FK_BASCONBASEMA_ON_BASE_CONTACT, Keys.COMPANYADDON_BASE_CONTACT_BASE_EMAIL_LINK__FK_BASCONBASEMA_ON_BASE_EMAIL);
    }

    private transient CompanyaddonBaseContact _companyaddonBaseContact;
    private transient CompanyaddonBaseEmail _companyaddonBaseEmail;

    public CompanyaddonBaseContact companyaddonBaseContact() {
        if (_companyaddonBaseContact == null)
            _companyaddonBaseContact = new CompanyaddonBaseContact(this, Keys.COMPANYADDON_BASE_CONTACT_BASE_EMAIL_LINK__FK_BASCONBASEMA_ON_BASE_CONTACT);

        return _companyaddonBaseContact;
    }

    public CompanyaddonBaseEmail companyaddonBaseEmail() {
        if (_companyaddonBaseEmail == null)
            _companyaddonBaseEmail = new CompanyaddonBaseEmail(this, Keys.COMPANYADDON_BASE_CONTACT_BASE_EMAIL_LINK__FK_BASCONBASEMA_ON_BASE_EMAIL);

        return _companyaddonBaseEmail;
    }

    @Override
    public CompanyaddonBaseContactBaseEmailLink as(String alias) {
        return new CompanyaddonBaseContactBaseEmailLink(DSL.name(alias), this);
    }

    @Override
    public CompanyaddonBaseContactBaseEmailLink as(Name alias) {
        return new CompanyaddonBaseContactBaseEmailLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanyaddonBaseContactBaseEmailLink rename(String name) {
        return new CompanyaddonBaseContactBaseEmailLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanyaddonBaseContactBaseEmailLink rename(Name name) {
        return new CompanyaddonBaseContactBaseEmailLink(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, UUID> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}