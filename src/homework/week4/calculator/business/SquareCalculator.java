package homework.week4.calculator.business;

import homework.week4.calculator.domain.Square;

import javax.swing.*;

public class SquareCalculator extends Calculator {
    private Square s = new Square();

    @Override
    public void calculatePerimeter() {
        s.setSide(Integer.parseInt(JOptionPane.showInputDialog("Side: ")));
        double perimeter = 4*s.getSide();
        System.out.println("Square perimeter is " + perimeter + ".");
    }

    @Override
    public void calculateArea() {
        double area = s.getSide()*s.getSide();
        System.out.println("Square area is " + area + ".");
    }
}
