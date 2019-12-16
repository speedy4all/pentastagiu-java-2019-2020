package com.pentalog.pentastagiu.homework2;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private Integer bascketId;
    private Double totalPrice;
    private Customer customer;
    private List<Product> products = new ArrayList<>();

    public Double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    //Every client has associated an basket where he is adding the products
    //He can buy one by one
    public void add(Product product){
        getProducts().add(product);

        double discountPerProd = product.getPrice()*customer.getMembership().getDiscount();
        setTotalPrice(getTotalPrice()+product.getPrice() - discountPerProd);

        List<String> productsNames = new ArrayList<>();
        for(int i=0; i<getProducts().size(); i++){
            productsNames.add(getProducts().get(i).getProdName());
        }

        System.out.println("The products from bascket are: " + productsNames.toString().replace("[", "").replace("]", ""));
        System.out.println("The total price is: " + getTotalPrice());
    }

    public Basket(Integer bascketId, Double totalPrice, Customer customer) {
        this.customer = customer;
        this.bascketId = bascketId;
        this.totalPrice = totalPrice;
    }
}
