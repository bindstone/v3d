package com.bindstone.vd3_example.view;

import com.bindstone.vd3.SvgContainer;
import com.bindstone.vd3.charts.ChartDataItem;
import com.bindstone.vd3.charts.ChartsDataSet;
import com.bindstone.vd3.charts.Line;
import com.bindstone.vd3_example.entity.BikesPerMonth;
import com.bindstone.vd3_example.service.DataProvider;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("")
@BodySize(height = "100vh", width = "100vw")
public class MainView extends VerticalLayout {

    public MainView() {
        SvgContainer svgContainer = new SvgContainer(400, 600);

        Line line = new Line();
        ChartsDataSet data = new ChartsDataSet();
        for (BikesPerMonth bikesPerMonth : DataProvider.getAll()) {
            data.add(new ChartDataItem(bikesPerMonth.getMonth().toString(), new Double(bikesPerMonth.getSells())));
        }
        line.setColor("green");
        line.setChartsDataSet(data);
        svgContainer.draw(line);

        Grid<BikesPerMonth> grid = new Grid<>();
        grid.setItems(DataProvider.getAll());

        grid.addColumn(BikesPerMonth::getMonth).setHeader("Month");
        grid.addColumn(BikesPerMonth::getConstructor).setHeader("Constructor");
        grid.addColumn(BikesPerMonth::getSells).setHeader("Bikes sold");

        HorizontalLayout hl = new HorizontalLayout();
        hl.add(grid, svgContainer);
        hl.setSizeFull();
        this.add(hl);
    }
}
