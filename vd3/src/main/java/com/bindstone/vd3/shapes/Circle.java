package com.bindstone.vd3.shapes;

import com.bindstone.vd3.SvgContainer;

public class Circle extends AbstractShape<Circle> {
    public static String form = "circle";
    public static String positionX = "cx";
    public static String positionY = "cy";
    public static String radius = "r";

    private SvgContainer svg;

    public Circle(SvgContainer svg) {
        super();
        this.svg = svg;
    }

    public void draw() {
        this.svg.draw(form, getAttributes());
    }

}
