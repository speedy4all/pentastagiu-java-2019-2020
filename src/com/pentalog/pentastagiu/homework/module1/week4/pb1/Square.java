package com.pentalog.pentastagiu.homework.module1.week4.pb1;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                '}';
    }
}
