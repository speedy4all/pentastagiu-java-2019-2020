package com.pentalog.pentastagiu.homework2;

public class Basket {

    private double totalPrice = 0;
    private Customer customer;

    public Basket(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double addCandy(Candy candy){
        totalPrice  += candy.getPrice()*candy.getQuantity();
        return priceForMembership(totalPrice);

}

    public double addBook(Book book){
        totalPrice  += book.getPrice();
        return priceForMembership(totalPrice);
    }

    public double priceForMembership(double price){
        if(customer.getStatus() == membershipStatus.GOLD){
            totalPrice -= price*0.2;
            return totalPrice;
        }else if (customer.getStatus() == membershipStatus.SILVER){
            totalPrice -= totalPrice*0.1;
            return totalPrice;
        }else{
            return totalPrice;
        }
    }

}
