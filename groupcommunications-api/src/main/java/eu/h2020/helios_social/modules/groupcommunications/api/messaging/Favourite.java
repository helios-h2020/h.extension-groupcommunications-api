package eu.h2020.helios_social.modules.groupcommunications.api.messaging;

import java.util.ArrayList;
import java.util.List;

public class Favourite {

    private String messageId;
    private String author;
    private String body;
    private long timestamp;
    private List<Attachment> attachments;
    private Message.Type type;

    public Favourite(String messageId, String author, String body, Message.Type type,
                     long timestamp) {
        this.messageId = messageId;
        this.author = author;
        this.body = body;
        this.timestamp = timestamp;
        this.type = type;
        this.attachments = new ArrayList<>();
    }

    public String getMessageId() {
        return messageId;
    }

    public String getAuthor() {
        return author;
    }

    public String getTextMessage() {
        return body;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public Message.Type getType() {
        return type;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    @Override
    public String toString() {
        return "Favourite{" +
                "messageId='" + messageId + '\'' +
                ", author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", timestamp=" + timestamp +
                ", attachments=" + attachments +
                ", type=" + type +
                '}';
    }
}

