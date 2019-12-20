package com.pentalog.pentastagiu.homework2;

import com.pentalog.pentastagiu.homework2.bank.BankAccount;
import com.pentalog.pentastagiu.homework2.bank.NotEnoughMoneyException;
import com.pentalog.pentastagiu.homework2.chat.Board;
import com.pentalog.pentastagiu.homework2.chat.User;
import com.pentalog.pentastagiu.homework2.shop.Candy;
import com.pentalog.pentastagiu.homework2.shop.Customer;
import com.pentalog.pentastagiu.homework2.shop.Book;
import com.pentalog.pentastagiu.homework2.shop.Membership;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeworkApp {

    public static void testBankAccountApp() {

        // 1st - test constructor
        try {
            BankAccount invalidBankAccount = new BankAccount(4);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e);
        }
        try {
            BankAccount bankAccount = new BankAccount(15);
            BufferedReader readCommand = new BufferedReader(new InputStreamReader(System.in));
            String command = "start";
            while (!"0".equals(command)) {

                switch (command) {
                    case "0":
                        command = "0";
                        break;
                    case "1":
                        bankAccount.displaySold();
                        break;
                    case "2":
                        System.out.print("Introduce the value you want to withdraw: ");
                        try {
                            double value = Double.parseDouble(readCommand.readLine());
                            bankAccount.withdraw(value);
                        } catch (NumberFormatException e) {
                            System.out.println("Enter a numeric value!");
                        }
                        break;
                    case "3":
                        System.out.print("Introduce the value you want to deposit: ");
                        try {
                            double value = Double.parseDouble(readCommand.readLine());
                            bankAccount.deposit(value);
                        } catch (NumberFormatException e) {
                            System.out.println("Enter a numeric value!");
                        }
                        break;
                    default:
                        break;
                }
                System.out.println("0 - exit");
                System.out.println("1 - displaySold");
                System.out.println("2 - withdraw");
                System.out.println("3 - depositMoney");
                System.out.print("Enter a command from 0 to 3: ");
                command = readCommand.readLine();
            }
        } catch (NotEnoughMoneyException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void testShopApp() {
        // Products creation is normally made by an administrator.
        Candy candy1 = new Candy("Chocolate", 40, 90);
        Candy candy2 = new Candy("Cake", 70, 650);

        Book book1 = new Book("Spring in action, 4th", "Craig Walls", 150);
        Book book2 = new Book("Spring in action, 4th", "Craig Walls", 150);

        Customer alex = new Customer("Alex");

        alex.addProductInBasket(book1, 50);
        alex.displayDiscount();
        alex.purchase();
        alex.addProductInBasket(candy1, 100);
        alex.displayDiscount();
        alex.purchase();


    }

    public static void testBoardApp() {
        User andrei = new User("Andrei", "andrei@gmail.com");
        User george = new User("George", "george@gmail.com");
        Board.writeOnTheBoard(andrei.getName(), andrei.getMail());
        Board.registerUser(andrei.getName(), andrei.getMail());
        Board.writeOnTheBoard(andrei.getName(), andrei.getMail());
        Board.displayBoard();
        Board.registerUser(george.getName(), george.getMail());
        Board.writeOnTheBoard(george.getName(), george.getMail());
        Board.displayBoard();
    }

    public static void main(String[] args) {
        //System.out.println("The com.pentalog.pentastagiu.homework2 package should be used to commit all your classes related to homework 2");
        //testBankAccountApp();
        //testShopApp();
        //testBoardApp();
    }
}
