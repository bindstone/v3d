package com.bindstone.vd3.tools;

import elemental.json.Json;
import elemental.json.JsonArray;
import elemental.json.JsonObject;

import java.util.Map;

public class MapToJson {

    public static JsonArray generate(Map<String, String> attributes) {
        JsonArray js = Json.createArray();
        int i = 0;
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            JsonObject obj = Json.createObject();
            obj.put(entry.getKey(), entry.getValue());
            js.set(i++, obj);
        }
        return js;
    }
}
