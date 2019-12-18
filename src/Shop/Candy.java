package Shop;

public class Candy extends Product{
    protected double quantity;

    public Candy(int ID, String name, double price, double quantity) {
        super(ID, name, price);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Candy: " +
                " name='" + name + '\'' +
                ", quantity=" + quantity +
                ", ID=" + ID +
                ", price=" + price +
                '.';
    }
}
