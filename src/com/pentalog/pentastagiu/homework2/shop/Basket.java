package com.pentalog.pentastagiu.homework2.shop;


import com.pentalog.pentastagiu.homework2.shop.customermembership.MembershipType;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private int totalPrice;
    private List<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        totalPrice += product.getPrice();
        products.add(product);
    }

    public int getTotalFinalPrice(MembershipType membershipType) {
        int finalPrice = 0;
        switch (membershipType) {
            case GOLD:
                finalPrice += totalPrice - totalPrice * 20 / 100;
                break;
            case SILVER:
                finalPrice += totalPrice - totalPrice * 10 / 100;
                break;
            default:
                finalPrice += totalPrice;

        }
        return finalPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "totalPrice=" + totalPrice +
                ", products=" + products +
                '}';
    }
}
