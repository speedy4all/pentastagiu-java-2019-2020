package com.pentalog.pentastagiu.homework2.ex2;

public class Book extends Product {
    String autor;

    public Book(int id, String name, int price) {
        super(id, name, price);

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
