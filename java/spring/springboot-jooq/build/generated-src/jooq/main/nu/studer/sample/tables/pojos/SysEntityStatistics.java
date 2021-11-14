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
public class SysEntityStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UUID          id;
    private final LocalDateTime createTs;
    private final String        createdBy;
    private final LocalDateTime updateTs;
    private final String        updatedBy;
    private final String        name;
    private final Long          instanceCount;
    private final Integer       fetchUi;
    private final Integer       maxFetchUi;
    private final Integer       lazyCollectionThreshold;
    private final Integer       lookupScreenThreshold;

    public SysEntityStatistics(SysEntityStatistics value) {
        this.id = value.id;
        this.createTs = value.createTs;
        this.createdBy = value.createdBy;
        this.updateTs = value.updateTs;
        this.updatedBy = value.updatedBy;
        this.name = value.name;
        this.instanceCount = value.instanceCount;
        this.fetchUi = value.fetchUi;
        this.maxFetchUi = value.maxFetchUi;
        this.lazyCollectionThreshold = value.lazyCollectionThreshold;
        this.lookupScreenThreshold = value.lookupScreenThreshold;
    }

    public SysEntityStatistics(
        UUID          id,
        LocalDateTime createTs,
        String        createdBy,
        LocalDateTime updateTs,
        String        updatedBy,
        String        name,
        Long          instanceCount,
        Integer       fetchUi,
        Integer       maxFetchUi,
        Integer       lazyCollectionThreshold,
        Integer       lookupScreenThreshold
    ) {
        this.id = id;
        this.createTs = createTs;
        this.createdBy = createdBy;
        this.updateTs = updateTs;
        this.updatedBy = updatedBy;
        this.name = name;
        this.instanceCount = instanceCount;
        this.fetchUi = fetchUi;
        this.maxFetchUi = maxFetchUi;
        this.lazyCollectionThreshold = lazyCollectionThreshold;
        this.lookupScreenThreshold = lookupScreenThreshold;
    }

    /**
     * Getter for <code>public.sys_entity_statistics.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.sys_entity_statistics.create_ts</code>.
     */
    public LocalDateTime getCreateTs() {
        return this.createTs;
    }

    /**
     * Getter for <code>public.sys_entity_statistics.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Getter for <code>public.sys_entity_statistics.update_ts</code>.
     */
    public LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /**
     * Getter for <code>public.sys_entity_statistics.updated_by</code>.
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Getter for <code>public.sys_entity_statistics.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.sys_entity_statistics.instance_count</code>.
     */
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * Getter for <code>public.sys_entity_statistics.fetch_ui</code>.
     */
    public Integer getFetchUi() {
        return this.fetchUi;
    }

    /**
     * Getter for <code>public.sys_entity_statistics.max_fetch_ui</code>.
     */
    public Integer getMaxFetchUi() {
        return this.maxFetchUi;
    }

    /**
     * Getter for
     * <code>public.sys_entity_statistics.lazy_collection_threshold</code>.
     */
    public Integer getLazyCollectionThreshold() {
        return this.lazyCollectionThreshold;
    }

    /**
     * Getter for
     * <code>public.sys_entity_statistics.lookup_screen_threshold</code>.
     */
    public Integer getLookupScreenThreshold() {
        return this.lookupScreenThreshold;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SysEntityStatistics (");

        sb.append(id);
        sb.append(", ").append(createTs);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updateTs);
        sb.append(", ").append(updatedBy);
        sb.append(", ").append(name);
        sb.append(", ").append(instanceCount);
        sb.append(", ").append(fetchUi);
        sb.append(", ").append(maxFetchUi);
        sb.append(", ").append(lazyCollectionThreshold);
        sb.append(", ").append(lookupScreenThreshold);

        sb.append(")");
        return sb.toString();
    }
}
