package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries;

import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;
import eu.h2020.helios_social.modules.groupcommunications.api.peer.PeerId;

public interface QueryManager {

    void sendQuery(Query query) throws DbException;

    void forwardQuery(PeerId peerId, Query query);

    void sendQueryResponse(PeerId peerId, QueryResponse<Queryable> queryResponse);
}
