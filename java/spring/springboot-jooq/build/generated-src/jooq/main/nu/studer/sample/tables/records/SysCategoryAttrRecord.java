/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import nu.studer.sample.tables.SysCategoryAttr;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysCategoryAttrRecord extends UpdatableRecordImpl<SysCategoryAttrRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.sys_category_attr.id</code>.
     */
    public SysCategoryAttrRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.sys_category_attr.create_ts</code>.
     */
    public SysCategoryAttrRecord setCreateTs(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>public.sys_category_attr.created_by</code>.
     */
    public SysCategoryAttrRecord setCreatedBy(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.sys_category_attr.version</code>.
     */
    public SysCategoryAttrRecord setVersion(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.sys_category_attr.update_ts</code>.
     */
    public SysCategoryAttrRecord setUpdateTs(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>public.sys_category_attr.updated_by</code>.
     */
    public SysCategoryAttrRecord setUpdatedBy(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.sys_category_attr.delete_ts</code>.
     */
    public SysCategoryAttrRecord setDeleteTs(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.delete_ts</code>.
     */
    public LocalDateTime getDeleteTs() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.sys_category_attr.deleted_by</code>.
     */
    public SysCategoryAttrRecord setDeletedBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.deleted_by</code>.
     */
    public String getDeletedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.sys_category_attr.category_entity_type</code>.
     */
    public SysCategoryAttrRecord setCategoryEntityType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.category_entity_type</code>.
     */
    public String getCategoryEntityType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.sys_category_attr.name</code>.
     */
    public SysCategoryAttrRecord setName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.name</code>.
     */
    public String getName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.sys_category_attr.code</code>.
     */
    public SysCategoryAttrRecord setCode(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.code</code>.
     */
    public String getCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.sys_category_attr.description</code>.
     */
    public SysCategoryAttrRecord setDescription(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.description</code>.
     */
    public String getDescription() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.sys_category_attr.category_id</code>.
     */
    public SysCategoryAttrRecord setCategoryId(UUID value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.category_id</code>.
     */
    public UUID getCategoryId() {
        return (UUID) get(12);
    }

    /**
     * Setter for <code>public.sys_category_attr.entity_class</code>.
     */
    public SysCategoryAttrRecord setEntityClass(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.entity_class</code>.
     */
    public String getEntityClass() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.sys_category_attr.data_type</code>.
     */
    public SysCategoryAttrRecord setDataType(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.data_type</code>.
     */
    public String getDataType() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.sys_category_attr.default_string</code>.
     */
    public SysCategoryAttrRecord setDefaultString(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.default_string</code>.
     */
    public String getDefaultString() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.sys_category_attr.default_int</code>.
     */
    public SysCategoryAttrRecord setDefaultInt(Integer value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.default_int</code>.
     */
    public Integer getDefaultInt() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>public.sys_category_attr.default_double</code>.
     */
    public SysCategoryAttrRecord setDefaultDouble(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.default_double</code>.
     */
    public BigDecimal getDefaultDouble() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>public.sys_category_attr.default_decimal</code>.
     */
    public SysCategoryAttrRecord setDefaultDecimal(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.default_decimal</code>.
     */
    public BigDecimal getDefaultDecimal() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>public.sys_category_attr.default_date</code>.
     */
    public SysCategoryAttrRecord setDefaultDate(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.default_date</code>.
     */
    public LocalDateTime getDefaultDate() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>public.sys_category_attr.default_date_wo_time</code>.
     */
    public SysCategoryAttrRecord setDefaultDateWoTime(LocalDate value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.default_date_wo_time</code>.
     */
    public LocalDate getDefaultDateWoTime() {
        return (LocalDate) get(20);
    }

    /**
     * Setter for <code>public.sys_category_attr.default_date_is_current</code>.
     */
    public SysCategoryAttrRecord setDefaultDateIsCurrent(Boolean value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.default_date_is_current</code>.
     */
    public Boolean getDefaultDateIsCurrent() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>public.sys_category_attr.default_boolean</code>.
     */
    public SysCategoryAttrRecord setDefaultBoolean(Boolean value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.default_boolean</code>.
     */
    public Boolean getDefaultBoolean() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>public.sys_category_attr.default_entity_value</code>.
     */
    public SysCategoryAttrRecord setDefaultEntityValue(UUID value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.default_entity_value</code>.
     */
    public UUID getDefaultEntityValue() {
        return (UUID) get(23);
    }

    /**
     * Setter for
     * <code>public.sys_category_attr.default_str_entity_value</code>.
     */
    public SysCategoryAttrRecord setDefaultStrEntityValue(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.sys_category_attr.default_str_entity_value</code>.
     */
    public String getDefaultStrEntityValue() {
        return (String) get(24);
    }

    /**
     * Setter for
     * <code>public.sys_category_attr.default_int_entity_value</code>.
     */
    public SysCategoryAttrRecord setDefaultIntEntityValue(Integer value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.sys_category_attr.default_int_entity_value</code>.
     */
    public Integer getDefaultIntEntityValue() {
        return (Integer) get(25);
    }

    /**
     * Setter for
     * <code>public.sys_category_attr.default_long_entity_value</code>.
     */
    public SysCategoryAttrRecord setDefaultLongEntityValue(Long value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.sys_category_attr.default_long_entity_value</code>.
     */
    public Long getDefaultLongEntityValue() {
        return (Long) get(26);
    }

    /**
     * Setter for <code>public.sys_category_attr.enumeration</code>.
     */
    public SysCategoryAttrRecord setEnumeration(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.enumeration</code>.
     */
    public String getEnumeration() {
        return (String) get(27);
    }

    /**
     * Setter for <code>public.sys_category_attr.order_no</code>.
     */
    public SysCategoryAttrRecord setOrderNo(Integer value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.order_no</code>.
     */
    public Integer getOrderNo() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>public.sys_category_attr.screen</code>.
     */
    public SysCategoryAttrRecord setScreen(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.screen</code>.
     */
    public String getScreen() {
        return (String) get(29);
    }

    /**
     * Setter for <code>public.sys_category_attr.required</code>.
     */
    public SysCategoryAttrRecord setRequired(Boolean value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.required</code>.
     */
    public Boolean getRequired() {
        return (Boolean) get(30);
    }

    /**
     * Setter for <code>public.sys_category_attr.lookup</code>.
     */
    public SysCategoryAttrRecord setLookup(Boolean value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.lookup</code>.
     */
    public Boolean getLookup() {
        return (Boolean) get(31);
    }

    /**
     * Setter for <code>public.sys_category_attr.target_screens</code>.
     */
    public SysCategoryAttrRecord setTargetScreens(String value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.target_screens</code>.
     */
    public String getTargetScreens() {
        return (String) get(32);
    }

    /**
     * Setter for <code>public.sys_category_attr.width</code>.
     */
    public SysCategoryAttrRecord setWidth(String value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.width</code>.
     */
    public String getWidth() {
        return (String) get(33);
    }

    /**
     * Setter for <code>public.sys_category_attr.rows_count</code>.
     */
    public SysCategoryAttrRecord setRowsCount(Integer value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.rows_count</code>.
     */
    public Integer getRowsCount() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>public.sys_category_attr.is_collection</code>.
     */
    public SysCategoryAttrRecord setIsCollection(Boolean value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.is_collection</code>.
     */
    public Boolean getIsCollection() {
        return (Boolean) get(35);
    }

    /**
     * Setter for <code>public.sys_category_attr.join_clause</code>.
     */
    public SysCategoryAttrRecord setJoinClause(String value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.join_clause</code>.
     */
    public String getJoinClause() {
        return (String) get(36);
    }

    /**
     * Setter for <code>public.sys_category_attr.where_clause</code>.
     */
    public SysCategoryAttrRecord setWhereClause(String value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.where_clause</code>.
     */
    public String getWhereClause() {
        return (String) get(37);
    }

    /**
     * Setter for <code>public.sys_category_attr.filter_xml</code>.
     */
    public SysCategoryAttrRecord setFilterXml(String value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.filter_xml</code>.
     */
    public String getFilterXml() {
        return (String) get(38);
    }

    /**
     * Setter for <code>public.sys_category_attr.locale_names</code>.
     */
    public SysCategoryAttrRecord setLocaleNames(String value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.locale_names</code>.
     */
    public String getLocaleNames() {
        return (String) get(39);
    }

    /**
     * Setter for <code>public.sys_category_attr.locale_descriptions</code>.
     */
    public SysCategoryAttrRecord setLocaleDescriptions(String value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.locale_descriptions</code>.
     */
    public String getLocaleDescriptions() {
        return (String) get(40);
    }

    /**
     * Setter for <code>public.sys_category_attr.enumeration_locales</code>.
     */
    public SysCategoryAttrRecord setEnumerationLocales(String value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>public.sys_category_attr.enumeration_locales</code>.
     */
    public String getEnumerationLocales() {
        return (String) get(41);
    }

    /**
     * Setter for
     * <code>public.sys_category_attr.attribute_configuration_json</code>.
     */
    public SysCategoryAttrRecord setAttributeConfigurationJson(String value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.sys_category_attr.attribute_configuration_json</code>.
     */
    public String getAttributeConfigurationJson() {
        return (String) get(42);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysCategoryAttrRecord
     */
    public SysCategoryAttrRecord() {
        super(SysCategoryAttr.SYS_CATEGORY_ATTR);
    }

    /**
     * Create a detached, initialised SysCategoryAttrRecord
     */
    public SysCategoryAttrRecord(UUID id, LocalDateTime createTs, String createdBy, Integer version, LocalDateTime updateTs, String updatedBy, LocalDateTime deleteTs, String deletedBy, String categoryEntityType, String name, String code, String description, UUID categoryId, String entityClass, String dataType, String defaultString, Integer defaultInt, BigDecimal defaultDouble, BigDecimal defaultDecimal, LocalDateTime defaultDate, LocalDate defaultDateWoTime, Boolean defaultDateIsCurrent, Boolean defaultBoolean, UUID defaultEntityValue, String defaultStrEntityValue, Integer defaultIntEntityValue, Long defaultLongEntityValue, String enumeration, Integer orderNo, String screen, Boolean required, Boolean lookup, String targetScreens, String width, Integer rowsCount, Boolean isCollection, String joinClause, String whereClause, String filterXml, String localeNames, String localeDescriptions, String enumerationLocales, String attributeConfigurationJson) {
        super(SysCategoryAttr.SYS_CATEGORY_ATTR);

        setId(id);
        setCreateTs(createTs);
        setCreatedBy(createdBy);
        setVersion(version);
        setUpdateTs(updateTs);
        setUpdatedBy(updatedBy);
        setDeleteTs(deleteTs);
        setDeletedBy(deletedBy);
        setCategoryEntityType(categoryEntityType);
        setName(name);
        setCode(code);
        setDescription(description);
        setCategoryId(categoryId);
        setEntityClass(entityClass);
        setDataType(dataType);
        setDefaultString(defaultString);
        setDefaultInt(defaultInt);
        setDefaultDouble(defaultDouble);
        setDefaultDecimal(defaultDecimal);
        setDefaultDate(defaultDate);
        setDefaultDateWoTime(defaultDateWoTime);
        setDefaultDateIsCurrent(defaultDateIsCurrent);
        setDefaultBoolean(defaultBoolean);
        setDefaultEntityValue(defaultEntityValue);
        setDefaultStrEntityValue(defaultStrEntityValue);
        setDefaultIntEntityValue(defaultIntEntityValue);
        setDefaultLongEntityValue(defaultLongEntityValue);
        setEnumeration(enumeration);
        setOrderNo(orderNo);
        setScreen(screen);
        setRequired(required);
        setLookup(lookup);
        setTargetScreens(targetScreens);
        setWidth(width);
        setRowsCount(rowsCount);
        setIsCollection(isCollection);
        setJoinClause(joinClause);
        setWhereClause(whereClause);
        setFilterXml(filterXml);
        setLocaleNames(localeNames);
        setLocaleDescriptions(localeDescriptions);
        setEnumerationLocales(enumerationLocales);
        setAttributeConfigurationJson(attributeConfigurationJson);
    }

    /**
     * Create a detached, initialised SysCategoryAttrRecord
     */
    public SysCategoryAttrRecord(nu.studer.sample.tables.pojos.SysCategoryAttr value) {
        super(SysCategoryAttr.SYS_CATEGORY_ATTR);

        if (value != null) {
            setId(value.getId());
            setCreateTs(value.getCreateTs());
            setCreatedBy(value.getCreatedBy());
            setVersion(value.getVersion());
            setUpdateTs(value.getUpdateTs());
            setUpdatedBy(value.getUpdatedBy());
            setDeleteTs(value.getDeleteTs());
            setDeletedBy(value.getDeletedBy());
            setCategoryEntityType(value.getCategoryEntityType());
            setName(value.getName());
            setCode(value.getCode());
            setDescription(value.getDescription());
            setCategoryId(value.getCategoryId());
            setEntityClass(value.getEntityClass());
            setDataType(value.getDataType());
            setDefaultString(value.getDefaultString());
            setDefaultInt(value.getDefaultInt());
            setDefaultDouble(value.getDefaultDouble());
            setDefaultDecimal(value.getDefaultDecimal());
            setDefaultDate(value.getDefaultDate());
            setDefaultDateWoTime(value.getDefaultDateWoTime());
            setDefaultDateIsCurrent(value.getDefaultDateIsCurrent());
            setDefaultBoolean(value.getDefaultBoolean());
            setDefaultEntityValue(value.getDefaultEntityValue());
            setDefaultStrEntityValue(value.getDefaultStrEntityValue());
            setDefaultIntEntityValue(value.getDefaultIntEntityValue());
            setDefaultLongEntityValue(value.getDefaultLongEntityValue());
            setEnumeration(value.getEnumeration());
            setOrderNo(value.getOrderNo());
            setScreen(value.getScreen());
            setRequired(value.getRequired());
            setLookup(value.getLookup());
            setTargetScreens(value.getTargetScreens());
            setWidth(value.getWidth());
            setRowsCount(value.getRowsCount());
            setIsCollection(value.getIsCollection());
            setJoinClause(value.getJoinClause());
            setWhereClause(value.getWhereClause());
            setFilterXml(value.getFilterXml());
            setLocaleNames(value.getLocaleNames());
            setLocaleDescriptions(value.getLocaleDescriptions());
            setEnumerationLocales(value.getEnumerationLocales());
            setAttributeConfigurationJson(value.getAttributeConfigurationJson());
        }
    }
}