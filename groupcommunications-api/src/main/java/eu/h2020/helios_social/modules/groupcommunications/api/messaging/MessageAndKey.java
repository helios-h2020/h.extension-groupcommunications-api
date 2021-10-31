package eu.h2020.helios_social.modules.groupcommunications.api.messaging;

public class MessageAndKey implements AbstractMessage{
    private byte[] messageAndKeyBytes;

    public MessageAndKey(byte[] messageAndKeyBytes) {
        this.messageAndKeyBytes = messageAndKeyBytes;
    }

    public byte[] getMessageAndKeyBytes() {
        return messageAndKeyBytes;
    }

    public void setMessageAndKeyBytes(byte[] messageAndKeyBytes) {
        this.messageAndKeyBytes = messageAndKeyBytes;
    }


}
