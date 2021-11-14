/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.util.UUID;

import nu.studer.sample.tables.SysAppFolder;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysAppFolderRecord extends UpdatableRecordImpl<SysAppFolderRecord> implements Record6<UUID, String, String, String, String, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sys_app_folder.folder_id</code>.
     */
    public SysAppFolderRecord setFolderId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_app_folder.folder_id</code>.
     */
    public UUID getFolderId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sys_app_folder.filter_component</code>.
     */
    public SysAppFolderRecord setFilterComponent(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_app_folder.filter_component</code>.
     */
    public String getFilterComponent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.sys_app_folder.filter_xml</code>.
     */
    public SysAppFolderRecord setFilterXml(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_app_folder.filter_xml</code>.
     */
    public String getFilterXml() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sys_app_folder.visibility_script</code>.
     */
    public SysAppFolderRecord setVisibilityScript(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_app_folder.visibility_script</code>.
     */
    public String getVisibilityScript() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.sys_app_folder.quantity_script</code>.
     */
    public SysAppFolderRecord setQuantityScript(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_app_folder.quantity_script</code>.
     */
    public String getQuantityScript() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.sys_app_folder.apply_default</code>.
     */
    public SysAppFolderRecord setApplyDefault(Boolean value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_app_folder.apply_default</code>.
     */
    public Boolean getApplyDefault() {
        return (Boolean) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, String, String, String, String, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UUID, String, String, String, String, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SysAppFolder.SYS_APP_FOLDER.FOLDER_ID;
    }

    @Override
    public Field<String> field2() {
        return SysAppFolder.SYS_APP_FOLDER.FILTER_COMPONENT;
    }

    @Override
    public Field<String> field3() {
        return SysAppFolder.SYS_APP_FOLDER.FILTER_XML;
    }

    @Override
    public Field<String> field4() {
        return SysAppFolder.SYS_APP_FOLDER.VISIBILITY_SCRIPT;
    }

    @Override
    public Field<String> field5() {
        return SysAppFolder.SYS_APP_FOLDER.QUANTITY_SCRIPT;
    }

    @Override
    public Field<Boolean> field6() {
        return SysAppFolder.SYS_APP_FOLDER.APPLY_DEFAULT;
    }

    @Override
    public UUID component1() {
        return getFolderId();
    }

    @Override
    public String component2() {
        return getFilterComponent();
    }

    @Override
    public String component3() {
        return getFilterXml();
    }

    @Override
    public String component4() {
        return getVisibilityScript();
    }

    @Override
    public String component5() {
        return getQuantityScript();
    }

    @Override
    public Boolean component6() {
        return getApplyDefault();
    }

    @Override
    public UUID value1() {
        return getFolderId();
    }

    @Override
    public String value2() {
        return getFilterComponent();
    }

    @Override
    public String value3() {
        return getFilterXml();
    }

    @Override
    public String value4() {
        return getVisibilityScript();
    }

    @Override
    public String value5() {
        return getQuantityScript();
    }

    @Override
    public Boolean value6() {
        return getApplyDefault();
    }

    @Override
    public SysAppFolderRecord value1(UUID value) {
        setFolderId(value);
        return this;
    }

    @Override
    public SysAppFolderRecord value2(String value) {
        setFilterComponent(value);
        return this;
    }

    @Override
    public SysAppFolderRecord value3(String value) {
        setFilterXml(value);
        return this;
    }

    @Override
    public SysAppFolderRecord value4(String value) {
        setVisibilityScript(value);
        return this;
    }

    @Override
    public SysAppFolderRecord value5(String value) {
        setQuantityScript(value);
        return this;
    }

    @Override
    public SysAppFolderRecord value6(Boolean value) {
        setApplyDefault(value);
        return this;
    }

    @Override
    public SysAppFolderRecord values(UUID value1, String value2, String value3, String value4, String value5, Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysAppFolderRecord
     */
    public SysAppFolderRecord() {
        super(SysAppFolder.SYS_APP_FOLDER);
    }

    /**
     * Create a detached, initialised SysAppFolderRecord
     */
    public SysAppFolderRecord(UUID folderId, String filterComponent, String filterXml, String visibilityScript, String quantityScript, Boolean applyDefault) {
        super(SysAppFolder.SYS_APP_FOLDER);

        setFolderId(folderId);
        setFilterComponent(filterComponent);
        setFilterXml(filterXml);
        setVisibilityScript(visibilityScript);
        setQuantityScript(quantityScript);
        setApplyDefault(applyDefault);
    }

    /**
     * Create a detached, initialised SysAppFolderRecord
     */
    public SysAppFolderRecord(nu.studer.sample.tables.pojos.SysAppFolder value) {
        super(SysAppFolder.SYS_APP_FOLDER);

        if (value != null) {
            setFolderId(value.getFolderId());
            setFilterComponent(value.getFilterComponent());
            setFilterXml(value.getFilterXml());
            setVisibilityScript(value.getVisibilityScript());
            setQuantityScript(value.getQuantityScript());
            setApplyDefault(value.getApplyDefault());
        }
    }
}