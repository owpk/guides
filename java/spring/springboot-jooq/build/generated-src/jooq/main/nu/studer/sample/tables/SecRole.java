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
import nu.studer.sample.tables.records.SecRoleRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
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
public class SecRole extends TableImpl<SecRoleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sec_role</code>
     */
    public static final SecRole SEC_ROLE = new SecRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SecRoleRecord> getRecordType() {
        return SecRoleRecord.class;
    }

    /**
     * The column <code>public.sec_role.id</code>.
     */
    public final TableField<SecRoleRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.sec_role.create_ts</code>.
     */
    public final TableField<SecRoleRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sec_role.created_by</code>.
     */
    public final TableField<SecRoleRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sec_role.version</code>.
     */
    public final TableField<SecRoleRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.sec_role.update_ts</code>.
     */
    public final TableField<SecRoleRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sec_role.updated_by</code>.
     */
    public final TableField<SecRoleRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sec_role.delete_ts</code>.
     */
    public final TableField<SecRoleRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sec_role.deleted_by</code>.
     */
    public final TableField<SecRoleRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sec_role.sys_tenant_id</code>.
     */
    public final TableField<SecRoleRecord, String> SYS_TENANT_ID = createField(DSL.name("sys_tenant_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.sec_role.name</code>.
     */
    public final TableField<SecRoleRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.sec_role.loc_name</code>.
     */
    public final TableField<SecRoleRecord, String> LOC_NAME = createField(DSL.name("loc_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.sec_role.description</code>.
     */
    public final TableField<SecRoleRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>public.sec_role.is_default_role</code>.
     */
    public final TableField<SecRoleRecord, Boolean> IS_DEFAULT_ROLE = createField(DSL.name("is_default_role"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.sec_role.role_type</code>.
     */
    public final TableField<SecRoleRecord, Integer> ROLE_TYPE = createField(DSL.name("role_type"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.sec_role.security_scope</code>.
     */
    public final TableField<SecRoleRecord, String> SECURITY_SCOPE = createField(DSL.name("security_scope"), SQLDataType.VARCHAR(255), this, "");

    private SecRole(Name alias, Table<SecRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private SecRole(Name alias, Table<SecRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.sec_role</code> table reference
     */
    public SecRole(String alias) {
        this(DSL.name(alias), SEC_ROLE);
    }

    /**
     * Create an aliased <code>public.sec_role</code> table reference
     */
    public SecRole(Name alias) {
        this(alias, SEC_ROLE);
    }

    /**
     * Create a <code>public.sec_role</code> table reference
     */
    public SecRole() {
        this(DSL.name("sec_role"), null);
    }

    public <O extends Record> SecRole(Table<O> child, ForeignKey<O, SecRoleRecord> key) {
        super(child, key, SEC_ROLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SEC_ROLE_UNIQ_NAME, Indexes.IDX_SEC_ROLE_UNIQ_NAME_SYS_TENANT_ID_NN);
    }

    @Override
    public UniqueKey<SecRoleRecord> getPrimaryKey() {
        return Keys.SEC_ROLE_PKEY;
    }

    @Override
    public SecRole as(String alias) {
        return new SecRole(DSL.name(alias), this);
    }

    @Override
    public SecRole as(Name alias) {
        return new SecRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SecRole rename(String name) {
        return new SecRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SecRole rename(Name name) {
        return new SecRole(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, String, String, String, Boolean, Integer, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
