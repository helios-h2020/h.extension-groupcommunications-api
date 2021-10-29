package eu.h2020.helios_social.modules.groupcommunications.api.forum.sharing;

import eu.h2020.helios_social.modules.groupcommunications.api.contact.Contact;
import eu.h2020.helios_social.modules.groupcommunications.api.group.GroupType;
import eu.h2020.helios_social.modules.groupcommunications.api.contact.ContactId;
import eu.h2020.helios_social.modules.groupcommunications.api.group.sharing.GroupInvitationType;
import eu.h2020.helios_social.modules.groupcommunications.api.messaging.AbstractMessage;
import eu.h2020.helios_social.modules.groupcommunications.api.sharing.Invitation;
import eu.h2020.helios_social.modules.groupcommunications.api.sharing.Request;

public class ForumAccessRequest extends Request implements AbstractMessage {

    private String groupId;
    private ContactId contactId;
    private String name;
    private long timestamp;
    private boolean incoming;
    private String peerName;
    public ForumAccessRequest(ContactId contactId, String contextId,
                           String groupId,
                           String name, Request.Type type,
                           long timestamp,
                           boolean incoming,
                           String peerName   ) {
        super(contextId, type);
        this.groupId = groupId;
        this.contactId = contactId;
        this.name = name;
        this.timestamp = timestamp;
        this.incoming = incoming;
        this.peerName = peerName;
    }

    public String getGroupId() {
        return groupId;
    }

    public ContactId getContactId() {
        return contactId;
    }

    public String getName() {
        return name;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public boolean isIncoming() {
        return incoming;
    }

    public String getPeerName() {
        return peerName;
    }

    public void setPeerName(String peerName) {
        this.peerName = peerName;
    }
}
