package com.pentalog.pentastagiu.week3.deposit;

public class Box {
    public static int counterOfBoxes = 0;
    static {
        counterOfBoxes += 5;
        field = printFieldInfo("static field from block");
    }
    public static String field = printFieldInfo("static field");

    private int length = 20;
    private int depth;
    private int height;
    private String color;

    public String instanceField = printFieldInfo("instance field");
    {
        instanceField = printFieldInfo("instance field from block");
    }

    public Box(int length, int depth, int height, String color) {
        this(depth, length, height);
        this.color = color;
    }

    Box() {
        counterOfBoxes++;
        System.out.println("I am the one that overrides default constructor.");
        depth = 10;
        height = 30;
    }

    Box(int depth, int length, int height) {
        counterOfBoxes++;
        System.out.println("I am the custom constructor.");
        this.length = length;
        this.depth = depth;
        this.height = height;
    }

    public static void printInfoAboutBoxes() {
        System.out.println("number of boxes: " + counterOfBoxes);
    }

    public static String printFieldInfo(String value) {
        System.out.println("value: " + value);

        return value;
    }

    public static void modify(Box box) {
        box.length = 100;
    }

    public void modifyLength(int length) {
        length = 25;
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