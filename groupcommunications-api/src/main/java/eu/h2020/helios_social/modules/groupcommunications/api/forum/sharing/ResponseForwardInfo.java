package eu.h2020.helios_social.modules.groupcommunications.api.forum.sharing;

import eu.h2020.helios_social.modules.groupcommunications.api.contact.ContactId;
import eu.h2020.helios_social.modules.groupcommunications.api.messaging.AbstractMessage;

public class ResponseForwardInfo implements AbstractMessage {

    private ContactId contactId;
    private String groupId;

    public ResponseForwardInfo(ContactId contactId, String groupId) {
        this.contactId = contactId;
        this.groupId = groupId;
    }

    public ContactId getContactId() {
        return contactId;
    }

    public String getGroupId() {
        return groupId;
    }
}
