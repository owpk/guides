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
import nu.studer.sample.tables.records.SmartmonCheckListInstanceRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
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
public class SmartmonCheckListInstance extends TableImpl<SmartmonCheckListInstanceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.smartmon_check_list_instance</code>
     */
    public static final SmartmonCheckListInstance SMARTMON_CHECK_LIST_INSTANCE = new SmartmonCheckListInstance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmartmonCheckListInstanceRecord> getRecordType() {
        return SmartmonCheckListInstanceRecord.class;
    }

    /**
     * The column <code>public.smartmon_check_list_instance.id</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.version</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.create_ts</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.created_by</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.update_ts</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.updated_by</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.delete_ts</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.deleted_by</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.date_</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, LocalDateTime> DATE_ = createField(DSL.name("date_"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartmon_check_list_instance.responsible_id</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, UUID> RESPONSIBLE_ID = createField(DSL.name("responsible_id"), SQLDataType.UUID, this, "");

    /**
     * The column
     * <code>public.smartmon_check_list_instance.check_list_id</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, UUID> CHECK_LIST_ID = createField(DSL.name("check_list_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.status</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.comment_</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, String> COMMENT_ = createField(DSL.name("comment_"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.employee_id</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, UUID> EMPLOYEE_ID = createField(DSL.name("employee_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.sync_id</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, String> SYNC_ID = createField(DSL.name("sync_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.division_id</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, UUID> DIVISION_ID = createField(DSL.name("division_id"), SQLDataType.UUID, this, "");

    /**
     * The column
     * <code>public.smartmon_check_list_instance.instance_status</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, String> INSTANCE_STATUS = createField(DSL.name("instance_status"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.foreign_list</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, Boolean> FOREIGN_LIST = createField(DSL.name("foreign_list"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.smartmon_check_list_instance.transport_id</code>.
     */
    public final TableField<SmartmonCheckListInstanceRecord, UUID> TRANSPORT_ID = createField(DSL.name("transport_id"), SQLDataType.UUID, this, "");

    private SmartmonCheckListInstance(Name alias, Table<SmartmonCheckListInstanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmartmonCheckListInstance(Name alias, Table<SmartmonCheckListInstanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.smartmon_check_list_instance</code> table
     * reference
     */
    public SmartmonCheckListInstance(String alias) {
        this(DSL.name(alias), SMARTMON_CHECK_LIST_INSTANCE);
    }

    /**
     * Create an aliased <code>public.smartmon_check_list_instance</code> table
     * reference
     */
    public SmartmonCheckListInstance(Name alias) {
        this(alias, SMARTMON_CHECK_LIST_INSTANCE);
    }

    /**
     * Create a <code>public.smartmon_check_list_instance</code> table reference
     */
    public SmartmonCheckListInstance() {
        this(DSL.name("smartmon_check_list_instance"), null);
    }

    public <O extends Record> SmartmonCheckListInstance(Table<O> child, ForeignKey<O, SmartmonCheckListInstanceRecord> key) {
        super(child, key, SMARTMON_CHECK_LIST_INSTANCE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SMARTMON_CHECK_LIST_INSTANCE_ON_CHECK_LIST, Indexes.IDX_SMARTMON_CHECK_LIST_INSTANCE_ON_DIVISION, Indexes.IDX_SMARTMON_CHECK_LIST_INSTANCE_ON_EMPLOYEE, Indexes.IDX_SMARTMON_CHECK_LIST_INSTANCE_ON_RESPONSIBLE, Indexes.IDX_SMARTMON_CHECK_LIST_INSTANCE_ON_TRANSPORT, Indexes.IDX_SMARTMON_CHECK_LIST_INSTANCE_UK_SYNC_ID);
    }

    @Override
    public UniqueKey<SmartmonCheckListInstanceRecord> getPrimaryKey() {
        return Keys.SMARTMON_CHECK_LIST_INSTANCE_PKEY;
    }

    @Override
    public List<ForeignKey<SmartmonCheckListInstanceRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SMARTMON_CHECK_LIST_INSTANCE__FK_SMARTMON_CHECK_LIST_INSTANCE_ON_RESPONSIBLE, Keys.SMARTMON_CHECK_LIST_INSTANCE__FK_SMARTMON_CHECK_LIST_INSTANCE_ON_CHECK_LIST, Keys.SMARTMON_CHECK_LIST_INSTANCE__FK_SMARTMON_CHECK_LIST_INSTANCE_ON_EMPLOYEE, Keys.SMARTMON_CHECK_LIST_INSTANCE__FK_SMARTMON_CHECK_LIST_INSTANCE_ON_DIVISION, Keys.SMARTMON_CHECK_LIST_INSTANCE__FK_SMARTMON_CHECK_LIST_INSTANCE_ON_TRANSPORT);
    }

    private transient SmartexamEmployee _fkSmartmonCheckListInstanceOnResponsible;
    private transient SmartmonCheckList _smartmonCheckList;
    private transient SmartexamEmployee _fkSmartmonCheckListInstanceOnEmployee;
    private transient SmartmonDivision _smartmonDivision;
    private transient SmartmonTransport _smartmonTransport;

    public SmartexamEmployee fkSmartmonCheckListInstanceOnResponsible() {
        if (_fkSmartmonCheckListInstanceOnResponsible == null)
            _fkSmartmonCheckListInstanceOnResponsible = new SmartexamEmployee(this, Keys.SMARTMON_CHECK_LIST_INSTANCE__FK_SMARTMON_CHECK_LIST_INSTANCE_ON_RESPONSIBLE);

        return _fkSmartmonCheckListInstanceOnResponsible;
    }

    public SmartmonCheckList smartmonCheckList() {
        if (_smartmonCheckList == null)
            _smartmonCheckList = new SmartmonCheckList(this, Keys.SMARTMON_CHECK_LIST_INSTANCE__FK_SMARTMON_CHECK_LIST_INSTANCE_ON_CHECK_LIST);

        return _smartmonCheckList;
    }

    public SmartexamEmployee fkSmartmonCheckListInstanceOnEmployee() {
        if (_fkSmartmonCheckListInstanceOnEmployee == null)
            _fkSmartmonCheckListInstanceOnEmployee = new SmartexamEmployee(this, Keys.SMARTMON_CHECK_LIST_INSTANCE__FK_SMARTMON_CHECK_LIST_INSTANCE_ON_EMPLOYEE);

        return _fkSmartmonCheckListInstanceOnEmployee;
    }

    public SmartmonDivision smartmonDivision() {
        if (_smartmonDivision == null)
            _smartmonDivision = new SmartmonDivision(this, Keys.SMARTMON_CHECK_LIST_INSTANCE__FK_SMARTMON_CHECK_LIST_INSTANCE_ON_DIVISION);

        return _smartmonDivision;
    }

    public SmartmonTransport smartmonTransport() {
        if (_smartmonTransport == null)
            _smartmonTransport = new SmartmonTransport(this, Keys.SMARTMON_CHECK_LIST_INSTANCE__FK_SMARTMON_CHECK_LIST_INSTANCE_ON_TRANSPORT);

        return _smartmonTransport;
    }

    @Override
    public SmartmonCheckListInstance as(String alias) {
        return new SmartmonCheckListInstance(DSL.name(alias), this);
    }

    @Override
    public SmartmonCheckListInstance as(Name alias) {
        return new SmartmonCheckListInstance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartmonCheckListInstance rename(String name) {
        return new SmartmonCheckListInstance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartmonCheckListInstance rename(Name name) {
        return new SmartmonCheckListInstance(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, LocalDateTime, UUID, UUID, String, String, UUID, String, UUID, String, Boolean, UUID> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
