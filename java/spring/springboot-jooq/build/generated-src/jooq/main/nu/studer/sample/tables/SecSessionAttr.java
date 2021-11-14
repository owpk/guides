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
import nu.studer.sample.tables.records.SecSessionAttrRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class SecSessionAttr extends TableImpl<SecSessionAttrRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sec_session_attr</code>
     */
    public static final SecSessionAttr SEC_SESSION_ATTR = new SecSessionAttr();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SecSessionAttrRecord> getRecordType() {
        return SecSessionAttrRecord.class;
    }

    /**
     * The column <code>public.sec_session_attr.id</code>.
     */
    public final TableField<SecSessionAttrRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.sec_session_attr.create_ts</code>.
     */
    public final TableField<SecSessionAttrRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sec_session_attr.created_by</code>.
     */
    public final TableField<SecSessionAttrRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sec_session_attr.version</code>.
     */
    public final TableField<SecSessionAttrRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.sec_session_attr.update_ts</code>.
     */
    public final TableField<SecSessionAttrRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sec_session_attr.updated_by</code>.
     */
    public final TableField<SecSessionAttrRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sec_session_attr.delete_ts</code>.
     */
    public final TableField<SecSessionAttrRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sec_session_attr.deleted_by</code>.
     */
    public final TableField<SecSessionAttrRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sec_session_attr.sys_tenant_id</code>.
     */
    public final TableField<SecSessionAttrRecord, String> SYS_TENANT_ID = createField(DSL.name("sys_tenant_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.sec_session_attr.name</code>.
     */
    public final TableField<SecSessionAttrRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sec_session_attr.str_value</code>.
     */
    public final TableField<SecSessionAttrRecord, String> STR_VALUE = createField(DSL.name("str_value"), SQLDataType.VARCHAR(1000), this, "");

    /**
     * The column <code>public.sec_session_attr.datatype</code>.
     */
    public final TableField<SecSessionAttrRecord, String> DATATYPE = createField(DSL.name("datatype"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.sec_session_attr.group_id</code>.
     */
    public final TableField<SecSessionAttrRecord, UUID> GROUP_ID = createField(DSL.name("group_id"), SQLDataType.UUID, this, "");

    private SecSessionAttr(Name alias, Table<SecSessionAttrRecord> aliased) {
        this(alias, aliased, null);
    }

    private SecSessionAttr(Name alias, Table<SecSessionAttrRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.sec_session_attr</code> table reference
     */
    public SecSessionAttr(String alias) {
        this(DSL.name(alias), SEC_SESSION_ATTR);
    }

    /**
     * Create an aliased <code>public.sec_session_attr</code> table reference
     */
    public SecSessionAttr(Name alias) {
        this(alias, SEC_SESSION_ATTR);
    }

    /**
     * Create a <code>public.sec_session_attr</code> table reference
     */
    public SecSessionAttr() {
        this(DSL.name("sec_session_attr"), null);
    }

    public <O extends Record> SecSessionAttr(Table<O> child, ForeignKey<O, SecSessionAttrRecord> key) {
        super(child, key, SEC_SESSION_ATTR);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SEC_SESSION_ATTR_GROUP);
    }

    @Override
    public UniqueKey<SecSessionAttrRecord> getPrimaryKey() {
        return Keys.SEC_SESSION_ATTR_PKEY;
    }

    @Override
    public List<ForeignKey<SecSessionAttrRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SEC_SESSION_ATTR__SEC_SESSION_ATTR_GROUP);
    }

    private transient SecGroup _secGroup;

    public SecGroup secGroup() {
        if (_secGroup == null)
            _secGroup = new SecGroup(this, Keys.SEC_SESSION_ATTR__SEC_SESSION_ATTR_GROUP);

        return _secGroup;
    }

    @Override
    public SecSessionAttr as(String alias) {
        return new SecSessionAttr(DSL.name(alias), this);
    }

    @Override
    public SecSessionAttr as(Name alias) {
        return new SecSessionAttr(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SecSessionAttr rename(String name) {
        return new SecSessionAttr(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SecSessionAttr rename(Name name) {
        return new SecSessionAttr(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, String, String, String, UUID> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}