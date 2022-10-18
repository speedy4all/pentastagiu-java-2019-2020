package com.pentalog.pentastagiu.homework4.calculator.main;

import com.pentalog.pentastagiu.homework4.calculator.business.CircleCalculator;
import com.pentalog.pentastagiu.homework4.calculator.business.RectangleCalculator;
import com.pentalog.pentastagiu.homework4.calculator.business.SquareCalculator;
import com.pentalog.pentastagiu.homework4.calculator.business.TriangleCalculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CircleCalculator CC = new CircleCalculator();
        TriangleCalculator TC = new TriangleCalculator();
        RectangleCalculator RC = new RectangleCalculator();
        SquareCalculator SC = new SquareCalculator();

        int option;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("OPTIONS\nPlease select the shape that you want to calculate perimeter and area for:" + "\n1. Circle" + "\n2. Triangle" + "\n3. Rectangle" + "\n4. Square" + "\n5. Exit"));
            switch (option) {
                case 1:
                    CC.calculatePerimeter();
                    CC.calculateArea();
                    break;
                case 2:
                    TC.calculatePerimeter();
                    TC.calculateArea();
                    break;
                case 3:
                    RC.calculatePerimeter();
                    RC.calculateArea();
                    break;
                case 4:
                    SC.calculatePerimeter();
                    SC.calculateArea();
                    break;
                case 5:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid action!");
                    break;
            }
        } while (option != 5);
    }
}
