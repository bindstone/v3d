package com.bindstone.vd3.shapes;

import elemental.json.Json;
import elemental.json.JsonArray;
import elemental.json.JsonObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Abstract Shape Class containing Attribute and Style list
 *
 * @param <T> Shape to extends
 */
public abstract class AbstractShape<T> implements Shape {
    // Shape property of D3.js
    protected String shape;
    // Shape attributes of D3.js
    private Map<String, String> attributes;
    // Shape styles of D3.js
    private Map<String, String> styles;

    /**
     * Constructor
     */
    public AbstractShape() {
        this.attributes = new HashMap<String, String>();
        this.styles = new HashMap<String, String>();
    }

    /**
     * Add Attribute
     * @param key key
     * @param object object
     * @return Shape Object
     */
    public T addAttribute(String key, String object) {
        attributes.put(key, object);
        return (T) this;
    }

    /**
     * Add Attribute
     * @param key key
     * @param object object
     * @return Shape Object
     */
    public T addAttribute(String key, int object) {
        attributes.put(key, String.valueOf(object));
        return (T) this;
    }

    /**
     * Add Style
     *
     * @param key    key
     * @param object object
     * @return Shape Object
     */
    public T addStyle(String key, String object) {
        styles.put(key, object);
        return (T) this;
    }

    /**
     * Add Style
     *
     * @param key    key
     * @param object object
     * @return Shape Object
     */
    public T addStyle(String key, int object) {
        styles.put(key, String.valueOf(object));
        return (T) this;
    }

    /**
     * Get Attribute Map
     * @return Attributes
     */
    public Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * Get Style Map
     *
     * @return Styles
     */
    public Map<String, String> getStyles() {
        return styles;
    }

    /**
     * Get Shape Name
     *
     * @return Shape Name
     */
    public String getShape() {
        return this.shape;
    }

    /**
     * Methode to draw shape to SVG container
     */
    public abstract void draw();

    /**
     * Transform Object to Json
     *
     * @return Json Object
     */
    public JsonObject getJson() {
        JsonObject rtn = Json.createObject();
        // Shape
        rtn.put("shape", shape);

        // Styles
        JsonArray stl = Json.createArray();
        int countStl = 0;
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            JsonObject obj = Json.createObject();
            obj.put(entry.getKey(), entry.getValue());
            stl.set(countStl++, obj);
        }
        rtn.put("styles", stl);

        // Attributes
        JsonArray attr = Json.createArray();
        int countAttr = 0;
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            JsonObject obj = Json.createObject();
            obj.put(entry.getKey(), entry.getValue());
            attr.set(countAttr++, obj);
        }
        rtn.put("attributes", attr);

        return rtn;
    }
}
