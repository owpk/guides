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
import nu.studer.sample.tables.records.SmartexamNfcTagRecord;

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
public class SmartexamNfcTag extends TableImpl<SmartexamNfcTagRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.smartexam_nfc_tag</code>
     */
    public static final SmartexamNfcTag SMARTEXAM_NFC_TAG = new SmartexamNfcTag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmartexamNfcTagRecord> getRecordType() {
        return SmartexamNfcTagRecord.class;
    }

    /**
     * The column <code>public.smartexam_nfc_tag.id</code>.
     */
    public final TableField<SmartexamNfcTagRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.smartexam_nfc_tag.version</code>.
     */
    public final TableField<SmartexamNfcTagRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.smartexam_nfc_tag.create_ts</code>.
     */
    public final TableField<SmartexamNfcTagRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_nfc_tag.created_by</code>.
     */
    public final TableField<SmartexamNfcTagRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_nfc_tag.update_ts</code>.
     */
    public final TableField<SmartexamNfcTagRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_nfc_tag.updated_by</code>.
     */
    public final TableField<SmartexamNfcTagRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_nfc_tag.delete_ts</code>.
     */
    public final TableField<SmartexamNfcTagRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_nfc_tag.deleted_by</code>.
     */
    public final TableField<SmartexamNfcTagRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_nfc_tag.name</code>.
     */
    public final TableField<SmartexamNfcTagRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.smartexam_nfc_tag.serial_number</code>.
     */
    public final TableField<SmartexamNfcTagRecord, String> SERIAL_NUMBER = createField(DSL.name("serial_number"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.smartexam_nfc_tag.transport_id</code>.
     */
    public final TableField<SmartexamNfcTagRecord, UUID> TRANSPORT_ID = createField(DSL.name("transport_id"), SQLDataType.UUID, this, "");

    private SmartexamNfcTag(Name alias, Table<SmartexamNfcTagRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmartexamNfcTag(Name alias, Table<SmartexamNfcTagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.smartexam_nfc_tag</code> table reference
     */
    public SmartexamNfcTag(String alias) {
        this(DSL.name(alias), SMARTEXAM_NFC_TAG);
    }

    /**
     * Create an aliased <code>public.smartexam_nfc_tag</code> table reference
     */
    public SmartexamNfcTag(Name alias) {
        this(alias, SMARTEXAM_NFC_TAG);
    }

    /**
     * Create a <code>public.smartexam_nfc_tag</code> table reference
     */
    public SmartexamNfcTag() {
        this(DSL.name("smartexam_nfc_tag"), null);
    }

    public <O extends Record> SmartexamNfcTag(Table<O> child, ForeignKey<O, SmartexamNfcTagRecord> key) {
        super(child, key, SMARTEXAM_NFC_TAG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SMARTEXAM_NFC_TAG_ON_TRANSPORT, Indexes.IDX_SMARTEXAM_NFC_TAG_UK_SERIAL_NUMBER);
    }

    @Override
    public UniqueKey<SmartexamNfcTagRecord> getPrimaryKey() {
        return Keys.SMARTEXAM_NFC_TAG_PKEY;
    }

    @Override
    public List<ForeignKey<SmartexamNfcTagRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SMARTEXAM_NFC_TAG__FK_SMARTEXAM_NFC_TAG_ON_TRANSPORT);
    }

    private transient SmartmonTransport _smartmonTransport;

    public SmartmonTransport smartmonTransport() {
        if (_smartmonTransport == null)
            _smartmonTransport = new SmartmonTransport(this, Keys.SMARTEXAM_NFC_TAG__FK_SMARTEXAM_NFC_TAG_ON_TRANSPORT);

        return _smartmonTransport;
    }

    @Override
    public SmartexamNfcTag as(String alias) {
        return new SmartexamNfcTag(DSL.name(alias), this);
    }

    @Override
    public SmartexamNfcTag as(Name alias) {
        return new SmartexamNfcTag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamNfcTag rename(String name) {
        return new SmartexamNfcTag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamNfcTag rename(Name name) {
        return new SmartexamNfcTag(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, UUID> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
