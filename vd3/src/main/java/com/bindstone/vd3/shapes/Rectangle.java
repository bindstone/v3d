package com.bindstone.vd3.shapes;

import com.bindstone.vd3.SvgContainer;

/**
 * Rectangle Shape
 */
public class Rectangle extends AbstractShape<Rectangle> {
    // 3D.js properties
    public static String positionX = "x";
    public static String positionY = "y";
    public static String width = "width";
    public static String height = "height";
    public static String fill = "fill";

    // SVG Container
    private SvgContainer svg;

    /**
     * Constructor
     *
     * @param svg SVG Container
     */
    public Rectangle(SvgContainer svg) {
        super();
        this.svg = svg;
        this.shape = "rect";
    }

    /**
     * Draw Shape in SVG Container
     */
    public void draw() {
        this.svg.drawShape(this);
    }

}
