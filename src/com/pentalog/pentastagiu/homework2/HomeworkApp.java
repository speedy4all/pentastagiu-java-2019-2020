package com.pentalog.pentastagiu.homework2;

import com.pentalog.pentastagiu.homework2.exercise1.BankAccount;
import com.pentalog.pentastagiu.homework2.exercise2.*;
import com.pentalog.pentastagiu.homework2.exercise3.Board;
import com.pentalog.pentastagiu.homework2.exercise3.Message;
import com.pentalog.pentastagiu.homework2.exercise3.User;

public class HomeworkApp {
    public static void main(String[] args) {
        exercise1BankAccount();
        exercise2Shop();
        exercise3MessageBoard();
    }

    private static void exercise1BankAccount() {
        BankAccount bankAccount = new BankAccount("John Doe", "$", 50.00);
        System.out.println(bankAccount);

        bankAccount.withdrawal(17.25);
        bankAccount.deposit(25.00);
        bankAccount.withdrawal(100.00);
    }

    private static void exercise2Shop() {
        Product candy1 = new Candy("Candy 1", 5.00, 10);
        Product candy2 = new Candy("Candy 2", 10.00, 2);
        Product candy3 = new Candy("Candy 3", 7.00, 7);

        Product book1 = new Book("Book 1", 15.00, "Author 1");
        Product book2 = new Book("Book 2", 24.00, "Author 2");

        Customer johnDoe = new Customer("John Doe", Membership.SILVER);
        Basket johnsBasket = new Basket(johnDoe);
        johnsBasket.addProduct(candy1);
        johnsBasket.addProduct(book2);
        johnsBasket.addProduct(candy1);

        System.out.println("Silver membership");
        System.out.println("Total price before discount: " + johnsBasket.getPriceBeforeDiscount());
        System.out.println("Total price after discount: " + johnsBasket.getTotalPriceAfterDiscount());

        johnDoe.setMembership(Membership.GOLD);
        System.out.println("Gold membership");
        System.out.println("Total price before discount: " + johnsBasket.getPriceBeforeDiscount());
        System.out.println("Total price after discount: " + johnsBasket.getTotalPriceAfterDiscount());
    }

    private static void exercise3MessageBoard() {
        User user1 = new User("User1", "user1@test.com", "12345");
        User user2 = new User("User2", "user2@test.com", "12345");
        User user3 = new User("User3", "user3@test.com", "12345");

        Board board = new Board();
        board.addUserToBoard(user1);
        board.addUserToBoard(user2);

        board.postMessage(new Message("message1", user1));
        board.postMessage(new Message("message2", user1));
        board.postMessage(new Message("message99", user2));
        board.postMessage(new Message("message99", user3));

        board.printAllMessages();
    }
}
