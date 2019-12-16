package com.pentalog.pentastagiu.homework2;

public class DemoProduct {

    public static void main(String[] args) {


        Customer user1 = new Customer(1, "Popa Andrei", Customer.Tier.GOLD);
        Product book1 = new Book ("Ion", 304, 30, "Liviu Rebreanu");
        Product sugar = new Candy ("Sugar", 33, 3, 5 );

        System.out.println(user1.toString());

        Basket basket = new Basket(user1);

        System.out.println(book1.toString());

        basket.Add(book1);
        System.out.println("The new price after adding: " + basket.getTotalPrice());

        System.out.println(sugar.toString());

        basket.Add(sugar);
        System.out.println("The new price after adding: " + basket.getTotalPrice());






    } }
