package eu.h2020.helios_social.modules.groupcommunications.api.privategroup;

import java.util.List;

import eu.h2020.helios_social.modules.groupcommunications.api.messaging.Attachment;
import eu.h2020.helios_social.modules.groupcommunications.api.messaging.GroupMessage;
import eu.h2020.helios_social.modules.groupcommunications.api.messaging.Message;

public interface GroupMessageFactory {

    /**
     * Greates new Group Message
     *
     * @param groupId   group identifier
     * @param text      message body
     * @param timestamp
     * @param funnyName user's pseudonym for the group
     * @param fakeId    user's pseudo-identifier for the group
     * @return
     */
    GroupMessage createGroupMessage(String groupId,
                                    String text, long timestamp, String funnyName, String fakeId);

    GroupMessage createAttachmentMessage(String groupId, List<Attachment> attachments, Message.Type messageType,
                                         String text, long timestamp, String funnyName, String fakeId);
}
