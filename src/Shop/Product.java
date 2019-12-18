package Shop;

public class Product {
    protected int ID;
    protected String name;
    protected double price;

    public Product(int ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product :" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                "lei";
    }
}
