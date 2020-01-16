package com.pentalog.pentastagiu.homework2.shop;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Product, Integer> productsByQuantity;

    Basket() {
        productsByQuantity = new HashMap<>();
    }

    public Map<Product, Integer> getProductsByQuantity() {
        return productsByQuantity;
    }

    public void addProduct(Product product, int quantity) {
        if (productsByQuantity.containsKey(product)) {
            productsByQuantity.put(product, productsByQuantity.get(product) + quantity);
        } else
            productsByQuantity.put(product, quantity);
    }

    public void addProduct(Product product) {
        addProduct(product, 1);
    }
}
