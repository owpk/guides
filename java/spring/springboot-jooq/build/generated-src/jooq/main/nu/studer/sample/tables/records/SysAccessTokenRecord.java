/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SysAccessToken;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysAccessTokenRecord extends UpdatableRecordImpl<SysAccessTokenRecord> implements Record10<UUID, LocalDateTime, String, byte[], String, byte[], LocalDateTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sys_access_token.id</code>.
     */
    public SysAccessTokenRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_access_token.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sys_access_token.create_ts</code>.
     */
    public SysAccessTokenRecord setCreateTs(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_access_token.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.sys_access_token.token_value</code>.
     */
    public SysAccessTokenRecord setTokenValue(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_access_token.token_value</code>.
     */
    public String getTokenValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sys_access_token.token_bytes</code>.
     */
    public SysAccessTokenRecord setTokenBytes(byte[] value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_access_token.token_bytes</code>.
     */
    public byte[] getTokenBytes() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>public.sys_access_token.authentication_key</code>.
     */
    public SysAccessTokenRecord setAuthenticationKey(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_access_token.authentication_key</code>.
     */
    public String getAuthenticationKey() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.sys_access_token.authentication_bytes</code>.
     */
    public SysAccessTokenRecord setAuthenticationBytes(byte[] value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_access_token.authentication_bytes</code>.
     */
    public byte[] getAuthenticationBytes() {
        return (byte[]) get(5);
    }

    /**
     * Setter for <code>public.sys_access_token.expiry</code>.
     */
    public SysAccessTokenRecord setExpiry(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_access_token.expiry</code>.
     */
    public LocalDateTime getExpiry() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.sys_access_token.user_login</code>.
     */
    public SysAccessTokenRecord setUserLogin(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_access_token.user_login</code>.
     */
    public String getUserLogin() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.sys_access_token.locale</code>.
     */
    public SysAccessTokenRecord setLocale(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_access_token.locale</code>.
     */
    public String getLocale() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.sys_access_token.refresh_token_value</code>.
     */
    public SysAccessTokenRecord setRefreshTokenValue(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_access_token.refresh_token_value</code>.
     */
    public String getRefreshTokenValue() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<UUID, LocalDateTime, String, byte[], String, byte[], LocalDateTime, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<UUID, LocalDateTime, String, byte[], String, byte[], LocalDateTime, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SysAccessToken.SYS_ACCESS_TOKEN.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SysAccessToken.SYS_ACCESS_TOKEN.CREATE_TS;
    }

    @Override
    public Field<String> field3() {
        return SysAccessToken.SYS_ACCESS_TOKEN.TOKEN_VALUE;
    }

    @Override
    public Field<byte[]> field4() {
        return SysAccessToken.SYS_ACCESS_TOKEN.TOKEN_BYTES;
    }

    @Override
    public Field<String> field5() {
        return SysAccessToken.SYS_ACCESS_TOKEN.AUTHENTICATION_KEY;
    }

    @Override
    public Field<byte[]> field6() {
        return SysAccessToken.SYS_ACCESS_TOKEN.AUTHENTICATION_BYTES;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SysAccessToken.SYS_ACCESS_TOKEN.EXPIRY;
    }

    @Override
    public Field<String> field8() {
        return SysAccessToken.SYS_ACCESS_TOKEN.USER_LOGIN;
    }

    @Override
    public Field<String> field9() {
        return SysAccessToken.SYS_ACCESS_TOKEN.LOCALE;
    }

    @Override
    public Field<String> field10() {
        return SysAccessToken.SYS_ACCESS_TOKEN.REFRESH_TOKEN_VALUE;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreateTs();
    }

    @Override
    public String component3() {
        return getTokenValue();
    }

    @Override
    public byte[] component4() {
        return getTokenBytes();
    }

    @Override
    public String component5() {
        return getAuthenticationKey();
    }

    @Override
    public byte[] component6() {
        return getAuthenticationBytes();
    }

    @Override
    public LocalDateTime component7() {
        return getExpiry();
    }

    @Override
    public String component8() {
        return getUserLogin();
    }

    @Override
    public String component9() {
        return getLocale();
    }

    @Override
    public String component10() {
        return getRefreshTokenValue();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreateTs();
    }

    @Override
    public String value3() {
        return getTokenValue();
    }

    @Override
    public byte[] value4() {
        return getTokenBytes();
    }

    @Override
    public String value5() {
        return getAuthenticationKey();
    }

    @Override
    public byte[] value6() {
        return getAuthenticationBytes();
    }

    @Override
    public LocalDateTime value7() {
        return getExpiry();
    }

    @Override
    public String value8() {
        return getUserLogin();
    }

    @Override
    public String value9() {
        return getLocale();
    }

    @Override
    public String value10() {
        return getRefreshTokenValue();
    }

    @Override
    public SysAccessTokenRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SysAccessTokenRecord value2(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SysAccessTokenRecord value3(String value) {
        setTokenValue(value);
        return this;
    }

    @Override
    public SysAccessTokenRecord value4(byte[] value) {
        setTokenBytes(value);
        return this;
    }

    @Override
    public SysAccessTokenRecord value5(String value) {
        setAuthenticationKey(value);
        return this;
    }

    @Override
    public SysAccessTokenRecord value6(byte[] value) {
        setAuthenticationBytes(value);
        return this;
    }

    @Override
    public SysAccessTokenRecord value7(LocalDateTime value) {
        setExpiry(value);
        return this;
    }

    @Override
    public SysAccessTokenRecord value8(String value) {
        setUserLogin(value);
        return this;
    }

    @Override
    public SysAccessTokenRecord value9(String value) {
        setLocale(value);
        return this;
    }

    @Override
    public SysAccessTokenRecord value10(String value) {
        setRefreshTokenValue(value);
        return this;
    }

    @Override
    public SysAccessTokenRecord values(UUID value1, LocalDateTime value2, String value3, byte[] value4, String value5, byte[] value6, LocalDateTime value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysAccessTokenRecord
     */
    public SysAccessTokenRecord() {
        super(SysAccessToken.SYS_ACCESS_TOKEN);
    }

    /**
     * Create a detached, initialised SysAccessTokenRecord
     */
    public SysAccessTokenRecord(UUID id, LocalDateTime createTs, String tokenValue, byte[] tokenBytes, String authenticationKey, byte[] authenticationBytes, LocalDateTime expiry, String userLogin, String locale, String refreshTokenValue) {
        super(SysAccessToken.SYS_ACCESS_TOKEN);

        setId(id);
        setCreateTs(createTs);
        setTokenValue(tokenValue);
        setTokenBytes(tokenBytes);
        setAuthenticationKey(authenticationKey);
        setAuthenticationBytes(authenticationBytes);
        setExpiry(expiry);
        setUserLogin(userLogin);
        setLocale(locale);
        setRefreshTokenValue(refreshTokenValue);
    }

    /**
     * Create a detached, initialised SysAccessTokenRecord
     */
    public SysAccessTokenRecord(nu.studer.sample.tables.pojos.SysAccessToken value) {
        super(SysAccessToken.SYS_ACCESS_TOKEN);

        if (value != null) {
            setId(value.getId());
            setCreateTs(value.getCreateTs());
            setTokenValue(value.getTokenValue());
            setTokenBytes(value.getTokenBytes());
            setAuthenticationKey(value.getAuthenticationKey());
            setAuthenticationBytes(value.getAuthenticationBytes());
            setExpiry(value.getExpiry());
            setUserLogin(value.getUserLogin());
            setLocale(value.getLocale());
            setRefreshTokenValue(value.getRefreshTokenValue());
        }
    }
}