package src.mndragossh.week3.shop;

public class Book extends Product {
    String author;
    int year;

    public Book(int id, String name, double price, String author, int year) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.year = year;
    }
}
