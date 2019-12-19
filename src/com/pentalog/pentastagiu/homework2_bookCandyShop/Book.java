package com.pentalog.pentastagiu.homework2_bookCandyShop;

public class Book  extends Product{
    private String authorName;

    //constructors
    public Book() {
    }

    public Book(String productId, String productName, Double price, String authorName) {
        super(productId, productName, price);
        this.authorName = authorName;
    }

    //getters and setters
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                '}';
    }
}
