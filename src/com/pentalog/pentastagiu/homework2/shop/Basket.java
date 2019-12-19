package com.pentalog.pentastagiu.homework2.shop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private Customer customer;
    private List<Product> product = new ArrayList<>();
    private double totalPrice = 0;

    public List<Product> getProduct() {
        return product;
    }

    public void basketTotal(double price){
        totalPrice += price;
        System.out.println(totalPrice);
    }

    public String getPriceWithDiscount(Customer customer){
        DecimalFormat df = new DecimalFormat(".##");
        double percent = 0;
        double total;
        switch(customer.getMembership()){
            case NOMEMBERSHIP:
                percent = 0.0;
                break;
            case SILVER:
                percent = 0.1;
                break;
            case GOLD:
                percent = 0.2;
                break;
        }
        total = totalPrice - (totalPrice * percent);
        System.out.println("Membership price: " + df.format(total));
        return df.format(total);
    }

    public void addProducts(Product product) {
        getProduct().add(product);

        List<String> productsInBasket = new ArrayList<>();

        for (int i=0; i<getProduct().size(); i++){
            productsInBasket.add(getProduct().get(i).getName());
        }

        System.out.print("Products from basket: " +
                productsInBasket.toString().replace("[", "").replace("]", "") +
                " and the total price is: ");
        this.basketTotal(product.getPrice());
    }
}
