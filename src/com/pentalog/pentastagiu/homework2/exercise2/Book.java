package com.pentalog.pentastagiu.homework2.exercise2;

public class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + super.getName() + " " + author + " " + super.getPrice();
    }
}
