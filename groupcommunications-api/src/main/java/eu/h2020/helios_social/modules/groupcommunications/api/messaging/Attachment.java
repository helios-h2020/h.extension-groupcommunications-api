package eu.h2020.helios_social.modules.groupcommunications.api.messaging;

public class Attachment {

    private String uri;
    private String url;
    private String contentType;

    public Attachment(String uri, String url, String contentType) {
        this.uri = uri;
        this.url = url;
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
                ", url='" + url + '\'' +
                ", contentType='" + contentType + '\'' +
                '}';
    }
}
