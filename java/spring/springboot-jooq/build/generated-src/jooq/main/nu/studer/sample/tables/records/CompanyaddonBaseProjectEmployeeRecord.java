/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.CompanyaddonBaseProjectEmployee;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanyaddonBaseProjectEmployeeRecord extends UpdatableRecordImpl<CompanyaddonBaseProjectEmployeeRecord> implements Record12<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, UUID, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.companyaddon_base_project_employee.id</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_project_employee.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_project_employee.version</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_project_employee.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_project_employee.create_ts</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_project_employee.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_project_employee.created_by</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_project_employee.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_project_employee.update_ts</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_project_employee.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_project_employee.updated_by</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_project_employee.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_project_employee.delete_ts</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_project_employee.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_project_employee.deleted_by</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_project_employee.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_project_employee.received</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setReceived(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_project_employee.received</code>.
     */
    public Boolean getReceived() {
        return (Boolean) get(8);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_project_employee.kafka_key</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setKafkaKey(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_project_employee.kafka_key</code>.
     */
    public String getKafkaKey() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_project_employee.project_id</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setProjectId(UUID value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_project_employee.project_id</code>.
     */
    public UUID getProjectId() {
        return (UUID) get(10);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_project_employee.employee_id</code>.
     */
    public CompanyaddonBaseProjectEmployeeRecord setEmployeeId(UUID value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_project_employee.employee_id</code>.
     */
    public UUID getEmployeeId() {
        return (UUID) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, UUID, UUID> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, UUID, UUID> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.DELETED_BY;
    }

    @Override
    public Field<Boolean> field9() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.RECEIVED;
    }

    @Override
    public Field<String> field10() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.KAFKA_KEY;
    }

    @Override
    public Field<UUID> field11() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.PROJECT_ID;
    }

    @Override
    public Field<UUID> field12() {
        return CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE.EMPLOYEE_ID;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getVersion();
    }

    @Override
    public LocalDateTime component3() {
        return getCreateTs();
    }

    @Override
    public String component4() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component5() {
        return getUpdateTs();
    }

    @Override
    public String component6() {
        return getUpdatedBy();
    }

    @Override
    public LocalDateTime component7() {
        return getDeleteTs();
    }

    @Override
    public String component8() {
        return getDeletedBy();
    }

    @Override
    public Boolean component9() {
        return getReceived();
    }

    @Override
    public String component10() {
        return getKafkaKey();
    }

    @Override
    public UUID component11() {
        return getProjectId();
    }

    @Override
    public UUID component12() {
        return getEmployeeId();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getVersion();
    }

    @Override
    public LocalDateTime value3() {
        return getCreateTs();
    }

    @Override
    public String value4() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value5() {
        return getUpdateTs();
    }

    @Override
    public String value6() {
        return getUpdatedBy();
    }

    @Override
    public LocalDateTime value7() {
        return getDeleteTs();
    }

    @Override
    public String value8() {
        return getDeletedBy();
    }

    @Override
    public Boolean value9() {
        return getReceived();
    }

    @Override
    public String value10() {
        return getKafkaKey();
    }

    @Override
    public UUID value11() {
        return getProjectId();
    }

    @Override
    public UUID value12() {
        return getEmployeeId();
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value9(Boolean value) {
        setReceived(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value10(String value) {
        setKafkaKey(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value11(UUID value) {
        setProjectId(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord value12(UUID value) {
        setEmployeeId(value);
        return this;
    }

    @Override
    public CompanyaddonBaseProjectEmployeeRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, Boolean value9, String value10, UUID value11, UUID value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompanyaddonBaseProjectEmployeeRecord
     */
    public CompanyaddonBaseProjectEmployeeRecord() {
        super(CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE);
    }

    /**
     * Create a detached, initialised CompanyaddonBaseProjectEmployeeRecord
     */
    public CompanyaddonBaseProjectEmployeeRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, Boolean received, String kafkaKey, UUID projectId, UUID employeeId) {
        super(CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setReceived(received);
        setKafkaKey(kafkaKey);
        setProjectId(projectId);
        setEmployeeId(employeeId);
    }

    /**
     * Create a detached, initialised CompanyaddonBaseProjectEmployeeRecord
     */
    public CompanyaddonBaseProjectEmployeeRecord(nu.studer.sample.tables.pojos.CompanyaddonBaseProjectEmployee value) {
        super(CompanyaddonBaseProjectEmployee.COMPANYADDON_BASE_PROJECT_EMPLOYEE);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setReceived(value.getReceived());
            setKafkaKey(value.getKafkaKey());
            setProjectId(value.getProjectId());
            setEmployeeId(value.getEmployeeId());
        }
    }
}