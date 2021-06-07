package eu.h2020.helios_social.modules.groupcommunications.api.messaging;

import org.jetbrains.annotations.NotNull;

import eu.h2020.helios_social.modules.groupcommunications.api.peer.PeerInfo;

public class ContactInfo extends Message {

    private PeerInfo peerInfo;

    public ContactInfo(@NotNull String id, PeerInfo peerInfo, @NotNull String groupId, long timestamp) {
        super(id, groupId, timestamp, peerInfo.toJson(), Type.CONTACT);
        this.peerInfo = peerInfo;
    }

    public String getName() {
        return peerInfo.getAlias();
    }

    public String getPeerId() {
        return peerInfo.getPeerId().getId();
    }
}
