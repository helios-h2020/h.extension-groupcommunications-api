package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries;

import java.util.List;

import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;
import eu.h2020.helios_social.modules.groupcommunications.api.peer.PeerId;

public interface QueryForwarderManager {

    <Forwarder extends QueryForwarder> List<PeerId> getNextHops(Class<Forwarder> forwarderClass, PeerId peerId, Query query) throws DbException;

    <Forwarder extends QueryForwarder> List<PeerId> getNextHops(PeerId peerId, Query query) throws DbException;

    void addForwarder(Class<? extends QueryForwarder> forwarder);
}
