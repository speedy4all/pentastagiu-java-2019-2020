package com.pentalog.pentastagiu.homework2;

public class Book extends Product {
    public String author;

    Book(String name, int price, String author) {
        super(name, price);
        this.author = author;
    }
}
