package com.pentalog.pentastagiu.homework2.Shop;

public class TestBasket {
    public static void main(String[] args) {

        Customer noMemebershipCustomer = new Customer(1, "Maria", Customer.Status.NOMEMBERSHIP);
        Customer silverCustomer = new Customer(2, "Ion", Customer.Status.SILVER);
        Customer goldCustomer = new Customer(3, "Vasile", Customer.Status.GOLD);

        Product book = new Book(1, "Agonie si extaz", 50.0, "Irving Stone");

        Product candy = new Candy(1, "Chocotoff", 30.0, 2);

        Basket basket1 = new Basket(noMemebershipCustomer);
        Basket basket2 = new Basket(silverCustomer);
        Basket basket3 = new Basket(goldCustomer);

        basket1.Add(book);
        System.out.println("No membership customer basket price: " + basket1.getTotalPrice());

        basket2.Add(book);
        System.out.println("Silver customer basket price: " + basket2.getTotalPrice());

        basket3.Add(book);
        System.out.println("Gold customer basket price: " + basket3.getTotalPrice());

        basket1.Add(candy);
        System.out.println("No membership customer basket price: " + basket1.getTotalPrice());

        basket2.Add(candy);
        System.out.println("Silver customer basket price: " + basket2.getTotalPrice());

        basket3.Add(candy);
        System.out.println("Gold customer basket price: " + basket3.getTotalPrice());

    }
}