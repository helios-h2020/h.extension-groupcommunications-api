package eu.h2020.helios_social.modules.groupcommunications.api.contact;

import java.security.PublicKey;
import java.util.Objects;

import javax.annotation.Nullable;

public class Contact {

    private ContactId id;
    private String alias;
    private byte[] profilePicture;
    private PublicKey publicKey;

    public Contact(ContactId id, @Nullable String alias) {
        this.id = id;
        this.alias = alias;
    }

    public Contact(ContactId id, @Nullable String alias,
                   byte[] profilePicture, PublicKey publicKey) {
        this.id = id;
        this.alias = alias;
        this.profilePicture = profilePicture;
        this.publicKey = publicKey;
    }

    public ContactId getId() {
        return id;
    }

    public void setId(ContactId id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id.getId(), contact.id.getId());
    }
}
