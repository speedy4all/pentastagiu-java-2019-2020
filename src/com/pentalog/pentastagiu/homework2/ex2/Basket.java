package ex2;

import java.util.ArrayList;

public class Basket {
    private double totalPrice = 0;
    private double price = 0;
    private Costumer costumer;
    private ArrayList<Product> products = new ArrayList<>();

    public Basket(Costumer costumer) {
        totalPrice = 0;
        this.costumer = costumer;
    }

    public double getTotalPrice() {
        totalPrice = price;
        if (costumer.getMembership() == Costumer.Membership.GOLD) {
            totalPrice = (totalPrice * 80) / 100;
        } else if (costumer.getMembership() == Costumer.Membership.SILVER) {
            totalPrice = (totalPrice * 90) / 100;
        } else if (costumer.getMembership() == Costumer.Membership.NONE) {
            totalPrice = totalPrice * 1;
        }
        return totalPrice;
    }
    public void addProduct(Product product) {
        products.add(product);
        price += product.getPrice();
        System.out.println("The price of all is :" + price);
    }

}
