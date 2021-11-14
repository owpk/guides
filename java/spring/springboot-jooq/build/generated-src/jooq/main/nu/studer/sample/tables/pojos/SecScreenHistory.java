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
public class SecScreenHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final String        sysTenantId;
    private final UUID          userId;
    private final String        caption;
    private final String        url;
    private final UUID          entityId;
    private final String        stringEntityId;
    private final Integer       intEntityId;
    private final Long          longEntityId;
    private final UUID          substitutedUserId;

    public SecScreenHistory(SecScreenHistory value) {
        this.id = value.id;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.sysTenantId = value.sysTenantId;
        this.userId = value.userId;
        this.caption = value.caption;
        this.url = value.url;
        this.entityId = value.entityId;
        this.stringEntityId = value.stringEntityId;
        this.intEntityId = value.intEntityId;
        this.longEntityId = value.longEntityId;
        this.substitutedUserId = value.substitutedUserId;
    }

    public SecScreenHistory(
        UUID          id,
        LocalDateTime createTs,
        String        createdBy,
        String        sysTenantId,
        UUID          userId,
        String        caption,
        String        url,
        UUID          entityId,
        String        stringEntityId,
        Integer       intEntityId,
        Long          longEntityId,
        UUID          substitutedUserId
    ) {
        this.id = id;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.sysTenantId = sysTenantId;
        this.userId = userId;
        this.caption = caption;
        this.url = url;
        this.entityId = entityId;
        this.stringEntityId = stringEntityId;
        this.intEntityId = intEntityId;
        this.longEntityId = longEntityId;
        this.substitutedUserId = substitutedUserId;
    }

    /**
     * Getter for <code>public.sec_screen_history.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.sec_screen_history.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.sec_screen_history.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.sec_screen_history.sys_tenant_id</code>.
     */
    public String getSysTenantId() {
        return this.sysTenantId;
    }

    /**
     * Getter for <code>public.sec_screen_history.user_id</code>.
     */
    public UUID getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>public.sec_screen_history.caption</code>.
     */
    public String getCaption() {
        return this.caption;
    }

    /**
     * Getter for <code>public.sec_screen_history.url</code>.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Getter for <code>public.sec_screen_history.entity_id</code>.
     */
    public UUID getEntityId() {
        return this.entityId;
    }

    /**
     * Getter for <code>public.sec_screen_history.string_entity_id</code>.
     */
    public String getStringEntityId() {
        return this.stringEntityId;
    }

    /**
     * Getter for <code>public.sec_screen_history.int_entity_id</code>.
     */
    public Integer getIntEntityId() {
        return this.intEntityId;
    }

    /**
     * Getter for <code>public.sec_screen_history.long_entity_id</code>.
     */
    public Long getLongEntityId() {
        return this.longEntityId;
    }

    /**
     * Getter for <code>public.sec_screen_history.substituted_user_id</code>.
     */
    public UUID getSubstitutedUserId() {
        return this.substitutedUserId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SecScreenHistory (");

        sb.append(id);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(sysTenantId);
        sb.append(", ").append(userId);
        sb.append(", ").append(caption);
        sb.append(", ").append(url);
        sb.append(", ").append(entityId);
        sb.append(", ").append(stringEntityId);
        sb.append(", ").append(intEntityId);
        sb.append(", ").append(longEntityId);
        sb.append(", ").append(substitutedUserId);

        sb.append(")");
        return sb.toString();
    }
}