/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import nu.studer.sample.Keys;
import nu.studer.sample.Public;
import nu.studer.sample.tables.records.CompanyaddonBaseProjectBaseDirectionLinkRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class CompanyaddonBaseProjectBaseDirectionLink extends TableImpl<CompanyaddonBaseProjectBaseDirectionLinkRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>public.companyaddon_base_project_base_direction_link</code>
     */
    public static final CompanyaddonBaseProjectBaseDirectionLink COMPANYADDON_BASE_PROJECT_BASE_DIRECTION_LINK = new CompanyaddonBaseProjectBaseDirectionLink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompanyaddonBaseProjectBaseDirectionLinkRecord> getRecordType() {
        return CompanyaddonBaseProjectBaseDirectionLinkRecord.class;
    }

    /**
     * The column
     * <code>public.companyaddon_base_project_base_direction_link.base_direction_id</code>.
     */
    public final TableField<CompanyaddonBaseProjectBaseDirectionLinkRecord, UUID> BASE_DIRECTION_ID = createField(DSL.name("base_direction_id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column
     * <code>public.companyaddon_base_project_base_direction_link.base_project_id</code>.
     */
    public final TableField<CompanyaddonBaseProjectBaseDirectionLinkRecord, UUID> BASE_PROJECT_ID = createField(DSL.name("base_project_id"), SQLDataType.UUID.nullable(false), this, "");

    private CompanyaddonBaseProjectBaseDirectionLink(Name alias, Table<CompanyaddonBaseProjectBaseDirectionLinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompanyaddonBaseProjectBaseDirectionLink(Name alias, Table<CompanyaddonBaseProjectBaseDirectionLinkRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>public.companyaddon_base_project_base_direction_link</code> table
     * reference
     */
    public CompanyaddonBaseProjectBaseDirectionLink(String alias) {
        this(DSL.name(alias), COMPANYADDON_BASE_PROJECT_BASE_DIRECTION_LINK);
    }

    /**
     * Create an aliased
     * <code>public.companyaddon_base_project_base_direction_link</code> table
     * reference
     */
    public CompanyaddonBaseProjectBaseDirectionLink(Name alias) {
        this(alias, COMPANYADDON_BASE_PROJECT_BASE_DIRECTION_LINK);
    }

    /**
     * Create a
     * <code>public.companyaddon_base_project_base_direction_link</code> table
     * reference
     */
    public CompanyaddonBaseProjectBaseDirectionLink() {
        this(DSL.name("companyaddon_base_project_base_direction_link"), null);
    }

    public <O extends Record> CompanyaddonBaseProjectBaseDirectionLink(Table<O> child, ForeignKey<O, CompanyaddonBaseProjectBaseDirectionLinkRecord> key) {
        super(child, key, COMPANYADDON_BASE_PROJECT_BASE_DIRECTION_LINK);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<CompanyaddonBaseProjectBaseDirectionLinkRecord> getPrimaryKey() {
        return Keys.COMPANYADDON_BASE_PROJECT_BASE_DIRECTION_LINK_PKEY;
    }

    @Override
    public List<ForeignKey<CompanyaddonBaseProjectBaseDirectionLinkRecord, ?>> getReferences() {
        return Arrays.asList(Keys.COMPANYADDON_BASE_PROJECT_BASE_DIRECTION_LINK__FK_BASPROBASDIR_ON_BASE_DIRECTION, Keys.COMPANYADDON_BASE_PROJECT_BASE_DIRECTION_LINK__FK_BASPROBASDIR_ON_BASE_PROJECT);
    }

    private transient CompanyaddonBaseDirection _companyaddonBaseDirection;
    private transient CompanyaddonBaseProject _companyaddonBaseProject;

    public CompanyaddonBaseDirection companyaddonBaseDirection() {
        if (_companyaddonBaseDirection == null)
            _companyaddonBaseDirection = new CompanyaddonBaseDirection(this, Keys.COMPANYADDON_BASE_PROJECT_BASE_DIRECTION_LINK__FK_BASPROBASDIR_ON_BASE_DIRECTION);

        return _companyaddonBaseDirection;
    }

    public CompanyaddonBaseProject companyaddonBaseProject() {
        if (_companyaddonBaseProject == null)
            _companyaddonBaseProject = new CompanyaddonBaseProject(this, Keys.COMPANYADDON_BASE_PROJECT_BASE_DIRECTION_LINK__FK_BASPROBASDIR_ON_BASE_PROJECT);

        return _companyaddonBaseProject;
    }

    @Override
    public CompanyaddonBaseProjectBaseDirectionLink as(String alias) {
        return new CompanyaddonBaseProjectBaseDirectionLink(DSL.name(alias), this);
    }

    @Override
    public CompanyaddonBaseProjectBaseDirectionLink as(Name alias) {
        return new CompanyaddonBaseProjectBaseDirectionLink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanyaddonBaseProjectBaseDirectionLink rename(String name) {
        return new CompanyaddonBaseProjectBaseDirectionLink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CompanyaddonBaseProjectBaseDirectionLink rename(Name name) {
        return new CompanyaddonBaseProjectBaseDirectionLink(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, UUID> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}