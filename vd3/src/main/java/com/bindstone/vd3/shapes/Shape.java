package com.bindstone.vd3.shapes;

import elemental.json.JsonObject;

import java.util.Map;

/**
 * Shape Interface
 */
public interface Shape {

    /**
     * Get Attribute Map
     *
     * @return Attributes
     */
    Map<String, String> getAttributes();

    /**
     * Get Style Map
     *
     * @return Styles
     */
    Map<String, String> getStyles();

    /**
     * Get Shape Name
     *
     * @return Shape Name
     */
    String getShape();

    /**
     * Transform Object to Json
     *
     * @return Json Object
     */
    JsonObject getJson();

}
