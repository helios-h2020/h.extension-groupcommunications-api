package eu.h2020.helios_social.modules.groupcommunications.api.group;

import eu.h2020.helios_social.modules.groupcommunications.api.forum.ForumMemberRole;
import eu.h2020.helios_social.modules.groupcommunications.api.peer.PeerId;

public class GroupMember {
    private PeerId peerId;
    private String groupId;
    private String alias;
    private byte[] profilePic;

    public GroupMember(PeerId peerId, String alias, byte[] profilePic,String groupId) {
        this.peerId = peerId;
        this.alias = alias;
        this.profilePic = profilePic;
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public PeerId getPeerId() {
        return peerId;
    }

    public String getAlias() {
        return alias;
    }

    public byte[] getProfilePic() {return profilePic;}
}
