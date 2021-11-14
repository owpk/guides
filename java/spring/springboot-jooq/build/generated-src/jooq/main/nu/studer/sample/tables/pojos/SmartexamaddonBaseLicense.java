/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamaddonBaseLicense implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final Integer       version;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final LocalDateTime deleteTs;
    private final String        deletedBy;
    private final Boolean       received;
    private final String        kafkaKey;
    private final String        licenseCart;
    private final String        serial;
    private final String        number_;
    private final UUID          transportId;

    public SmartexamaddonBaseLicense(SmartexamaddonBaseLicense value) {
        this.id = value.id;
        this.version = value.version;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.received = value.received;
        this.kafkaKey = value.kafkaKey;
        this.licenseCart = value.licenseCart;
        this.serial = value.serial;
        this.number_ = value.number_;
        this.transportId = value.transportId;
    }

    public SmartexamaddonBaseLicense(
        UUID          id,
        Integer       version,
        LocalDateTime createTs,
        String        createdBy,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        Boolean       received,
        String        kafkaKey,
        String        licenseCart,
        String        serial,
        String        number_,
        UUID          transportId
    ) {
        this.id = id;
        this.version = version;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.updateTs = updateTs;
        this.updatedBy = updatedBy;
        this.deleteTs = deleteTs;
        this.deletedBy = deletedBy;
        this.received = received;
        this.kafkaKey = kafkaKey;
        this.licenseCart = licenseCart;
        this.serial = serial;
        this.number_ = number_;
        this.transportId = transportId;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.received</code>.
     */
    public Boolean getReceived() {
        return this.received;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.kafka_key</code>.
     */
    public String getKafkaKey() {
        return this.kafkaKey;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.license_cart</code>.
     */
    public String getLicenseCart() {
        return this.licenseCart;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.serial</code>.
     */
    public String getSerial() {
        return this.serial;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.number_</code>.
     */
    public String getNumber_() {
        return this.number_;
    }

    /**
     * Getter for <code>public.smartexamaddon_base_license.transport_id</code>.
     */
    public UUID getTransportId() {
        return this.transportId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartexamaddonBaseLicense (");

        sb.append(id);
        sb.append(", ").append(version);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(received);
        sb.append(", ").append(kafkaKey);
        sb.append(", ").append(licenseCart);
        sb.append(", ").append(serial);
        sb.append(", ").append(number_);
        sb.append(", ").append(transportId);

        sb.append(")");
        return sb.toString();
    }
}