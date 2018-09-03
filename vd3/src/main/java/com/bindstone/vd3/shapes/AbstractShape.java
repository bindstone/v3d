package com.bindstone.vd3.shapes;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractShape<T> {

    private Map<String, String> attributes;

    public AbstractShape() {
        this.attributes = new HashMap<String, String>();
    }

    public T addAttribute(String key, String object) {
        attributes.put(key, object);
        return (T) this;
    }

    public T addAttribute(String key, int object) {
        attributes.put(key, String.valueOf(object));
        return (T) this;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public abstract void draw();
}
