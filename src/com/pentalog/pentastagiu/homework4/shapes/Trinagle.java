package com.pentalog.pentastagiu.homework4.shapes;

public class Trinagle extends  Shapes implements Perimeter, Area{
    private int edge1;
    private int edge2;
    private int edge3;

    public Trinagle(int edge1, int edge2, int edge3){
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    public int getEdge1() {
        return edge1;
    }

    public void setEdge1(int edge1) {
        this.edge1 = edge1;
    }

    public int getEdge2() {
        return edge2;
    }

    public void setEdge2(int edge2) {
        this.edge2 = edge2;
    }

    public int getEdge3() {
        return edge3;
    }

    public void setEdge3(int edge3) {
        this.edge3 = edge3;
    }

    @Override
    public double calculatePerimiter() {
        return edge1+edge2+edge3;
    }

    @Override
    public double calculateArea() {
        return Math.pow((calculatePerimiter()/2*(calculatePerimiter()/2-edge1)*(calculatePerimiter()/2-edge2)*(calculatePerimiter()/2-edge3)), 0.5);
    }

    @Override
    public String toString() {
        return "Triangle edge1: " + String.valueOf(getEdge1()) + " edge2: " + String.valueOf(getEdge2()) + " edge3: " + String.valueOf(getEdge3()) + " Perimiter: " + String.valueOf(calculatePerimiter()) + " Area: " + String.valueOf(calculateArea());
    }
}
