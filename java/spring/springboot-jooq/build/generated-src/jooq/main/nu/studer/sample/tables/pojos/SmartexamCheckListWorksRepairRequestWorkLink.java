/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.pojos;


import java.io.Serializable;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmartexamCheckListWorksRepairRequestWorkLink implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID checkListWorksId;
    private final UUID repairRequestWorkId;

    public SmartexamCheckListWorksRepairRequestWorkLink(SmartexamCheckListWorksRepairRequestWorkLink value) {
        this.checkListWorksId = value.checkListWorksId;
        this.repairRequestWorkId = value.repairRequestWorkId;
    }

    public SmartexamCheckListWorksRepairRequestWorkLink(
        UUID checkListWorksId,
        UUID repairRequestWorkId
    ) {
        this.checkListWorksId = checkListWorksId;
        this.repairRequestWorkId = repairRequestWorkId;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_works_repair_request_work_link.check_list_works_id</code>.
     */
    public UUID getCheckListWorksId() {
        return this.checkListWorksId;
    }

    /**
     * Getter for
     * <code>public.smartexam_check_list_works_repair_request_work_link.repair_request_work_id</code>.
     */
    public UUID getRepairRequestWorkId() {
        return this.repairRequestWorkId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SmartexamCheckListWorksRepairRequestWorkLink (");

        sb.append(checkListWorksId);
        sb.append(", ").append(repairRequestWorkId);

        sb.append(")");
        return sb.toString();
    }
}