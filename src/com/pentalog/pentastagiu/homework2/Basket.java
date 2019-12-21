package com.pentalog.pentastagiu.homework2;

public class Basket {
    private int totalPrice;

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addToCart(int priceOfAddedProd) {
        totalPrice += priceOfAddedProd;
        System.out.println("The price of your order was updated to: " + totalPrice);
    }

    public double getPriceToPay(String membership) {
        double finalPrice = 0.00;
        switch (membership) {
            case "GOLD":
                finalPrice = totalPrice - 0.2 * totalPrice;
                break;
            case "SILVER":
                finalPrice = totalPrice - 0.1 * totalPrice;
                break;
            default:
                finalPrice = totalPrice;
                break;
        }
        return finalPrice;
    }


}
