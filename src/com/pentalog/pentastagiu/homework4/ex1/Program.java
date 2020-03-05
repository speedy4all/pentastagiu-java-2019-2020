package com.pentalog.pentastagiu.homework4.ex1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Program {

    public static void main(String[] args) {
        Circle circle = new Circle(15.3);
        Square square = new Square(15.3);
        Rectangle rectangle = new Rectangle(15.3, 10.3);
        Triangle triangle = new Triangle(15.3, 15.3, 15.3);

        Map<IShapeMethods, Double> shapes = new HashMap();
        shapes.put(circle, circle.calculateArea());
        shapes.put(square, square.calculateArea());
        shapes.put(rectangle, rectangle.calculateArea());
        shapes.put(triangle, triangle.calculateArea());

        double maxArea = 0;

        Collection<Double> areasCollection = shapes.values();
        Double[] areas = areasCollection.toArray(new Double[areasCollection.size()]);

        for (int i = 0; i < areas.length; i++) {
            if (maxArea < areas[i]) {
                maxArea = areas[i];
            }
        }

        for (Entry<IShapeMethods, Double> entry : shapes.entrySet()) {
            if (entry.getValue().equals(maxArea)) {
                entry.getKey().getInfo();
            }
        }

    }

}

