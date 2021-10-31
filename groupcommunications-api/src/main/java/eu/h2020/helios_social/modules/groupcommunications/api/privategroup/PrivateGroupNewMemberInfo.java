package eu.h2020.helios_social.modules.groupcommunications.api.privategroup;


import org.jetbrains.annotations.NotNull;

import eu.h2020.helios_social.modules.groupcommunications.api.messaging.AbstractMessage;

public class PrivateGroupNewMemberInfo implements AbstractMessage {

    private String alias;
    private byte[] profilePicture;
    private String message;
    private String groupId;
    private String peerId;
    private boolean isRemovedMember;


    public PrivateGroupNewMemberInfo(@NotNull String alias, byte[] profilePicture, String peerId,
                                     String groupId, boolean isRemovedMember) {
        this.alias = alias;
        this.profilePicture = profilePicture;
        this.peerId = peerId;
        this.groupId = groupId;
        this.isRemovedMember = isRemovedMember;
    }

    public PrivateGroupNewMemberInfo setMessage(String message) {
        this.message = message;
        return this;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public String getAlias() {
        return alias;
    }

    public String getMessage() {
        return message;
    }


    public String getGroupId() {
        return groupId;
    }

    public String getPeerId() {
        return peerId;
    }

    public boolean isRemovedMember() {
        return isRemovedMember;
    }

}