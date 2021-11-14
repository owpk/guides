/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SecGroupHierarchyRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class SecGroupHierarchy extends TableImpl<SecGroupHierarchyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sec_group_hierarchy</code>
     */
    public static final SecGroupHierarchy SEC_GROUP_HIERARCHY = new SecGroupHierarchy();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SecGroupHierarchyRecord> getRecordType() {
        return SecGroupHierarchyRecord.class;
    }

    /**
     * The column <code>public.sec_group_hierarchy.id</code>.
     */
    public final TableField<SecGroupHierarchyRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.sec_group_hierarchy.create_ts</code>.
     */
    public final TableField<SecGroupHierarchyRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sec_group_hierarchy.created_by</code>.
     */
    public final TableField<SecGroupHierarchyRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sec_group_hierarchy.sys_tenant_id</code>.
     */
    public final TableField<SecGroupHierarchyRecord, String> SYS_TENANT_ID = createField(DSL.name("sys_tenant_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.sec_group_hierarchy.group_id</code>.
     */
    public final TableField<SecGroupHierarchyRecord, UUID> GROUP_ID = createField(DSL.name("group_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.sec_group_hierarchy.parent_id</code>.
     */
    public final TableField<SecGroupHierarchyRecord, UUID> PARENT_ID = createField(DSL.name("parent_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.sec_group_hierarchy.hierarchy_level</code>.
     */
    public final TableField<SecGroupHierarchyRecord, Integer> HIERARCHY_LEVEL = createField(DSL.name("hierarchy_level"), SQLDataType.INTEGER, this, "");

    private SecGroupHierarchy(Name alias, Table<SecGroupHierarchyRecord> aliased) {
        this(alias, aliased, null);
    }

    private SecGroupHierarchy(Name alias, Table<SecGroupHierarchyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.sec_group_hierarchy</code> table reference
     */
    public SecGroupHierarchy(String alias) {
        this(DSL.name(alias), SEC_GROUP_HIERARCHY);
    }

    /**
     * Create an aliased <code>public.sec_group_hierarchy</code> table reference
     */
    public SecGroupHierarchy(Name alias) {
        this(alias, SEC_GROUP_HIERARCHY);
    }

    /**
     * Create a <code>public.sec_group_hierarchy</code> table reference
     */
    public SecGroupHierarchy() {
        this(DSL.name("sec_group_hierarchy"), null);
    }

    public <O extends Record> SecGroupHierarchy(Table<O> child, ForeignKey<O, SecGroupHierarchyRecord> key) {
        super(child, key, SEC_GROUP_HIERARCHY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<SecGroupHierarchyRecord> getPrimaryKey() {
        return Keys.SEC_GROUP_HIERARCHY_PKEY;
    }

    @Override
    public List<ForeignKey<SecGroupHierarchyRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SEC_GROUP_HIERARCHY__SEC_GROUP_HIERARCHY_GROUP, Keys.SEC_GROUP_HIERARCHY__SEC_GROUP_HIERARCHY_PARENT);
    }

    private transient SecGroup _secGroupHierarchyGroup;
    private transient SecGroup _secGroupHierarchyParent;

    public SecGroup secGroupHierarchyGroup() {
        if (_secGroupHierarchyGroup == null)
            _secGroupHierarchyGroup = new SecGroup(this, Keys.SEC_GROUP_HIERARCHY__SEC_GROUP_HIERARCHY_GROUP);

        return _secGroupHierarchyGroup;
    }

    public SecGroup secGroupHierarchyParent() {
        if (_secGroupHierarchyParent == null)
            _secGroupHierarchyParent = new SecGroup(this, Keys.SEC_GROUP_HIERARCHY__SEC_GROUP_HIERARCHY_PARENT);

        return _secGroupHierarchyParent;
    }

    @Override
    public SecGroupHierarchy as(String alias) {
        return new SecGroupHierarchy(DSL.name(alias), this);
    }

    @Override
    public SecGroupHierarchy as(Name alias) {
        return new SecGroupHierarchy(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SecGroupHierarchy rename(String name) {
        return new SecGroupHierarchy(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SecGroupHierarchy rename(Name name) {
        return new SecGroupHierarchy(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<UUID, LocalDateTime, String, String, UUID, UUID, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
