package com.pentalog.pentastagiu.homework2.shop;

public class Book extends Product {
    private String author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public Book() {
        super();
    }
}
