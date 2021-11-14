/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.records;


import java.util.UUID;

import nu.studer.sample.tables.SmartexamCheckListItemCheckListLink;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamCheckListItemCheckListLinkRecord extends UpdatableRecordImpl<SmartexamCheckListItemCheckListLinkRecord> implements Record2<UUID, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>public.smartexam_check_list_item_check_list_link.check_list_item_id</code>.
     */
    public SmartexamCheckListItemCheckListLinkRecord setCheckListItemId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_item_check_list_link.check_list_item_id</code>.
     */
    public UUID getCheckListItemId() {
        return (UUID) get(0);
    }

    /**
     * Setter for
     * <code>public.smartexam_check_list_item_check_list_link.check_list_id</code>.
     */
    public SmartexamCheckListItemCheckListLinkRecord setCheckListId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_item_check_list_link.check_list_id</code>.
     */
    public UUID getCheckListId() {
        return (UUID) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<UUID, UUID> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, UUID> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UUID, UUID> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return SmartexamCheckListItemCheckListLink.SMARTEXAM_CHECK_LIST_ITEM_CHECK_LIST_LINK.CHECK_LIST_ITEM_ID;
    }

    @Override
    public Field<UUID> field2() {
        return SmartexamCheckListItemCheckListLink.SMARTEXAM_CHECK_LIST_ITEM_CHECK_LIST_LINK.CHECK_LIST_ID;
    }

    @Override
    public UUID component1() {
        return getCheckListItemId();
    }

    @Override
    public UUID component2() {
        return getCheckListId();
    }

    @Override
    public UUID value1() {
        return getCheckListItemId();
    }

    @Override
    public UUID value2() {
        return getCheckListId();
    }

    @Override
    public SmartexamCheckListItemCheckListLinkRecord value1(UUID value) {
        setCheckListItemId(value);
        return this;
    }

    @Override
    public SmartexamCheckListItemCheckListLinkRecord value2(UUID value) {
        setCheckListId(value);
        return this;
    }

    @Override
    public SmartexamCheckListItemCheckListLinkRecord values(UUID value1, UUID value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SmartexamCheckListItemCheckListLinkRecord
     */
    public SmartexamCheckListItemCheckListLinkRecord() {
        super(SmartexamCheckListItemCheckListLink.SMARTEXAM_CHECK_LIST_ITEM_CHECK_LIST_LINK);
    }

    /**
     * Create a detached, initialised SmartexamCheckListItemCheckListLinkRecord
     */
    public SmartexamCheckListItemCheckListLinkRecord(UUID checkListItemId, UUID checkListId) {
        super(SmartexamCheckListItemCheckListLink.SMARTEXAM_CHECK_LIST_ITEM_CHECK_LIST_LINK);

        setCheckListItemId(checkListItemId);
        setCheckListId(checkListId);
    }

    /**
     * Create a detached, initialised SmartexamCheckListItemCheckListLinkRecord
     */
    public SmartexamCheckListItemCheckListLinkRecord(nu.studer.sample.tables.pojos.SmartexamCheckListItemCheckListLink value) {
        super(SmartexamCheckListItemCheckListLink.SMARTEXAM_CHECK_LIST_ITEM_CHECK_LIST_LINK);

        if (value != null) {
            setCheckListItemId(value.getCheckListItemId());
            setCheckListId(value.getCheckListId());
        }
    }
}