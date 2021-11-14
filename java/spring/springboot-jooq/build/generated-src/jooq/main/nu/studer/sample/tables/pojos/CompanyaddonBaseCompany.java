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
public class CompanyaddonBaseCompany implements Serializable {

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
    private final String        code;
    private final String        name;
    private final String        fullName;
    private final String        taxNumber;
    private final String        taxCode;
    private final String        comment_;
    private final UUID          headPerson;

    public CompanyaddonBaseCompany(CompanyaddonBaseCompany value) {
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
        this.code = value.code;
        this.name = value.name;
        this.fullName = value.fullName;
        this.taxNumber = value.taxNumber;
        this.taxCode = value.taxCode;
        this.comment_ = value.comment_;
        this.headPerson = value.headPerson;
    }

    public CompanyaddonBaseCompany(
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
        String        code,
        String        name,
        String        fullName,
        String        taxNumber,
        String        taxCode,
        String        comment_,
        UUID          headPerson
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
        this.code = code;
        this.name = name;
        this.fullName = fullName;
        this.taxNumber = taxNumber;
        this.taxCode = taxCode;
        this.comment_ = comment_;
        this.headPerson = headPerson;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.received</code>.
     */
    public Boolean getReceived() {
        return this.received;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.kafka_key</code>.
     */
    public String getKafkaKey() {
        return this.kafkaKey;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.code</code>.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.full_name</code>.
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.tax_number</code>.
     */
    public String getTaxNumber() {
        return this.taxNumber;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.tax_code</code>.
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.comment_</code>.
     */
    public String getComment_() {
        return this.comment_;
    }

    /**
     * Getter for <code>public.companyaddon_base_company.head_person</code>.
     */
    public UUID getHeadPerson() {
        return this.headPerson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CompanyaddonBaseCompany (");

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
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(fullName);
        sb.append(", ").append(taxNumber);
        sb.append(", ").append(taxCode);
        sb.append(", ").append(comment_);
        sb.append(", ").append(headPerson);

        sb.append(")");
        return sb.toString();
    }
}