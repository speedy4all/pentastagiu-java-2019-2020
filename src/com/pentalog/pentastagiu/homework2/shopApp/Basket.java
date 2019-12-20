package com.pentalog.pentastagiu.homework2.shopApp;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Product> basketProducts = new ArrayList<>();

    public void addToBasket(Product product)
    {
        basketProducts.add(product);
    }

    public void setBasketProducts(List<Product> basketProducts) {
        this.basketProducts = basketProducts;
    }

    public List<Product> getBasketProducts() {
        return basketProducts;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basketProducts='" + basketProducts + '}';
    }

    public static double getPrice(List<Product> products, double discount) {
        double price = 0;
        for (Product product : products) {
            price += product.getPrice();
        }
        //scadere discount din pret, daca exista
        return price - ( price * discount );
    }
}
