package eu.h2020.helios_social.modules.groupcommunications.api.group;


import org.jetbrains.annotations.NotNull;

import java.util.List;

import eu.h2020.helios_social.modules.groupcommunications.api.context.utils.Datespan;
import eu.h2020.helios_social.modules.groupcommunications.api.context.utils.Daytime;
import eu.h2020.helios_social.modules.groupcommunications.api.context.utils.Season;
import eu.h2020.helios_social.modules.groupcommunications.api.forum.Forum;
import eu.h2020.helios_social.modules.groupcommunications.api.forum.ForumMemberRole;
import eu.h2020.helios_social.modules.groupcommunications.api.forum.LocationForum;
import eu.h2020.helios_social.modules.groupcommunications.api.forum.SeasonalForum;
import eu.h2020.helios_social.modules.groupcommunications.api.privategroup.PrivateGroup;

/**
 * A class for creating new sharable and non-sharable Groups of conversation
 */
public interface GroupFactory {

	/**
	 * Creates a non-sharable Group of conversation with a given name
	 *
	 * @param name of the Private Group
	 */
	PrivateGroup createPrivateGroup(@NotNull String name, String contextId);

	/**
	 * creates a sharable Forum with a given name
	 *
	 * @param name      of the forum
	 * @param contextId identifier of context the forum lives in
	 * @param forumType PUBLIC, PROTECTED, SECRET
	 * @param tags      a List of strings describing the forum
	 * @return the created forum
	 */
	Forum createNamedForum(@NotNull String name,
						   String contextId,
						   @NotNull GroupType forumType,
						   List<String> tags,
						   ForumMemberRole defaultRole);

	/**
	 * creates a sharable Location Forum with a given name
	 *
	 * @param name      of the forum
	 * @param forumType PUBLIC, PROTECTED, SECRET
	 * @param tags      a List of strings describing the forum
	 * @param lat       latitude of the location assigned to forum
	 * @param lon       longitude of the location assigned to forum
	 * @return the created forum
	 */
	LocationForum createLocationForum(@NotNull String name,
									  String contextId,
									  GroupType forumType,
									  List<String> tags,
									  ForumMemberRole defaultRole,
									  double lat, double lon, int radius);

	/**
	 * creates a sharable Location Forum with a given name
	 *
	 * @param name      of the forum
	 * @param forumType PUBLIC, PROTECTED, SECRET
	 * @param tags      a List of strings describing the forum
	 * @param season    season the forum is active
	 * @return the created forum
	 */
	SeasonalForum<Season> createSeasonalForum(@NotNull String name,
											  String contextId,
											  @NotNull GroupType forumType,
											  List<String> tags,
											  ForumMemberRole defaultRole,
											  @NotNull Season season);

	/**
	 * creates a sharable Location Forum with a given name
	 *
	 * @param name      of the forum
	 * @param forumType PUBLIC, PROTECTED, SECRET
	 * @param tags      a List of strings describing the forum
	 * @param season    season the forum is active
	 * @return the created forum
	 */
	SeasonalForum<Datespan> createSeasonalForum(@NotNull String name,
												String contextId,
												@NotNull GroupType forumType,
												List<String> tags,
												ForumMemberRole defaultRole,
												@NotNull Datespan season);

	/**
	 * creates a sharable Location Forum with a given name
	 *
	 * @param name      of the forum
	 * @param forumType PUBLIC, PROTECTED, SECRET
	 * @param tags      a List of strings describing the forum
	 * @param season    season the forum is active
	 * @return the created forum
	 */
	SeasonalForum<Daytime> createSeasonalForum(@NotNull String name, String contextId,
											   @NotNull GroupType forumType,
											   List<String> tags,
											   ForumMemberRole defaultRole,
											   @NotNull Daytime season);
}
