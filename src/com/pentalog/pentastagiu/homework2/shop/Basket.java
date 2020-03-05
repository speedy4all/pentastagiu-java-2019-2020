package com.pentalog.pentastagiu.homework2.shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private static int totalPrice;
    private static Customer customerBakset;
    public static List<Product> basketProductsList= new ArrayList<>();

    public Basket(Customer customer) {
        this.customerBakset = customer;
        this.totalPrice = 0;
    }

    public  int getTotalPrice(){
        if(customerBakset.getUserMembership() == Customer.Membership.GOLD){
            refreshPrice();
            totalPrice *= 0.8;
        }
        if (customerBakset.getUserMembership() == Customer.Membership.SILVER){
            refreshPrice();
            totalPrice *= 0.9;
        }
        if (customerBakset.getUserMembership() == Customer.Membership.NOMEMBERSHIP){
            refreshPrice();
            totalPrice *= 1;

        }
        return totalPrice;
    }
    public static void addProduct(Product product){
        basketProductsList.add(product);
        updateFinalPrice(product);
    }

    public static void updateFinalPrice(Product product){
        totalPrice += product.getPrice();
    }

    private void refreshPrice(){
        totalPrice = 0;
        for(Product p: basketProductsList){
            updateFinalPrice(p);
        }
    }





}
