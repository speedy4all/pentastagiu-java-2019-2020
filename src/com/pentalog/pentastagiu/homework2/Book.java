package com.pentalog.pentastagiu.homework2;

public class Book extends Product {

    private String author;

    public Book(String name, int ID, double price, String author) {
        super(name,ID, price);
        this.author = author;
    }

    @Override

    public String toString() {
        return "Book name: " + getName() +
                " \nID: " + getID() +
                "\nPrice: " + getPrice() +
                "\nAuthor: " + author;

    }



}

