package com.bindstone.vd3.charts;

import elemental.json.Json;
import elemental.json.JsonObject;

public class AxeY {
    public static String SCALE_LINEAR = "SCALE_LINEAR";

    private int valueMin;

    private int valueMax;

    private String type;

    // Charts Data Set
    private ChartsDataSet chartsDataSet;

    public int getValueMin() {
        return valueMin;
    }

    public void setValueMin(int valueMin) {
        this.valueMin = valueMin;
    }

    public int getValueMax() {
        return valueMax;
    }

    public void setValueMax(int valueMax) {
        this.valueMax = valueMax;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ChartsDataSet getChartsDataSet() {
        return chartsDataSet;
    }

    public void setChartsDataSet(ChartsDataSet chartsDataSet) {
        this.chartsDataSet = chartsDataSet;
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

        if (this.type != null) {
            rtn.put("type", this.type);
        }

        rtn.put("valueMax", this.valueMax);
        rtn.put("valueMin", this.valueMin);

        return rtn;
    }
}
