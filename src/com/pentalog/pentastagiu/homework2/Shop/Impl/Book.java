package com.pentalog.pentastagiu.homework2.Shop.Impl;

import com.pentalog.pentastagiu.homework2.Shop.Product;

public class Book extends Product {

    private String author;

    public Book(long id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' + super.toString() +
                '}';
    }
}
