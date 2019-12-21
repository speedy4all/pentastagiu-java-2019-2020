package homework2.problem2;

import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {
        Customer customerGold = new Customer(1, "Maria", Membership.GOLD);

        Customer customerSilver = new Customer(2, "Ana", Membership.SILVER);

        Customer customer = new Customer(3, "Dana", Membership.NO_MEMBERSHIP);

        Candy candyOne = new Candy(1, "Oreo", 10.0, 2);
        Candy candyTow = new Candy(2, "Milka", 20.0, 5);

        Book bookOne = new Book(3, "Baltagul", 30.0, "Mihail Sadoveanu");
        Book bookTwo = new Book(4, "Luceafarul", 20.0, "Mihai Eminescu");

        Basket basketOne = new Basket(0.0, customerGold);
        Basket basketTwo = new Basket(0.0, customerSilver);
        Basket basketThree = new Basket(0.0, customer);
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(candyOne);
        products.add(bookOne);
        products.add(candyTow);
        products.add(bookTwo);

        basketOne.addProduct(products);
        System.out.println("The price for " + customerGold.getName() + " which is " + customerGold.getMembership() + " is: " + basketOne.getFinalPrice());

        basketTwo.addProduct(products);
        System.out.println("The price for " + customerSilver.getName() + " which is " + customerSilver.getMembership() + " is: " + basketTwo.getFinalPrice());

        basketThree.addProduct(products);
        System.out.println("The price for " + customer.getName() + " which is " + customer.getMembership() + " is: " + + basketThree.getFinalPrice());


    }

}
