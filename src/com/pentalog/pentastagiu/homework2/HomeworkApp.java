package com.pentalog.pentastagiu.homework2;

public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println("The com.pentalog.pentastagiu.homework2 package should be used to commit all your classes related to homework 2");
        //p1
        Account acc1 = new Account(200, "$", "SS");
        acc1.printOwnerAndAmount();
        acc1.widthdrawAmount(100);
        acc1.depositAmount(50);
        acc1.widthdrawAmount(300);

        //p3
        App user1 = new App();
        user1.register("lali", "lali@y.com");
        App user2 = new App();
        user2.register("lali2", "lali2@y.com");
        user1.publishMessage("test message!!!!!!!!!!", "descri1");
        user2.publishMessage("test message!!!!!!!!!!", "descrip2");

        //p2
        Basket basket = new Basket();
        Customer customer = new Customer("Mark", basket);
        Book book1 = new Book("Podul de lut", 25, "Markus Zusak");
        Book book2 = new Book("Everything is fucked", 49, "Markus Manson");
        Candy candy1 = new Candy("candy cane", 8, 3);
        Candy candy2 = new Candy("jellies", 16, 4);
        Candy candy3 = new Candy("marshmallows", 46, 8);
        basket.addToCart(book1.getPrice());
        basket.addToCart(book1.getPrice());
        basket.addToCart(candy2.getPrice());
        basket.addToCart(candy1.getPrice());
        System.out.println("Your order : " + basket.getPriceToPay("GOLD"));
        System.out.println("Changed membership for customer " + customer.getName());
        System.out.println("Your order : " + basket.getPriceToPay("SILVER"));
    }
}
