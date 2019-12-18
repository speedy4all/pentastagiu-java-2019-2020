package Shop;

public class Books extends Product {
    protected String author;

    public Books(int ID, String name, double price, String author) {
        super(ID, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books: " +
                " name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", ID=" + ID +
                ", price=" + price +
                '.';
    }
}


