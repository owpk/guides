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
public class SecUserSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final UUID          userId;
    private final String        clientType;
    private final String        name;
    private final String        value_;

    public SecUserSetting(SecUserSetting value) {
        this.id = value.id;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.userId = value.userId;
        this.clientType = value.clientType;
        this.name = value.name;
        this.value_ = value.value_;
    }

    public SecUserSetting(
        UUID          id,
        LocalDateTime createTs,
        String        createdBy,
        UUID          userId,
        String        clientType,
        String        name,
        String        value_
    ) {
        this.id = id;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.userId = userId;
        this.clientType = clientType;
        this.name = name;
        this.value_ = value_;
    }

    /**
     * Getter for <code>public.sec_user_setting.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.sec_user_setting.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.sec_user_setting.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.sec_user_setting.user_id</code>.
     */
    public UUID getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>public.sec_user_setting.client_type</code>.
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * Getter for <code>public.sec_user_setting.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.sec_user_setting.value_</code>.
     */
    public String getValue_() {
        return this.value_;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SecUserSetting (");

        sb.append(id);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(userId);
        sb.append(", ").append(clientType);
        sb.append(", ").append(name);
        sb.append(", ").append(value_);

        sb.append(")");
        return sb.toString();
    }
}