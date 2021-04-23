package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.forwarders;

import java.util.List;

public interface Forwarder {

    List<String> findNextHops(String peerId, String queryId);
}
