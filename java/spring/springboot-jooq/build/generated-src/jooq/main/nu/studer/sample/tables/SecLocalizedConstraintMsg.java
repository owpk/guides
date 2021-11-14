/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import nu.studer.sample.Indexes;
import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.SecLocalizedConstraintMsgRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SecLocalizedConstraintMsg extends TableImpl<SecLocalizedConstraintMsgRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.sec_localized_constraint_msg</code>
     */
    public static final SecLocalizedConstraintMsg SEC_LOCALIZED_CONSTRAINT_MSG = new SecLocalizedConstraintMsg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SecLocalizedConstraintMsgRecord> getRecordType() {
        return SecLocalizedConstraintMsgRecord.class;
    }

    /**
     * The column <code>public.sec_localized_constraint_msg.id</code>.
     */
    public final TableField<SecLocalizedConstraintMsgRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.sec_localized_constraint_msg.create_ts</code>.
     */
    public final TableField<SecLocalizedConstraintMsgRecord, LocalDateTime> CREATE_TS = createField(DSL.name("create_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sec_localized_constraint_msg.created_by</code>.
     */
    public final TableField<SecLocalizedConstraintMsgRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sec_localized_constraint_msg.version</code>.
     */
    public final TableField<SecLocalizedConstraintMsgRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("1", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.sec_localized_constraint_msg.update_ts</code>.
     */
    public final TableField<SecLocalizedConstraintMsgRecord, LocalDateTime> UPDATE_TS = createField(DSL.name("update_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sec_localized_constraint_msg.updated_by</code>.
     */
    public final TableField<SecLocalizedConstraintMsgRecord, String> UPDATED_BY = createField(DSL.name("updated_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sec_localized_constraint_msg.delete_ts</code>.
     */
    public final TableField<SecLocalizedConstraintMsgRecord, LocalDateTime> DELETE_TS = createField(DSL.name("delete_ts"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.sec_localized_constraint_msg.deleted_by</code>.
     */
    public final TableField<SecLocalizedConstraintMsgRecord, String> DELETED_BY = createField(DSL.name("deleted_by"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.sec_localized_constraint_msg.entity_name</code>.
     */
    public final TableField<SecLocalizedConstraintMsgRecord, String> ENTITY_NAME = createField(DSL.name("entity_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column
     * <code>public.sec_localized_constraint_msg.operation_type</code>.
     */
    public final TableField<SecLocalizedConstraintMsgRecord, String> OPERATION_TYPE = createField(DSL.name("operation_type"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.sec_localized_constraint_msg.values_</code>.
     */
    public final TableField<SecLocalizedConstraintMsgRecord, String> VALUES_ = createField(DSL.name("values_"), SQLDataType.CLOB, this, "");

    private SecLocalizedConstraintMsg(Name alias, Table<SecLocalizedConstraintMsgRecord> aliased) {
        this(alias, aliased, null);
    }

    private SecLocalizedConstraintMsg(Name alias, Table<SecLocalizedConstraintMsgRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.sec_localized_constraint_msg</code> table
     * reference
     */
    public SecLocalizedConstraintMsg(String alias) {
        this(DSL.name(alias), SEC_LOCALIZED_CONSTRAINT_MSG);
    }

    /**
     * Create an aliased <code>public.sec_localized_constraint_msg</code> table
     * reference
     */
    public SecLocalizedConstraintMsg(Name alias) {
        this(alias, SEC_LOCALIZED_CONSTRAINT_MSG);
    }

    /**
     * Create a <code>public.sec_localized_constraint_msg</code> table reference
     */
    public SecLocalizedConstraintMsg() {
        this(DSL.name("sec_localized_constraint_msg"), null);
    }

    public <O extends Record> SecLocalizedConstraintMsg(Table<O> child, ForeignKey<O, SecLocalizedConstraintMsgRecord> key) {
        super(child, key, SEC_LOCALIZED_CONSTRAINT_MSG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_SEC_LOC_CNSTRNT_MSG_UNIQUE);
    }

    @Override
    public UniqueKey<SecLocalizedConstraintMsgRecord> getPrimaryKey() {
        return Keys.SEC_LOCALIZED_CONSTRAINT_MSG_PKEY;
    }

    @Override
    public SecLocalizedConstraintMsg as(String alias) {
        return new SecLocalizedConstraintMsg(DSL.name(alias), this);
    }

    @Override
    public SecLocalizedConstraintMsg as(Name alias) {
        return new SecLocalizedConstraintMsg(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SecLocalizedConstraintMsg rename(String name) {
        return new SecLocalizedConstraintMsg(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SecLocalizedConstraintMsg rename(Name name) {
        return new SecLocalizedConstraintMsg(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<UUID, LocalDateTime, String, Integer, LocalDateTime, String, LocalDateTime, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}