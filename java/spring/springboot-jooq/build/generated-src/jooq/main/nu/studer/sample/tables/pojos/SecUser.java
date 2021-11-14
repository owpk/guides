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
public class SecUser implements Serializable {

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
    private final String        login;
    private final String        loginLc;
    private final String        password;
    private final String        passwordEncryption;
    private final String        name;
    private final String        firstName;
    private final String        lastName;
    private final String        middleName;
    private final String        position_;
    private final String        email;
    private final String        language_;
    private final String        timeZone;
    private final Boolean       timeZoneAuto;
    private final Boolean       active;
    private final UUID          groupId;
    private final String        groupNames;
    private final String        ipMask;
    private final Boolean       changePasswordAtLogon;

    public SecUser(SecUser value) {
        this.id = value.id;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.version = value.version;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.sysTenantId = value.sysTenantId;
        this.login = value.login;
        this.loginLc = value.loginLc;
        this.password = value.password;
        this.passwordEncryption = value.passwordEncryption;
        this.name = value.name;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.middleName = value.middleName;
        this.position_ = value.position_;
        this.email = value.email;
        this.language_ = value.language_;
        this.timeZone = value.timeZone;
        this.timeZoneAuto = value.timeZoneAuto;
        this.active = value.active;
        this.groupId = value.groupId;
        this.groupNames = value.groupNames;
        this.ipMask = value.ipMask;
        this.changePasswordAtLogon = value.changePasswordAtLogon;
    }

    public SecUser(
        UUID          id,
        LocalDateTime createTs,
        String        createdBy,
        Integer       version,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        String        sysTenantId,
        String        login,
        String        loginLc,
        String        password,
        String        passwordEncryption,
        String        name,
        String        firstName,
        String        lastName,
        String        middleName,
        String        position_,
        String        email,
        String        language_,
        String        timeZone,
        Boolean       timeZoneAuto,
        Boolean       active,
        UUID          groupId,
        String        groupNames,
        String        ipMask,
        Boolean       changePasswordAtLogon
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
        this.login = login;
        this.loginLc = loginLc;
        this.password = password;
        this.passwordEncryption = passwordEncryption;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position_ = position_;
        this.email = email;
        this.language_ = language_;
        this.timeZone = timeZone;
        this.timeZoneAuto = timeZoneAuto;
        this.active = active;
        this.groupId = groupId;
        this.groupNames = groupNames;
        this.ipMask = ipMask;
        this.changePasswordAtLogon = changePasswordAtLogon;
    }

    /**
     * Getter for <code>public.sec_user.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.sec_user.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.sec_user.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.sec_user.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.sec_user.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.sec_user.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.sec_user.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.sec_user.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.sec_user.sys_tenant_id</code>.
     */
    public String getSysTenantId() {
        return this.sysTenantId;
    }

    /**
     * Getter for <code>public.sec_user.login</code>.
     */
    public String getLogin() {
        return this.login;
    }

    /**
     * Getter for <code>public.sec_user.login_lc</code>.
     */
    public String getLoginLc() {
        return this.loginLc;
    }

    /**
     * Getter for <code>public.sec_user.password</code>.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Getter for <code>public.sec_user.password_encryption</code>.
     */
    public String getPasswordEncryption() {
        return this.passwordEncryption;
    }

    /**
     * Getter for <code>public.sec_user.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.sec_user.first_name</code>.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Getter for <code>public.sec_user.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Getter for <code>public.sec_user.middle_name</code>.
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * Getter for <code>public.sec_user.position_</code>.
     */
    public String getPosition_() {
        return this.position_;
    }

    /**
     * Getter for <code>public.sec_user.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Getter for <code>public.sec_user.language_</code>.
     */
    public String getLanguage_() {
        return this.language_;
    }

    /**
     * Getter for <code>public.sec_user.time_zone</code>.
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * Getter for <code>public.sec_user.time_zone_auto</code>.
     */
    public Boolean getTimeZoneAuto() {
        return this.timeZoneAuto;
    }

    /**
     * Getter for <code>public.sec_user.active</code>.
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Getter for <code>public.sec_user.group_id</code>.
     */
    public UUID getGroupId() {
        return this.groupId;
    }

    /**
     * Getter for <code>public.sec_user.group_names</code>.
     */
    public String getGroupNames() {
        return this.groupNames;
    }

    /**
     * Getter for <code>public.sec_user.ip_mask</code>.
     */
    public String getIpMask() {
        return this.ipMask;
    }

    /**
     * Getter for <code>public.sec_user.change_password_at_logon</code>.
     */
    public Boolean getChangePasswordAtLogon() {
        return this.changePasswordAtLogon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SecUser (");

        sb.append(id);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(version);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(sysTenantId);
        sb.append(", ").append(login);
        sb.append(", ").append(loginLc);
        sb.append(", ").append(password);
        sb.append(", ").append(passwordEncryption);
        sb.append(", ").append(name);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(middleName);
        sb.append(", ").append(position_);
        sb.append(", ").append(email);
        sb.append(", ").append(language_);
        sb.append(", ").append(timeZone);
        sb.append(", ").append(timeZoneAuto);
        sb.append(", ").append(active);
        sb.append(", ").append(groupId);
        sb.append(", ").append(groupNames);
        sb.append(", ").append(ipMask);
        sb.append(", ").append(changePasswordAtLogon);

        sb.append(")");
        return sb.toString();
    }
}