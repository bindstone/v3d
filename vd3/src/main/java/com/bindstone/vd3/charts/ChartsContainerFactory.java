package com.bindstone.vd3.charts;

public class ChartsContainerFactory {

    public static ChartsContainer defaultChartsContainer() {
        ChartsContainer container = new ChartsContainer();
        container.setMargin(new Margin(10, 60, 30, 10));

        AxeX axeX = new AxeX();
        axeX.setType(AxeX.SCALE_BAND);
        container.setAxeX(axeX);

        AxeY axeY = new AxeY();
        axeY.setType(AxeY.SCALE_LINEAR);
        axeY.setValueMin(0);
        axeY.setValueMax(25);
        container.setAxeY(axeY);

        return container;
    }
}
