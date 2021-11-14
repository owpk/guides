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
public class SmartmonTransportType implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final Integer       version;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final LocalDateTime deleteTs;
    private final String        deletedBy;
    private final String        name;
    private final String        extUuid;
    private final String        shortName;
    private final UUID          transportTypeGroupingId;

    public SmartmonTransportType(SmartmonTransportType value) {
        this.id = value.id;
        this.version = value.version;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.name = value.name;
        this.extUuid = value.extUuid;
        this.shortName = value.shortName;
        this.transportTypeGroupingId = value.transportTypeGroupingId;
    }

    public SmartmonTransportType(
        UUID          id,
        Integer       version,
        LocalDateTime createTs,
        String        createdBy,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        String        name,
        String        extUuid,
        String        shortName,
        UUID          transportTypeGroupingId
    ) {
        this.id = id;
        this.version = version;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.updateTs = updateTs;
        this.updatedBy = updatedBy;
        this.deleteTs = deleteTs;
        this.deletedBy = deletedBy;
        this.name = name;
        this.extUuid = extUuid;
        this.shortName = shortName;
        this.transportTypeGroupingId = transportTypeGroupingId;
    }

    /**
     * Getter for <code>public.smartmon_transport_type.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.smartmon_transport_type.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.smartmon_transport_type.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.smartmon_transport_type.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.smartmon_transport_type.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.smartmon_transport_type.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.smartmon_transport_type.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.smartmon_transport_type.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.smartmon_transport_type.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.smartmon_transport_type.ext_uuid</code>.
     */
    public String getExtUuid() {
        return this.extUuid;
    }

    /**
     * Getter for <code>public.smartmon_transport_type.short_name</code>.
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * Getter for
     * <code>public.smartmon_transport_type.transport_type_grouping_id</code>.
     */
    public UUID getTransportTypeGroupingId() {
        return this.transportTypeGroupingId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartmonTransportType (");

        sb.append(id);
        sb.append(", ").append(version);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(name);
        sb.append(", ").append(extUuid);
        sb.append(", ").append(shortName);
        sb.append(", ").append(transportTypeGroupingId);

        sb.append(")");
        return sb.toString();
    }
}
