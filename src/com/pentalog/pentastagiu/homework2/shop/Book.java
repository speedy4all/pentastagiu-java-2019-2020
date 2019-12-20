package com.pentalog.pentastagiu.homework2.shop;

public class Book extends Product {
    private String author;

    public Book(String name, String author, float price) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }
}
