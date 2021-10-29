package eu.h2020.helios_social.modules.groupcommunications.api.forum.sharing;

import eu.h2020.helios_social.modules.groupcommunications.api.contact.ContactId;
import eu.h2020.helios_social.modules.groupcommunications.api.forum.Forum;
import eu.h2020.helios_social.modules.groupcommunications.api.group.Group;
import eu.h2020.helios_social.modules.groupcommunications.api.privategroup.sharing.GroupInfo;
import eu.h2020.helios_social.modules.groupcommunications.api.privategroup.sharing.GroupInvitation;

public interface ForumAccessRequestFactory {

    /**
     * Creates an incoming Forum request given the contact identifier and the corresponding
     * Forum info.
     *
     * @param contactId
     * @param forumInfo
     * @return
     */
    ForumAccessRequest createIncomingForumAccessRequest(ContactId contactId,
                                                  ForumInfo forumInfo);

    /**
     * Creates an outgoing Forum request given the contact identifier and corresponding Forum.
     *
     * @param contactId
     * @param forum
     * @param peerName
     * @return
     */
    ForumAccessRequest createOutgoingForumAccessRequest(ContactId contactId,
                                                  Forum forum, String peerName);
}
