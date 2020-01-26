package com.pentalog.pentastagiu.homework.module1.week3.Pb2;

public class Book extends ItemForSale {
    private String authorInfo;

    public Book(int price, String name) {
        super(price, name);
    }

    public Book(int price, String name, String authorInfo) {
        super(price, name);
        this.authorInfo = authorInfo;
    }

    public String getAuthorInfo() {
        return authorInfo;
    }

    public void setAuthorInfo(String autorInfo) {
        this.authorInfo = autorInfo;
    }
}
