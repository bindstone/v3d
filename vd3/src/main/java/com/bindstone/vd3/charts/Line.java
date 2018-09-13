package com.bindstone.vd3.charts;

import elemental.json.Json;
import elemental.json.JsonObject;

/**
 * Charts Line
 */
public class Line {

    // Charts Data Set
    private ChartsDataSet chartsDataSet;
    // Line Color
    private String color;

    /**
     * Constructor
     */
    public Line() {
        this.chartsDataSet = new ChartsDataSet();
    }

    /**
     * Get Charts Data Set
     *
     * @return data
     */
    public ChartsDataSet getChartsDataSet() {
        return chartsDataSet;
    }

    /**
     * Set Charts Data Set
     *
     * @param chartsDataSet data
     */
    public void setChartsDataSet(ChartsDataSet chartsDataSet) {
        this.chartsDataSet = chartsDataSet;
    }

    /**
     * Get Color line
     *
     * @return Color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set Color line
     *
     * @param color Color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get Json Object
     *
     * @return Json Object
     */
    public JsonObject getJson() {
        JsonObject rtn = Json.createObject();

        // add X/Y to Json
        if (this.chartsDataSet != null) {
            rtn.put("data", chartsDataSet.getJson());
        }

        // add color to Json
        if (color != null) {
            rtn.put("color", color);
        }

        return rtn;
    }
}
