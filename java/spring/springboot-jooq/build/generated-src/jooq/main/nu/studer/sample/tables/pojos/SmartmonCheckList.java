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
public class SmartmonCheckList implements Serializable {

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
    private final UUID          transportTypeId;
    private final String        status;
    private final String        type_;
    private final Boolean       archived;
    private final UUID          transportId_U33258;
    private final Boolean       commentEnabled;
    private final UUID          transportId;

    public SmartmonCheckList(SmartmonCheckList value) {
        this.id = value.id;
        this.version = value.version;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.name = value.name;
        this.transportTypeId = value.transportTypeId;
        this.status = value.status;
        this.type_ = value.type_;
        this.archived = value.archived;
        this.transportId_U33258 = value.transportId_U33258;
        this.commentEnabled = value.commentEnabled;
        this.transportId = value.transportId;
    }

    public SmartmonCheckList(
        UUID          id,
        Integer       version,
        LocalDateTime createTs,
        String        createdBy,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        String        name,
        UUID          transportTypeId,
        String        status,
        String        type_,
        Boolean       archived,
        UUID          transportId_U33258,
        Boolean       commentEnabled,
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
        this.name = name;
        this.transportTypeId = transportTypeId;
        this.status = status;
        this.type_ = type_;
        this.archived = archived;
        this.transportId_U33258 = transportId_U33258;
        this.commentEnabled = commentEnabled;
        this.transportId = transportId;
    }

    /**
     * Getter for <code>public.smartmon_check_list.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.smartmon_check_list.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.smartmon_check_list.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.smartmon_check_list.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.smartmon_check_list.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.smartmon_check_list.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.smartmon_check_list.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.smartmon_check_list.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.smartmon_check_list.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.smartmon_check_list.transport_type_id</code>.
     */
    public UUID getTransportTypeId() {
        return this.transportTypeId;
    }

    /**
     * Getter for <code>public.smartmon_check_list.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Getter for <code>public.smartmon_check_list.type_</code>.
     */
    public String getType_() {
        return this.type_;
    }

    /**
     * Getter for <code>public.smartmon_check_list.archived</code>.
     */
    public Boolean getArchived() {
        return this.archived;
    }

    /**
     * Getter for <code>public.smartmon_check_list.transport_id__u33258</code>.
     */
    public UUID getTransportId_U33258() {
        return this.transportId_U33258;
    }

    /**
     * Getter for <code>public.smartmon_check_list.comment_enabled</code>.
     */
    public Boolean getCommentEnabled() {
        return this.commentEnabled;
    }

    /**
     * Getter for <code>public.smartmon_check_list.transport_id</code>.
     */
    public UUID getTransportId() {
        return this.transportId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartmonCheckList (");

        sb.append(id);
        sb.append(", ").append(version);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(name);
        sb.append(", ").append(transportTypeId);
        sb.append(", ").append(status);
        sb.append(", ").append(type_);
        sb.append(", ").append(archived);
        sb.append(", ").append(transportId_U33258);
        sb.append(", ").append(commentEnabled);
        sb.append(", ").append(transportId);

        sb.append(")");
        return sb.toString();
    }
}
