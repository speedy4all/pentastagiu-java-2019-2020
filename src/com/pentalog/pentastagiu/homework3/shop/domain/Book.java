package com.pentalog.pentastagiu.homework3.shop.domain;

public class Book extends Product {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int id, String name, double price, String author) {
        super(id, name, price);
        this.author = author;
    }

    @Override
    public String toString() {
        return "\nBook:" + " " +
                ", Id: " + super.getId() + " " +
                ", Name: "+ super.getName() + " " +
                ", Price: " + super.getPrice() + " " +
                ", Author: " + author;
    }
}
