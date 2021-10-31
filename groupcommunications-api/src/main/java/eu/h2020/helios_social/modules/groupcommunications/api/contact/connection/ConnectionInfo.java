package eu.h2020.helios_social.modules.groupcommunications.api.contact.connection;

import org.jetbrains.annotations.NotNull;

import java.security.PrivateKey;
import java.security.PublicKey;

import eu.h2020.helios_social.modules.groupcommunications.api.messaging.AbstractMessage;

public class ConnectionInfo implements AbstractMessage {

	private String alias;
	private byte[] profilePicture;
	private String message;
	private long timestamp;
	private String groupId;
	private String contextId;
	private byte[] publicKey;

	public ConnectionInfo() {
	}

	public ConnectionInfo(@NotNull String alias,
			long timestamp) {
		this.alias = alias;
		this.timestamp = timestamp;
	}

	public ConnectionInfo(@NotNull String alias, byte[] profilePicture,
						  long timestamp, byte[] publicKey) {
		this.alias = alias;
		this.profilePicture = profilePicture;
		this.timestamp = timestamp;
		this.publicKey = publicKey;
	}

	public ConnectionInfo setMessage(String message) {
		this.message = message;
		return this;
	}

	public byte[] getProfilePicture() {
		return profilePicture;
	}

	public String getAlias() {
		return alias;
	}

	public String getMessage() {
		return message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getGroupId() {
		return groupId;
	}

	public String getContextId() {
		return contextId;
	}

	public byte[] getPublicKey() {
		return publicKey;
	}

	public ConnectionInfo setConversationInfo(String groupId,
											  String contextId) {
		this.groupId = groupId;
		this.contextId = contextId;
		return this;
	}


}
