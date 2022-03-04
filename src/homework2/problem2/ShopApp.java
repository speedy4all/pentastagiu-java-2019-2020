package homework2.problem2;

import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {
        Customer customerGold = new Customer("Maria", Membership.GOLD);

        Customer customerSilver = new Customer("Ana", Membership.SILVER);

        Customer customer = new Customer( "Dana", Membership.NO_MEMBERSHIP);

        Candy candyOne = new Candy("Oreo", 10.0, 2);
        Candy candyTow = new Candy( "Milka", 20.0, 5);

        Book bookOne = new Book( "Baltagul", 30.0, "Mihail Sadoveanu");
        Book bookTwo = new Book( "Luceafarul", 20.0, "Mihai Eminescu");

        Basket basketOne = new Basket(customerGold);
        Basket basketTwo = new Basket(customerSilver);
        Basket basketThree = new Basket(customer);
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(candyOne);
        products.add(bookOne);
        products.add(candyTow);
        products.add(bookTwo);

        basketOne.addProducts(products);
        System.out.println("The price for " + customerGold.getName() + " which is " + customerGold.getMembership() + " is: " + basketOne.getFinalPrice());

        basketTwo.addProducts(products);
        System.out.println("The price for " + customerSilver.getName() + " which is " + customerSilver.getMembership() + " is: " + basketTwo.getFinalPrice());

        basketThree.addProducts(products);
        System.out.println("The price for " + customer.getName() + " which is " + customer.getMembership() + " is: " + + basketThree.getFinalPrice());


    }

}
