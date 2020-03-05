package com.pentalog.pentastagiu.homework2.shop;

public class ShopApp {
    public static void main(String[] args) {

        // Create customer
        Customer testCustomer = new Customer(1, "John", Customer.Membership.GOLD);

        //-	create few products
        Product product1 = new Book(1, "Poems", 50, "Shakespeare");
        Product product2 = new Book(2, "Clean Code", 100, "Bob Martin");
        Candy product3 = new Candy(3, "M&Ms", 10, 50);
        Candy product4 = new Candy(4, "Pepito", 25, 15);

        //-	create a basket associated to our customer

        Basket basketCustomer1 = new Basket(testCustomer);

        /**- add products to the basket → update the total price of the basket each time a new product is added
         - get info about the discounted price he has to pay
         - print to the console this info */


        basketCustomer1.addProduct(product1);
        basketCustomer1.addProduct(product2);
        basketCustomer1.addProduct(product3);
        basketCustomer1.addProduct(product4);

        System.out.println("Customer " + testCustomer.getName().toString() + " with the new membership " + testCustomer.getUserMembership() +
                " has total price after discounts: " + basketCustomer1.getTotalPrice());

        //-	change the membership of the customer
        testCustomer.setUserMembership(Customer.Membership.NOMEMBERSHIP);

        //-	print to the console the new discounted price
        System.out.println("Customer " + testCustomer.getName().toString() + " with the new membership " + testCustomer.getUserMembership()
                + "  has total price: " + basketCustomer1.getTotalPrice());

    }
}
