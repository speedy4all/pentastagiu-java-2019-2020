package homework2.problem2;

public class Candy extends Product {

    private double quantity;

   public Candy(String name, double price, double quantity){
        super(name, price);
        if (quantity < 0){
            throw new IllegalArgumentException();
        }
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * quantity;
    }


}
