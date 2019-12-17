package src.mndragossh.week3;

import src.mndragossh.week3.bankaccount.BankAccount;
import src.mndragossh.week3.shop.*;

public class MnDragosshMainW3 {
    public static void main(String[] args) {
//        BankAccount account = new BankAccount(40);
//        account.withdraw(30);
//        account.deposit(60);
//        account.displayAmount();

        double finalPrice = 0.0;

        Product book1 = new Book(1, "The Philosopher's Stone", 25.0, "J. K. Rowling", 1997);
        Product book2 = new Book(2, "The Chamber of Secrets", 30.0, "J. K. Rowling", 1998);
        Product book3 = new Book(3, "The Prisoner of Azkaban", 27.0, "J. K. Rowling", 1999);
        Product candy1 = new Candy(1, "Lifesavers", 10, 100);
        Product candy2 = new Candy(2, "M&M's", 20, 500);
        Product candy3 = new Candy(3, "Laffy Taffy", 11, 400);

        Customer meAsCustomer = new Customer(1, "mndragossh");
        Basket basket = new Basket(meAsCustomer);

        basket.addToBasket(book1);
        basket.addToBasket(book2);
        finalPrice = basket.getTotalPrice();
        System.out.println("First time calculated");
        System.out.println(finalPrice);

        basket.addToBasket(candy1);
        System.out.println("Second time calculated");
        finalPrice = basket.getTotalPrice();
        System.out.println(finalPrice);

        /**
         * this should work
         * basket.removeFromBasket(candy1);
         */

        meAsCustomer.setMembership(Membership.Gold);
        finalPrice = basket.getTotalPrice();
        System.out.println("After changing membership");
        System.out.println(finalPrice);

    }
}
