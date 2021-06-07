package eu.h2020.helios_social.modules.groupcommunications.api.attachment;

import java.io.FileNotFoundException;
import java.util.List;

import eu.h2020.helios_social.modules.groupcommunications.api.messaging.Attachment;

public interface AttachmentManager {

    boolean validateAttachments(List<Attachment> attachments);

    void storeOutgoingAttachmentsToExternalStorage(List<Attachment> attachments);

    void uploadAttachments(List<Attachment> attachments);

    void downloadAttachments(String messageId, List<Attachment> attachments);
}
