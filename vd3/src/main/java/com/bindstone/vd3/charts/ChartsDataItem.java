package com.bindstone.vd3.charts;

/**
 * X/Y Values for mapping in JS
 */
public class ChartsDataItem {

    // Value X
    private String valueX;
    // Value Y
    private Double valueY;

    /**
     * Character DataItem
     */
    public ChartsDataItem() {
    }

    /**
     * Constructor
     *
     * @param valueX value X
     * @param valueY value Y
     */
    public ChartsDataItem(String valueX, Double valueY) {
        this.valueX = valueX;
        this.valueY = valueY;
    }

    /**
     * Getter X
     *
     * @return Value X
     */
    public String getValueX() {
        return valueX;
    }

    /**
     * Setter X
     *
     * @param valueX Value X
     */
    public void setValueX(String valueX) {
        this.valueX = valueX;
    }

    /**
     * Getter Y
     *
     * @return Value Y
     */
    public Double getValueY() {
        return valueY;
    }

    /**
     * Setter Y
     *
     * @param valueY Value Y
     */
    public void setValueY(Double valueY) {
        this.valueY = valueY;
    }
}
