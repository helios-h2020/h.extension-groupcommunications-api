package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries;

import java.util.Map;

import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;
import eu.h2020.helios_social.modules.groupcommunications.api.exception.FormatException;
import eu.h2020.helios_social.modules.groupcommunications.api.peer.PeerId;

public interface SearchManager<T> {

    Map<Queryable, Double> execute(T txn, TextQuery q) throws DbException, FormatException;

    Map<Queryable, Double> execute(T txn, LocationQuery q) throws DbException, FormatException;
}
