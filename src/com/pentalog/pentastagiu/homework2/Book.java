package com.pentalog.pentastagiu.homework2;

public class Book extends Product{

    private String isbn;
    private String author;
    private Integer noPages;

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getNoPages() {
        return noPages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNoPages(Integer noPages) {
        this.noPages = noPages;
    }

    public Book(Integer productId, String prodName, Double price, Shop shop, String isbn, String author, Integer noPages) {
        super(productId, prodName, price, shop);
        this.isbn = isbn;
        this.author = author;
        this.noPages = noPages;
    }
}
