package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries;

import eu.h2020.helios_social.modules.groupcommunications.api.messaging.AbstractMessage;
import eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.EntityType;

public abstract class Query implements AbstractMessage {

    protected final String queryId;
    protected final String contextId;
    protected final EntityType entityType;
    protected final long timestamp;
    protected int TTL;

    public Query(String queryId, String contextId, EntityType entityType, long timestamp, int ttl) {
        this.queryId = queryId;
        this.contextId = contextId;
        this.entityType = entityType;
        this.timestamp = timestamp;
        this.TTL = ttl;
    }

    public String getQueryId() {
        return queryId;
    }

    public String getContextId() {
        return contextId;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getTTL() {
        return TTL;
    }

    public void decrementTLL() {
        TTL--;
    }

    public boolean isDead() {
        long currentTime = System.currentTimeMillis();
        long diff = currentTime - timestamp;
        return TTL <= 0 || diff >= 60000;
    }

    @Override
    public String toString() {
        return "Query{" +
                "queryId='" + queryId + '\'' +
                ", entityType=" + entityType +
                ", timestamp=" + timestamp +
                ", TTL=" + TTL +
                '}';
    }
}
