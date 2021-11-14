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
import nu.studer.sample.tables.records.SmartexamRepairRequestRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
public class SmartexamRepairRequest extends TableImpl<SmartexamRepairRequestRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.smartexam_repair_request</code>
     */
    public static final SmartexamRepairRequest SMARTEXAM_REPAIR_REQUEST = new SmartexamRepairRequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmartexamRepairRequestRecord> getRecordType() {
        return SmartexamRepairRequestRecord.class;
    }

    /**
     * The column <code>public.smartexam_repair_request.id</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.smartexam_repair_request.version</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.smartexam_repair_request.create_ts</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_repair_request.created_by</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_repair_request.update_ts</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_repair_request.updated_by</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_repair_request.delete_ts</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_repair_request.deleted_by</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_repair_request.name</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.smartexam_repair_request.shop_id</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, UUID> SHOP_ID = createField(DSL.name("shop_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.smartexam_repair_request.stock_id</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, UUID> STOCK_ID = createField(DSL.name("stock_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.smartexam_repair_request.date_start</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, LocalDateTime> DATE_START = createField(DSL.name("date_start"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_repair_request.date_end</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, LocalDateTime> DATE_END = createField(DSL.name("date_end"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_repair_request.completed</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, Boolean> COMPLETED = createField(DSL.name("completed"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.smartexam_repair_request.posted</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, Boolean> POSTED = createField(DSL.name("posted"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.smartexam_repair_request.deletion_mark</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, Boolean> DELETION_MARK = createField(DSL.name("deletion_mark"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.smartexam_repair_request.organization_id</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, UUID> ORGANIZATION_ID = createField(DSL.name("organization_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.smartexam_repair_request.repair_method</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, String> REPAIR_METHOD = createField(DSL.name("repair_method"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_repair_request.description</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.smartexam_repair_request.check_list_id</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, UUID> CHECK_LIST_ID = createField(DSL.name("check_list_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.smartexam_repair_request.time_</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, LocalDateTime> TIME_ = createField(DSL.name("time_"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.smartexam_repair_request.sum_</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, Double> SUM_ = createField(DSL.name("sum_"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>public.smartexam_repair_request.agreement</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, String> AGREEMENT = createField(DSL.name("agreement"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_repair_request.driver_id</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, UUID> DRIVER_ID = createField(DSL.name("driver_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.smartexam_repair_request.sync</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, Boolean> SYNC = createField(DSL.name("sync"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.smartexam_repair_request.master_id</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, UUID> MASTER_ID = createField(DSL.name("master_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.smartexam_repair_request.mechanic_id</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, UUID> MECHANIC_ID = createField(DSL.name("mechanic_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.smartexam_repair_request.employee_id</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, UUID> EMPLOYEE_ID = createField(DSL.name("employee_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.smartexam_repair_request.transport_id</code>.
     */
    public final TableField<SmartexamRepairRequestRecord, UUID> TRANSPORT_ID = createField(DSL.name("transport_id"), SQLDataType.UUID, this, "");

    private SmartexamRepairRequest(Name alias, Table<SmartexamRepairRequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmartexamRepairRequest(Name alias, Table<SmartexamRepairRequestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.smartexam_repair_request</code> table
     * reference
     */
    public SmartexamRepairRequest(String alias) {
        this(DSL.name(alias), SMARTEXAM_REPAIR_REQUEST);
    }

    /**
     * Create an aliased <code>public.smartexam_repair_request</code> table
     * reference
     */
    public SmartexamRepairRequest(Name alias) {
        this(alias, SMARTEXAM_REPAIR_REQUEST);
    }

    /**
     * Create a <code>public.smartexam_repair_request</code> table reference
     */
    public SmartexamRepairRequest() {
        this(DSL.name("smartexam_repair_request"), null);
    }

    public <O extends Record> SmartexamRepairRequest(Table<O> child, ForeignKey<O, SmartexamRepairRequestRecord> key) {
        super(child, key, SMARTEXAM_REPAIR_REQUEST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SMARTEXAM_REPAIR_REQUEST_ON_CHECK_LIST, Indexes.IDX_SMARTEXAM_REPAIR_REQUEST_ON_DRIVER, Indexes.IDX_SMARTEXAM_REPAIR_REQUEST_ON_EMPLOYEE, Indexes.IDX_SMARTEXAM_REPAIR_REQUEST_ON_MASTER, Indexes.IDX_SMARTEXAM_REPAIR_REQUEST_ON_MECHANIC, Indexes.IDX_SMARTEXAM_REPAIR_REQUEST_ON_ORGANIZATION, Indexes.IDX_SMARTEXAM_REPAIR_REQUEST_ON_SHOP, Indexes.IDX_SMARTEXAM_REPAIR_REQUEST_ON_STOCK, Indexes.IDX_SMARTEXAM_REPAIR_REQUEST_ON_TRANSPORT, Indexes.IDX_SMARTEXAM_REPAIR_REQUEST_UK_NAME);
    }

    @Override
    public UniqueKey<SmartexamRepairRequestRecord> getPrimaryKey() {
        return Keys.SMARTEXAM_REPAIR_REQUEST_PKEY;
    }

    @Override
    public List<ForeignKey<SmartexamRepairRequestRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_SHOP, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_STOCK, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_ORGANIZATION, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_CHECK_LIST, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_DRIVER, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_MASTER, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_MECHANIC, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_EMPLOYEE, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_TRANSPORT);
    }

    private transient SmartexamShop _smartexamShop;
    private transient SmartexamStock _smartexamStock;
    private transient SmartexamOrganization _smartexamOrganization;
    private transient SmartmonCheckListInstance _smartmonCheckListInstance;
    private transient SmartexamEmployee _smartexamEmployee;
    private transient CompanyaddonBaseEmployee _fkSmartexamRepairRequestOnMaster;
    private transient CompanyaddonBaseEmployee _fkSmartexamRepairRequestOnMechanic;
    private transient CompanyaddonBaseEmployee _fkSmartexamRepairRequestOnEmployee;
    private transient SmartmonTransport _smartmonTransport;

    public SmartexamShop smartexamShop() {
        if (_smartexamShop == null)
            _smartexamShop = new SmartexamShop(this, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_SHOP);

        return _smartexamShop;
    }

    public SmartexamStock smartexamStock() {
        if (_smartexamStock == null)
            _smartexamStock = new SmartexamStock(this, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_STOCK);

        return _smartexamStock;
    }

    public SmartexamOrganization smartexamOrganization() {
        if (_smartexamOrganization == null)
            _smartexamOrganization = new SmartexamOrganization(this, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_ORGANIZATION);

        return _smartexamOrganization;
    }

    public SmartmonCheckListInstance smartmonCheckListInstance() {
        if (_smartmonCheckListInstance == null)
            _smartmonCheckListInstance = new SmartmonCheckListInstance(this, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_CHECK_LIST);

        return _smartmonCheckListInstance;
    }

    public SmartexamEmployee smartexamEmployee() {
        if (_smartexamEmployee == null)
            _smartexamEmployee = new SmartexamEmployee(this, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_DRIVER);

        return _smartexamEmployee;
    }

    public CompanyaddonBaseEmployee fkSmartexamRepairRequestOnMaster() {
        if (_fkSmartexamRepairRequestOnMaster == null)
            _fkSmartexamRepairRequestOnMaster = new CompanyaddonBaseEmployee(this, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_MASTER);

        return _fkSmartexamRepairRequestOnMaster;
    }

    public CompanyaddonBaseEmployee fkSmartexamRepairRequestOnMechanic() {
        if (_fkSmartexamRepairRequestOnMechanic == null)
            _fkSmartexamRepairRequestOnMechanic = new CompanyaddonBaseEmployee(this, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_MECHANIC);

        return _fkSmartexamRepairRequestOnMechanic;
    }

    public CompanyaddonBaseEmployee fkSmartexamRepairRequestOnEmployee() {
        if (_fkSmartexamRepairRequestOnEmployee == null)
            _fkSmartexamRepairRequestOnEmployee = new CompanyaddonBaseEmployee(this, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_EMPLOYEE);

        return _fkSmartexamRepairRequestOnEmployee;
    }

    public SmartmonTransport smartmonTransport() {
        if (_smartmonTransport == null)
            _smartmonTransport = new SmartmonTransport(this, Keys.SMARTEXAM_REPAIR_REQUEST__FK_SMARTEXAM_REPAIR_REQUEST_ON_TRANSPORT);

        return _smartmonTransport;
    }

    @Override
    public SmartexamRepairRequest as(String alias) {
        return new SmartexamRepairRequest(DSL.name(alias), this);
    }

    @Override
    public SmartexamRepairRequest as(Name alias) {
        return new SmartexamRepairRequest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamRepairRequest rename(String name) {
        return new SmartexamRepairRequest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamRepairRequest rename(Name name) {
        return new SmartexamRepairRequest(name, null);
    }
}