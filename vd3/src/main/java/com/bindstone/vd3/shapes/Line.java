package com.bindstone.vd3.shapes;

import com.bindstone.vd3.SvgContainer;

/**
 * Line Shape
 */
public class Line extends AbstractShape<Line> {
    // 3D.js properties
    public static String positionX = "x1";
    public static String positionY = "y1";
    public static String positionX2 = "x2";
    public static String positionY2 = "y2";
    public static String strokeWidth = "stroke-width";
    public static String stroke = "stroke";

    // SVG Container
    private SvgContainer svg;

    /**
     * Constructor
     *
     * @param svg SVG Container
     */
    public Line(SvgContainer svg) {
        super();
        this.svg = svg;
        this.shape = "line";
    }

    /**
     * Draw Shape in SVG Container
     */
    public void draw() {
        this.svg.drawShape(this);
    }

}
