/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;

import nu.studer.sample.tables.SysDbChangelog;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysDbChangelogRecord extends UpdatableRecordImpl<SysDbChangelogRecord> implements Record3<String, LocalDateTime, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sys_db_changelog.script_name</code>.
     */
    public SysDbChangelogRecord setScriptName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_db_changelog.script_name</code>.
     */
    public String getScriptName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.sys_db_changelog.create_ts</code>.
     */
    public SysDbChangelogRecord setCreateTs(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_db_changelog.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.sys_db_changelog.is_init</code>.
     */
    public SysDbChangelogRecord setIsInit(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_db_changelog.is_init</code>.
     */
    public Integer getIsInit() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, LocalDateTime, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, LocalDateTime, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SysDbChangelog.SYS_DB_CHANGELOG.SCRIPT_NAME;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SysDbChangelog.SYS_DB_CHANGELOG.CREATE_TS;
    }

    @Override
    public Field<Integer> field3() {
        return SysDbChangelog.SYS_DB_CHANGELOG.IS_INIT;
    }

    @Override
    public String component1() {
        return getScriptName();
    }

    @Override
    public LocalDateTime component2() {
        return getCreateTs();
    }

    @Override
    public Integer component3() {
        return getIsInit();
    }

    @Override
    public String value1() {
        return getScriptName();
    }

    @Override
    public LocalDateTime value2() {
        return getCreateTs();
    }

    @Override
    public Integer value3() {
        return getIsInit();
    }

    @Override
    public SysDbChangelogRecord value1(String value) {
        setScriptName(value);
        return this;
    }

    @Override
    public SysDbChangelogRecord value2(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SysDbChangelogRecord value3(Integer value) {
        setIsInit(value);
        return this;
    }

    @Override
    public SysDbChangelogRecord values(String value1, LocalDateTime value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysDbChangelogRecord
     */
    public SysDbChangelogRecord() {
        super(SysDbChangelog.SYS_DB_CHANGELOG);
    }

    /**
     * Create a detached, initialised SysDbChangelogRecord
     */
    public SysDbChangelogRecord(String scriptName, LocalDateTime createTs, Integer isInit) {
        super(SysDbChangelog.SYS_DB_CHANGELOG);

        setScriptName(scriptName);
        setCreateTs(createTs);
        setIsInit(isInit);
    }

    /**
     * Create a detached, initialised SysDbChangelogRecord
     */
    public SysDbChangelogRecord(nu.studer.sample.tables.pojos.SysDbChangelog value) {
        super(SysDbChangelog.SYS_DB_CHANGELOG);

        if (value != null) {
            setScriptName(value.getScriptName());
            setCreateTs(value.getCreateTs());
            setIsInit(value.getIsInit());
        }
    }
}