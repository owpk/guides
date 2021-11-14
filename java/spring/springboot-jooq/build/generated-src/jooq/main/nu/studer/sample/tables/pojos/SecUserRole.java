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
public class SecUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final Integer       version;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final LocalDateTime deleteTs;
    private final String        deletedBy;
    private final UUID          userId;
    private final UUID          roleId;
    private final String        roleName;

    public SecUserRole(SecUserRole value) {
        this.id = value.id;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.version = value.version;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.userId = value.userId;
        this.roleId = value.roleId;
        this.roleName = value.roleName;
    }

    public SecUserRole(
        UUID          id,
        LocalDateTime createTs,
        String        createdBy,
        Integer       version,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        UUID          userId,
        UUID          roleId,
        String        roleName
    ) {
        this.id = id;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.version = version;
        this.updateTs = updateTs;
        this.updatedBy = updatedBy;
        this.deleteTs = deleteTs;
        this.deletedBy = deletedBy;
        this.userId = userId;
        this.roleId = roleId;
        this.roleName = roleName;
    }

    /**
     * Getter for <code>public.sec_user_role.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.sec_user_role.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.sec_user_role.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.sec_user_role.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.sec_user_role.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.sec_user_role.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.sec_user_role.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.sec_user_role.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.sec_user_role.user_id</code>.
     */
    public UUID getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>public.sec_user_role.role_id</code>.
     */
    public UUID getRoleId() {
        return this.roleId;
    }

    /**
     * Getter for <code>public.sec_user_role.role_name</code>.
     */
    public String getRoleName() {
        return this.roleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SecUserRole (");

        sb.append(id);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(version);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(userId);
        sb.append(", ").append(roleId);
        sb.append(", ").append(roleName);

        sb.append(")");
        return sb.toString();
    }
}
