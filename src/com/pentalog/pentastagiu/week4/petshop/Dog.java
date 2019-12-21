package com.pentalog.pentastagiu.week4.petshop;

import com.pentalog.pentastagiu.week3.petshop.Animal;

public class Dog extends Animal {
    private boolean trained;

    public Dog(String name, int age, int price) {
        super(name, age, price);
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark!");
    }
}
