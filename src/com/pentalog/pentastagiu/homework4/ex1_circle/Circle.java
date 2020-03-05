package com.pentalog.pentastagiu.homework4.ex1_circle;

import java.util.ArrayList;
import java.util.List;

public class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    '}';
        }

        public static void main(String[] args) {
            List<Circle> circles = new ArrayList<>();
            double rand = Math.random() * 10;
            while (rand > 1) {
                double radiusCircle = Math.random() * 10 + 1;
                Circle firstCircle = new Circle(radiusCircle);
                circles.add(firstCircle);
                rand = Math.random() * 10;
            }
            for (Circle iterator : circles) {
                System.out.println("The area of circle is " + iterator.area());
            }
        }
}
