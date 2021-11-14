/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysAttrValue implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final Integer       version;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final LocalDateTime deleteTs;
    private final String        deletedBy;
    private final UUID          categoryAttrId;
    private final String        code;
    private final UUID          entityId;
    private final String        stringEntityId;
    private final Integer       intEntityId;
    private final Long          longEntityId;
    private final String        stringValue;
    private final Integer       integerValue;
    private final BigDecimal    doubleValue;
    private final BigDecimal    decimalValue;
    private final LocalDateTime dateValue;
    private final LocalDate     dateWoTimeValue;
    private final Boolean       booleanValue;
    private final UUID          entityValue;
    private final String        stringEntityValue;
    private final Integer       intEntityValue;
    private final Long          longEntityValue;
    private final UUID          parentId;

    public SysAttrValue(SysAttrValue value) {
        this.id = value.id;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.version = value.version;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.deleteTs = value.deleteTs;
        this.deletedBy = value.deletedBy;
        this.categoryAttrId = value.categoryAttrId;
        this.code = value.code;
        this.entityId = value.entityId;
        this.stringEntityId = value.stringEntityId;
        this.intEntityId = value.intEntityId;
        this.longEntityId = value.longEntityId;
        this.stringValue = value.stringValue;
        this.integerValue = value.integerValue;
        this.doubleValue = value.doubleValue;
        this.decimalValue = value.decimalValue;
        this.dateValue = value.dateValue;
        this.dateWoTimeValue = value.dateWoTimeValue;
        this.booleanValue = value.booleanValue;
        this.entityValue = value.entityValue;
        this.stringEntityValue = value.stringEntityValue;
        this.intEntityValue = value.intEntityValue;
        this.longEntityValue = value.longEntityValue;
        this.parentId = value.parentId;
    }

    public SysAttrValue(
        UUID          id,
        LocalDateTime createTs,
        String        createdBy,
        Integer       version,
        LocalDateTime updateTs,
        String        updatedBy,
        LocalDateTime deleteTs,
        String        deletedBy,
        UUID          categoryAttrId,
        String        code,
        UUID          entityId,
        String        stringEntityId,
        Integer       intEntityId,
        Long          longEntityId,
        String        stringValue,
        Integer       integerValue,
        BigDecimal    doubleValue,
        BigDecimal    decimalValue,
        LocalDateTime dateValue,
        LocalDate     dateWoTimeValue,
        Boolean       booleanValue,
        UUID          entityValue,
        String        stringEntityValue,
        Integer       intEntityValue,
        Long          longEntityValue,
        UUID          parentId
    ) {
        this.id = id;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.version = version;
        this.updateTs = updateTs;
        this.updatedBy = updatedBy;
        this.deleteTs = deleteTs;
        this.deletedBy = deletedBy;
        this.categoryAttrId = categoryAttrId;
        this.code = code;
        this.entityId = entityId;
        this.stringEntityId = stringEntityId;
        this.intEntityId = intEntityId;
        this.longEntityId = longEntityId;
        this.stringValue = stringValue;
        this.integerValue = integerValue;
        this.doubleValue = doubleValue;
        this.decimalValue = decimalValue;
        this.dateValue = dateValue;
        this.dateWoTimeValue = dateWoTimeValue;
        this.booleanValue = booleanValue;
        this.entityValue = entityValue;
        this.stringEntityValue = stringEntityValue;
        this.intEntityValue = intEntityValue;
        this.longEntityValue = longEntityValue;
        this.parentId = parentId;
    }

    /**
     * Getter for <code>public.sys_attr_value.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.sys_attr_value.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.sys_attr_value.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.sys_attr_value.version</code>.
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>public.sys_attr_value.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.sys_attr_value.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.sys_attr_value.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return this.deleteTs;
    }

    /**
     * Getter for <code>public.sys_attr_value.deleted_by</code>.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Getter for <code>public.sys_attr_value.category_attr_id</code>.
     */
    public UUID getCategoryAttrId() {
        return this.categoryAttrId;
    }

    /**
     * Getter for <code>public.sys_attr_value.code</code>.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Getter for <code>public.sys_attr_value.entity_id</code>.
     */
    public UUID getEntityId() {
        return this.entityId;
    }

    /**
     * Getter for <code>public.sys_attr_value.string_entity_id</code>.
     */
    public String getStringEntityId() {
        return this.stringEntityId;
    }

    /**
     * Getter for <code>public.sys_attr_value.int_entity_id</code>.
     */
    public Integer getIntEntityId() {
        return this.intEntityId;
    }

    /**
     * Getter for <code>public.sys_attr_value.long_entity_id</code>.
     */
    public Long getLongEntityId() {
        return this.longEntityId;
    }

    /**
     * Getter for <code>public.sys_attr_value.string_value</code>.
     */
    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * Getter for <code>public.sys_attr_value.integer_value</code>.
     */
    public Integer getIntegerValue() {
        return this.integerValue;
    }

    /**
     * Getter for <code>public.sys_attr_value.double_value</code>.
     */
    public BigDecimal getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * Getter for <code>public.sys_attr_value.decimal_value</code>.
     */
    public BigDecimal getDecimalValue() {
        return this.decimalValue;
    }

    /**
     * Getter for <code>public.sys_attr_value.date_value</code>.
     */
    public LocalDateTime getDateValue() {
        return this.dateValue;
    }

    /**
     * Getter for <code>public.sys_attr_value.date_wo_time_value</code>.
     */
    public LocalDate getDateWoTimeValue() {
        return this.dateWoTimeValue;
    }

    /**
     * Getter for <code>public.sys_attr_value.boolean_value</code>.
     */
    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * Getter for <code>public.sys_attr_value.entity_value</code>.
     */
    public UUID getEntityValue() {
        return this.entityValue;
    }

    /**
     * Getter for <code>public.sys_attr_value.string_entity_value</code>.
     */
    public String getStringEntityValue() {
        return this.stringEntityValue;
    }

    /**
     * Getter for <code>public.sys_attr_value.int_entity_value</code>.
     */
    public Integer getIntEntityValue() {
        return this.intEntityValue;
    }

    /**
     * Getter for <code>public.sys_attr_value.long_entity_value</code>.
     */
    public Long getLongEntityValue() {
        return this.longEntityValue;
    }

    /**
     * Getter for <code>public.sys_attr_value.parent_id</code>.
     */
    public UUID getParentId() {
        return this.parentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysAttrValue (");

        sb.append(id);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(version);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(deleteTs);
        sb.append(", ").append(deletedBy);
        sb.append(", ").append(categoryAttrId);
        sb.append(", ").append(code);
        sb.append(", ").append(entityId);
        sb.append(", ").append(stringEntityId);
        sb.append(", ").append(intEntityId);
        sb.append(", ").append(longEntityId);
        sb.append(", ").append(stringValue);
        sb.append(", ").append(integerValue);
        sb.append(", ").append(doubleValue);
        sb.append(", ").append(decimalValue);
        sb.append(", ").append(dateValue);
        sb.append(", ").append(dateWoTimeValue);
        sb.append(", ").append(booleanValue);
        sb.append(", ").append(entityValue);
        sb.append(", ").append(stringEntityValue);
        sb.append(", ").append(intEntityValue);
        sb.append(", ").append(longEntityValue);
        sb.append(", ").append(parentId);

        sb.append(")");
        return sb.toString();
    }
}
