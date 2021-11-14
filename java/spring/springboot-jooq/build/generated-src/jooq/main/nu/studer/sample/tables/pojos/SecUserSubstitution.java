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
public class SecUserSubstitution implements Serializable {

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
    private final UUID          userId;
    private final UUID          substitutedUserId;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;

    public SecUserSubstitution(SecUserSubstitution value) {
        this.id = value.id;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.version = value.version;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.sysTenantId = value.sysTenantId;
        this.userId = value.userId;
        this.substitutedUserId = value.substitutedUserId;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
    }

    public SecUserSubstitution(
        UUID          id,
        LocalDateTime createTs,
        String        createdBy,
        Integer       version,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        String        sysTenantId,
        UUID          userId,
        UUID          substitutedUserId,
        LocalDateTime startDate,
        LocalDateTime endDate
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
        this.userId = userId;
        this.substitutedUserId = substitutedUserId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Getter for <code>public.sec_user_substitution.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.sec_user_substitution.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.sec_user_substitution.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.sec_user_substitution.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.sec_user_substitution.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.sec_user_substitution.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.sec_user_substitution.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.sec_user_substitution.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.sec_user_substitution.sys_tenant_id</code>.
     */
    public String getSysTenantId() {
        return this.sysTenantId;
    }

    /**
     * Getter for <code>public.sec_user_substitution.user_id</code>.
     */
    public UUID getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>public.sec_user_substitution.substituted_user_id</code>.
     */
    public UUID getSubstitutedUserId() {
        return this.substitutedUserId;
    }

    /**
     * Getter for <code>public.sec_user_substitution.start_date</code>.
     */
    public LocalDateTime getStartDate() {
        return this.startDate;
    }

    /**
     * Getter for <code>public.sec_user_substitution.end_date</code>.
     */
    public LocalDateTime getEndDate() {
        return this.endDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SecUserSubstitution (");

        sb.append(id);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(version);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(sysTenantId);
        sb.append(", ").append(userId);
        sb.append(", ").append(substitutedUserId);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);

        sb.append(")");
        return sb.toString();
    }
}
