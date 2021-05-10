package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery;

public enum EntityType {

    FORUM(0), MESSAGE(1), EVENT(2);

    private final int value;

    EntityType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static EntityType fromValue(int value) {
        for (EntityType s : values()) if (s.value == value) return s;
        throw new IllegalArgumentException();
    }
}
