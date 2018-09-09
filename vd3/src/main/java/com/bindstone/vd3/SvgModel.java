package com.bindstone.vd3;

import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Polymer Template to communicate with <svg-container.html>
 */
public class SvgModel implements TemplateModel {

    // Height
    private int height;
    // Width
    private int width;

    /**
     * get Height
     *
     * @return value
     */
    public int getHeight() {
        return height;
    }

    /**
     * set Height
     *
     * @param height value
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * get Width
     *
     * @return value
     */
    public int getWidth() {
        return width;
    }

    /**
     * set Width
     *
     * @param width value
     */
    public void setWidth(int width) {
        this.width = width;
    }
}
