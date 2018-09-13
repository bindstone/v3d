package com.bindstone.vd3;

import com.bindstone.vd3.charts.ChartsContainer;
import com.bindstone.vd3.charts.Line;
import com.bindstone.vd3.shapes.Shape;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * Vaadin Polymer Template: SVG Container
 */
@Tag("svg-container")
@HtmlImport("components/svg-container.html")
public class SvgContainer extends PolymerTemplate<SvgModel> {

    /**
     * Constuctor of SVG Container
     *
     * @param height Height
     * @param width  Width
     */
    public SvgContainer(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    /**
     * Setter Height
     * @param height Height
     */
    public void setHeight(int height) {
        getModel().setHeight(height);
    }

    /**
     * Setter Width
     * @param width Width
     */
    public void setWidth(int width) {
        getModel().setWidth(width);
    }

    /**
     * Draw a shape (Remote JS-Script)
     *
     * @param shape Shape
     */
    public void drawShape(Shape shape) {
        getElement().callFunction("drawShape", shape.getJson());
    }

    /**
     * Draw a line (Remote JS-Script)
     * @param line Line
     */
    public void draw(Line line) {
        getElement().callFunction("drawLine", line.getJson());
    }

    /**
     * Draw a Charts Container (Remote JS-Script)
     * @param container Charts Container
     */
    public void draw(ChartsContainer container) {
        getElement().callFunction("drawContainer", container.getJson());
    }
}
