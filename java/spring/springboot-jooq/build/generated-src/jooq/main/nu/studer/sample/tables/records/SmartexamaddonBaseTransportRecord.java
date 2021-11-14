/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SmartexamaddonBaseTransport;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamaddonBaseTransportRecord extends UpdatableRecordImpl<SmartexamaddonBaseTransportRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.smartexamaddon_base_transport.id</code>.
     */
    public SmartexamaddonBaseTransportRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.version</code>.
     */
    public SmartexamaddonBaseTransportRecord setVersion(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.create_ts</code>.
     */
    public SmartexamaddonBaseTransportRecord setCreateTs(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.created_by</code>.
     */
    public SmartexamaddonBaseTransportRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.update_ts</code>.
     */
    public SmartexamaddonBaseTransportRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.updated_by</code>.
     */
    public SmartexamaddonBaseTransportRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.delete_ts</code>.
     */
    public SmartexamaddonBaseTransportRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.deleted_by</code>.
     */
    public SmartexamaddonBaseTransportRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.received</code>.
     */
    public SmartexamaddonBaseTransportRecord setReceived(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.received</code>.
     */
    public Boolean getReceived() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.kafka_key</code>.
     */
    public SmartexamaddonBaseTransportRecord setKafkaKey(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.kafka_key</code>.
     */
    public String getKafkaKey() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.name</code>.
     */
    public SmartexamaddonBaseTransportRecord setName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.name</code>.
     */
    public String getName() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport.base_garbage_container_id</code>.
     */
    public SmartexamaddonBaseTransportRecord setBaseGarbageContainerId(UUID value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport.base_garbage_container_id</code>.
     */
    public UUID getBaseGarbageContainerId() {
        return (UUID) get(11);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport._long</code>.
     */
    public SmartexamaddonBaseTransportRecord set_Long(Double value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport._long</code>.
     */
    public Double get_Long() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.consumption</code>.
     */
    public SmartexamaddonBaseTransportRecord setConsumption(Double value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.consumption</code>.
     */
    public Double getConsumption() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.gps_system</code>.
     */
    public SmartexamaddonBaseTransportRecord setGpsSystem(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.gps_system</code>.
     */
    public String getGpsSystem() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.gps_id</code>.
     */
    public SmartexamaddonBaseTransportRecord setGpsId(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.gps_id</code>.
     */
    public String getGpsId() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.height</code>.
     */
    public SmartexamaddonBaseTransportRecord setHeight(Double value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.height</code>.
     */
    public Double getHeight() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.width</code>.
     */
    public SmartexamaddonBaseTransportRecord setWidth(Double value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.width</code>.
     */
    public Double getWidth() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.create_year</code>.
     */
    public SmartexamaddonBaseTransportRecord setCreateYear(Integer value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.create_year</code>.
     */
    public Integer getCreateYear() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.vin</code>.
     */
    public SmartexamaddonBaseTransportRecord setVin(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.vin</code>.
     */
    public String getVin() {
        return (String) get(19);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport.organization_id</code>.
     */
    public SmartexamaddonBaseTransportRecord setOrganizationId(UUID value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport.organization_id</code>.
     */
    public UUID getOrganizationId() {
        return (UUID) get(20);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport.costs_organization_id</code>.
     */
    public SmartexamaddonBaseTransportRecord setCostsOrganizationId(UUID value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport.costs_organization_id</code>.
     */
    public UUID getCostsOrganizationId() {
        return (UUID) get(21);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.lizing</code>.
     */
    public SmartexamaddonBaseTransportRecord setLizing(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.lizing</code>.
     */
    public String getLizing() {
        return (String) get(22);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport.date_gibdd_set</code>.
     */
    public SmartexamaddonBaseTransportRecord setDateGibddSet(LocalDate value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport.date_gibdd_set</code>.
     */
    public LocalDate getDateGibddSet() {
        return (LocalDate) get(23);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.status</code>.
     */
    public SmartexamaddonBaseTransportRecord setStatus(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.status</code>.
     */
    public String getStatus() {
        return (String) get(24);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.license_id</code>.
     */
    public SmartexamaddonBaseTransportRecord setLicenseId(UUID value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.license_id</code>.
     */
    public UUID getLicenseId() {
        return (UUID) get(25);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.reg_num</code>.
     */
    public SmartexamaddonBaseTransportRecord setRegNum(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.reg_num</code>.
     */
    public String getRegNum() {
        return (String) get(26);
    }

    /**
     * Setter for
     * <code>public.smartexamaddon_base_transport.transport_type_id</code>.
     */
    public SmartexamaddonBaseTransportRecord setTransportTypeId(UUID value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexamaddon_base_transport.transport_type_id</code>.
     */
    public UUID getTransportTypeId() {
        return (UUID) get(27);
    }

    /**
     * Setter for <code>public.smartexamaddon_base_transport.model</code>.
     */
    public SmartexamaddonBaseTransportRecord setModel(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_transport.model</code>.
     */
    public String getModel() {
        return (String) get(28);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SmartexamaddonBaseTransportRecord
     */
    public SmartexamaddonBaseTransportRecord() {
        super(SmartexamaddonBaseTransport.SMARTEXAMADDON_BASE_TRANSPORT);
    }

    /**
     * Create a detached, initialised SmartexamaddonBaseTransportRecord
     */
    public SmartexamaddonBaseTransportRecord(UUID id, Integer version, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, Boolean received, String kafkaKey, String name, UUID baseGarbageContainerId, Double _Long, Double consumption, String gpsSystem, String gpsId, Double height, Double width, Integer createYear, String vin, UUID organizationId, UUID costsOrganizationId, String lizing, LocalDate dateGibddSet, String status, UUID licenseId, String regNum, UUID transportTypeId, String model) {
        super(SmartexamaddonBaseTransport.SMARTEXAMADDON_BASE_TRANSPORT);

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
        setName(name);
        setBaseGarbageContainerId(baseGarbageContainerId);
        set_Long(_Long);
        setConsumption(consumption);
        setGpsSystem(gpsSystem);
        setGpsId(gpsId);
        setHeight(height);
        setWidth(width);
        setCreateYear(createYear);
        setVin(vin);
        setOrganizationId(organizationId);
        setCostsOrganizationId(costsOrganizationId);
        setLizing(lizing);
        setDateGibddSet(dateGibddSet);
        setStatus(status);
        setLicenseId(licenseId);
        setRegNum(regNum);
        setTransportTypeId(transportTypeId);
        setModel(model);
    }

    /**
     * Create a detached, initialised SmartexamaddonBaseTransportRecord
     */
    public SmartexamaddonBaseTransportRecord(nu.studer.sample.tables.pojos.SmartexamaddonBaseTransport value) {
        super(SmartexamaddonBaseTransport.SMARTEXAMADDON_BASE_TRANSPORT);

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
            setName(value.getName());
            setBaseGarbageContainerId(value.getBaseGarbageContainerId());
            set_Long(value.get_Long());
            setConsumption(value.getConsumption());
            setGpsSystem(value.getGpsSystem());
            setGpsId(value.getGpsId());
            setHeight(value.getHeight());
            setWidth(value.getWidth());
            setCreateYear(value.getCreateYear());
            setVin(value.getVin());
            setOrganizationId(value.getOrganizationId());
            setCostsOrganizationId(value.getCostsOrganizationId());
            setLizing(value.getLizing());
            setDateGibddSet(value.getDateGibddSet());
            setStatus(value.getStatus());
            setLicenseId(value.getLicenseId());
            setRegNum(value.getRegNum());
            setTransportTypeId(value.getTransportTypeId());
            setModel(value.getModel());
        }
    }
}