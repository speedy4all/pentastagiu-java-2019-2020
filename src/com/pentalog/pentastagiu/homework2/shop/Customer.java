package com.pentalog.pentastagiu.homework2.shop;

import java.util.Iterator;
import java.util.Map;

public class Customer {
    private static int customerCounter;
    private int id;
    private String name;
    private Membership membership;
    private Basket basket;
    private double totalPurchaseHistory;

    public Customer(String name) {
        id = ++customerCounter;
        this.name = name;
        basket = new Basket();
        membership = Membership.DEFAULT;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Membership getMembership() {
        return membership;
    }

    public void displayDiscount() {
        System.out.println("Discount is: " + membership.getDiscountPercentage() + "%");
    }

    public void addProductInBasket(Product p) {
        basket.addProduct(p);
    }

    public void addProductInBasket(Product p, int quantity) {
        basket.addProduct(p, quantity);
    }

    public void displayTotal() {
        float total = 0;
        for (Map.Entry<Product, Integer> product : basket.getBasket().entrySet()) {
            total += product.getKey().getPrice() * product.getValue();
        }
        float sumWithDiscount = total - total * membership.getDiscountPercentage() / 100;
        System.out.println("Total is: " + sumWithDiscount + " Discount:" + membership.getDiscountPercentage() + "%");
    }

    public void purchase() {
        float total = 0;
        Iterator<Map.Entry<Product, Integer>> productIterator = basket.getBasket().entrySet().iterator();
        while (productIterator.hasNext()) {
            Map.Entry<Product, Integer> product = productIterator.next();
            total += product.getKey().getPrice() * product.getValue();
            productIterator.remove();
        }
        float sumWithDiscount = total - total * membership.getDiscountPercentage() / 100;
        System.out.println("Total is: " + sumWithDiscount + " Discount: " + membership.getDiscountPercentage() + "%");
        System.out.println("Purchase complete.");
        totalPurchaseHistory += sumWithDiscount;
        updateMembership();
    }

    public void updateMembership() {
        if (totalPurchaseHistory >= 5000 && totalPurchaseHistory < 10000 && membership != Membership.SILVER) {
            membership = Membership.SILVER;
            System.out.println("Congratulations! You have now a SILVER Membership");
        } else if (totalPurchaseHistory >= 10000 && membership != Membership.GOLD) {
            membership = Membership.GOLD;
            System.out.println("Congratulations! You have now a GOLD Membership");
        }
    }


}
