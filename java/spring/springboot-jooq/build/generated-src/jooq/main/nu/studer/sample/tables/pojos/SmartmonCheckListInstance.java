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
public class SmartmonCheckListInstance implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final Integer       version;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final LocalDateTime deleteTs;
    private final String        deletedBy;
    private final LocalDateTime date_;
    private final UUID          responsibleId;
    private final UUID          checkListId;
    private final String        status;
    private final String        comment_;
    private final UUID          employeeId;
    private final String        syncId;
    private final UUID          divisionId;
    private final String        instanceStatus;
    private final Boolean       foreignList;
    private final UUID          transportId;

    public SmartmonCheckListInstance(SmartmonCheckListInstance value) {
        this.id = value.id;
        this.version = value.version;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.date_ = value.date_;
        this.responsibleId = value.responsibleId;
        this.checkListId = value.checkListId;
        this.status = value.status;
        this.comment_ = value.comment_;
        this.employeeId = value.employeeId;
        this.syncId = value.syncId;
        this.divisionId = value.divisionId;
        this.instanceStatus = value.instanceStatus;
        this.foreignList = value.foreignList;
        this.transportId = value.transportId;
    }

    public SmartmonCheckListInstance(
        UUID          id,
        Integer       version,
        LocalDateTime createTs,
        String        createdBy,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        LocalDateTime date_,
        UUID          responsibleId,
        UUID          checkListId,
        String        status,
        String        comment_,
        UUID          employeeId,
        String        syncId,
        UUID          divisionId,
        String        instanceStatus,
        Boolean       foreignList,
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
        this.date_ = date_;
        this.responsibleId = responsibleId;
        this.checkListId = checkListId;
        this.status = status;
        this.comment_ = comment_;
        this.employeeId = employeeId;
        this.syncId = syncId;
        this.divisionId = divisionId;
        this.instanceStatus = instanceStatus;
        this.foreignList = foreignList;
        this.transportId = transportId;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.date_</code>.
     */
    public LocalDateTime getDate_() {
        return this.date_;
    }

    /**
     * Getter for
     * <code>public.smartmon_check_list_instance.responsible_id</code>.
     */
    public UUID getResponsibleId() {
        return this.responsibleId;
    }

    /**
     * Getter for
     * <code>public.smartmon_check_list_instance.check_list_id</code>.
     */
    public UUID getCheckListId() {
        return this.checkListId;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.status</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.comment_</code>.
     */
    public String getComment_() {
        return this.comment_;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.employee_id</code>.
     */
    public UUID getEmployeeId() {
        return this.employeeId;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.sync_id</code>.
     */
    public String getSyncId() {
        return this.syncId;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.division_id</code>.
     */
    public UUID getDivisionId() {
        return this.divisionId;
    }

    /**
     * Getter for
     * <code>public.smartmon_check_list_instance.instance_status</code>.
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.foreign_list</code>.
     */
    public Boolean getForeignList() {
        return this.foreignList;
    }

    /**
     * Getter for <code>public.smartmon_check_list_instance.transport_id</code>.
     */
    public UUID getTransportId() {
        return this.transportId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartmonCheckListInstance (");

        sb.append(id);
        sb.append(", ").append(version);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(date_);
        sb.append(", ").append(responsibleId);
        sb.append(", ").append(checkListId);
        sb.append(", ").append(status);
        sb.append(", ").append(comment_);
        sb.append(", ").append(employeeId);
        sb.append(", ").append(syncId);
        sb.append(", ").append(divisionId);
        sb.append(", ").append(instanceStatus);
        sb.append(", ").append(foreignList);
        sb.append(", ").append(transportId);

        sb.append(")");
        return sb.toString();
    }
}