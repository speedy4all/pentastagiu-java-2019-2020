package AppRestaurant;

public class Menu {
    double  price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Menu(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "price=" + price +
                '}';
    }
}
