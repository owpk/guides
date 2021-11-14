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
public class SysFolder implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final Integer       version;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final LocalDateTime deleteTs;
    private final String        deletedBy;
    private final String        sysTenantId;
    private final String        folderType;
    private final UUID          parentId;
    private final String        name;
    private final String        tabName;
    private final Integer       sortOrder;

    public SysFolder(SysFolder value) {
        this.id = value.id;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.version = value.version;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.sysTenantId = value.sysTenantId;
        this.folderType = value.folderType;
        this.parentId = value.parentId;
        this.name = value.name;
        this.tabName = value.tabName;
        this.sortOrder = value.sortOrder;
    }

    public SysFolder(
        UUID          id,
        LocalDateTime createTs,
        String        createdBy,
        Integer       version,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        String        sysTenantId,
        String        folderType,
        UUID          parentId,
        String        name,
        String        tabName,
        Integer       sortOrder
    ) {
        this.id = id;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.version = version;
        this.updateTs = updateTs;
        this.updatedBy = updatedBy;
        this.deleteTs = deleteTs;
        this.deletedBy = deletedBy;
        this.sysTenantId = sysTenantId;
        this.folderType = folderType;
        this.parentId = parentId;
        this.name = name;
        this.tabName = tabName;
        this.sortOrder = sortOrder;
    }

    /**
     * Getter for <code>public.sys_folder.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.sys_folder.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.sys_folder.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.sys_folder.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.sys_folder.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.sys_folder.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.sys_folder.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.sys_folder.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.sys_folder.sys_tenant_id</code>.
     */
    public String getSysTenantId() {
        return this.sysTenantId;
    }

    /**
     * Getter for <code>public.sys_folder.folder_type</code>.
     */
    public String getFolderType() {
        return this.folderType;
    }

    /**
     * Getter for <code>public.sys_folder.parent_id</code>.
     */
    public UUID getParentId() {
        return this.parentId;
    }

    /**
     * Getter for <code>public.sys_folder.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.sys_folder.tab_name</code>.
     */
    public String getTabName() {
        return this.tabName;
    }

    /**
     * Getter for <code>public.sys_folder.sort_order</code>.
     */
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysFolder (");

        sb.append(id);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(version);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(sysTenantId);
        sb.append(", ").append(folderType);
        sb.append(", ").append(parentId);
        sb.append(", ").append(name);
        sb.append(", ").append(tabName);
        sb.append(", ").append(sortOrder);

        sb.append(")");
        return sb.toString();
    }
}