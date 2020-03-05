package com.pentalog.pentastagiu.homework.module1.week4.pb2;

public class Test {
    public static void main(String[] args) {
        Restaurant vegie = new Vegetarian(100);
        Restaurant KFC = new FastFood(20);
        KFC.newGuests(20);
        vegie.newGuests(10);
        System.out.println(vegie.calculateTaxes());
        System.out.println(KFC.calculateTaxes());
        Vegetarian.setDiscountPercentage(30);
        System.out.println(vegie.calculateTaxes());
        System.out.println(KFC.calculateTaxes());
    }
}
