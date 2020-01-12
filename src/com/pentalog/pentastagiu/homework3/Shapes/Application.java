package com.pentalog.pentastagiu.homework3.Shapes;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> Shapes = new ArrayList();

        Circle firstCircle = new Circle();
        firstCircle.setRadius(1);
        firstCircle.setyPosition(2);
        firstCircle.setxPosition(5);
        Shapes.add(firstCircle);


        Rectangle firstRectangle = new Rectangle();
        firstRectangle.setLenght(10);
        firstRectangle.setWidth(5);
        Shapes.add(firstRectangle);

        Square firstSquare = new Square();
        firstSquare.setLength(5);
        Shapes.add(firstSquare);

        Triangle firstTriangle = new Triangle();
        firstTriangle.setFirstSide(2);
        firstTriangle.setSecondSide(4);
        firstTriangle.setThirdSide(5);
        Shapes.add(firstTriangle);
        double maxArea = 0;
        int maxPostion = 0;
        int i = 0;
        while (i < Shapes.size()) {
            if (Shapes.get(i).getArea() > maxArea) {
                maxArea = Shapes.get(i).getArea();
                maxPostion = i;
            }
            i++;
        }
        System.out.println(Shapes.get(maxPostion).toString());
    }
}
