package com.pentalog.pentastagiu.homework3;

import com.pentalog.pentastagiu.homework3.shapes.Circle;
import com.pentalog.pentastagiu.homework3.shapes.Rectangle;
import com.pentalog.pentastagiu.homework3.shapes.Square;
import com.pentalog.pentastagiu.homework3.shapes.Triangle;

import java.text.DecimalFormat;

public class HomeworkApp {
    public static void main(String[] args) {
        Circle c = new Circle(6);
        c.getArea();
        c.getPerimeter();

        Square s = new Square(5,5);
        s.getArea();
        s.getPerimeter();

        Rectangle r = new Rectangle(4,6);
        r.getArea();
        r.getPerimeter();

        Triangle t = new Triangle(4,7);
        t.getArea();
        t.getPerimeter();

        DecimalFormat df = new DecimalFormat(".##");
        double biggestArea = Math.max(c.getArea(), Math.max(s.getArea(), Math.max(r.getArea(), t.getArea())));

        System.out.println("Biggest Area: " + df.format(biggestArea));




    }
}
