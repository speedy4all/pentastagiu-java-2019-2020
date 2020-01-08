/*package Homework2.EX2;

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
*/

/*
Create a console application from the following requirements:
We have a shop that sells 2 products: books(with info about the author) and candy(with info about the quantity in grams)
A customer will go to this shop and he will choose some items from the shop, in different quantities
Each customer has a membership status, based on which discounts will be applied: GOLD → 20%, SILVER → 10%, no membership → 0%
Create a customer, create products and add them to his basket and print to the console the total price for the products that he ordered
Change the membership of the Customer and print again the total price

Hint example analysis:
What objects can we identify in this scenario? Book, Candy, Customer, Basket
Book and Candy are both products, so we can put in a superclass Product all the common things:
	Product → what does it have? →  id, name, price, …
	Book → what else does it have(except for what we have in Product)? → author
	Candy → what else does it have(except for what we have in Product)? → quantity
Customer: what does it have? → id, name, membership(add enum for the types of membership)
	what can it do? → give us info about the membership of the customer → getter and setter should be implemented
Basket: what does it have?: total price and a Customer(in this way each customer can add products to his basket and ask for info about the price he has to pay)
	what can it do? → update the total price each time a product is added to the basket, get total price that a customer has to pay, based on the type of membership he has
How can we test this?
In a main method:
create a customer
create few products
create a basket associated to our customer
add products to the basket → update the total price of the basket each time a new product is added
get info about the discounted price he has to pay
print to the console this info
change the membership of the customer
print to the console the new discounted price and notice the difference

 */