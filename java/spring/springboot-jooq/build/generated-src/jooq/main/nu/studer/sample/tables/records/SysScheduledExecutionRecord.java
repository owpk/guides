/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SysScheduledExecution;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysScheduledExecutionRecord extends UpdatableRecordImpl<SysScheduledExecutionRecord> implements Record9<UUID, LocalDateTime, String, String, UUID, String, OffsetDateTime, OffsetDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sys_scheduled_execution.id</code>.
     */
    public SysScheduledExecutionRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_execution.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sys_scheduled_execution.create_ts</code>.
     */
    public SysScheduledExecutionRecord setCreateTs(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_execution.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.sys_scheduled_execution.created_by</code>.
     */
    public SysScheduledExecutionRecord setCreatedBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_execution.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sys_scheduled_execution.sys_tenant_id</code>.
     */
    public SysScheduledExecutionRecord setSysTenantId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_execution.sys_tenant_id</code>.
     */
    public String getSysTenantId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.sys_scheduled_execution.task_id</code>.
     */
    public SysScheduledExecutionRecord setTaskId(UUID value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_execution.task_id</code>.
     */
    public UUID getTaskId() {
        return (UUID) get(4);
    }

    /**
     * Setter for <code>public.sys_scheduled_execution.server</code>.
     */
    public SysScheduledExecutionRecord setServer(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_execution.server</code>.
     */
    public String getServer() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.sys_scheduled_execution.start_time</code>.
     */
    public SysScheduledExecutionRecord setStartTime(OffsetDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_execution.start_time</code>.
     */
    public OffsetDateTime getStartTime() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for <code>public.sys_scheduled_execution.finish_time</code>.
     */
    public SysScheduledExecutionRecord setFinishTime(OffsetDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_execution.finish_time</code>.
     */
    public OffsetDateTime getFinishTime() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for <code>public.sys_scheduled_execution.result</code>.
     */
    public SysScheduledExecutionRecord setResult(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_scheduled_execution.result</code>.
     */
    public String getResult() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, LocalDateTime, String, String, UUID, String, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<UUID, LocalDateTime, String, String, UUID, String, OffsetDateTime, OffsetDateTime, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SysScheduledExecution.SYS_SCHEDULED_EXECUTION.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SysScheduledExecution.SYS_SCHEDULED_EXECUTION.CREATE_TS;
    }

    @Override
    public Field<String> field3() {
        return SysScheduledExecution.SYS_SCHEDULED_EXECUTION.CREATED_BY;
    }

    @Override
    public Field<String> field4() {
        return SysScheduledExecution.SYS_SCHEDULED_EXECUTION.SYS_TENANT_ID;
    }

    @Override
    public Field<UUID> field5() {
        return SysScheduledExecution.SYS_SCHEDULED_EXECUTION.TASK_ID;
    }

    @Override
    public Field<String> field6() {
        return SysScheduledExecution.SYS_SCHEDULED_EXECUTION.SERVER;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return SysScheduledExecution.SYS_SCHEDULED_EXECUTION.START_TIME;
    }

    @Override
    public Field<OffsetDateTime> field8() {
        return SysScheduledExecution.SYS_SCHEDULED_EXECUTION.FINISH_TIME;
    }

    @Override
    public Field<String> field9() {
        return SysScheduledExecution.SYS_SCHEDULED_EXECUTION.RESULT;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreateTs();
    }

    @Override
    public String component3() {
        return getCreatedBy();
    }

    @Override
    public String component4() {
        return getSysTenantId();
    }

    @Override
    public UUID component5() {
        return getTaskId();
    }

    @Override
    public String component6() {
        return getServer();
    }

    @Override
    public OffsetDateTime component7() {
        return getStartTime();
    }

    @Override
    public OffsetDateTime component8() {
        return getFinishTime();
    }

    @Override
    public String component9() {
        return getResult();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreateTs();
    }

    @Override
    public String value3() {
        return getCreatedBy();
    }

    @Override
    public String value4() {
        return getSysTenantId();
    }

    @Override
    public UUID value5() {
        return getTaskId();
    }

    @Override
    public String value6() {
        return getServer();
    }

    @Override
    public OffsetDateTime value7() {
        return getStartTime();
    }

    @Override
    public OffsetDateTime value8() {
        return getFinishTime();
    }

    @Override
    public String value9() {
        return getResult();
    }

    @Override
    public SysScheduledExecutionRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SysScheduledExecutionRecord value2(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SysScheduledExecutionRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SysScheduledExecutionRecord value4(String value) {
        setSysTenantId(value);
        return this;
    }

    @Override
    public SysScheduledExecutionRecord value5(UUID value) {
        setTaskId(value);
        return this;
    }

    @Override
    public SysScheduledExecutionRecord value6(String value) {
        setServer(value);
        return this;
    }

    @Override
    public SysScheduledExecutionRecord value7(OffsetDateTime value) {
        setStartTime(value);
        return this;
    }

    @Override
    public SysScheduledExecutionRecord value8(OffsetDateTime value) {
        setFinishTime(value);
        return this;
    }

    @Override
    public SysScheduledExecutionRecord value9(String value) {
        setResult(value);
        return this;
    }

    @Override
    public SysScheduledExecutionRecord values(UUID value1, LocalDateTime value2, String value3, String value4, UUID value5, String value6, OffsetDateTime value7, OffsetDateTime value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysScheduledExecutionRecord
     */
    public SysScheduledExecutionRecord() {
        super(SysScheduledExecution.SYS_SCHEDULED_EXECUTION);
    }

    /**
     * Create a detached, initialised SysScheduledExecutionRecord
     */
    public SysScheduledExecutionRecord(UUID id, LocalDateTime createTs, String createdBy, String sysTenantId, UUID taskId, String server, OffsetDateTime startTime, OffsetDateTime finishTime, String result) {
        super(SysScheduledExecution.SYS_SCHEDULED_EXECUTION);

        setId(id);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setSysTenantId(sysTenantId);
        setTaskId(taskId);
        setServer(server);
        setStartTime(startTime);
        setFinishTime(finishTime);
        setResult(result);
    }

    /**
     * Create a detached, initialised SysScheduledExecutionRecord
     */
    public SysScheduledExecutionRecord(nu.studer.sample.tables.pojos.SysScheduledExecution value) {
        super(SysScheduledExecution.SYS_SCHEDULED_EXECUTION);

        if (value != null) {
            setId(value.getId());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setSysTenantId(value.getSysTenantId());
            setTaskId(value.getTaskId());
            setServer(value.getServer());
            setStartTime(value.getStartTime());
            setFinishTime(value.getFinishTime());
            setResult(value.getResult());
        }
    }
}