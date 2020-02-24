package com.pentalog.pentastagiu.homework2.PR2;

public class Basket {
    private int BasketId;
    private Product produs;
    private static int totalPrice = 0;

    public Basket() {
    }


    public Basket(Product product, int total, int BasketId) {
        this.produs = product;
        this.totalPrice += total;
        this.BasketId = BasketId;
    }

    public static int getTotal() {
        return totalPrice;
    }

    public static void setTotalPrice(int totalPrice) {
        Basket.totalPrice = totalPrice;
    }

    public void printBasket() {


            System.out.println(produs.toString1());
    }


}
