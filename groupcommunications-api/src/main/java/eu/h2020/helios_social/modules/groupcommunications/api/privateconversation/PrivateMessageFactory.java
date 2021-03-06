package eu.h2020.helios_social.modules.groupcommunications.api.privateconversation;

import java.util.List;

import eu.h2020.helios_social.modules.groupcommunications.api.event.HeliosEvent;
import eu.h2020.helios_social.modules.groupcommunications.api.messaging.Attachment;
import eu.h2020.helios_social.modules.groupcommunications.api.messaging.Message;
import eu.h2020.helios_social.modules.groupcommunications.api.peer.PeerInfo;

/**
 * Interface for Private Message Factory
 */
public interface PrivateMessageFactory {

    /**
     * Creates a new private Message given the group Identifier, timestamp and text
     *
     * @param groupId
     * @param timestamp
     * @param text
     * @return
     */
    Message createTextMessage(String groupId, long timestamp,
                              String text);

    Message createAttachmentMessage(String groupId, long timestamp, String text,
                                         List<Attachment> attachments, Message.Type messageType);

    /**
     * Creates a new video call message given the group Identifier, timestamp and room identifier
     *
     * @param groupId
     * @param timestamp
     * @param room_id
     * @return
     */
    Message createVideoCallMessage(String groupId, long timestamp,
                                   String room_id);

    Message createShareContactMessage(String groupId, long timestamp, PeerInfo peerInfo);
}
