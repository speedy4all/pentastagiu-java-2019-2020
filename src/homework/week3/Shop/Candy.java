package homework.week3.Shop;

public class Candy extends Product {
    private int quantity;

    Candy(int id, String name, double price, int quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public String toString() {
        return "Book { " +
                "id= " + super.id +
                ", name=' " + super.name + '\'' +
                ", price= " + super.price +
                ", quantity= " + this.quantity +
                " } ";
    }
}
