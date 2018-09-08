package com.bindstone.vd3.tools;

import com.bindstone.vd3.charts.ChartDataItem;
import com.bindstone.vd3.charts.ChartsDataSet;
import elemental.json.Json;
import elemental.json.JsonArray;
import elemental.json.JsonObject;

import java.util.Iterator;
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

    public static JsonArray generate(ChartsDataSet set) {
        JsonArray js = Json.createArray();
        int i = 0;
        if (set != null) {
            Iterator<ChartDataItem> iterator = set.iterator();
            while (iterator.hasNext()) {
                ChartDataItem item = iterator.next();
                JsonObject obj = Json.createObject();
                obj.put("valueX", item.getValueX());
                obj.put("valueY", item.getValueY());
                js.set(i++, obj);
            }
        }
        return js;
    }
}
