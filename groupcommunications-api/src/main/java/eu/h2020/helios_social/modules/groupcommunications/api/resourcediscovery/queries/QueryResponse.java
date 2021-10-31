package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import eu.h2020.helios_social.modules.groupcommunications.api.messaging.AbstractMessage;

public class QueryResponse<T extends Queryable> implements AbstractMessage {

    private final String queryId;
    private Map<String, Double> scores;
    private Map<String, T> results;
    private String type;
    private int TTL;
    protected final long timestamp;

    private QueryResponse(String queryId, LinkedHashMap<String, Double> scores, HashMap<String, T> results, String type, int TTL, long timestamp) {
        this.queryId = queryId;
        this.scores = scores;
        this.results = results;
        this.type = type;
        this.TTL = TTL;
        this.timestamp = timestamp;
    }

    public QueryResponse(String queryId, long timestamp) {
        this(queryId, new LinkedHashMap<String, Double>(), new HashMap<String, T>(), new String(), 2, timestamp);
    }

    public Map<String, Double> getScores() {
        return scores;
    }

    public Map<String, T> getEntities() {
        return results;
    }

    public void appendResults(Map<T, Double> newResults) {
        // when a user leaves a forum, then newResults has a null key, so we have to remove it
        newResults.remove(null);
        scores.putAll(
                newResults
                        .entrySet()
                        .stream()
                        .collect(Collectors.toMap(entry -> entry.getKey().getId(), entry -> entry.getValue()))
        );

        results.putAll(newResults
                .entrySet()
                .stream()
                .collect(Collectors.toMap(entry -> entry.getKey().getId(), entry -> entry.getKey())));
        Queryable queryable = (Queryable) newResults.keySet().toArray()[0];
        type = queryable.getQueryableType();
    }

    public QueryResponse appendScores(Map<String, Double> scores) {
        this.scores.putAll(scores);
        return this;
    }

    public QueryResponse appendEntities(Map<String, T> entities) {
        this.results.putAll(entities);
        return this;
    }

    public String getQueryId() {
        return queryId;
    }

    @Override
    public String toString() {
        return "QueryResponse{" +
                ", queryId='" + queryId + '\'' +
                ", scores=" + scores +
                ", results=" + results +
                '}';
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
        //long currentTime = System.currentTimeMillis();
        //long diff = currentTime - timestamp;
        return TTL < 0; //|| diff > 60000;
    }

    public String getType() {
        return this.type;
    }
}
