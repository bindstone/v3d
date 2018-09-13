package com.bindstone.vd3_example.view;

import com.bindstone.vd3.SvgContainer;
import com.bindstone.vd3.charts.ChartsContainer;
import com.bindstone.vd3.charts.ChartsContainerFactory;
import com.bindstone.vd3.charts.ChartsDataItem;
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

        // SVG
        SvgContainer svgContainer = new SvgContainer(400, 600);

        // Chart Data
        ChartsDataSet data = new ChartsDataSet();
        for (BikesPerMonth bikesPerMonth : DataProvider.getAll()) {
            data.add(new ChartsDataItem(bikesPerMonth.getMonth().toString(), new Double(bikesPerMonth.getSells())));
        }

        // Chart Container
        ChartsContainer chartsContainer = ChartsContainerFactory.defaultChartsContainer();
        chartsContainer.setDataSet(data);
        svgContainer.draw(chartsContainer);

        // Chart Line
        Line line = new Line();
        line.setColor("green");
        line.setChartsDataSet(data);
        svgContainer.draw(line);

        // Grid Table
        Grid<BikesPerMonth> grid = new Grid<>();
        grid.setItems(DataProvider.getAll());

        grid.addColumn(BikesPerMonth::getMonth).setHeader("Month");
        grid.addColumn(BikesPerMonth::getConstructor).setHeader("Constructor");
        grid.addColumn(BikesPerMonth::getSells).setHeader("Bikes sold");

        // Panel
        HorizontalLayout hl = new HorizontalLayout();
        hl.add(grid, svgContainer);
        hl.setSizeFull();
        this.add(hl);
    }
}
