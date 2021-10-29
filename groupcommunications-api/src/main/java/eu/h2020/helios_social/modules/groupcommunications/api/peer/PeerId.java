package eu.h2020.helios_social.modules.groupcommunications.api.peer;

import java.util.Objects;

public class PeerId {

	public String pid;
	public String fakeId;

	public PeerId(String pid) {
		this.pid = pid;
	}

	public PeerId(String pid, String fakeId) {
		this.pid = pid;
		this.fakeId = fakeId;
	}

	public String getId() {
		return pid;
	}

	public String getFakeId() {
		return fakeId;
	}

	@Override
	public String toString() {
		return "PeerId{" +
				"pid='" + pid + '\'' +
				", fakeId='" + fakeId + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof PeerId)) return false;
		PeerId peerId = (PeerId) o;
		return pid.equals(peerId.pid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(pid);
	}
}
