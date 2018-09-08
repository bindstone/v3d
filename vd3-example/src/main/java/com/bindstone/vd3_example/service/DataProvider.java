package com.bindstone.vd3_example.service;

import com.bindstone.vd3_example.entity.BikesPerMonth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public static List<BikesPerMonth> getAll() {
        List<BikesPerMonth> rtn = new ArrayList<>();
        rtn.add(new BikesPerMonth(LocalDate.of(2018, 1, 1), "Harley Davidson", 10));
        rtn.add(new BikesPerMonth(LocalDate.of(2018, 2, 1), "Harley Davidson", 4));
        rtn.add(new BikesPerMonth(LocalDate.of(2018, 3, 1), "Harley Davidson", 3));
        rtn.add(new BikesPerMonth(LocalDate.of(2018, 4, 1), "Harley Davidson", 21));
        rtn.add(new BikesPerMonth(LocalDate.of(2018, 5, 1), "Harley Davidson", 15));
        rtn.add(new BikesPerMonth(LocalDate.of(2018, 6, 1), "Harley Davidson", 13));
        return rtn;
    }
}
