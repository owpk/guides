/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import nu.studer.sample.Indexes;
import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SmartexamDivisionAccessControlRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamDivisionAccessControl extends TableImpl<SmartexamDivisionAccessControlRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.smartexam_division_access_control</code>
     */
    public static final SmartexamDivisionAccessControl SMARTEXAM_DIVISION_ACCESS_CONTROL = new SmartexamDivisionAccessControl();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmartexamDivisionAccessControlRecord> getRecordType() {
        return SmartexamDivisionAccessControlRecord.class;
    }

    /**
     * The column <code>public.smartexam_division_access_control.id</code>.
     */
    public final TableField<SmartexamDivisionAccessControlRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.smartexam_division_access_control.version</code>.
     */
    public final TableField<SmartexamDivisionAccessControlRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>public.smartexam_division_access_control.create_ts</code>.
     */
    public final TableField<SmartexamDivisionAccessControlRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_division_access_control.created_by</code>.
     */
    public final TableField<SmartexamDivisionAccessControlRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.smartexam_division_access_control.update_ts</code>.
     */
    public final TableField<SmartexamDivisionAccessControlRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_division_access_control.updated_by</code>.
     */
    public final TableField<SmartexamDivisionAccessControlRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column
     * <code>public.smartexam_division_access_control.delete_ts</code>.
     */
    public final TableField<SmartexamDivisionAccessControlRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column
     * <code>public.smartexam_division_access_control.deleted_by</code>.
     */
    public final TableField<SmartexamDivisionAccessControlRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.smartexam_division_access_control.user_id</code>.
     */
    public final TableField<SmartexamDivisionAccessControlRecord, UUID> USER_ID = createField(DSL.name("user_id"), SQLDataType.UUID, this, "");

    private SmartexamDivisionAccessControl(Name alias, Table<SmartexamDivisionAccessControlRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmartexamDivisionAccessControl(Name alias, Table<SmartexamDivisionAccessControlRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.smartexam_division_access_control</code>
     * table reference
     */
    public SmartexamDivisionAccessControl(String alias) {
        this(DSL.name(alias), SMARTEXAM_DIVISION_ACCESS_CONTROL);
    }

    /**
     * Create an aliased <code>public.smartexam_division_access_control</code>
     * table reference
     */
    public SmartexamDivisionAccessControl(Name alias) {
        this(alias, SMARTEXAM_DIVISION_ACCESS_CONTROL);
    }

    /**
     * Create a <code>public.smartexam_division_access_control</code> table
     * reference
     */
    public SmartexamDivisionAccessControl() {
        this(DSL.name("smartexam_division_access_control"), null);
    }

    public <O extends Record> SmartexamDivisionAccessControl(Table<O> child, ForeignKey<O, SmartexamDivisionAccessControlRecord> key) {
        super(child, key, SMARTEXAM_DIVISION_ACCESS_CONTROL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SMARTEXAM_DIVISION_ACCESS_CONTROL_ON_USER);
    }

    @Override
    public UniqueKey<SmartexamDivisionAccessControlRecord> getPrimaryKey() {
        return Keys.SMARTEXAM_DIVISION_ACCESS_CONTROL_PKEY;
    }

    @Override
    public List<ForeignKey<SmartexamDivisionAccessControlRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SMARTEXAM_DIVISION_ACCESS_CONTROL__FK_SMARTEXAM_DIVISION_ACCESS_CONTROL_ON_USER);
    }

    private transient SecUser _secUser;

    public SecUser secUser() {
        if (_secUser == null)
            _secUser = new SecUser(this, Keys.SMARTEXAM_DIVISION_ACCESS_CONTROL__FK_SMARTEXAM_DIVISION_ACCESS_CONTROL_ON_USER);

        return _secUser;
    }

    @Override
    public SmartexamDivisionAccessControl as(String alias) {
        return new SmartexamDivisionAccessControl(DSL.name(alias), this);
    }

    @Override
    public SmartexamDivisionAccessControl as(Name alias) {
        return new SmartexamDivisionAccessControl(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamDivisionAccessControl rename(String name) {
        return new SmartexamDivisionAccessControl(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmartexamDivisionAccessControl rename(Name name) {
        return new SmartexamDivisionAccessControl(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, Integer, LocalDateTime, String, LocalDateTime, String, LocalDateTime, String, UUID> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
