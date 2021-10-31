package eu.h2020.helios_social.modules.groupcommunications.api.attachment;

public class InvalidAttachmentException extends Exception {

    String message;

    public InvalidAttachmentException(String message) {
        this.message = message;
    }

    public InvalidAttachmentException() {
    }

    public InvalidAttachmentException(Throwable t) {
        super(t);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
