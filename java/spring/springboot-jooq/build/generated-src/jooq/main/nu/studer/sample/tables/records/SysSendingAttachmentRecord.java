/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SysSendingAttachment;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysSendingAttachmentRecord extends UpdatableRecordImpl<SysSendingAttachmentRecord> implements Record16<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, UUID, byte[], UUID, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sys_sending_attachment.id</code>.
     */
    public SysSendingAttachmentRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.create_ts</code>.
     */
    public SysSendingAttachmentRecord setCreateTs(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.created_by</code>.
     */
    public SysSendingAttachmentRecord setCreatedBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.version</code>.
     */
    public SysSendingAttachmentRecord setVersion(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.update_ts</code>.
     */
    public SysSendingAttachmentRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.updated_by</code>.
     */
    public SysSendingAttachmentRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.delete_ts</code>.
     */
    public SysSendingAttachmentRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.deleted_by</code>.
     */
    public SysSendingAttachmentRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.sys_tenant_id</code>.
     */
    public SysSendingAttachmentRecord setSysTenantId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.sys_tenant_id</code>.
     */
    public String getSysTenantId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.message_id</code>.
     */
    public SysSendingAttachmentRecord setMessageId(UUID value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.message_id</code>.
     */
    public UUID getMessageId() {
        return (UUID) get(9);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.content</code>.
     */
    public SysSendingAttachmentRecord setContent(byte[] value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.content</code>.
     */
    public byte[] getContent() {
        return (byte[]) get(10);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.content_file_id</code>.
     */
    public SysSendingAttachmentRecord setContentFileId(UUID value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.content_file_id</code>.
     */
    public UUID getContentFileId() {
        return (UUID) get(11);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.content_id</code>.
     */
    public SysSendingAttachmentRecord setContentId(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.content_id</code>.
     */
    public String getContentId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.name</code>.
     */
    public SysSendingAttachmentRecord setName(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.name</code>.
     */
    public String getName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.disposition</code>.
     */
    public SysSendingAttachmentRecord setDisposition(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.disposition</code>.
     */
    public String getDisposition() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.sys_sending_attachment.text_encoding</code>.
     */
    public SysSendingAttachmentRecord setTextEncoding(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_sending_attachment.text_encoding</code>.
     */
    public String getTextEncoding() {
        return (String) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, UUID, byte[], UUID, String, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, UUID, byte[], UUID, String, String, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.CREATE_TS;
    }

    @Override
    public Field<String> field3() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.CREATED_BY;
    }

    @Override
    public Field<Integer> field4() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.VERSION;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.UPDATE_TS;
    }

    @Override
    public Field<String> field6() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.UPDATED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.DELETE_TS;
    }

    @Override
    public Field<String> field8() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.DELETED_BY;
    }

    @Override
    public Field<String> field9() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.SYS_TENANT_ID;
    }

    @Override
    public Field<UUID> field10() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.MESSAGE_ID;
    }

    @Override
    public Field<byte[]> field11() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.CONTENT;
    }

    @Override
    public Field<UUID> field12() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.CONTENT_FILE_ID;
    }

    @Override
    public Field<String> field13() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.CONTENT_ID;
    }

    @Override
    public Field<String> field14() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.NAME;
    }

    @Override
    public Field<String> field15() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.DISPOSITION;
    }

    @Override
    public Field<String> field16() {
        return SysSendingAttachment.SYS_SENDING_ATTACHMENT.TEXT_ENCODING;
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
        return getCreatedBy();
    }

    @Override
    public Integer component4() {
        return getVersion();
    }

    @Override
    public LocalDateTime component5() {
        return getUpdateTs();
    }

    @Override
    public String component6() {
        return getUpdatedBy();
    }

    @Override
    public LocalDateTime component7() {
        return getDeleteTs();
    }

    @Override
    public String component8() {
        return getDeletedBy();
    }

    @Override
    public String component9() {
        return getSysTenantId();
    }

    @Override
    public UUID component10() {
        return getMessageId();
    }

    @Override
    public byte[] component11() {
        return getContent();
    }

    @Override
    public UUID component12() {
        return getContentFileId();
    }

    @Override
    public String component13() {
        return getContentId();
    }

    @Override
    public String component14() {
        return getName();
    }

    @Override
    public String component15() {
        return getDisposition();
    }

    @Override
    public String component16() {
        return getTextEncoding();
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
        return getCreatedBy();
    }

    @Override
    public Integer value4() {
        return getVersion();
    }

    @Override
    public LocalDateTime value5() {
        return getUpdateTs();
    }

    @Override
    public String value6() {
        return getUpdatedBy();
    }

    @Override
    public LocalDateTime value7() {
        return getDeleteTs();
    }

    @Override
    public String value8() {
        return getDeletedBy();
    }

    @Override
    public String value9() {
        return getSysTenantId();
    }

    @Override
    public UUID value10() {
        return getMessageId();
    }

    @Override
    public byte[] value11() {
        return getContent();
    }

    @Override
    public UUID value12() {
        return getContentFileId();
    }

    @Override
    public String value13() {
        return getContentId();
    }

    @Override
    public String value14() {
        return getName();
    }

    @Override
    public String value15() {
        return getDisposition();
    }

    @Override
    public String value16() {
        return getTextEncoding();
    }

    @Override
    public SysSendingAttachmentRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value2(LocalDateTime value) {
        setCreateTs(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value4(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value5(LocalDateTime value) {
        setUpdateTs(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value6(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value7(LocalDateTime value) {
        setDeleteTs(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value8(String value) {
        setDeletedBy(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value9(String value) {
        setSysTenantId(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value10(UUID value) {
        setMessageId(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value11(byte[] value) {
        setContent(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value12(UUID value) {
        setContentFileId(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value13(String value) {
        setContentId(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value14(String value) {
        setName(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value15(String value) {
        setDisposition(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord value16(String value) {
        setTextEncoding(value);
        return this;
    }

    @Override
    public SysSendingAttachmentRecord values(UUID value1, LocalDateTime value2, String value3, Integer value4, LocalDateTime value5, String value6, LocalDateTime value7, String value8, String value9, UUID value10, byte[] value11, UUID value12, String value13, String value14, String value15, String value16) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysSendingAttachmentRecord
     */
    public SysSendingAttachmentRecord() {
        super(SysSendingAttachment.SYS_SENDING_ATTACHMENT);
    }

    /**
     * Create a detached, initialised SysSendingAttachmentRecord
     */
    public SysSendingAttachmentRecord(UUID id, LocalDateTime createTs, String createdBy, Integer version, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String sysTenantId, UUID messageId, byte[] content, UUID contentFileId, String contentId, String name, String disposition, String textEncoding) {
        super(SysSendingAttachment.SYS_SENDING_ATTACHMENT);

        setId(id);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setVersion(version);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setSysTenantId(sysTenantId);
        setMessageId(messageId);
        setContent(content);
        setContentFileId(contentFileId);
        setContentId(contentId);
        setName(name);
        setDisposition(disposition);
        setTextEncoding(textEncoding);
    }

    /**
     * Create a detached, initialised SysSendingAttachmentRecord
     */
    public SysSendingAttachmentRecord(nu.studer.sample.tables.pojos.SysSendingAttachment value) {
        super(SysSendingAttachment.SYS_SENDING_ATTACHMENT);

        if (value != null) {
            setId(value.getId());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setVersion(value.getVersion());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setSysTenantId(value.getSysTenantId());
            setMessageId(value.getMessageId());
            setContent(value.getContent());
            setContentFileId(value.getContentFileId());
            setContentId(value.getContentId());
            setName(value.getName());
            setDisposition(value.getDisposition());
            setTextEncoding(value.getTextEncoding());
        }
    }
}
