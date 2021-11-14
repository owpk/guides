/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartexamOrganization;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamOrganizationRecord extends UpdatableRecordImpl<SmartexamOrganizationRecord> implements Record18<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, Integer, String, Boolean, String, String, String, String, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.smartexam_organization.id</code>.
     */
    public SmartexamOrganizationRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.smartexam_organization.version</code>.
     */
    public SmartexamOrganizationRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.smartexam_organization.create_ts</code>.
     */
    public SmartexamOrganizationRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.smartexam_organization.created_by</code>.
     */
    public SmartexamOrganizationRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.smartexam_organization.update_ts</code>.
     */
    public SmartexamOrganizationRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.smartexam_organization.updated_by</code>.
     */
    public SmartexamOrganizationRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.smartexam_organization.delete_ts</code>.
     */
    public SmartexamOrganizationRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.smartexam_organization.deleted_by</code>.
     */
    public SmartexamOrganizationRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.smartexam_organization.name</code>.
     */
    public SmartexamOrganizationRecord setName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.smartexam_organization.full_name</code>.
     */
    public SmartexamOrganizationRecord setFullName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.full_name</code>.
     */
    public String getFullName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.smartexam_organization.online_gibdd_id</code>.
     */
    public SmartexamOrganizationRecord setOnlineGibddId(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.online_gibdd_id</code>.
     */
    public Integer getOnlineGibddId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.smartexam_organization.code</code>.
     */
    public SmartexamOrganizationRecord setCode(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.code</code>.
     */
    public String getCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.smartexam_organization.received</code>.
     */
    public SmartexamOrganizationRecord setReceived(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.received</code>.
     */
    public Boolean getReceived() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>public.smartexam_organization.kafka_key</code>.
     */
    public SmartexamOrganizationRecord setKafkaKey(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.kafka_key</code>.
     */
    public String getKafkaKey() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.smartexam_organization.tax_code</code>.
     */
    public SmartexamOrganizationRecord setTaxCode(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.tax_code</code>.
     */
    public String getTaxCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.smartexam_organization.tax_number</code>.
     */
    public SmartexamOrganizationRecord setTaxNumber(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.tax_number</code>.
     */
    public String getTaxNumber() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.smartexam_organization.comment_</code>.
     */
    public SmartexamOrganizationRecord setComment_(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.comment_</code>.
     */
    public String getComment_() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.smartexam_organization.head_person</code>.
     */
    public SmartexamOrganizationRecord setHeadPerson(UUID value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexam_organization.head_person</code>.
     */
    public UUID getHeadPerson() {
        return (UUID) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, Integer, String, Boolean, String, String, String, String, UUID> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, String, String, Integer, String, Boolean, String, String, String, String, UUID> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.ID;
    }

    @Override
    public Field<Integer> field2() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.DELETED_BY;
    }

    @Override
    public Field<String> field9() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.NAME;
    }

    @Override
    public Field<String> field10() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.FULL_NAME;
    }

    @Override
    public Field<Integer> field11() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.ONLINE_GIBDD_ID;
    }

    @Override
    public Field<String> field12() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.CODE;
    }

    @Override
    public Field<Boolean> field13() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.RECEIVED;
    }

    @Override
    public Field<String> field14() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.KAFKA_KEY;
    }

    @Override
    public Field<String> field15() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.TAX_CODE;
    }

    @Override
    public Field<String> field16() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.TAX_NUMBER;
    }

    @Override
    public Field<String> field17() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.COMMENT_;
    }

    @Override
    public Field<UUID> field18() {
        return SmartexamOrganization.SMARTEXAM_ORGANIZATION.HEAD_PERSON;
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
    public String component9() {
        return getName();
    }

    @Override
    public String component10() {
        return getFullName();
    }

    @Override
    public Integer component11() {
        return getOnlineGibddId();
    }

    @Override
    public String component12() {
        return getCode();
    }

    @Override
    public Boolean component13() {
        return getReceived();
    }

    @Override
    public String component14() {
        return getKafkaKey();
    }

    @Override
    public String component15() {
        return getTaxCode();
    }

    @Override
    public String component16() {
        return getTaxNumber();
    }

    @Override
    public String component17() {
        return getComment_();
    }

    @Override
    public UUID component18() {
        return getHeadPerson();
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
    public String value9() {
        return getName();
    }

    @Override
    public String value10() {
        return getFullName();
    }

    @Override
    public Integer value11() {
        return getOnlineGibddId();
    }

    @Override
    public String value12() {
        return getCode();
    }

    @Override
    public Boolean value13() {
        return getReceived();
    }

    @Override
    public String value14() {
        return getKafkaKey();
    }

    @Override
    public String value15() {
        return getTaxCode();
    }

    @Override
    public String value16() {
        return getTaxNumber();
    }

    @Override
    public String value17() {
        return getComment_();
    }

    @Override
    public UUID value18() {
        return getHeadPerson();
    }

    @Override
    public SmartexamOrganizationRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value9(String value) {
        setName(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value10(String value) {
        setFullName(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value11(Integer value) {
        setOnlineGibddId(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value12(String value) {
        setCode(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value13(Boolean value) {
        setReceived(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value14(String value) {
        setKafkaKey(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value15(String value) {
        setTaxCode(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value16(String value) {
        setTaxNumber(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value17(String value) {
        setComment_(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord value18(UUID value) {
        setHeadPerson(value);
        return this;
    }

    @Override
    public SmartexamOrganizationRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, String value9, String value10, Integer value11, String value12, Boolean value13, String value14, String value15, String value16, String value17, UUID value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SmartexamOrganizationRecord
     */
    public SmartexamOrganizationRecord() {
        super(SmartexamOrganization.SMARTEXAM_ORGANIZATION);
    }

    /**
     * Create a detached, initialised SmartexamOrganizationRecord
     */
    public SmartexamOrganizationRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String name, String fullName, Integer onlineGibddId, String code, Boolean received, String kafkaKey, String taxCode, String taxNumber, String comment_, UUID headPerson) {
        super(SmartexamOrganization.SMARTEXAM_ORGANIZATION);

        setId(id);
        setVersion(version);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setName(name);
        setFullName(fullName);
        setOnlineGibddId(onlineGibddId);
        setCode(code);
        setReceived(received);
        setKafkaKey(kafkaKey);
        setTaxCode(taxCode);
        setTaxNumber(taxNumber);
        setComment_(comment_);
        setHeadPerson(headPerson);
    }

    /**
     * Create a detached, initialised SmartexamOrganizationRecord
     */
    public SmartexamOrganizationRecord(nu.studer.sample.tables.pojos.SmartexamOrganization value) {
        super(SmartexamOrganization.SMARTEXAM_ORGANIZATION);

        if (value != null) {
            setId(value.getId());
            setVersion(value.getVersion());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setName(value.getName());
            setFullName(value.getFullName());
            setOnlineGibddId(value.getOnlineGibddId());
            setCode(value.getCode());
            setReceived(value.getReceived());
            setKafkaKey(value.getKafkaKey());
            setTaxCode(value.getTaxCode());
            setTaxNumber(value.getTaxNumber());
            setComment_(value.getComment_());
            setHeadPerson(value.getHeadPerson());
        }
    }
}