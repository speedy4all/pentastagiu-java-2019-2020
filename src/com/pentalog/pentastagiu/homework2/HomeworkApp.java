package com.pentalog.pentastagiu.homework2;

import java.util.Scanner;

public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println("The com.pentalog.pentastagiu.homework2 package should be used to commit all your classes related to homework 2");

        //1st ex
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        bankAccount.setCurrentAmount(500);

        int choice = 0;
        while (choice != 3){
            System.out.println("What do you want to do? For withdrawals enter 1, for deposits enter 2, and for exit press 3: ");
            choice = scanner.nextInt();

            if (choice == 3){
                break;
            }
            System.out.println("Please enter the amount: ");
            double amount = scanner.nextDouble();

            if (choice == 1){
                bankAccount.withdraw(amount);
            } else if (choice == 2) {
                bankAccount.deposit(amount);
            }
        }

        //2nd ex
        Customer customer1 = new Customer(1, "John");

        Product product1 = new Product(1, "lipstick", 10);
        Product product2 = new Product(2, "brush", 13);
        Product product3 = new Product(3, "chair", 60);
        Book book1 = new Book(4, "Attitude is everything", 50, "Jeff Keller");
        Book book2 = new Book(5, "How successful people think", 60,"John Maxwell");
        Book book3 = new Book(6, "Harry Potter", 45, "J.K");
        Candy candy1 = new Candy(7, "chocolate", 5, 80);
        Candy candy2 = new Candy(8, "buble gums", 13, 120);
        Candy candy3 = new Candy(9, "cake", 20, 250);

        Basket basket1 = new Basket(customer1);
        basket1.addProducts(product1.getPrice());
        basket1.addProducts(book2.getPrice());
        basket1.addProducts(book1.getPrice());
        basket1.addProducts(candy1.getPrice());

        basket1.getTotalPrice();
        basket1.getFinalPrice("WITHOUT");
        basket1.getTotalPrice();
        basket1.getFinalPrice("SILVER");

        //3rd ex
        User user1 = new User("Mark", "mark@gmail.com");
        Message message1 = new Message(user1);
        message1.setAuthor("Mark T");
        message1.setDescription("Everything is alright!");
        message1.sendMessage();

        User user2 = new User("anca200", "anca@gmail.com");
        Message message2 = new Message(user2);
        message2.setDescription("Hello there!");
        message2.setAuthor("Anca");
        message2.sendMessage();
    }
}
