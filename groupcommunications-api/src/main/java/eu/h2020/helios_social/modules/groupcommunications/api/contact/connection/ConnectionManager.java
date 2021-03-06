package eu.h2020.helios_social.modules.groupcommunications.api.contact.connection;

import eu.h2020.helios_social.modules.groupcommunications.api.contact.PendingContact;
import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;

public interface ConnectionManager {

    /**
     * Sends a Connection Request to the given pending contact
     *
     * @param pendingContact
     */
    void sendConnectionRequest(PendingContact pendingContact) throws DbException;

    /**
     * Accepts connection request from the given pending contact
     *
     * @param pendingContact
     */
    void acceptConnectionRequest(PendingContact pendingContact);


	/**
	 * Rejects connection request from the given pending contact
	 * @param pendingContact
	 */
	void rejectConnectionRequest(PendingContact pendingContact);
}
