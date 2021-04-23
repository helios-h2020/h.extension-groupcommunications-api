package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries;

import java.util.List;

import eu.h2020.helios_social.modules.groupcommunications.api.contact.ContactManager;
import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;
import eu.h2020.helios_social.modules.groupcommunications.api.peer.PeerId;

public abstract class QueryForwarder {

    protected final ContactManager contactManager;

    public QueryForwarder(ContactManager contactManager) {
        this.contactManager = contactManager;
    }

    public abstract List<PeerId> forward(PeerId peerId, Query query) throws DbException;
}
