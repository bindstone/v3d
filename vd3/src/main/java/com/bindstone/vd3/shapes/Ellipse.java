package com.bindstone.vd3.shapes;

import com.bindstone.vd3.SvgContainer;

public class Ellipse extends AbstractShape<Ellipse> {
    public static String form = "ellipse";
    public static String positionX = "cx";
    public static String positionY = "cy";
    public static String width = "rx";
    public static String height = "ry";
    public static String strokeWidth="stroke-width";
    public static String stroke="stroke";
    public static String fill="fill";

    private SvgContainer svg;

    public Ellipse(SvgContainer svg) {
        super();
        this.svg = svg;
    }

    public void draw() {
        this.svg.draw(form, getAttributes());
    }

}
