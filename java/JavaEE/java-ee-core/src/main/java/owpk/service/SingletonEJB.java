package owpk.service;

import javax.ejb.Singleton;
import javax.json.Json;
import javax.json.JsonObjectBuilder;

@Singleton
public class SingletonEJB {
    public String buildJson() {
        JsonObjectBuilder json = Json.createObjectBuilder();
        json.add("name", "1");
        json.add("body", "2");
        return json.toString();
    }
}
