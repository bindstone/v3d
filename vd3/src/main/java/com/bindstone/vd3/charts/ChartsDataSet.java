package com.bindstone.vd3.charts;

import elemental.json.Json;
import elemental.json.JsonArray;
import elemental.json.JsonObject;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Set of Charts Data Item Set
 */
public class ChartsDataSet {

    // Chart Data Item
    private Set<ChartsDataItem> item;

    /**
     * Constructor Creating Set Type LinkedHashSet
     */
    public ChartsDataSet() {
        this.item = new LinkedHashSet<ChartsDataItem>();
    }

    /**
     * Add Item
     *
     * @param item item
     */
    public void add(ChartsDataItem item) {
        this.item.add(item);
    }

    /**
     * Get Iterator of items
     *
     * @return Iterator
     */
    public Iterator<ChartsDataItem> iterator() {
        return this.item.iterator();
    }

    /**
     * Get Json Object
     *
     * @return Json Object
     */
    public JsonArray getJson() {
        JsonArray js = Json.createArray();

        // add X/Y to Json
        if (this.item != null) {
            int i = 0;
            Iterator<ChartsDataItem> iterator = this.item.iterator();
            while (iterator.hasNext()) {
                ChartsDataItem item = iterator.next();
                JsonObject obj = Json.createObject();
                obj.put("valueX", item.getValueX());
                obj.put("valueY", item.getValueY());
                js.set(i++, obj);
            }
        }
        return js;
    }
}
