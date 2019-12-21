package com.pentalog.pentastagiu.week3.petshop;

public class Cat extends Animal {
    private String color;

/*    public Cat() {
        System.out.println("I am the constructor from cat");
    }*/

    public Cat(String name, int age, int price, String color) {
        super(name, age, price);
        this.color = color;
    }

    public void printInfoAboutCat() {
        System.out.println(super.name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
