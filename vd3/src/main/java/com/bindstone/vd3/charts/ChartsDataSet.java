package com.bindstone.vd3.charts;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Set of Charts Data Item Set
 */
public class ChartsDataSet {

    // Chart Data Item
    private Set<ChartDataItem> item;

    /**
     * Constructor Creating Set Type LinkedHashSet
     */
    public ChartsDataSet() {
        this.item = new LinkedHashSet<ChartDataItem>();
    }

    /**
     * Add Item
     *
     * @param item item
     */
    public void add(ChartDataItem item) {
        this.item.add(item);
    }

    /**
     * Get Iterator of items
     *
     * @return Iterator
     */
    public Iterator<ChartDataItem> iterator() {
        return this.item.iterator();
    }

}
