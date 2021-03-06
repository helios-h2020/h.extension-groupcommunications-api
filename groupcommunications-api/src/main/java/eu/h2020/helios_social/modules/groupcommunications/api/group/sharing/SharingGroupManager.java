package eu.h2020.helios_social.modules.groupcommunications.api.group.sharing;

import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;
import eu.h2020.helios_social.modules.groupcommunications.api.exception.FormatException;
import eu.h2020.helios_social.modules.groupcommunications.api.forum.Forum;
import eu.h2020.helios_social.modules.groupcommunications.api.forum.sharing.ForumAccessRequest;
import eu.h2020.helios_social.modules.groupcommunications.api.group.GroupMember;
import eu.h2020.helios_social.modules.groupcommunications.api.privategroup.sharing.GroupInvitation;

public interface SharingGroupManager {

    /**
     * Stores and sends a Group Invitation
     *
     * @param privateGroupInvite
     * @throws DbException
     */
    void sendGroupInvitation(GroupInvitation privateGroupInvite) throws DbException;

    /**
     * Accepts an incoming Group Invitation and notifies the private group’s owner or the forum
     * moderators to update their member lists.
     *
     * @param privateGroupInvite
     * @throws DbException
     * @throws FormatException
     */
    void acceptGroupInvitation(GroupInvitation privateGroupInvite)
            throws DbException, FormatException;

    void acceptGroupInvitation(GroupInvitation privateGroupInvite, boolean isRequestAutoAccept)
            throws DbException, FormatException;

    void joinForum(Forum forum) throws DbException, FormatException;

    /**
     * Rejects an incoming Group Invitation and notifies the contact that she has rejected the
     * invitation
     *
     * @param privateGroupInvite
     * @throws FormatException
     * @throws DbException
     */
    void rejectGroupInvitation(
            GroupInvitation privateGroupInvite) throws FormatException, DbException;

    void sendUpdatedGroupMembers (Collection<GroupMember> groupMembers, String newMemberId, String groupId)
        throws DbException;

    void sendGroupAccessRequest(ForumAccessRequest forumAccessRequest) throws DbException;

    void acceptGroupAccessRequest(ForumAccessRequest forumAccessRequest) throws DbException;

    void rejectGroupAccessRequest(ForumAccessRequest forumAccessRequest) throws DbException;

}
