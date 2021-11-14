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
public class BnaNsiChangeLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final Integer       version;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final LocalDateTime deleteTs;
    private final String        deletedBy;
    private final Boolean       received;
    private final String        kafkaKey;
    private final String        topicName;
    private final String        key_;
    private final String        message;
    private final String        direction;
    private final String        messageType;
    private final Boolean       processed;
    private final Boolean       manualCheck;
    private final String        senderName;
    private final String        recipientName;

    public BnaNsiChangeLog(BnaNsiChangeLog value) {
        this.id = value.id;
        this.version = value.version;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.received = value.received;
        this.kafkaKey = value.kafkaKey;
        this.topicName = value.topicName;
        this.key_ = value.key_;
        this.message = value.message;
        this.direction = value.direction;
        this.messageType = value.messageType;
        this.processed = value.processed;
        this.manualCheck = value.manualCheck;
        this.senderName = value.senderName;
        this.recipientName = value.recipientName;
    }

    public BnaNsiChangeLog(
        UUID          id,
        Integer       version,
        LocalDateTime createTs,
        String        createdBy,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        Boolean       received,
        String        kafkaKey,
        String        topicName,
        String        key_,
        String        message,
        String        direction,
        String        messageType,
        Boolean       processed,
        Boolean       manualCheck,
        String        senderName,
        String        recipientName
    ) {
        this.id = id;
        this.version = version;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.updateTs = updateTs;
        this.updatedBy = updatedBy;
        this.deleteTs = deleteTs;
        this.deletedBy = deletedBy;
        this.received = received;
        this.kafkaKey = kafkaKey;
        this.topicName = topicName;
        this.key_ = key_;
        this.message = message;
        this.direction = direction;
        this.messageType = messageType;
        this.processed = processed;
        this.manualCheck = manualCheck;
        this.senderName = senderName;
        this.recipientName = recipientName;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.received</code>.
     */
    public Boolean getReceived() {
        return this.received;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.kafka_key</code>.
     */
    public String getKafkaKey() {
        return this.kafkaKey;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.topic_name</code>.
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.key_</code>.
     */
    public String getKey_() {
        return this.key_;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.message</code>.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.direction</code>.
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.message_type</code>.
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.processed</code>.
     */
    public Boolean getProcessed() {
        return this.processed;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.manual_check</code>.
     */
    public Boolean getManualCheck() {
        return this.manualCheck;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.sender_name</code>.
     */
    public String getSenderName() {
        return this.senderName;
    }

    /**
     * Getter for <code>public.bna_nsi_change_log.recipient_name</code>.
     */
    public String getRecipientName() {
        return this.recipientName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BnaNsiChangeLog (");

        sb.append(id);
        sb.append(", ").append(version);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(received);
        sb.append(", ").append(kafkaKey);
        sb.append(", ").append(topicName);
        sb.append(", ").append(key_);
        sb.append(", ").append(message);
        sb.append(", ").append(direction);
        sb.append(", ").append(messageType);
        sb.append(", ").append(processed);
        sb.append(", ").append(manualCheck);
        sb.append(", ").append(senderName);
        sb.append(", ").append(recipientName);

        sb.append(")");
        return sb.toString();
    }
}