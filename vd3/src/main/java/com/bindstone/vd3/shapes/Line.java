package com.bindstone.vd3.shapes;

import com.bindstone.vd3.SvgContainer;

public class Line extends AbstractShape<Line> {
    public static String form = "line";
    public static String positionX = "x1";
    public static String positionY = "y1";
    public static String positionX2 = "x2";
    public static String positionY2 = "y2";
    public static String strokeWidth="stroke-width";
    public static String stroke="stroke";

    private SvgContainer svg;

    public Line(SvgContainer svg) {
        super();
        this.svg = svg;
    }

    public void draw() {
        this.svg.draw(form, getAttributes());
    }

}
