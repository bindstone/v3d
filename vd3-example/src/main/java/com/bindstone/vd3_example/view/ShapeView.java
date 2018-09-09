package com.bindstone.vd3_example.view;

import com.bindstone.vd3.SvgContainer;
import com.bindstone.vd3.shapes.Circle;
import com.bindstone.vd3.shapes.Ellipse;
import com.bindstone.vd3.shapes.Line;
import com.bindstone.vd3.shapes.Rectangle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("shape")
@BodySize(height = "100vh", width = "100vw")
public class ShapeView extends VerticalLayout {

    public ShapeView() {
        SvgContainer svgContainer = new SvgContainer(300, 300);

        Button btnCircle = new Button("draw circle");
        btnCircle.addClickListener(buttonClickEvent -> {
            new Circle(svgContainer)
                    .addAttribute(Circle.positionY, 30)
                    .addAttribute(Circle.positionX, 30)
                    .addAttribute(Circle.radius, 30)
                    .addAttribute(Circle.fill, "purple")
                    .draw();
        });

        Button btnRecangle = new Button("draw rectangle");
        btnRecangle.addClickListener(buttonClickEvent -> {
            new Rectangle(svgContainer)
                    .addAttribute(Rectangle.positionY, 100)
                    .addAttribute(Rectangle.positionX, 100)
                    .addAttribute(Rectangle.height, 30)
                    .addAttribute(Rectangle.width, 30)
                    .draw();
        });

        Button btnEllipse = new Button("draw ellipse");
        btnEllipse.addClickListener(buttonClickEvent -> {
            new Ellipse(svgContainer)
                    .addAttribute(Ellipse.positionY, 30)
                    .addAttribute(Ellipse.positionX, 30)
                    .addAttribute(Ellipse.height, 80)
                    .addAttribute(Ellipse.width, 80)
                    .addAttribute(Ellipse.stroke, "green")
                    .addAttribute(Ellipse.strokeWidth, 2)
                    .addAttribute(Ellipse.fill, "yellow")
                    .draw();
        });

        Button btnLine = new Button("draw line");
        btnLine.addClickListener(buttonClickEvent -> {
            new Line(svgContainer)
                    .addAttribute(Line.positionY, 70)
                    .addAttribute(Line.positionX, 70)
                    .addAttribute(Line.positionY2, 100)
                    .addAttribute(Line.positionX2, 100)
                    .addAttribute(Line.stroke, "red")
                    .addAttribute(Line.strokeWidth, 2)
                    .draw();
        });

        Button btnTriangle = new Button("draw triangle");
        btnTriangle.addClickListener(buttonClickEvent -> {
            new Line(svgContainer)
                    .addAttribute(Line.positionY, 100)
                    .addAttribute(Line.positionX, 160)
                    .addAttribute(Line.positionY2, 100)
                    .addAttribute(Line.positionX2, 200)
                    .addAttribute(Line.stroke, "blue")
                    .addAttribute(Line.strokeWidth, 2)
                    .draw();
            new Line(svgContainer)
                    .addAttribute(Line.positionY, 50)
                    .addAttribute(Line.positionX, 180)
                    .addAttribute(Line.positionY2, 100)
                    .addAttribute(Line.positionX2, 200)
                    .addAttribute(Line.stroke, "blue")
                    .addAttribute(Line.strokeWidth, 2)
                    .draw();
            new Line(svgContainer)
                    .addAttribute(Line.positionY, 100)
                    .addAttribute(Line.positionX, 160)
                    .addAttribute(Line.positionY2, 50)
                    .addAttribute(Line.positionX2, 180)
                    .addAttribute(Line.stroke, "blue")
                    .addAttribute(Line.strokeWidth, 2)
                    .draw();
        });


        this.add(new Label("SVG POC"));
        HorizontalLayout hl = new HorizontalLayout();
        hl.add(btnCircle, btnRecangle, btnEllipse, btnLine, btnTriangle);
        this.add(hl);
        this.add(svgContainer);
    }
}
