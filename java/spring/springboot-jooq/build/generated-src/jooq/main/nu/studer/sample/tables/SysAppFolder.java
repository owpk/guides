/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SysAppFolderRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class SysAppFolder extends TableImpl<SysAppFolderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sys_app_folder</code>
     */
    public static final SysAppFolder SYS_APP_FOLDER = new SysAppFolder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysAppFolderRecord> getRecordType() {
        return SysAppFolderRecord.class;
    }

    /**
     * The column <code>public.sys_app_folder.folder_id</code>.
     */
    public final TableField<SysAppFolderRecord, UUID> FOLDER_ID = createField(DSL.name("folder_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.sys_app_folder.filter_component</code>.
     */
    public final TableField<SysAppFolderRecord, String> FILTER_COMPONENT = createField(DSL.name("filter_component"), SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>public.sys_app_folder.filter_xml</code>.
     */
    public final TableField<SysAppFolderRecord, String> FILTER_XML = createField(DSL.name("filter_xml"), SQLDataType.VARCHAR(7000), this, "");

    /**
     * The column <code>public.sys_app_folder.visibility_script</code>.
     */
    public final TableField<SysAppFolderRecord, String> VISIBILITY_SCRIPT = createField(DSL.name("visibility_script"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.sys_app_folder.quantity_script</code>.
     */
    public final TableField<SysAppFolderRecord, String> QUANTITY_SCRIPT = createField(DSL.name("quantity_script"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.sys_app_folder.apply_default</code>.
     */
    public final TableField<SysAppFolderRecord, Boolean> APPLY_DEFAULT = createField(DSL.name("apply_default"), SQLDataType.BOOLEAN, this, "");

    private SysAppFolder(Name alias, Table<SysAppFolderRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysAppFolder(Name alias, Table<SysAppFolderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.sys_app_folder</code> table reference
     */
    public SysAppFolder(String alias) {
        this(DSL.name(alias), SYS_APP_FOLDER);
    }

    /**
     * Create an aliased <code>public.sys_app_folder</code> table reference
     */
    public SysAppFolder(Name alias) {
        this(alias, SYS_APP_FOLDER);
    }

    /**
     * Create a <code>public.sys_app_folder</code> table reference
     */
    public SysAppFolder() {
        this(DSL.name("sys_app_folder"), null);
    }

    public <O extends Record> SysAppFolder(Table<O> child, ForeignKey<O, SysAppFolderRecord> key) {
        super(child, key, SYS_APP_FOLDER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<SysAppFolderRecord> getPrimaryKey() {
        return Keys.SYS_APP_FOLDER_PKEY;
    }

    @Override
    public List<ForeignKey<SysAppFolderRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SYS_APP_FOLDER__FK_SYS_APP_FOLDER_FOLDER);
    }

    private transient SysFolder _sysFolder;

    public SysFolder sysFolder() {
        if (_sysFolder == null)
            _sysFolder = new SysFolder(this, Keys.SYS_APP_FOLDER__FK_SYS_APP_FOLDER_FOLDER);

        return _sysFolder;
    }

    @Override
    public SysAppFolder as(String alias) {
        return new SysAppFolder(DSL.name(alias), this);
    }

    @Override
    public SysAppFolder as(Name alias) {
        return new SysAppFolder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysAppFolder rename(String name) {
        return new SysAppFolder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysAppFolder rename(Name name) {
        return new SysAppFolder(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, String, String, String, String, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}