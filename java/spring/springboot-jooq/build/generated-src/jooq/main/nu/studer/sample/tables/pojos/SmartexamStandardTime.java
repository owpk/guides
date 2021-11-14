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
public class SmartexamStandardTime implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final Integer       version;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final LocalDateTime deleteTs;
    private final String        deletedBy;
    private final UUID          transportTypeId;
    private final Double        standardTime;
    private final UUID          repairRequestWorkId;

    public SmartexamStandardTime(SmartexamStandardTime value) {
        this.id = value.id;
        this.version = value.version;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.transportTypeId = value.transportTypeId;
        this.standardTime = value.standardTime;
        this.repairRequestWorkId = value.repairRequestWorkId;
    }

    public SmartexamStandardTime(
        UUID          id,
        Integer       version,
        LocalDateTime createTs,
        String        createdBy,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        UUID          transportTypeId,
        Double        standardTime,
        UUID          repairRequestWorkId
    ) {
        this.id = id;
        this.version = version;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.updateTs = updateTs;
        this.updatedBy = updatedBy;
        this.deleteTs = deleteTs;
        this.deletedBy = deletedBy;
        this.transportTypeId = transportTypeId;
        this.standardTime = standardTime;
        this.repairRequestWorkId = repairRequestWorkId;
    }

    /**
     * Getter for <code>public.smartexam_standard_time.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.smartexam_standard_time.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.smartexam_standard_time.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.smartexam_standard_time.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.smartexam_standard_time.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.smartexam_standard_time.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.smartexam_standard_time.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.smartexam_standard_time.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.smartexam_standard_time.transport_type_id</code>.
     */
    public UUID getTransportTypeId() {
        return this.transportTypeId;
    }

    /**
     * Getter for <code>public.smartexam_standard_time.standard_time</code>.
     */
    public Double getStandardTime() {
        return this.standardTime;
    }

    /**
     * Getter for
     * <code>public.smartexam_standard_time.repair_request_work_id</code>.
     */
    public UUID getRepairRequestWorkId() {
        return this.repairRequestWorkId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartexamStandardTime (");

        sb.append(id);
        sb.append(", ").append(version);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(transportTypeId);
        sb.append(", ").append(standardTime);
        sb.append(", ").append(repairRequestWorkId);

        sb.append(")");
        return sb.toString();
    }
}
