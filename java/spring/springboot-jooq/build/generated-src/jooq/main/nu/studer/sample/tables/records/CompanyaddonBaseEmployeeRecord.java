/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.CompanyaddonBaseEmployee;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanyaddonBaseEmployeeRecord extends UpdatableRecordImpl<CompanyaddonBaseEmployeeRecord> implements Record21<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, String, String, String, UUID, Boolean, LocalDate, String, Boolean, String, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.companyaddon_base_employee.id</code>.
     */
    public CompanyaddonBaseEmployeeRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.version</code>.
     */
    public CompanyaddonBaseEmployeeRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.create_ts</code>.
     */
    public CompanyaddonBaseEmployeeRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.created_by</code>.
     */
    public CompanyaddonBaseEmployeeRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.update_ts</code>.
     */
    public CompanyaddonBaseEmployeeRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.updated_by</code>.
     */
    public CompanyaddonBaseEmployeeRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.delete_ts</code>.
     */
    public CompanyaddonBaseEmployeeRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.deleted_by</code>.
     */
    public CompanyaddonBaseEmployeeRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.received</code>.
     */
    public CompanyaddonBaseEmployeeRecord setReceived(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.received</code>.
     */
    public Boolean getReceived() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.kafka_key</code>.
     */
    public CompanyaddonBaseEmployeeRecord setKafkaKey(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.kafka_key</code>.
     */
    public String getKafkaKey() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.last_name</code>.
     */
    public CompanyaddonBaseEmployeeRecord setLastName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.last_name</code>.
     */
    public String getLastName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.name</code>.
     */
    public CompanyaddonBaseEmployeeRecord setName(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.name</code>.
     */
    public String getName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.middle_name</code>.
     */
    public CompanyaddonBaseEmployeeRecord setMiddleName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.middle_name</code>.
     */
    public String getMiddleName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.full_name</code>.
     */
    public CompanyaddonBaseEmployeeRecord setFullName(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.full_name</code>.
     */
    public String getFullName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.user_id</code>.
     */
    public CompanyaddonBaseEmployeeRecord setUserId(UUID value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.user_id</code>.
     */
    public UUID getUserId() {
        return (UUID) get(14);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.is_active</code>.
     */
    public CompanyaddonBaseEmployeeRecord setIsActive(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.is_active</code>.
     */
    public Boolean getIsActive() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.date_of_birth</code>.
     */
    public CompanyaddonBaseEmployeeRecord setDateOfBirth(LocalDate value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.date_of_birth</code>.
     */
    public LocalDate getDateOfBirth() {
        return (LocalDate) get(16);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_employee.personnel_number</code>.
     */
    public CompanyaddonBaseEmployeeRecord setPersonnelNumber(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_employee.personnel_number</code>.
     */
    public String getPersonnelNumber() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.is_shift_work</code>.
     */
    public CompanyaddonBaseEmployeeRecord setIsShiftWork(Boolean value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.is_shift_work</code>.
     */
    public Boolean getIsShiftWork() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.comment_</code>.
     */
    public CompanyaddonBaseEmployeeRecord setComment_(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.comment_</code>.
     */
    public String getComment_() {
        return (String) get(19);
    }

    /**
     * Setter for <code>public.companyaddon_base_employee.contacts_id</code>.
     */
    public CompanyaddonBaseEmployeeRecord setContactsId(UUID value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_employee.contacts_id</code>.
     */
    public UUID getContactsId() {
        return (UUID) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, String, String, String, UUID, Boolean, LocalDate, String, Boolean, String, UUID> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, String, String, String, UUID, Boolean, LocalDate, String, Boolean, String, UUID> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.DELETED_BY;
    }

    @Override
    public Field<Boolean> field9() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.RECEIVED;
    }

    @Override
    public Field<String> field10() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.KAFKA_KEY;
    }

    @Override
    public Field<String> field11() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.LAST_NAME;
    }

    @Override
    public Field<String> field12() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.NAME;
    }

    @Override
    public Field<String> field13() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.MIDDLE_NAME;
    }

    @Override
    public Field<String> field14() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.FULL_NAME;
    }

    @Override
    public Field<UUID> field15() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.USER_ID;
    }

    @Override
    public Field<Boolean> field16() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.IS_ACTIVE;
    }

    @Override
    public Field<LocalDate> field17() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.DATE_OF_BIRTH;
    }

    @Override
    public Field<String> field18() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.PERSONNEL_NUMBER;
    }

    @Override
    public Field<Boolean> field19() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.IS_SHIFT_WORK;
    }

    @Override
    public Field<String> field20() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.COMMENT_;
    }

    @Override
    public Field<UUID> field21() {
        return CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE.CONTACTS_ID;
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
    public String component11() {
        return getLastName();
    }

    @Override
    public String component12() {
        return getName();
    }

    @Override
    public String component13() {
        return getMiddleName();
    }

    @Override
    public String component14() {
        return getFullName();
    }

    @Override
    public UUID component15() {
        return getUserId();
    }

    @Override
    public Boolean component16() {
        return getIsActive();
    }

    @Override
    public LocalDate component17() {
        return getDateOfBirth();
    }

    @Override
    public String component18() {
        return getPersonnelNumber();
    }

    @Override
    public Boolean component19() {
        return getIsShiftWork();
    }

    @Override
    public String component20() {
        return getComment_();
    }

    @Override
    public UUID component21() {
        return getContactsId();
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
    public String value11() {
        return getLastName();
    }

    @Override
    public String value12() {
        return getName();
    }

    @Override
    public String value13() {
        return getMiddleName();
    }

    @Override
    public String value14() {
        return getFullName();
    }

    @Override
    public UUID value15() {
        return getUserId();
    }

    @Override
    public Boolean value16() {
        return getIsActive();
    }

    @Override
    public LocalDate value17() {
        return getDateOfBirth();
    }

    @Override
    public String value18() {
        return getPersonnelNumber();
    }

    @Override
    public Boolean value19() {
        return getIsShiftWork();
    }

    @Override
    public String value20() {
        return getComment_();
    }

    @Override
    public UUID value21() {
        return getContactsId();
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value9(Boolean value) {
        setReceived(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value10(String value) {
        setKafkaKey(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value11(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value12(String value) {
        setName(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value13(String value) {
        setMiddleName(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value14(String value) {
        setFullName(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value15(UUID value) {
        setUserId(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value16(Boolean value) {
        setIsActive(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value17(LocalDate value) {
        setDateOfBirth(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value18(String value) {
        setPersonnelNumber(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value19(Boolean value) {
        setIsShiftWork(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value20(String value) {
        setComment_(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord value21(UUID value) {
        setContactsId(value);
        return this;
    }

    @Override
    public CompanyaddonBaseEmployeeRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, Boolean value9, String value10, String value11, String value12, String value13, String value14, UUID value15, Boolean value16, LocalDate value17, String value18, Boolean value19, String value20, UUID value21) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompanyaddonBaseEmployeeRecord
     */
    public CompanyaddonBaseEmployeeRecord() {
        super(CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE);
    }

    /**
     * Create a detached, initialised CompanyaddonBaseEmployeeRecord
     */
    public CompanyaddonBaseEmployeeRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, Boolean received, String kafkaKey, String lastName, String name, String middleName, String fullName, UUID userId, Boolean isActive, LocalDate dateOfBirth, String personnelNumber, Boolean isShiftWork, String comment_, UUID contactsId) {
        super(CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE);

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
        setLastName(lastName);
        setName(name);
        setMiddleName(middleName);
        setFullName(fullName);
        setUserId(userId);
        setIsActive(isActive);
        setDateOfBirth(dateOfBirth);
        setPersonnelNumber(personnelNumber);
        setIsShiftWork(isShiftWork);
        setComment_(comment_);
        setContactsId(contactsId);
    }

    /**
     * Create a detached, initialised CompanyaddonBaseEmployeeRecord
     */
    public CompanyaddonBaseEmployeeRecord(nu.studer.sample.tables.pojos.CompanyaddonBaseEmployee value) {
        super(CompanyaddonBaseEmployee.COMPANYADDON_BASE_EMPLOYEE);

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
            setLastName(value.getLastName());
            setName(value.getName());
            setMiddleName(value.getMiddleName());
            setFullName(value.getFullName());
            setUserId(value.getUserId());
            setIsActive(value.getIsActive());
            setDateOfBirth(value.getDateOfBirth());
            setPersonnelNumber(value.getPersonnelNumber());
            setIsShiftWork(value.getIsShiftWork());
            setComment_(value.getComment_());
            setContactsId(value.getContactsId());
        }
    }
}
