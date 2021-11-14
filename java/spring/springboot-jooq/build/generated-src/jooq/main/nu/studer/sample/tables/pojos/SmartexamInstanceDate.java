/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamInstanceDate implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID      id;
    private final LocalDate date_;
    private final Long      amountCheckLists;
    private final UUID      divisionId;
    private final Long      amountAllTs;
    private final Long      amountTs;
    private final Long      amointTsNoLine;

    public SmartexamInstanceDate(SmartexamInstanceDate value) {
        this.id = value.id;
        this.date_ = value.date_;
        this.amountCheckLists = value.amountCheckLists;
        this.divisionId = value.divisionId;
        this.amountAllTs = value.amountAllTs;
        this.amountTs = value.amountTs;
        this.amointTsNoLine = value.amointTsNoLine;
    }

    public SmartexamInstanceDate(
        UUID      id,
        LocalDate date_,
        Long      amountCheckLists,
        UUID      divisionId,
        Long      amountAllTs,
        Long      amountTs,
        Long      amointTsNoLine
    ) {
        this.id = id;
        this.date_ = date_;
        this.amountCheckLists = amountCheckLists;
        this.divisionId = divisionId;
        this.amountAllTs = amountAllTs;
        this.amountTs = amountTs;
        this.amointTsNoLine = amointTsNoLine;
    }

    /**
     * Getter for <code>public.smartexam_instance_date.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.smartexam_instance_date.date_</code>.
     */
    public LocalDate getDate_() {
        return this.date_;
    }

    /**
     * Getter for
     * <code>public.smartexam_instance_date.amount_check_lists</code>.
     */
    public Long getAmountCheckLists() {
        return this.amountCheckLists;
    }

    /**
     * Getter for <code>public.smartexam_instance_date.division_id</code>.
     */
    public UUID getDivisionId() {
        return this.divisionId;
    }

    /**
     * Getter for <code>public.smartexam_instance_date.amount_all_ts</code>.
     */
    public Long getAmountAllTs() {
        return this.amountAllTs;
    }

    /**
     * Getter for <code>public.smartexam_instance_date.amount_ts</code>.
     */
    public Long getAmountTs() {
        return this.amountTs;
    }

    /**
     * Getter for <code>public.smartexam_instance_date.amoint_ts_no_line</code>.
     */
    public Long getAmointTsNoLine() {
        return this.amointTsNoLine;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartexamInstanceDate (");

        sb.append(id);
        sb.append(", ").append(date_);
        sb.append(", ").append(amountCheckLists);
        sb.append(", ").append(divisionId);
        sb.append(", ").append(amountAllTs);
        sb.append(", ").append(amountTs);
        sb.append(", ").append(amointTsNoLine);

        sb.append(")");
        return sb.toString();
    }
}