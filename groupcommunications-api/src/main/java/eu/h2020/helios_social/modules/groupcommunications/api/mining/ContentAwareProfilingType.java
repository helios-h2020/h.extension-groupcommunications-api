package eu.h2020.helios_social.modules.groupcommunications.api.mining;

import eu.h2020.helios_social.modules.groupcommunications.api.group.GroupType;

public enum ContentAwareProfilingType {

    NONE(0), FINE_INTEREST_PROFILE(1), COARSE_INTEREST_RPOFILE(2), DML_PROFILE(3);

    private int value;

    ContentAwareProfilingType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ContentAwareProfilingType fromValue(int value) {
        for (ContentAwareProfilingType g : values()) if (g.value == value) return g;
        throw new IllegalArgumentException();
    }
}
