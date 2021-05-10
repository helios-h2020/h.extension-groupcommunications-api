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


    private QueryResponse(String queryId, LinkedHashMap<String, Double> scores, HashMap<String, T> results) {
        this.queryId = queryId;
        this.scores = scores;
        this.results = results;
    }

    public QueryResponse(String queryId) {
        this(queryId, new LinkedHashMap<String, Double>(), new HashMap<String, T>());
    }

    public Map<String, Double> getScores() {
        return scores;
    }

    public Map<String, T> getEntities() {
        return results;
    }

    public void appendResults(Map<T, Double> newResults) {
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
}
