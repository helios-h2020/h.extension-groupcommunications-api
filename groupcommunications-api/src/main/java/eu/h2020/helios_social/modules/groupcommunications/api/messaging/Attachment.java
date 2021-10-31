package eu.h2020.helios_social.modules.groupcommunications.api.messaging;

public class Attachment implements Cloneable {

    private String uri;
    private String attachmentName;
    private String url;
    private String contentType;

    public Attachment(String uri, String url, String contentType, String attachmentName) {
        this.uri = uri;
        this.url = url;
        this.attachmentName = attachmentName;
        this.contentType = contentType;
    }

    public Attachment(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }

    public String getUri() {
        return uri;
    }

    public String getUrl() {
        return url;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public Attachment setUri(String uri) {
        this.uri = uri;
        return this;
    }

    public Attachment setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "uri='" + uri + '\'' +
                ", attachmentName='" + attachmentName + '\'' +
                ", url='" + url + '\'' +
                ", contentType='" + contentType + '\'' +
                '}';
    }

    @Override
    public Attachment clone() {
        try {
            return (Attachment) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Attachment(this.uri, this.url, this.contentType, this.attachmentName);
        }
    }
}
