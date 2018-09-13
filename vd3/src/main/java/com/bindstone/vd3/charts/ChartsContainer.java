package com.bindstone.vd3.charts;

import elemental.json.Json;
import elemental.json.JsonObject;

/**
 * Charts main container
 */
public class ChartsContainer {

    // Margins inside of SVG
    private Margin margin;
    // Axe X
    private AxeX axeX;
    // Axe Y
    private AxeY axeY;
    // Dataset
    private ChartsDataSet dataSet;

    /**
     * Getter Margin
     *
     * @return value
     */
    public Margin getMargin() {
        return margin;
    }

    /**
     * Setter Margin
     *
     * @param margin value
     */
    public void setMargin(Margin margin) {
        this.margin = margin;
    }

    /**
     * Getter Axe X
     *
     * @return value
     */
    public AxeX getAxeX() {
        return axeX;
    }

    /**
     * Setter Axe X
     *
     * @param axeX value
     */
    public void setAxeX(AxeX axeX) {
        this.axeX = axeX;
    }

    /**
     * Getter Y
     *
     * @return value
     */
    public AxeY getAxeY() {
        return axeY;
    }

    /**
     * Setter Y
     *
     * @param axeY value
     */
    public void setAxeY(AxeY axeY) {
        this.axeY = axeY;
    }

    /**
     * Getter Charts Data Set
     *
     * @return value
     */
    public ChartsDataSet getDataSet() {
        return dataSet;
    }

    /**
     * Setter Charts Data Set
     *
     * @param dataSet value
     */
    public void setDataSet(ChartsDataSet dataSet) {
        this.dataSet = dataSet;
    }

    /**
     * Get Json Object
     *
     * @return Json Object
     */
    public JsonObject getJson() {

        JsonObject rtn = Json.createObject();
        if (this.margin != null) {
            rtn.put("margin", this.margin.getJson());
        }
        if (this.axeX != null) {
            rtn.put("axeX", this.axeX.getJson());
        }
        if (this.axeY != null) {
            rtn.put("axeY", this.axeY.getJson());
        }
        if (this.dataSet != null) {
            rtn.put("data", dataSet.getJson());
        }

        return rtn;
    }
}
