package com.pentalog.pentastagiu.homework3.ex1;
import java.util.Scanner;
public abstract class Shape {
    protected double area;
    protected double perimeter;
    Scanner sc= new Scanner(System.in);
    public abstract double calculateArea();
    public abstract double calculatePermieter();
}
