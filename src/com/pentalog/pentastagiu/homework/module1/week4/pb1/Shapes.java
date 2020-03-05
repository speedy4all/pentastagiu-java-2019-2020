package com.pentalog.pentastagiu.homework.module1.week4.pb1;

public abstract class Shapes{
    protected abstract double calculatePerimeter();
    protected abstract double calculateArea();

    public Shapes compareTo(Shapes other)
    {
        return (calculateArea() > other.calculateArea()) ? this : other;
    }
}
