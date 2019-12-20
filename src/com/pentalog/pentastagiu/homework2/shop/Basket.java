package com.pentalog.pentastagiu.homework2.shop;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Product, Integer> basket;

    Basket() {
        basket = new HashMap<>();
    }

    public Map<Product, Integer> getBasket() {
        return basket;
    }

    public void addProduct(Product product) {
        if (basket.containsKey(product)) {
            basket.put(product, basket.get(product) + 1);
        } else
            basket.put(product, 1);
    }

    public void addProduct(Product product, int quantity) {
        if (basket.containsKey(product)) {
            basket.put(product, basket.get(product) + quantity);
        } else
            basket.put(product, quantity);
    }
}
