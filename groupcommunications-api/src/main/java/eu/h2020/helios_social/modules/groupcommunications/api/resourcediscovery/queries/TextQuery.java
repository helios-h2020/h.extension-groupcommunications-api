package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries;

import eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.EntityType;

public class TextQuery extends Query {

    private final String query;

    public TextQuery(String queryId, String contextId, String query, EntityType entityType, long timestamp, int ttl) {
        super(queryId, contextId, entityType, timestamp, ttl);
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
