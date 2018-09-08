package com.bindstone.vd3.charts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ChartsDataSet {

    private Set<ChartDataItem> item;

    public ChartsDataSet() {
        this.item = new HashSet<ChartDataItem>();
    }

    public void add(ChartDataItem item) {
        this.item.add(item);
    }

    public Iterator<ChartDataItem> iterator() {
        return this.item.iterator();
    }

}
