package com.bindstone.vd3.charts;

public class ChartDataItem {

    private String valueX;
    private Double valueY;

    public ChartDataItem() {
    }

    public ChartDataItem(String valueX, Double valueY) {
        this.valueX = valueX;
        this.valueY = valueY;
    }

    public String getValueX() {
        return valueX;
    }

    public void setValueX(String valueX) {
        this.valueX = valueX;
    }

    public Double getValueY() {
        return valueY;
    }

    public void setValueY(Double valueY) {
        this.valueY = valueY;
    }
}
