package eu.h2020.helios_social.modules.groupcommunications.api.privategroup;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.api.group.GroupMember;
import eu.h2020.helios_social.modules.groupcommunications.api.messaging.AbstractMessage;

public class PrivateGroupMemberListInfo implements AbstractMessage {

    private String message;
    private Collection<GroupMember> groupMembers;


    public PrivateGroupMemberListInfo(@NotNull Collection<GroupMember> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public PrivateGroupMemberListInfo setMessage(String message) {
        this.message = message;
        return this;
    }

    public Collection<GroupMember> getGroupMembers() {
        return groupMembers;
    }
}

