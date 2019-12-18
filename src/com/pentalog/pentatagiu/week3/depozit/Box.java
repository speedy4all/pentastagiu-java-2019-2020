package com.pentalog.pentatagiu.week3.depozit;

public class Box {
    public static int counterofboxes=0;

    public static String fieldStatic=printInfoField("Print static field.");
    static{
        counterofboxes+=5;
        fieldStatic=printInfoField("Print static field from block");
    }
    private int length = 20;
    private int depth;
    private int height;
    private String color;

    public String fieldInstance=printInfoField("Print instance field.");
    {
        fieldStatic=printInfoField("Print instance field from block.");
    }

    Box() {
        counterofboxes++;
        System.out.println("I am the default constructor.");
        depth = 5;
        height = 52;
    }

    Box(int length, int depth, int height) {
        counterofboxes++;
        this.length = length;
        this.depth = depth;
        this.height = height;
        System.out.println("I am the second constructor.");
    }

    Box(int length, int depth, int height, String color) {
        this(length, depth, height);
        this.color = color;
    }

    public static void modify(Box box){
        box.length=100;
    }

    public static void printinfoAboutBoxes(){
        System.out.println("Numeber of boxes : " + counterofboxes);
    }

    public static String printInfoField( String value){
        System.out.println(" value: "+ value);
        return value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", depth=" + depth +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}