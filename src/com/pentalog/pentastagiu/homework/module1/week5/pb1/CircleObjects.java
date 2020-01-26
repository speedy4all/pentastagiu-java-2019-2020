package com.pentalog.pentastagiu.homework.module1.week5.pb1;

import java.util.Stack;

public class CircleObjects {
    public static void main(String[] args) {
        Stack<Double> circles = new Stack<>();
        double radius = Math.random();
        while (radius > 0.01)
        {
            circles.push(radius);
            radius = Math.random();
        }
        while(!circles.empty())
        {
            System.out.println(circles.pop() * 2 * Math.PI);
        }
    }
}
