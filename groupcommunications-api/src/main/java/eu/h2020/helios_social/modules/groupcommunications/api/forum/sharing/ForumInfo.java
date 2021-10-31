package eu.h2020.helios_social.modules.groupcommunications.api.forum.sharing;

import java.util.Collection;

import eu.h2020.helios_social.modules.groupcommunications.api.group.sharing.GroupInvitationType;
import eu.h2020.helios_social.modules.groupcommunications.api.messaging.AbstractMessage;
import eu.h2020.helios_social.modules.groupcommunications.api.peer.PeerId;
import eu.h2020.helios_social.modules.groupcommunications.api.sharing.Request;

public class ForumInfo implements AbstractMessage {

	private String contextId;
	private String groupId;
	private String name;
	private Request.Type type;
	private long timestamp;
	private String peerName;

	public ForumInfo(String contextId, String groupId, String name, Request.Type type, long timestamp, String peerName) {
		this.contextId = contextId;
		this.groupId = groupId;
		this.name = name;
		this.type = type;
		this.timestamp = timestamp;
		this.peerName = peerName;
	}

	public String getContextId() {
		return contextId;
	}

	public String getGroupId() {
		return groupId;
	}

	public String getName() {
		return name;
	}

	public Request.Type getType() {
		return type;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getPeerName() {
		return peerName;
	}
}
