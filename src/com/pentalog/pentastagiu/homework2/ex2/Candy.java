package ex2;

public class Candy extends Product {

    private int quantity;


    public Candy(int id, String name, double price, int quantity) {
        super(id, name, price);
        this.quantity = quantity;

    }
}
