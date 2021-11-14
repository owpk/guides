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
public class SmartexamRepairBlockStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final Integer       version;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final LocalDateTime deleteTs;
    private final String        deletedBy;
    private final UUID          repairBlockId;
    private final UUID          planId;
    private final LocalDateTime dateTimeStart;
    private final LocalDateTime dateTimeEnd;
    private final String        status;

    public SmartexamRepairBlockStatus(SmartexamRepairBlockStatus value) {
        this.id = value.id;
        this.version = value.version;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.repairBlockId = value.repairBlockId;
        this.planId = value.planId;
        this.dateTimeStart = value.dateTimeStart;
        this.dateTimeEnd = value.dateTimeEnd;
        this.status = value.status;
    }

    public SmartexamRepairBlockStatus(
        UUID          id,
        Integer       version,
        LocalDateTime createTs,
        String        createdBy,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        UUID          repairBlockId,
        UUID          planId,
        LocalDateTime dateTimeStart,
        LocalDateTime dateTimeEnd,
        String        status
    ) {
        this.id = id;
        this.version = version;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.updateTs = updateTs;
        this.updatedBy = updatedBy;
        this.deleteTs = deleteTs;
        this.deletedBy = deletedBy;
        this.repairBlockId = repairBlockId;
        this.planId = planId;
        this.dateTimeStart = dateTimeStart;
        this.dateTimeEnd = dateTimeEnd;
        this.status = status;
    }

    /**
     * Getter for <code>public.smartexam_repair_block_status.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.smartexam_repair_block_status.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.smartexam_repair_block_status.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.smartexam_repair_block_status.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.smartexam_repair_block_status.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.smartexam_repair_block_status.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.smartexam_repair_block_status.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.smartexam_repair_block_status.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_block_status.repair_block_id</code>.
     */
    public UUID getRepairBlockId() {
        return this.repairBlockId;
    }

    /**
     * Getter for <code>public.smartexam_repair_block_status.plan_id</code>.
     */
    public UUID getPlanId() {
        return this.planId;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_block_status.date_time_start</code>.
     */
    public LocalDateTime getDateTimeStart() {
        return this.dateTimeStart;
    }

    /**
     * Getter for
     * <code>public.smartexam_repair_block_status.date_time_end</code>.
     */
    public LocalDateTime getDateTimeEnd() {
        return this.dateTimeEnd;
    }

    /**
     * Getter for <code>public.smartexam_repair_block_status.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartexamRepairBlockStatus (");

        sb.append(id);
        sb.append(", ").append(version);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(repairBlockId);
        sb.append(", ").append(planId);
        sb.append(", ").append(dateTimeStart);
        sb.append(", ").append(dateTimeEnd);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}