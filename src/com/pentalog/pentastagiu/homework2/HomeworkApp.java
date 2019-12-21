package com.pentalog.pentastagiu.homework2;

import static com.pentalog.pentastagiu.homework2.Membership.GOLD;

public class HomeworkApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        System.out.println(account.getBalance());
        account.withdraw(10.5);
        System.out.println(account.getBalance());
        account.deposit(100);
        System.out.println(account.getBalance());
        account.withdraw(15);
        System.out.println(account.getBalance());

        Customer customer = new Customer(1, "Andrei");
        Basket basket = new Basket(customer);
        Product chocolateTruffle = new Candy(1, "Chocolate Truffle", 13.2, 12);
        Product harryPotter =
                new Book(2, "Harry Potter and the Order of the Phoenix", 100, "J.K. Rowling");
        Product jellyTots = new Candy(3, "Jelly Tots", 5.7, 80);

        basket.addProduct(chocolateTruffle);
        basket.addProduct(harryPotter);
        basket.addProduct(jellyTots);

        System.out.println("Customer " + customer.getName() + " has to pay: " + basket.getPrice());

        customer.setMembership(GOLD);
        System.out.println("Customer " + customer.getName() + " has to pay: " + basket.getPrice());

        Board board = new Board();
        User student = new User(1, "best-student", "student@gmail.com");
        User professor = new User(2, "number-one-professor", "professor@university.com");

        board.addMessage(new Message(1, "Hi! I have a problem with homework.", student));
        board.addMessage(new Message(2, "Hi! What kind of problem do you have?", professor));
        board.addMessage(new Message(3, "I can't solve first problem!", student));
        board.addMessage(new Message(4, "Why?", professor));
        board.addMessage(new Message(5, "I don't understand what Java means.", student));
        board.addMessage(new Message(6, "See you at the next session!", professor));

        board.printMessages();
    }
}
