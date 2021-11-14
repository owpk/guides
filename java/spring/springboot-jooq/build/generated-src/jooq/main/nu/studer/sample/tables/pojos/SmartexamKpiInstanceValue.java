/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamKpiInstanceValue implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final Integer       version;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final LocalDateTime deleteTs;
    private final String        deletedBy;
    private final UUID          kpiInstanceId;
    private final String        name;
    private final Double        value_;
    private final LocalDate     date_;
    private final Integer       type_;

    public SmartexamKpiInstanceValue(SmartexamKpiInstanceValue value) {
        this.id = value.id;
        this.version = value.version;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.kpiInstanceId = value.kpiInstanceId;
        this.name = value.name;
        this.value_ = value.value_;
        this.date_ = value.date_;
        this.type_ = value.type_;
    }

    public SmartexamKpiInstanceValue(
        UUID          id,
        Integer       version,
        LocalDateTime createTs,
        String        createdBy,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        UUID          kpiInstanceId,
        String        name,
        Double        value_,
        LocalDate     date_,
        Integer       type_
    ) {
        this.id = id;
        this.version = version;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.updateTs = updateTs;
        this.updatedBy = updatedBy;
        this.deleteTs = deleteTs;
        this.deletedBy = deletedBy;
        this.kpiInstanceId = kpiInstanceId;
        this.name = name;
        this.value_ = value_;
        this.date_ = date_;
        this.type_ = type_;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for
     * <code>public.smartexam_kpi_instance_value.kpi_instance_id</code>.
     */
    public UUID getKpiInstanceId() {
        return this.kpiInstanceId;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.value_</code>.
     */
    public Double getValue_() {
        return this.value_;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.date_</code>.
     */
    public LocalDate getDate_() {
        return this.date_;
    }

    /**
     * Getter for <code>public.smartexam_kpi_instance_value.type_</code>.
     */
    public Integer getType_() {
        return this.type_;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartexamKpiInstanceValue (");

        sb.append(id);
        sb.append(", ").append(version);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(kpiInstanceId);
        sb.append(", ").append(name);
        sb.append(", ").append(value_);
        sb.append(", ").append(date_);
        sb.append(", ").append(type_);

        sb.append(")");
        return sb.toString();
    }
}