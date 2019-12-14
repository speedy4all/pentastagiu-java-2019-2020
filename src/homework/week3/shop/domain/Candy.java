package homework.week3.shop.domain;

public class Candy extends Product {
    private double quantity;//grams

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Candy(int id, String name, double price, double quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\nCandy" + " " +
                ", Id: " + super.getId() + " " +
                ", Name: " + super.getName() + " " +
                ", Price: " + super.getPrice() + " " +
                ", Quantity: " + quantity;
    }
}
