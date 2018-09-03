package com.bindstone.vd3.shapes;

import com.bindstone.vd3.SvgContainer;

public class Rectangle extends AbstractShape<Rectangle> {
    public static String form = "rect";
    public static String positionX = "x";
    public static String positionY = "y";
    public static String width = "width";
    public static String height = "height";

    private SvgContainer svg;

    public Rectangle(SvgContainer svg) {
        super();
        this.svg = svg;
    }

    public void draw() {
        this.svg.draw(form, getAttributes());
    }

}
