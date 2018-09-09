package com.bindstone.vd3.charts;

import elemental.json.Json;
import elemental.json.JsonArray;
import elemental.json.JsonObject;

import java.util.Iterator;

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
            int i = 0;
            JsonArray js = Json.createArray();
            Iterator<ChartDataItem> iterator = this.chartsDataSet.iterator();
            while (iterator.hasNext()) {
                ChartDataItem item = iterator.next();
                JsonObject obj = Json.createObject();
                obj.put("valueX", item.getValueX());
                obj.put("valueY", item.getValueY());
                js.set(i++, obj);
            }
            rtn.put("data", js);
        }

        // add color to Json
        if (color != null) {
            rtn.put("color", color);
        }

        return rtn;
    }
}
