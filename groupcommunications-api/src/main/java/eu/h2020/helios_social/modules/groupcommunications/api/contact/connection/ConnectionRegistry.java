package eu.h2020.helios_social.modules.groupcommunications.api.contact.connection;

import java.util.List;

import eu.h2020.helios_social.modules.groupcommunications.api.contact.ContactId;
import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;
import eu.h2020.helios_social.modules.groupcommunications.api.peer.PeerId;

public interface ConnectionRegistry {

    boolean isConnected(ContactId contactId);

    boolean isConnected(PeerId peerId);

    List<ContactId> getConnectedContacts() throws DbException;
}
