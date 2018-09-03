package com.bindstone.vd3;

import com.bindstone.vd3.tools.MapToJson;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.shared.Registration;

import java.util.Map;

@Tag("svg-container")
@HtmlImport("components/svg-container.html")
public class SvgContainer extends PolymerTemplate<SvgModel> {

    public SvgContainer(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    public Registration addClickListener(ComponentEventListener<ClickEvent> listener) {
        return addListener(ClickEvent.class, listener);
    }

    public void setHeight(int height) {
        getModel().setHeight(height);
    }

    public void setWidth(int width) {
        getModel().setWidth(width);
    }

    public void draw(String form, Map<String, String> attributes) {
        getElement().callFunction("draw", form, MapToJson.generate(attributes));
    }

    @DomEvent("click-me")
    public static class ClickEvent extends ComponentEvent<SvgContainer> {
        public ClickEvent(SvgContainer source, boolean fromClient) {
            super(source, fromClient);
        }
    }
}
