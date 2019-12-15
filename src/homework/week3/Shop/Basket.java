package homework.week3.Shop;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products = new ArrayList<>();
    private Customer client;
    private double total;


    Basket(Customer client) {
        this.client = client;
    }

    public void addProduct(Product prod) {
        products.add(prod);
        total += prod.getPrice();
    }

    public double getTotal() {
        return total - calculateTotal();
    }

    public void getProducts() {
        for( Product i: products) {
            System.out.println(i);
        }
    }

    private double calculateTotal() {
        switch (client.getMember()) {
            case GOLD:
                return total * 20/100;
            case SILVER:
                return total * 10/100;
            default:
                return 0;
        }
    }
}
