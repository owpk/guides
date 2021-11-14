/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SysScheduledTask;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysScheduledTaskRecord extends UpdatableRecordImpl<SysScheduledTaskRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sys_scheduled_task.id</code>.
     */
    public SysScheduledTaskRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.create_ts</code>.
     */
    public SysScheduledTaskRecord setCreateTs(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.created_by</code>.
     */
    public SysScheduledTaskRecord setCreatedBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.update_ts</code>.
     */
    public SysScheduledTaskRecord setUpdateTs(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.updated_by</code>.
     */
    public SysScheduledTaskRecord setUpdatedBy(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.delete_ts</code>.
     */
    public SysScheduledTaskRecord setDeleteTs(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.deleted_by</code>.
     */
    public SysScheduledTaskRecord setDeletedBy(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.sys_tenant_id</code>.
     */
    public SysScheduledTaskRecord setSysTenantId(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.sys_tenant_id</code>.
     */
    public String getSysTenantId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.defined_by</code>.
     */
    public SysScheduledTaskRecord setDefinedBy(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.defined_by</code>.
     */
    public String getDefinedBy() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.class_name</code>.
     */
    public SysScheduledTaskRecord setClassName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.class_name</code>.
     */
    public String getClassName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.script_name</code>.
     */
    public SysScheduledTaskRecord setScriptName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.script_name</code>.
     */
    public String getScriptName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.bean_name</code>.
     */
    public SysScheduledTaskRecord setBeanName(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.bean_name</code>.
     */
    public String getBeanName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.method_name</code>.
     */
    public SysScheduledTaskRecord setMethodName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.method_name</code>.
     */
    public String getMethodName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.method_params</code>.
     */
    public SysScheduledTaskRecord setMethodParams(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.method_params</code>.
     */
    public String getMethodParams() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.user_name</code>.
     */
    public SysScheduledTaskRecord setUserName(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.user_name</code>.
     */
    public String getUserName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.is_singleton</code>.
     */
    public SysScheduledTaskRecord setIsSingleton(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.is_singleton</code>.
     */
    public Boolean getIsSingleton() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.is_active</code>.
     */
    public SysScheduledTaskRecord setIsActive(Boolean value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.is_active</code>.
     */
    public Boolean getIsActive() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.period_</code>.
     */
    public SysScheduledTaskRecord setPeriod_(Integer value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.period_</code>.
     */
    public Integer getPeriod_() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.timeout</code>.
     */
    public SysScheduledTaskRecord setTimeout(Integer value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.timeout</code>.
     */
    public Integer getTimeout() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.start_date</code>.
     */
    public SysScheduledTaskRecord setStartDate(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.start_date</code>.
     */
    public LocalDateTime getStartDate() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.time_frame</code>.
     */
    public SysScheduledTaskRecord setTimeFrame(Integer value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.time_frame</code>.
     */
    public Integer getTimeFrame() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.start_delay</code>.
     */
    public SysScheduledTaskRecord setStartDelay(Integer value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.start_delay</code>.
     */
    public Integer getStartDelay() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.permitted_servers</code>.
     */
    public SysScheduledTaskRecord setPermittedServers(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.permitted_servers</code>.
     */
    public String getPermittedServers() {
        return (String) get(22);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.log_start</code>.
     */
    public SysScheduledTaskRecord setLogStart(Boolean value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.log_start</code>.
     */
    public Boolean getLogStart() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.log_finish</code>.
     */
    public SysScheduledTaskRecord setLogFinish(Boolean value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.log_finish</code>.
     */
    public Boolean getLogFinish() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.last_start_time</code>.
     */
    public SysScheduledTaskRecord setLastStartTime(OffsetDateTime value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.last_start_time</code>.
     */
    public OffsetDateTime getLastStartTime() {
        return (OffsetDateTime) get(25);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.last_start_server</code>.
     */
    public SysScheduledTaskRecord setLastStartServer(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.last_start_server</code>.
     */
    public String getLastStartServer() {
        return (String) get(26);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.description</code>.
     */
    public SysScheduledTaskRecord setDescription(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.description</code>.
     */
    public String getDescription() {
        return (String) get(27);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.cron</code>.
     */
    public SysScheduledTaskRecord setCron(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.cron</code>.
     */
    public String getCron() {
        return (String) get(28);
    }

    /**
     * Setter for <code>public.sys_scheduled_task.scheduling_type</code>.
     */
    public SysScheduledTaskRecord setSchedulingType(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_task.scheduling_type</code>.
     */
    public String getSchedulingType() {
        return (String) get(29);
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
     * Create a detached SysScheduledTaskRecord
     */
    public SysScheduledTaskRecord() {
        super(SysScheduledTask.SYS_SCHEDULED_TASK);
    }

    /**
     * Create a detached, initialised SysScheduledTaskRecord
     */
    public SysScheduledTaskRecord(UUID id, LocalDateTime createTs, String createdBy, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String sysTenantId, String definedBy, String className, String scriptName, String beanName, String methodName, String methodParams, String userName, Boolean isSingleton, Boolean isActive, Integer period_, Integer timeout, LocalDateTime startDate, Integer timeFrame, Integer startDelay, String permittedServers, Boolean logStart, Boolean logFinish, OffsetDateTime lastStartTime, String lastStartServer, String description, String cron, String schedulingType) {
        super(SysScheduledTask.SYS_SCHEDULED_TASK);

        setId(id);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setSysTenantId(sysTenantId);
        setDefinedBy(definedBy);
        setClassName(className);
        setScriptName(scriptName);
        setBeanName(beanName);
        setMethodName(methodName);
        setMethodParams(methodParams);
        setUserName(userName);
        setIsSingleton(isSingleton);
        setIsActive(isActive);
        setPeriod_(period_);
        setTimeout(timeout);
        setStartDate(startDate);
        setTimeFrame(timeFrame);
        setStartDelay(startDelay);
        setPermittedServers(permittedServers);
        setLogStart(logStart);
        setLogFinish(logFinish);
        setLastStartTime(lastStartTime);
        setLastStartServer(lastStartServer);
        setDescription(description);
        setCron(cron);
        setSchedulingType(schedulingType);
    }

    /**
     * Create a detached, initialised SysScheduledTaskRecord
     */
    public SysScheduledTaskRecord(nu.studer.sample.tables.pojos.SysScheduledTask value) {
        super(SysScheduledTask.SYS_SCHEDULED_TASK);

        if (value != null) {
            setId(value.getId());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setSysTenantId(value.getSysTenantId());
            setDefinedBy(value.getDefinedBy());
            setClassName(value.getClassName());
            setScriptName(value.getScriptName());
            setBeanName(value.getBeanName());
            setMethodName(value.getMethodName());
            setMethodParams(value.getMethodParams());
            setUserName(value.getUserName());
            setIsSingleton(value.getIsSingleton());
            setIsActive(value.getIsActive());
            setPeriod_(value.getPeriod_());
            setTimeout(value.getTimeout());
            setStartDate(value.getStartDate());
            setTimeFrame(value.getTimeFrame());
            setStartDelay(value.getStartDelay());
            setPermittedServers(value.getPermittedServers());
            setLogStart(value.getLogStart());
            setLogFinish(value.getLogFinish());
            setLastStartTime(value.getLastStartTime());
            setLastStartServer(value.getLastStartServer());
            setDescription(value.getDescription());
            setCron(value.getCron());
            setSchedulingType(value.getSchedulingType());
        }
    }
}