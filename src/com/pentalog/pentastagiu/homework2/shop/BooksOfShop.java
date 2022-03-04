package com.pentalog.pentastagiu.homework2.shop;

public class BooksOfShop extends ItemsOnSale {

    private String nameOfAuthor;

    public BooksOfShop(double price, String nameOfAuthor) {
        super(price);
        this.nameOfAuthor = nameOfAuthor;
        System.out.println("Book by: "+nameOfAuthor+", price is: "+ price);
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }
}
