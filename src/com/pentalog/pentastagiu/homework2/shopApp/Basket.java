package com.pentalog.pentastagiu.homework2.shopApp;

public class Basket {
	
	private Customer customer;
    private double totalPrice;

    public Basket(Customer customer) {
        this.customer = customer;
    }

    public void UpdateTotalPrice(double price)
    {
        totalPrice += price;
    }

    public double GetTotalPrice()
    {
        double percent = 0;
        double total;
        switch (customer.getMembership())
        {
            case GOLD:
                percent = 0.2;
                break;
            case SILVER:
                percent = 0.1;
                break;
            case NO:
                percent = 0.0;
                break;
        }
        total = totalPrice - totalPrice*percent;
        return total;
    }

    public void AddToBasket(Products product)
    {
        this.UpdateTotalPrice(product.getPrice());
    }


}
