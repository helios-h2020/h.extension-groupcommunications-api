package eu.h2020.helios_social.modules.groupcommunications.api.group.sharing;

/**
 * Available Invitation Types
 */
public enum GroupInvitationType {

    PrivateGroup(0), Forum(1), LocationForum(2), SeasonalForum(3);

    private int value;

    GroupInvitationType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static GroupInvitationType fromValue(int value) {
        for (GroupInvitationType g : values()) if (g.value == value) return g;
        throw new IllegalArgumentException();
    }

    public String getString() {
        switch (value) {
            case 0:
                return "private group";
            case 1:
                return "forum";
            case 2:
                return "location forum";
            case 3:
                return "seasonal forum";
            default:
                return null;
        }
    }
}
