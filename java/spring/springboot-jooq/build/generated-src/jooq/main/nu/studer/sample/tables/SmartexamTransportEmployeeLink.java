/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import nu.studer.sample.Indexes;
import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SmartexamTransportEmployeeLinkRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamTransportEmployeeLink extends TableImpl<SmartexamTransportEmployeeLinkRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.smartexam_transport_employee_link</code>
     */
    public static final SmartexamTransportEmployeeLink SMARTEXAM_TRANSPORT_EMPLOYEE_LINK = new SmartexamTransportEmployeeLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmartexamTransportEmployeeLinkRecord> getRecordType() {
        return SmartexamTransportEmployeeLinkRecord.class;
    }

    /**
     * The column
     * <code>public.smartexam_transport_employee_link.employee_id</code>.
     */
    public final TableField<SmartexamTransportEmployeeLinkRecord, UUID> EMPLOYEE_ID = createField(DSL.name("employee_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column
     * <code>public.smartexam_transport_employee_link.transport_id</code>.
     */
    public final TableField<SmartexamTransportEmployeeLinkRecord, UUID> TRANSPORT_ID = createField(DSL.name("transport_id"), SQLDataType.UUID, this, "");

    private SmartexamTransportEmployeeLink(Name alias, Table<SmartexamTransportEmployeeLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmartexamTransportEmployeeLink(Name alias, Table<SmartexamTransportEmployeeLinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.smartexam_transport_employee_link</code>
     * table reference
     */
    public SmartexamTransportEmployeeLink(String alias) {
        this(DSL.name(alias), SMARTEXAM_TRANSPORT_EMPLOYEE_LINK);
    }

    /**
     * Create an aliased <code>public.smartexam_transport_employee_link</code>
     * table reference
     */
    public SmartexamTransportEmployeeLink(Name alias) {
        this(alias, SMARTEXAM_TRANSPORT_EMPLOYEE_LINK);
    }

    /**
     * Create a <code>public.smartexam_transport_employee_link</code> table
     * reference
     */
    public SmartexamTransportEmployeeLink() {
        this(DSL.name("smartexam_transport_employee_link"), null);
    }

    public <O extends Record> SmartexamTransportEmployeeLink(Table<O> child, ForeignKey<O, SmartexamTransportEmployeeLinkRecord> key) {
        super(child, key, SMARTEXAM_TRANSPORT_EMPLOYEE_LINK);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SMARTEXAM_TRANSPORT_EMPLOYEE_LINK_ON_TRANSPORT);
    }

    @Override
    public List<ForeignKey<SmartexamTransportEmployeeLinkRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SMARTEXAM_TRANSPORT_EMPLOYEE_LINK__FK_TRAEMP_ON_EMPLOYEE, Keys.SMARTEXAM_TRANSPORT_EMPLOYEE_LINK__FK_SMARTEXAM_TRANSPORT_EMPLOYEE_LINK_ON_TRANSPORT);
    }

    private transient SmartexamEmployee _smartexamEmployee;
    private transient SmartmonTransport _smartmonTransport;

    public SmartexamEmployee smartexamEmployee() {
        if (_smartexamEmployee == null)
            _smartexamEmployee = new SmartexamEmployee(this, Keys.SMARTEXAM_TRANSPORT_EMPLOYEE_LINK__FK_TRAEMP_ON_EMPLOYEE);

        return _smartexamEmployee;
    }

    public SmartmonTransport smartmonTransport() {
        if (_smartmonTransport == null)
            _smartmonTransport = new SmartmonTransport(this, Keys.SMARTEXAM_TRANSPORT_EMPLOYEE_LINK__FK_SMARTEXAM_TRANSPORT_EMPLOYEE_LINK_ON_TRANSPORT);

        return _smartmonTransport;
    }

    @Override
    public SmartexamTransportEmployeeLink as(String alias) {
        return new SmartexamTransportEmployeeLink(DSL.name(alias), this);
    }

    @Override
    public SmartexamTransportEmployeeLink as(Name alias) {
        return new SmartexamTransportEmployeeLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamTransportEmployeeLink rename(String name) {
        return new SmartexamTransportEmployeeLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamTransportEmployeeLink rename(Name name) {
        return new SmartexamTransportEmployeeLink(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, UUID> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}