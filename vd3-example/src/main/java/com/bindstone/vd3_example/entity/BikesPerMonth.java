package com.bindstone.vd3_example.entity;

import java.time.LocalDate;

public class BikesPerMonth {

    private LocalDate month;
    private String constructor;
    private int sells;

    public BikesPerMonth(LocalDate month, String constructor, int sells) {
        this.month = month;
        this.constructor = constructor;
        this.sells = sells;
    }

    public LocalDate getMonth() {
        return month;
    }

    public void setMonth(LocalDate month) {
        this.month = month;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public int getSells() {
        return sells;
    }

    public void setSells(int sells) {
        this.sells = sells;
    }
}
