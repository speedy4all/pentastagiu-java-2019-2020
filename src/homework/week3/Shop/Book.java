package homework.week3.Shop;


public class Book extends Product {

    private String author;

    Book(int id, String name, double price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book { " +
                "id= " + super.id +
                ", name=' " + super.name + '\'' +
                ", price= " + super.price +
                ", author=' " + this.author +
                " ' } ";
    }
}