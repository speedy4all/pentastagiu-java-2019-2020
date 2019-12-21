package homework2.problem2;

public class Candy extends Product {

    private double quantity;

   public Candy(int id, String name, double price, double quantity){
        super(id, name, price);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
