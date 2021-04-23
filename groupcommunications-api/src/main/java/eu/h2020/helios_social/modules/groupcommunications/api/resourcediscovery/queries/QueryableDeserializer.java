package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class QueryableDeserializer implements JsonDeserializer<Queryable> {
    private String queryableTypeElementName;
    private Gson gson;
    private Map<String, Class<? extends Queryable>> queryableTypeRegistry;

    public QueryableDeserializer(String queryableTypeElementName) {
        this.queryableTypeElementName = queryableTypeElementName;
        this.gson = new Gson();
        this.queryableTypeRegistry = new HashMap<>();
    }

    public void registerQueryableType(String queryableTypeName, Class<? extends Queryable> queryableType) {
        queryableTypeRegistry.put(queryableTypeName, queryableType);
    }

    public Queryable deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        JsonObject queryableObject = json.getAsJsonObject();
        System.out.println(json);
        System.out.println(queryableTypeElementName);
        JsonElement queryableTypeElement = queryableObject.get(queryableTypeElementName);

        Class<? extends Queryable> queryableType = queryableTypeRegistry.get(queryableTypeElement.getAsString());
        return gson.fromJson(queryableObject, queryableType);
    }
}
