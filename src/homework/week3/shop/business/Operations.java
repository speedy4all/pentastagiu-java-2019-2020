package homework.week3.shop.business;

import homework.week3.shop.domain.*;

public class Operations {

    private Customer c1 = new Customer(1, "John", 0.1);
    private Product p1 = new Book(23, "Carrie", 36.7, "Steven King");
    private Product p2 = new Candy(57, "Chupa Chups", 1.2, 45.3);
    private Product p3 = new Book(2, "Impreuna", 48.3, "Anna Gavalda");

    private double priceCalculator() {
        double price = p1.getPrice() + p2.getPrice() + p3.getPrice();
        return price - price * c1.getDiscount();
    }

    public void addToBasket() {
        Basket b1 = new Basket();
        b1.setCustomer(c1);
        b1.setTotalPrice(priceCalculator());
        System.out.println("Customer " + c1 + "\nHas in his basket: " + "\n" + p1 + "\n" + p2 + "\n" + p3 + "\n" + "Total price: " + priceCalculator());
    }
}


