package com.pentalog.pentastagiu.homework2.PR2;

public class Book extends Product {
    private String description;
    private String author;

    public Book(int id, String name, int price, int quantity, String description, String author) {
        super(id, name, price, quantity);
        this.description = description;
        this.author = author;
    }

    public String moreDetails() {
        return "Description of the book:" + description + "\nWritten by " + author;
    }

    @Override
    public String toString() {
        return "#" + id + "- " + name + " at the price of " + price + " lei. Available items: " + quantity;

    }
}
