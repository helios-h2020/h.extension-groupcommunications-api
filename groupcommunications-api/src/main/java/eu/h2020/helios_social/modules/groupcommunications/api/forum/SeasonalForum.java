package eu.h2020.helios_social.modules.groupcommunications.api.forum;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.api.group.GroupType;
import eu.h2020.helios_social.modules.groupcommunications.api.context.utils.Datespan;
import eu.h2020.helios_social.modules.groupcommunications.api.context.utils.Daytime;
import eu.h2020.helios_social.modules.groupcommunications.api.context.utils.Season;

/**
 * A sharable Seasonal Forum
 */
public class SeasonalForum<T> extends Forum {

    private T season;

    public SeasonalForum(@NotNull String groupId, String contextId,
                         @NotNull String name, String password,
						 @NotNull Collection<String> moderators,
                         GroupType forumType,
                         Collection<String> tags, ForumMemberRole defaultMemberRole, T season) {
        super(groupId, contextId, name, password, moderators, forumType,
                tags, defaultMemberRole);
        this.season = season;
    }

    public T getSeason() {
        return season;
    }

    public boolean isActive() {
        if (season instanceof Season) {
            return season.equals(Season.of(LocalDate.now().getMonth()));
        } else if (season instanceof Daytime) {
            return season.equals(Daytime.of(LocalTime.now()));
        } else {
            return ((Datespan) season).contains(LocalDate.now());
        }
    }
}
