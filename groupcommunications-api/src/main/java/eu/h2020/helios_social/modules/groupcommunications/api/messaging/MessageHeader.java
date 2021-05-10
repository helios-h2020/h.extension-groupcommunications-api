package eu.h2020.helios_social.modules.groupcommunications.api.messaging;

import java.util.List;

import eu.h2020.helios_social.modules.groupcommunications.api.conversation.ConversationMessageVisitor;

/**
 * Message Header class
 */
public class MessageHeader {

    private final String messageId;
    private final String groupId;
    private final long timestamp;
    private boolean incoming;
    private boolean favourite;
    private MessageState state;
    private final Message.Type messageType;
    private final boolean hasText;
    private List<Attachment> attachments;

    public MessageHeader(String messageId, String groupId, long timestamp,
                         MessageState state, boolean incoming, boolean favourite,
                         Message.Type messageType, boolean hasText) {
        this.messageId = messageId;
        this.groupId = groupId;
        this.timestamp = timestamp;
        this.incoming = incoming;
        this.state = state;
        this.favourite = favourite;
        this.messageType = messageType;
        this.hasText = hasText;
    }

    /**
     * Returns the ID of the message.
     */
    public String getMessageId() {
        return messageId;
    }

    public String getGroupId() {
        return groupId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public boolean isIncoming() {
        return incoming;
    }

    public boolean hasText() {
        return hasText;
    }

    /**
     * Returns message state.
     */
    public MessageState getMessageState() {
        return state;
    }

    /**
     * Returns true if the message has been liked by the contact.
     */
    public boolean isFavourite() {
        return favourite;
    }

    public Message.Type getMessageType() {
        return messageType;
    }

    public void setMessageState(MessageState state) {
        this.state = state;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public <T> T accept(ConversationMessageVisitor<T> v) {
        return v.visitMessageHeader(this);
    }

    @Override
    public String toString() {
        return "MessageHeader{" +
                "messageId='" + messageId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", timestamp=" + timestamp +
                ", incoming=" + incoming +
                ", favourite=" + favourite +
                ", state=" + state +
                ", messageType=" + messageType +
                ", hasText=" + hasText +
                ", attachments=" + attachments +
                '}';
    }
}

