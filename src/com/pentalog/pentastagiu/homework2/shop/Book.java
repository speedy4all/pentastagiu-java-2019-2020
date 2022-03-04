package com.pentalog.pentastagiu.homework2.shop;

public class Book extends Product{
//    private int id;
//    private String name;
//    private float price;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(){
    }

    public Book(int id, String name, float price, String author){
        super(id, name, price);
        this.author = author;
    }

    public String toString(){
        return super.toString() + ", " + getAuthor();
    }
}
