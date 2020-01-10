package homework.week4.calculator.business;

import homework.week4.calculator.domain.Rectangle;

import javax.swing.*;

public class RectangleCalculator extends Calculator {
    private Rectangle r = new Rectangle();

    @Override
    public void calculatePerimeter() {
        r.setLength(Integer.parseInt(JOptionPane.showInputDialog("Length: ")));
        r.setWidth(Integer.parseInt(JOptionPane.showInputDialog("Width: ")));
        double perimeter = 2*(r.getLength()+r.getWidth());
        System.out.println("Rectangle perimeter is " + perimeter + ".");
    }

    @Override
    public void calculateArea() {
        double area = r.getLength()*r.getWidth();
        System.out.println("Rectangle area is " + area + ".");
    }
}
