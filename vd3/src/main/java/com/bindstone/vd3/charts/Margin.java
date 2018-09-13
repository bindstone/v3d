package com.bindstone.vd3.charts;

import elemental.json.Json;
import elemental.json.JsonObject;

/**
 * Margin object
 */
public class Margin {

    // Margin Top
    private int top;
    // Margin Bottom
    private int bottom;
    // Margin Left
    private int left;
    // Margin Right
    private int right;

    /**
     * Default Constructor
     */
    public Margin() {
    }

    /**
     * Constructor with initialization
     *
     * @param top    top
     * @param bottom bottom
     * @param left   left
     * @param right  right
     */
    public Margin(int top, int bottom, int left, int right) {
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }

    /**
     * Getter Top
     *
     * @return value
     */
    public int getTop() {
        return top;
    }

    /**
     * Setter Top
     *
     * @param top value
     */
    public void setTop(int top) {
        this.top = top;
    }

    /**
     * getter Bottom
     *
     * @return value
     */
    public int getBottom() {
        return bottom;
    }

    /**
     * Setter Bottom
     *
     * @param bottom value
     */
    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    /**
     * Getter Left
     *
     * @return value
     */
    public int getLeft() {
        return left;
    }

    /**
     * Setter Left
     *
     * @param left value
     */
    public void setLeft(int left) {
        this.left = left;
    }

    /**
     * Getter Right
     *
     * @return value
     */
    public int getRight() {
        return right;
    }

    /**
     * Setter Right
     *
     * @param right value
     */
    public void setRight(int right) {
        this.right = right;
    }

    /**
     * Transform Object to Json
     *
     * @return Json Object
     */
    public JsonObject getJson() {

        JsonObject rtn = Json.createObject();
        rtn.put("top", this.top);
        rtn.put("bottom", this.bottom);
        rtn.put("left", this.left);
        rtn.put("right", this.right);

        return rtn;
    }
}
