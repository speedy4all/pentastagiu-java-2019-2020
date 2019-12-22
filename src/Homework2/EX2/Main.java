package Homework2.EX2;

import com.sun.org.apache.xerces.internal.impl.io.UCSReader;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer client1 = new Customer("Andrei", Customer.CustomerType.gold);

        Product p1 = new Product(Product.ProductType.book, 100.00);
        Product p2 = new Product(Product.ProductType.candy, 1.00);
        Product p3 = new Product(Product.ProductType.book, 70.00);
        Product p4 = new Product(Product.ProductType.candy, 0.50);
        List<Product> l1 = new ArrayList<>();
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        l1.add(p4);

        client1.setBasket(l1);
        client1.basketValue();
        System.out.println("Total value basket is: " + client1.basketValue());
    }
}
