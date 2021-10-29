package eu.h2020.helios_social.modules.groupcommunications.api.sharing;

import eu.h2020.helios_social.modules.groupcommunications.api.messaging.AbstractMessage;

/**
 * A class for Request
 */
public class Request implements AbstractMessage {

    public enum Type {
        PROFILE, FORUM_ACCESS
    }

    private String contextId;
    private Type requestType;
    private int typeValue;
    public Request(String contextId, Type requestType) {
        this.contextId = contextId;
        this.requestType = requestType;
        if (requestType.equals(Type.FORUM_ACCESS)){
            this.typeValue = 1;
        }
        else {
            this.typeValue = 0;
        }
    }

    public Request(String contextId, int typeValue) {
        this.contextId = contextId;
        this.typeValue = typeValue;
        if (typeValue == 1){
            this.requestType = Type.FORUM_ACCESS;
        }
        else {
            this.requestType = Type.PROFILE;
        }
    }

    public String getContextId() {
        return contextId;
    }

    public Type getRequestType() {
        return requestType;
    }

    public int getTypeValue() {
        return typeValue;
    }
}
