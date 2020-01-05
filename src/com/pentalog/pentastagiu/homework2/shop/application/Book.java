package com.pentalog.pentastagiu.homework2.shop.application;

public class Book extends Product {

    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(Integer id, String name, Double price, String author) {
        super(id, name, price);
        this.author = author;
    }
}
