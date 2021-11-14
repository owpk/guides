/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.util.UUID;

import nu.studer.sample.tables.SmartexamTransportEmployeeLink;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamTransportEmployeeLinkRecord extends TableRecordImpl<SmartexamTransportEmployeeLinkRecord> implements Record2<UUID, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>public.smartexam_transport_employee_link.employee_id</code>.
     */
    public SmartexamTransportEmployeeLinkRecord setEmployeeId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_transport_employee_link.employee_id</code>.
     */
    public UUID getEmployeeId() {
        return (UUID) get(0);
    }

    /**
     * Setter for
     * <code>public.smartexam_transport_employee_link.transport_id</code>.
     */
    public SmartexamTransportEmployeeLinkRecord setTransportId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_transport_employee_link.transport_id</code>.
     */
    public UUID getTransportId() {
        return (UUID) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, UUID> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UUID, UUID> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SmartexamTransportEmployeeLink.SMARTEXAM_TRANSPORT_EMPLOYEE_LINK.EMPLOYEE_ID;
    }

    @Override
    public Field<UUID> field2() {
        return SmartexamTransportEmployeeLink.SMARTEXAM_TRANSPORT_EMPLOYEE_LINK.TRANSPORT_ID;
    }

    @Override
    public UUID component1() {
        return getEmployeeId();
    }

    @Override
    public UUID component2() {
        return getTransportId();
    }

    @Override
    public UUID value1() {
        return getEmployeeId();
    }

    @Override
    public UUID value2() {
        return getTransportId();
    }

    @Override
    public SmartexamTransportEmployeeLinkRecord value1(UUID value) {
        setEmployeeId(value);
        return this;
    }

    @Override
    public SmartexamTransportEmployeeLinkRecord value2(UUID value) {
        setTransportId(value);
        return this;
    }

    @Override
    public SmartexamTransportEmployeeLinkRecord values(UUID value1, UUID value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SmartexamTransportEmployeeLinkRecord
     */
    public SmartexamTransportEmployeeLinkRecord() {
        super(SmartexamTransportEmployeeLink.SMARTEXAM_TRANSPORT_EMPLOYEE_LINK);
    }

    /**
     * Create a detached, initialised SmartexamTransportEmployeeLinkRecord
     */
    public SmartexamTransportEmployeeLinkRecord(UUID employeeId, UUID transportId) {
        super(SmartexamTransportEmployeeLink.SMARTEXAM_TRANSPORT_EMPLOYEE_LINK);

        setEmployeeId(employeeId);
        setTransportId(transportId);
    }

    /**
     * Create a detached, initialised SmartexamTransportEmployeeLinkRecord
     */
    public SmartexamTransportEmployeeLinkRecord(nu.studer.sample.tables.pojos.SmartexamTransportEmployeeLink value) {
        super(SmartexamTransportEmployeeLink.SMARTEXAM_TRANSPORT_EMPLOYEE_LINK);

        if (value != null) {
            setEmployeeId(value.getEmployeeId());
            setTransportId(value.getTransportId());
        }
    }
}
