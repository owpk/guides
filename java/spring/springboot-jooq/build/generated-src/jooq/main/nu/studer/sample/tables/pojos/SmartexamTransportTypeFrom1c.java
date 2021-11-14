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
public class SmartexamTransportTypeFrom1c implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final String        name;
    private final UUID          parentId;
    private final Long          mileageForTo;
    private final String        registrySheetName;
    private final Boolean       received;
    private final String        kafkaKey;
    private final String        deletedBy;
    private final LocalDateTime updateTs;
    private final LocalDateTime deleteTs;
    private final String        updatedBy;
    private final String        createdBy;
    private final LocalDateTime createTs;
    private final Integer       version;

    public SmartexamTransportTypeFrom1c(SmartexamTransportTypeFrom1c value) {
        this.id = value.id;
        this.name = value.name;
        this.parentId = value.parentId;
        this.mileageForTo = value.mileageForTo;
        this.registrySheetName = value.registrySheetName;
        this.received = value.received;
        this.kafkaKey = value.kafkaKey;
        this.deletedBy = value.deletedBy;
        this.updateTs = value.updateTs;
        this.deleteTs = value.deleteTs;
        this.updatedBy = value.updatedBy;
        this.createdBy = value.createdBy;
        this.createTs = value.createTs;
        this.version = value.version;
    }

    public SmartexamTransportTypeFrom1c(
        UUID          id,
        String        name,
        UUID          parentId,
        Long          mileageForTo,
        String        registrySheetName,
        Boolean       received,
        String        kafkaKey,
        String        deletedBy,
        LocalDateTime updateTs,
        LocalDateTime deleteTs,
        String        updatedBy,
        String        createdBy,
        LocalDateTime createTs,
        Integer       version
    ) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.mileageForTo = mileageForTo;
        this.registrySheetName = registrySheetName;
        this.received = received;
        this.kafkaKey = kafkaKey;
        this.deletedBy = deletedBy;
        this.updateTs = updateTs;
        this.deleteTs = deleteTs;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
        this.createTs = createTs;
        this.version = version;
    }

    /**
     * Getter for <code>public.smartexam_transport_type_from1c.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.smartexam_transport_type_from1c.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.smartexam_transport_type_from1c.parent_id</code>.
     */
    public UUID getParentId() {
        return this.parentId;
    }

    /**
     * Getter for
     * <code>public.smartexam_transport_type_from1c.mileage_for_to</code>.
     */
    public Long getMileageForTo() {
        return this.mileageForTo;
    }

    /**
     * Getter for
     * <code>public.smartexam_transport_type_from1c.registry_sheet_name</code>.
     */
    public String getRegistrySheetName() {
        return this.registrySheetName;
    }

    /**
     * Getter for <code>public.smartexam_transport_type_from1c.received</code>.
     */
    public Boolean getReceived() {
        return this.received;
    }

    /**
     * Getter for <code>public.smartexam_transport_type_from1c.kafka_key</code>.
     */
    public String getKafkaKey() {
        return this.kafkaKey;
    }

    /**
     * Getter for
     * <code>public.smartexam_transport_type_from1c.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.smartexam_transport_type_from1c.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.smartexam_transport_type_from1c.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for
     * <code>public.smartexam_transport_type_from1c.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for
     * <code>public.smartexam_transport_type_from1c.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.smartexam_transport_type_from1c.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.smartexam_transport_type_from1c.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartexamTransportTypeFrom1c (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(parentId);
        sb.append(", ").append(mileageForTo);
        sb.append(", ").append(registrySheetName);
        sb.append(", ").append(received);
        sb.append(", ").append(kafkaKey);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createTs);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
