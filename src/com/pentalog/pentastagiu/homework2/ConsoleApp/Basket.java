package com.pentalog.pentastagiu.homework2.ConsoleApp;

public class Basket {
    private static float TotalPrice ;
    Customer customer;

    public void AddProduct(Product product)
    {
        TotalPrice = TotalPrice + product.getPrice();

    }
    public float getTotalPrice() {
        if(customer.getMembership()=="GOLD")
        return (TotalPrice- TotalPrice*(2.0f/10));
        else
            if(customer.getMembership()=="SILVER")
                return (TotalPrice-TotalPrice*(1.0f/10));
            else
                return TotalPrice;
    }
}
