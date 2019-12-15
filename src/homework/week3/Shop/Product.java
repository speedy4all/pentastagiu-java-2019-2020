package homework.week3.Shop;

public class Product {
    protected int id;
    protected String name;
    protected double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product { " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                " } ";
    }
}
