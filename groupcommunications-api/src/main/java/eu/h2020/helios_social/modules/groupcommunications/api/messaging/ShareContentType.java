package eu.h2020.helios_social.modules.groupcommunications.api.messaging;

public enum ShareContentType {

    TEXT(1), IMAGES(2), VIDEO(3);

    private int value;

    ShareContentType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ShareContentType fromValue(int value) {
        for (ShareContentType contentType : values()) if (contentType.value == value) return contentType;
        throw new IllegalArgumentException();
    }
}
