/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.CompanyaddonBasePhoneNumber;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanyaddonBasePhoneNumberRecord extends UpdatableRecordImpl<CompanyaddonBasePhoneNumberRecord> implements Record14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.companyaddon_base_phone_number.id</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.companyaddon_base_phone_number.version</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.companyaddon_base_phone_number.create_ts</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.companyaddon_base_phone_number.created_by</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.companyaddon_base_phone_number.update_ts</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.companyaddon_base_phone_number.updated_by</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.companyaddon_base_phone_number.delete_ts</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.companyaddon_base_phone_number.deleted_by</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.companyaddon_base_phone_number.received</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setReceived(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.received</code>.
     */
    public Boolean getReceived() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.companyaddon_base_phone_number.kafka_key</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setKafkaKey(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.kafka_key</code>.
     */
    public String getKafkaKey() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_phone_number.country_code</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setCountryCode(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_phone_number.country_code</code>.
     */
    public String getCountryCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.companyaddon_base_phone_number.city</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setCity(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.city</code>.
     */
    public String getCity() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.companyaddon_base_phone_number.number_</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setNumber_(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.companyaddon_base_phone_number.number_</code>.
     */
    public String getNumber_() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>public.companyaddon_base_phone_number.additional_code</code>.
     */
    public CompanyaddonBasePhoneNumberRecord setAdditionalCode(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.companyaddon_base_phone_number.additional_code</code>.
     */
    public String getAdditionalCode() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, Boolean, String, String, String, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.ID;
    }

    @Override
    public Field<Integer> field2() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.VERSION;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.CREATE_TS;
    }

    @Override
    public Field<String> field4() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.DELETED_BY;
    }

    @Override
    public Field<Boolean> field9() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.RECEIVED;
    }

    @Override
    public Field<String> field10() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.KAFKA_KEY;
    }

    @Override
    public Field<String> field11() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.COUNTRY_CODE;
    }

    @Override
    public Field<String> field12() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.CITY;
    }

    @Override
    public Field<String> field13() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.NUMBER_;
    }

    @Override
    public Field<String> field14() {
        return CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER.ADDITIONAL_CODE;
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
        return getCountryCode();
    }

    @Override
    public String component12() {
        return getCity();
    }

    @Override
    public String component13() {
        return getNumber_();
    }

    @Override
    public String component14() {
        return getAdditionalCode();
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
        return getCountryCode();
    }

    @Override
    public String value12() {
        return getCity();
    }

    @Override
    public String value13() {
        return getNumber_();
    }

    @Override
    public String value14() {
        return getAdditionalCode();
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value3(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value9(Boolean value) {
        setReceived(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value10(String value) {
        setKafkaKey(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value11(String value) {
        setCountryCode(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value12(String value) {
        setCity(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value13(String value) {
        setNumber_(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord value14(String value) {
        setAdditionalCode(value);
        return this;
    }

    @Override
    public CompanyaddonBasePhoneNumberRecord values(UUID value1, Integer value2, LocalDateTime value3, String value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, Boolean value9, String value10, String value11, String value12, String value13, String value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompanyaddonBasePhoneNumberRecord
     */
    public CompanyaddonBasePhoneNumberRecord() {
        super(CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER);
    }

    /**
     * Create a detached, initialised CompanyaddonBasePhoneNumberRecord
     */
    public CompanyaddonBasePhoneNumberRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, Boolean received, String kafkaKey, String countryCode, String city, String number_, String additionalCode) {
        super(CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER);

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
        setCountryCode(countryCode);
        setCity(city);
        setNumber_(number_);
        setAdditionalCode(additionalCode);
    }

    /**
     * Create a detached, initialised CompanyaddonBasePhoneNumberRecord
     */
    public CompanyaddonBasePhoneNumberRecord(nu.studer.sample.tables.pojos.CompanyaddonBasePhoneNumber value) {
        super(CompanyaddonBasePhoneNumber.COMPANYADDON_BASE_PHONE_NUMBER);

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
            setCountryCode(value.getCountryCode());
            setCity(value.getCity());
            setNumber_(value.getNumber_());
            setAdditionalCode(value.getAdditionalCode());
        }
    }
}
