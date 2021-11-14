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
public class SmartexamRepairRequestWork implements Serializable {

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
    private final UUID          extUuid;
    private final UUID          parentId;
    private final String        linkedWorks;

    public SmartexamRepairRequestWork(SmartexamRepairRequestWork value) {
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
        this.parentId = value.parentId;
        this.linkedWorks = value.linkedWorks;
    }

    public SmartexamRepairRequestWork(
        UUID          id,
        Integer       version,
        LocalDateTime createTs,
        String        createdBy,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        String        name,
        UUID          extUuid,
        UUID          parentId,
        String        linkedWorks
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
        this.parentId = parentId;
        this.linkedWorks = linkedWorks;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_work.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_work.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_work.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_work.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_work.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_work.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_work.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_work.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_work.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_work.ext_uuid</code>.
     */
    public UUID getExtUuid() {
        return this.extUuid;
    }

    /**
     * Getter for <code>public.smartexam_repair_request_work.parent_id</code>.
     */
    public UUID getParentId() {
        return this.parentId;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_request_work.linked_works</code>.
     */
    public String getLinkedWorks() {
        return this.linkedWorks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartexamRepairRequestWork (");

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
        sb.append(", ").append(parentId);
        sb.append(", ").append(linkedWorks);

        sb.append(")");
        return sb.toString();
    }
}
