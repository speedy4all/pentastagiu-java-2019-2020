package com.pentalog.pentastagiu.homework2.ConsoleApp;

public class MainApp {
    public static void main(String[] args) {
        Customer FirstCustomer=new Customer("Tomoiaga Horatiu","SILVER");
        Candy TootsieRoll=new Candy(20,"TootsieRoll",10);
        Product Masa=new Product(10,"MASA");
        Book Wu=new Book(30,"Wu","Mark");
        Basket FirstBasket=new Basket();
        FirstBasket.customer=FirstCustomer;
        FirstBasket.AddProduct(TootsieRoll);
        FirstBasket.AddProduct(Masa);
        System.out.println("You have to pay "+ FirstBasket.getTotalPrice());
        FirstCustomer.setMembership("GOLD");
        System.out.println("You have to pay "+ FirstBasket.getTotalPrice());

    }
}
