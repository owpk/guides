/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import nu.studer.sample.Indexes;
import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SmartexamTransportMileageListRecord;

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
public class SmartexamTransportMileageList extends TableImpl<SmartexamTransportMileageListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.smartexam_transport_mileage_list</code>
     */
    public static final SmartexamTransportMileageList SMARTEXAM_TRANSPORT_MILEAGE_LIST = new SmartexamTransportMileageList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmartexamTransportMileageListRecord> getRecordType() {
        return SmartexamTransportMileageListRecord.class;
    }

    /**
     * The column <code>public.smartexam_transport_mileage_list.id</code>.
     */
    public final TableField<SmartexamTransportMileageListRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.smartexam_transport_mileage_list.version</code>.
     */
    public final TableField<SmartexamTransportMileageListRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_mileage_list.create_ts</code>.
     */
    public final TableField<SmartexamTransportMileageListRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_mileage_list.created_by</code>.
     */
    public final TableField<SmartexamTransportMileageListRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_mileage_list.update_ts</code>.
     */
    public final TableField<SmartexamTransportMileageListRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_mileage_list.updated_by</code>.
     */
    public final TableField<SmartexamTransportMileageListRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_mileage_list.delete_ts</code>.
     */
    public final TableField<SmartexamTransportMileageListRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_mileage_list.deleted_by</code>.
     */
    public final TableField<SmartexamTransportMileageListRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_transport_mileage_list.date_</code>.
     */
    public final TableField<SmartexamTransportMileageListRecord, LocalDate> DATE_ = createField(DSL.name("date_"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>public.smartexam_transport_mileage_list.mileage</code>.
     */
    public final TableField<SmartexamTransportMileageListRecord, Long> MILEAGE = createField(DSL.name("mileage"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>public.smartexam_transport_mileage_list.transport_id</code>.
     */
    public final TableField<SmartexamTransportMileageListRecord, UUID> TRANSPORT_ID = createField(DSL.name("transport_id"), SQLDataType.UUID, this, "");

    private SmartexamTransportMileageList(Name alias, Table<SmartexamTransportMileageListRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmartexamTransportMileageList(Name alias, Table<SmartexamTransportMileageListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.smartexam_transport_mileage_list</code>
     * table reference
     */
    public SmartexamTransportMileageList(String alias) {
        this(DSL.name(alias), SMARTEXAM_TRANSPORT_MILEAGE_LIST);
    }

    /**
     * Create an aliased <code>public.smartexam_transport_mileage_list</code>
     * table reference
     */
    public SmartexamTransportMileageList(Name alias) {
        this(alias, SMARTEXAM_TRANSPORT_MILEAGE_LIST);
    }

    /**
     * Create a <code>public.smartexam_transport_mileage_list</code> table
     * reference
     */
    public SmartexamTransportMileageList() {
        this(DSL.name("smartexam_transport_mileage_list"), null);
    }

    public <O extends Record> SmartexamTransportMileageList(Table<O> child, ForeignKey<O, SmartexamTransportMileageListRecord> key) {
        super(child, key, SMARTEXAM_TRANSPORT_MILEAGE_LIST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SMARTEXAM_TRANSPORT_MILEAGE_LIST_ON_TRANSPORT);
    }

    @Override
    public UniqueKey<SmartexamTransportMileageListRecord> getPrimaryKey() {
        return Keys.SMARTEXAM_TRANSPORT_MILEAGE_LIST_PKEY;
    }

    @Override
    public List<ForeignKey<SmartexamTransportMileageListRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SMARTEXAM_TRANSPORT_MILEAGE_LIST__FK_SMARTEXAM_TRANSPORT_MILEAGE_LIST_ON_TRANSPORT);
    }

    private transient SmartmonTransport _smartmonTransport;

    public SmartmonTransport smartmonTransport() {
        if (_smartmonTransport == null)
            _smartmonTransport = new SmartmonTransport(this, Keys.SMARTEXAM_TRANSPORT_MILEAGE_LIST__FK_SMARTEXAM_TRANSPORT_MILEAGE_LIST_ON_TRANSPORT);

        return _smartmonTransport;
    }

    @Override
    public SmartexamTransportMileageList as(String alias) {
        return new SmartexamTransportMileageList(DSL.name(alias), this);
    }

    @Override
    public SmartexamTransportMileageList as(Name alias) {
        return new SmartexamTransportMileageList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamTransportMileageList rename(String name) {
        return new SmartexamTransportMileageList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamTransportMileageList rename(Name name) {
        return new SmartexamTransportMileageList(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, LocalDate, Long, UUID> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}