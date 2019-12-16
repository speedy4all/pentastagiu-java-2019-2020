package com.pentalog.pentastagiu.homework2;

public class HomeworkApp {

    public static void main(String[] args) {

        //Exercise 1
        System.out.println("Exercise 1 #################");
        System.out.println("Classes used: BankAccount and Person");
        System.out.println(" ");

        BankAccount acc1 = new BankAccount(1, "Banca Transilvania", "bogdan", "RON", 2000.0, "DEBIT");

        Person p1 = new Person(1, "Bogdan Andrei", "ZX 004423", 25);

        p1.withdraw(200, acc1);
        p1.deposit(200, acc1);
        p1.withdraw(4000,acc1);
        System.out.println(" ");


        //Exercise 2
        System.out.println("Exercise 2 #################");
        System.out.println("Classes used: Basket, Book, Candy, Customer, Product, Shop");
        System.out.println(" ");


        Customer customer1 = new Customer(1, "Paul", Customer.Membership.SILVER);
        Basket basket1 = new Basket(1, 0.0, customer1);


        Shop s1 = new Shop(1, "Palas", "Iasi","nr. 5");

        Product candy1 = new Candy(1, "Kinder", 2.2, s1, 20.5, "ciocolata");
        Product candy2 = new Candy(2, "Rafaelo", 10.0, s1, 22.0, "ciocolata and cocos");
        Product book1 = new Book(1, "Amintiri din copilarie", 10.0, s1, "004423N", "Ion Creanga", 70);

        basket1.add(candy1);
        basket1.add(candy2);
        basket1.add(book1);

        System.out.println(" ");


        //Exercise 3
        System.out.println("Exercise 3 #################");
        System.out.println("Classes used: User and Person");
        System.out.println(" ");

        User user1 = new User("alinut", "alinut@gmail.com");

        Message message1 = new Message("Alinut barosanul", "homework", user1);

        displayMessages(message1);

    }

    public static void displayMessages(Message message){
        System.out.println("The message is: " + message.getMessage());
        System.out.println("The description is: " + message.getDescription());
        System.out.println("The author is: " + message.getUser().getUsername());
    }
}
