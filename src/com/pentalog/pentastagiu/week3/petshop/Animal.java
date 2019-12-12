package com.pentalog.pentastagiu.week3.petshop;

public class Animal {
    protected String name;
    private int age;
    private int price;

    public Animal() {
        System.out.println("I am the constructor from animal");
    }

    public Animal(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
