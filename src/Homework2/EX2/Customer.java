package Homework2.EX2;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private CustomerType type;

    enum CustomerType {
        gold,
        silver,
        noMembership
    }
public Customer(){
        this.customerName = "";
        this.type = CustomerType.noMembership;
} ///constructor

    public Customer(String customerName, CustomerType type ){
        this.customerName = customerName;
        this.type = type;
    }

    List<Product> basket = new ArrayList<>();

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
    this.basket = basket;
    }

    public void addProductsToBasket(List<Product> clientBasket) {
        this.basket.addAll(clientBasket);

    }

    public double basketValue() {
        double sum = 0;
        for (int i = 0; i < basket.size(); i++) {
            sum += basket.get(i).getPrice();
        }
        return sum * getDiscount() / 100;
    }

    private int getDiscount() {
        double discount = 0;
        if (this.getType().equals(CustomerType.gold))
            return 20;
        else
            return 10;
    }

}
