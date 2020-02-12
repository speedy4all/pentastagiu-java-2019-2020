package com.pentalog.pentastagiu.homework4.shapes;

public class Circle extends Shapes implements Perimeter, Area{
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(){
        System.out.println("Enter a parameter");
    }

    public Circle(float radius){
        this.radius = radius;
    }



    @Override
    public String toString() {
        return "Circle radius: " + String.valueOf(getRadius()) + " Perimiter: " + String.valueOf(calculatePerimiter()) + " Area: " + String.valueOf(calculateArea());
    }

    @Override
    public double calculatePerimiter() {
        return 2*this.radius*Math.PI;
    }

    @Override
    public double calculateArea(){return Math.PI*Math.pow(this.radius, 2);}




}
