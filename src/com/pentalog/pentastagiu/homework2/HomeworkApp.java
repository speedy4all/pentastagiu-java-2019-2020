package com.pentalog.pentastagiu.homework2;

import java.util.Scanner;

public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println("The com.pentalog.pentastagiu.homework2 package should be used to commit all your classes related to homework 2");

        //1st ex
        BankAccount bankAccount = new BankAccount(100);
        Scanner scanner = new Scanner(System.in);

        Integer choice = null;
        double amount;
        while (choice == null) {
            try {
                System.out.println("What do you want to do? For withdrawals enter 1, for deposits enter 2, and for exit press 3: ");
                choice = Integer.parseInt(scanner.next());
                switch (choice) {
                    case 3:
                        break;
                    case 1:
                        System.out.println("Please enter the amount: ");
                        amount = scanner.nextDouble();
                        bankAccount.withdraw(amount);
                        break;
                    case 2:
                        System.out.println("Please enter the amount: ");
                        amount = scanner.nextDouble();
                        bankAccount.deposit(amount);
                        break;
                    default:
                        System.out.println("This option doesn`t exist!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }
        }


        //2nd ex

        Customer customer1 = new Customer("John", Customer.Membership.GOLD);

        Book book1 = new Book("Attitude is everything", 50, "Jeff Keller");
        Book book2 = new Book("How successful people think", 60, "John Maxwell");
        Book book3 = new Book("Harry Potter", 45, "J.K");

        Candy candy1 = new Candy("chocolate", 5, 80);
        Candy candy2 = new Candy("buble gums", 13, 120);
        Candy candy3 = new Candy("cake", 20, 250);

        Basket basket1 = new Basket(customer1);
        basket1.addProduct(book2);
        basket1.addProduct(book1);
        basket1.addProduct(candy3);
        basket1.addProduct(candy1);
        basket1.addProduct(candy2);
        basket1.addProduct(book3);
        basket1.getFinalPrice(customer1);
        customer1.setMembership(Customer.Membership.SILVER);
        basket1.getFinalPrice(customer1);


        System.out.println("Add a new customer.\n Please enter the name of the customer: ");
        String nameCustomer = scanner.next();
        Integer status = null;
        Customer customer = new Customer();
        while (status == null) {
            System.out.println("Choose customer's membership status => For GOLD enter 1, for SILVER enter 2, NO membership enter 3, and for exit press 4: ");
            try {
                status = Integer.parseInt(scanner.next());
                switch (status) {
                    case 4:
                        break;
                    case 1:
                        customer = new Customer(nameCustomer, Customer.Membership.GOLD);
                        break;
                    case 2:
                        customer = new Customer(nameCustomer, Customer.Membership.SILVER);
                        break;
                    default:
                        customer = new Customer(nameCustomer, Customer.Membership.WITHOUT);
                        break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Wrong info!");
            }
        }

        Basket basket = new Basket(customer);
        Book book;
        Candy candy;
        String bookName;
        double bookPrice;
        String author;

        String candyName;
        double candyPrice;
        double candyQuantity;

        System.out.println("Create new products~~~\nFor books => enter 1 ~~~ For Candies => enter 2 ~~~ For exit => enter 3.");
        Integer productChoice = null;
        while (productChoice == null) {
            try {
                productChoice = Integer.parseInt(scanner.next());
                switch (productChoice) {
                    case 3:
                        break;
                    case 1:
                        System.out.println("Enter the title of the book: ");
                        bookName = scanner.next();
                        System.out.println("Enter the price: ");
                        bookPrice = scanner.nextDouble();
                        System.out.println("Enter the author: ");
                        author = scanner.next();
                        book = new Book(bookName, bookPrice, author);
                        basket.addProduct(book);
                        basket.getFinalPrice(customer);
                        break;
                    case 2:
                        System.out.println("Enter the name of the candy: ");
                        candyName = scanner.next();
                        System.out.println("Enter the quantity in grams: ");
                        candyQuantity = scanner.nextDouble();
                        System.out.println("Enter the price: ");
                        candyPrice = scanner.nextDouble();
                        candy = new Candy(candyName, candyPrice, candyQuantity);
                        basket.addProduct(candy);
                        basket.getFinalPrice(customer);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            } catch (NumberFormatException exc) {
                System.out.println("Wrong info!");

            }
        }

        //3rd ex
//        User user1 = new User("Mark", "mark", "mark@gmail.com");
//        Message message1 = new Message("Everything is alright!", user1);
//        message1.sendMessage();
//
//        User user2 = new User("Anca","anca200", "anca@gmail.com");
//        Message message2 = new Message("Hello there!", user2);
//        message2.sendMessage();

        System.out.println("Let's register!!\nEnter the name:");
        String userName = scanner.next();
        System.out.println("Enter the username:");
        String username = scanner.next();
        System.out.println("Enter the email address");
        String userEmail = scanner.next();
        System.out.println("Enter your message: ");
        String mess = scanner.next();

        User user = new User(userName,username, userEmail);
        Message message = new Message(mess,user);
        message.sendMessage();
    }
}
