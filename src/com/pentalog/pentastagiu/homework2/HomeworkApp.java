package com.pentalog.pentastagiu.homework2;

import com.pentalog.pentastagiu.homework2.bank.application.Account;
import com.pentalog.pentastagiu.homework2.bank.application.User;
import com.pentalog.pentastagiu.homework2.shop.application.*;
import com.pentalog.pentastagiu.homework2.users.application.Message;
import com.pentalog.pentastagiu.homework2.users.application.UserChat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println("The com.pentalog.pentastagiu.homework2 package should be used to commit all your classes related to homework 2");
    /* 1. Create a console application from the following requirements:
    A bank account from where someone has the option to withdraw and deposit money
    Write information to the console each time someone makes an operation on that account
    Take into consideration any validations that have to be done since this is a debit account,
    so user can’t withdraw more than he has into account. Display this information to inform the user
    about why the operation failed */
        System.out.println("----------------------PROBLEM NO 1--------------------------");
        User myUser = new User("Anca", "David", 1234);
        Account myAccount = new Account("RO12345678", 1500.5, myUser);

        Scanner scan = new Scanner(System.in);
        Integer myPin = scan.nextInt();

        if (myAccount.checkPin(myUser, myPin) == true) {
            System.out.println("Pin is correct!");
        } else {
            System.out.println("Pin is incorrect!");
        }
        System.out.println("Please select the action you need: (1. Check Balance; 2. Withdraw 3. Deposit)");
        Integer action = scan.nextInt();
        if (action.equals(1)) {
            System.out.println(myAccount.displayBalance());
        } else if (action.equals(2)) {
            System.out.println("Insert the value to withdraw:");
            int amount = scan.nextInt();
            System.out.println(myAccount.withdraw(amount));

        } else if (action.equals(3)) {
            System.out.println("Insert the value to deposit:");
            int deposit = scan.nextInt();
            System.out.println(myAccount.deposite(deposit));
        } else {
            System.out.println("Please select an existing action!");
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("----------------------PROBLEM NO 2--------------------------");
        /* 2. Create a console application from the following requirements:
        We have a shop that sells 2 products: books(with info about the author) and
        candy(with info about the quantity in grams)
        A customer will go to this shop and he will choose some items from the shop, in different quantities
        Each customer has a membership status, based on which discounts will be applied:
        GOLD → 20%, SILVER → 10%, no membership → 0%
        Create a customer, create products and add them to his basket and print to the console the total price
        for the products that he ordered
        Change the membership of the Customer and print again the total price.
         */

        Customer cust1 = new Customer(1, "Anca David", Customer.Membership.GOLD);
        Customer cust2 = new Customer(1, "Ana Mihai", Customer.Membership.SILVER);
        Customer cust3 = new Customer(1, "Cristian Botez", Customer.Membership.NOMEMBERSHIP);

        Product product1 = new Book(1, "Doamna Bovary", 25.5, "Gustave Flaubert");
        Product product2 = new Book(1, "Crima si pedeapsa", 40.0, "Feodor Dostoievski");
        Product product3 = new Book(1, "Jane Eyre", 30.0, "Charlotte Bronte");

        Product candy1 = new Candy(1, "Bomboane ciocolata", 5.0, 10);
        Product candy2 = new Candy(1, "Bomboane menta", 4.5, 11);
        Product candy3 = new Candy(1, "Bomboane lapte", 7.5, 16);

        HashMap<Integer, Product> cust1List = new HashMap<Integer, Product>();
        Basket basket1 = new Basket(0.0, cust1, cust1List);
        basket1.addProduct(2, product1);
        basket1.addProduct(1, product2);
        basket1.addProduct(5, candy1);

        Double basketCust1 = basket1.returnTotalPrice(cust1List);
        System.out.println("Client 1 total baket price: " + basketCust1);

        HashMap<Integer, Product> cust2List = new HashMap<Integer, Product>();
        Basket basket2 = new Basket(0.0, cust2, cust2List);
        basket2.addProduct(3, candy2);
        basket2.addProduct(5, candy3);

        Double basketCust2 = basket2.returnTotalPrice(cust2List);
        System.out.println("Client 2 total baket price: " + basketCust2);


        HashMap<Integer, Product> cust3List = new HashMap<Integer, Product>();
        Basket basket3 = new Basket(0.0, cust3, cust3List);
        basket3.addProduct(1, product1);
        basket3.addProduct(3, product3);

        Double basketCust3 = basket3.returnTotalPrice(cust3List);
        System.out.println("Client 3 total baket price: " + basketCust3);

        System.out.println("------------------------------------------------------------");
        System.out.println("----------------------PROBLEM NO 3--------------------------");
        /* 3. Create a console application from the following requirements:
        We have some users that can register into an app with name & email
        Users are able to post messages on a board
        Each message has a description and an author
        The board can display messages from all the users
        */

        UserChat userChat1 = new UserChat("Anca", "anca_damian@gmail.com");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter login credentials:");
        System.out.println("User Name");
        String name1 = scan1.nextLine();
        System.out.println("User Email");
        String userEmail1 = scan1.nextLine();
        while (true) {
            if (userChat1.getName().equals(name1) && userChat1.getEmail().equals(userEmail1)) {
                System.out.println("You have successfully logged in.");
                System.out.println("You can now post messages:");
                System.out.println("Please post your message: ");
                String message = scan1.nextLine();
                Message message1 = new Message(message, userChat1);
                List<Message> messages = new ArrayList<Message>();
                System.out.println("The messages you have posterd are: " + message1.getDescription());

            } else {
                System.out.println("Username or email is not correct.");
            }
        }
    }
}
