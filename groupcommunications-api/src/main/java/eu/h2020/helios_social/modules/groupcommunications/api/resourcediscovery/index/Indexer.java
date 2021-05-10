package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.index;

import java.util.Map;

import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;
import eu.h2020.helios_social.modules.groupcommunications.api.exception.FormatException;
import eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries.Queryable;

public interface Indexer<T> {

    void addQueryable(T txn, Queryable queryable) throws DbException, FormatException;

    Map<String, Double> search(T txn, String text, String contextId) throws DbException, FormatException;
}
