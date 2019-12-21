package com.pentalog.pentastagiu.homework2.ConsoleApp;

public class Book extends Product {
    private String Author;

    Book(int Price,String Name,String Author){
        super(Price,Name);
        this.Author=Author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        Author = this.Author;
    }
}
