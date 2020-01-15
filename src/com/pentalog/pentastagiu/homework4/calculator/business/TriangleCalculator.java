package com.pentalog.pentastagiu.homework4.calculator.business;

import com.pentalog.pentastagiu.homework4.calculator.domain.Triangle;

import javax.swing.*;

public class TriangleCalculator extends Calculator {
    private Triangle t = new Triangle();

    @Override
    public void calculatePerimeter() {
        t.setSideA(Integer.parseInt(JOptionPane.showInputDialog("Side A: ")));
        t.setSideB(Integer.parseInt(JOptionPane.showInputDialog("Side B: ")));
        t.setSideC(Integer.parseInt(JOptionPane.showInputDialog("Side C (base): ")));
        double perimeter = t.getSideA()+t.getSideB()+t.getSideC();
        System.out.println("Triangle perimeter is " + perimeter + ".");
    }

    @Override
    public void calculateArea() {
        t.setHeight(Integer.parseInt(JOptionPane.showInputDialog("Height of the triangle: ")));
        double area = (t.getHeight()*t.getSideC())/2;
        System.out.println("Triangle area is " + area + ".");
    }
}
