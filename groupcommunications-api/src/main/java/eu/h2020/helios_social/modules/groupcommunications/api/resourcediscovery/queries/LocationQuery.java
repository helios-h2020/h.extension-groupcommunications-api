package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries;

import eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.EntityType;

public class LocationQuery extends Query {

    private final double queryLat;
    private final double queryLong;
    private final double queryRadius;

    public LocationQuery(String queryId, String contextId, double queryLat, double queryLong, double queryRadius, EntityType entityType, long timestamp, int ttl) {
        super(queryId, contextId, entityType, timestamp, ttl);
        this.queryLat = queryLat;
        this.queryLong = queryLong;
        this.queryRadius = queryRadius;
    }

    public double getQueryLongitude() {
        return queryLong;
    }

    public double getQueryRadius() {
        return queryRadius;
    }

    public double getQueryLatitude() {
        return queryLat;
    }
}
