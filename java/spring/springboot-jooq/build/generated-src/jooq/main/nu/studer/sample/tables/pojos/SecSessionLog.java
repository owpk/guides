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
public class SecSessionLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final Integer       version;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final LocalDateTime deleteTs;
    private final String        deletedBy;
    private final String        sysTenantId;
    private final UUID          sessionId;
    private final UUID          userId;
    private final UUID          substitutedUserId;
    private final String        userData;
    private final Integer       lastAction;
    private final String        clientInfo;
    private final String        clientType;
    private final String        address;
    private final LocalDateTime startedTs;
    private final LocalDateTime finishedTs;
    private final String        serverId;

    public SecSessionLog(SecSessionLog value) {
        this.id = value.id;
        this.version = value.version;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.sysTenantId = value.sysTenantId;
        this.sessionId = value.sessionId;
        this.userId = value.userId;
        this.substitutedUserId = value.substitutedUserId;
        this.userData = value.userData;
        this.lastAction = value.lastAction;
        this.clientInfo = value.clientInfo;
        this.clientType = value.clientType;
        this.address = value.address;
        this.startedTs = value.startedTs;
        this.finishedTs = value.finishedTs;
        this.serverId = value.serverId;
    }

    public SecSessionLog(
        UUID          id,
        Integer       version,
        LocalDateTime createTs,
        String        createdBy,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        String        sysTenantId,
        UUID          sessionId,
        UUID          userId,
        UUID          substitutedUserId,
        String        userData,
        Integer       lastAction,
        String        clientInfo,
        String        clientType,
        String        address,
        LocalDateTime startedTs,
        LocalDateTime finishedTs,
        String        serverId
    ) {
        this.id = id;
        this.version = version;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.updateTs = updateTs;
        this.updatedBy = updatedBy;
        this.deleteTs = deleteTs;
        this.deletedBy = deletedBy;
        this.sysTenantId = sysTenantId;
        this.sessionId = sessionId;
        this.userId = userId;
        this.substitutedUserId = substitutedUserId;
        this.userData = userData;
        this.lastAction = lastAction;
        this.clientInfo = clientInfo;
        this.clientType = clientType;
        this.address = address;
        this.startedTs = startedTs;
        this.finishedTs = finishedTs;
        this.serverId = serverId;
    }

    /**
     * Getter for <code>public.sec_session_log.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.sec_session_log.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.sec_session_log.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.sec_session_log.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.sec_session_log.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.sec_session_log.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.sec_session_log.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.sec_session_log.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.sec_session_log.sys_tenant_id</code>.
     */
    public String getSysTenantId() {
        return this.sysTenantId;
    }

    /**
     * Getter for <code>public.sec_session_log.session_id</code>.
     */
    public UUID getSessionId() {
        return this.sessionId;
    }

    /**
     * Getter for <code>public.sec_session_log.user_id</code>.
     */
    public UUID getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>public.sec_session_log.substituted_user_id</code>.
     */
    public UUID getSubstitutedUserId() {
        return this.substitutedUserId;
    }

    /**
     * Getter for <code>public.sec_session_log.user_data</code>.
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * Getter for <code>public.sec_session_log.last_action</code>.
     */
    public Integer getLastAction() {
        return this.lastAction;
    }

    /**
     * Getter for <code>public.sec_session_log.client_info</code>.
     */
    public String getClientInfo() {
        return this.clientInfo;
    }

    /**
     * Getter for <code>public.sec_session_log.client_type</code>.
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * Getter for <code>public.sec_session_log.address</code>.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Getter for <code>public.sec_session_log.started_ts</code>.
     */
    public LocalDateTime getStartedTs() {
        return this.startedTs;
    }

    /**
     * Getter for <code>public.sec_session_log.finished_ts</code>.
     */
    public LocalDateTime getFinishedTs() {
        return this.finishedTs;
    }

    /**
     * Getter for <code>public.sec_session_log.server_id</code>.
     */
    public String getServerId() {
        return this.serverId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SecSessionLog (");

        sb.append(id);
        sb.append(", ").append(version);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(sysTenantId);
        sb.append(", ").append(sessionId);
        sb.append(", ").append(userId);
        sb.append(", ").append(substitutedUserId);
        sb.append(", ").append(userData);
        sb.append(", ").append(lastAction);
        sb.append(", ").append(clientInfo);
        sb.append(", ").append(clientType);
        sb.append(", ").append(address);
        sb.append(", ").append(startedTs);
        sb.append(", ").append(finishedTs);
        sb.append(", ").append(serverId);

        sb.append(")");
        return sb.toString();
    }
}
