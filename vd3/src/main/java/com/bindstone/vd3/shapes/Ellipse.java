package com.bindstone.vd3.shapes;

import com.bindstone.vd3.SvgContainer;

/**
 * Ellipse Shape
 */
public class Ellipse extends AbstractShape<Ellipse> {
    // 3D.js properties
    public static String positionX = "cx";
    public static String positionY = "cy";
    public static String width = "rx";
    public static String height = "ry";
    public static String strokeWidth = "stroke-width";
    public static String stroke = "stroke";
    public static String fill = "fill";

    // SVG Container
    private SvgContainer svg;

    /**
     * Constructor
     *
     * @param svg SVG Container
     */
    public Ellipse(SvgContainer svg) {
        super();
        this.svg = svg;
        this.shape = "ellipse";
    }

    /**
     * Draw Shape in SVG Container
     */
    public void draw() {
        this.svg.drawShape(this);
    }

}
