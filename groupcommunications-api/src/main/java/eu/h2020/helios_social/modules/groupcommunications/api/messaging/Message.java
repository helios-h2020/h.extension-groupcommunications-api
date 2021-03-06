package eu.h2020.helios_social.modules.groupcommunications.api.messaging;

import org.jetbrains.annotations.NotNull;

import java.util.List;


/**
 * Represents a Message
 */
public class Message implements AbstractMessage {

    public enum Type {
        TEXT(0), FILE_ATTACHMENT(1), VIDEOCALL(2), ACK(3), EVENT(4), IMAGES(5), CONTACT(6), ACK_INVALID_GROUP(7);

        private final int value;

        Type(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Type fromValue(int value) {
            for (Type s : values()) if (s.value == value) return s;
            throw new IllegalArgumentException();
        }
    }

    private String id;
    private String groupId;
    private long timestamp;
    private String preferences;
    private String body;
    private String mediaFileName;
    private final Message.Type message_type;
    private List<Attachment> attachments;

    /**
     * Contracts a new instance of Message
     *
     * @param id            message identifier
     * @param groupId       group Identifier
     * @param timestamp
     * @param body
     * @param mediaFileName
     */
    public Message(@NotNull String id, @NotNull String groupId, long timestamp,
                   String body, String mediaFileName, Message.Type type) {
        this.id = id;
        this.groupId = groupId;
        this.timestamp = timestamp;
        this.body = body;
        this.mediaFileName = mediaFileName;
        this.message_type = type;
    }

    /**
     * Contracts a new instance of Message
     *
     * @param id        message identifier
     * @param groupId   group Identifier
     * @param timestamp
     * @param body
     */
    public Message(@NotNull String id, @NotNull String groupId, long timestamp,
                   String body, Message.Type type) {
        this.id = id;
        this.groupId = groupId;
        this.timestamp = timestamp;
        this.body = body;
        this.message_type = type;
    }

    public Message(@NotNull String id, @NotNull String groupId, long timestamp,
                   String body, Message.Type type, List<Attachment> attachments) {
        this.id = id;
        this.groupId = groupId;
        this.timestamp = timestamp;
        this.body = body;
        this.message_type = type;
        this.attachments = attachments;
    }

    public Message(String preferences, String body) {
        this.preferences = preferences;
        this.body = body;
        this.message_type = Type.ACK;
    }

    public Message(String groupId) {
        this.groupId = groupId;
        this.message_type = Type.ACK_INVALID_GROUP;
    }

    public String getMessageBody() {
        return body;
    }

    public Message.Type getMessageType() {
        return message_type;
    }

    public String getMediaFileName() {
        return mediaFileName;
    }

    /**
     * @return the Message Identifier
     */
    public String getId() {
        return id;
    }

    /**
     * @return Conversation Identifier of the group the message shared to
     */
    public String getGroupId() {
        return groupId;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setAttachment(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * @return epoch timestamp of the message
     */
    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Message && id.equals(((Message) o).getId());
    }
}
