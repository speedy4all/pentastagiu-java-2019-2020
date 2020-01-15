package com.pentalog.pentastagiu.homework4.calculator.business;

import com.pentalog.pentastagiu.homework4.calculator.domain.Circle;
import com.pentalog.pentastagiu.homework4.calculator.domain.Shape;

import javax.swing.*;

public class CircleCalculator extends Calculator {
    private Shape s = new Circle();
    private Circle c = (Circle) s;

    @Override
    public void calculatePerimeter() {
        c.setRadius(Integer.parseInt(JOptionPane.showInputDialog("Circle radius: ")));
        double perimeter = c.getPI()*c.getRadius()*2;
        System.out.println("Circle perimeter is " + perimeter + ".");
    }

    @Override
    public void calculateArea() {
        double area = c.getPI()*c.getRadius()*c.getRadius();
        System.out.println("Circle perimeter is " + area + ".");
    }
}
