package com.pentalog.pentastagiu.homework2;

import com.pentalog.pentastagiu.homework2.bankaccount.BankAccount;
import com.pentalog.pentastagiu.homework2.bankaccount.impl.BankAccountImpl;
import com.pentalog.pentastagiu.homework2.boardproblem.Board;
import com.pentalog.pentastagiu.homework2.boardproblem.Message;
import com.pentalog.pentastagiu.homework2.boardproblem.User;
import com.pentalog.pentastagiu.homework2.consolecommands.ConsoleBankAccountCommands;
import com.pentalog.pentastagiu.homework2.exceptions.InsufficientMoneyException;
import com.pentalog.pentastagiu.homework2.exceptions.NegativeDepositAmountException;
import com.pentalog.pentastagiu.homework2.shop.Basket;
import com.pentalog.pentastagiu.homework2.shop.Customer;
import com.pentalog.pentastagiu.homework2.shop.Product;
import com.pentalog.pentastagiu.homework2.shop.customermembership.MembershipType;
import com.pentalog.pentastagiu.homework2.shop.impl.Book;
import com.pentalog.pentastagiu.homework2.shop.impl.Candy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class HomeworkApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The com.pentalog.pentastagiu.homework2 package should be used to commit all your classes related to homework 2");

        System.out.println("=== PB1 ===");
        PB1();

        System.out.println("=== PB2 ===");
        PB2();

        System.out.println("=== PB3 ===");
        Board board = Board.getInstance();
        User user1 = new User("mihail@yahoo.com", "cancel");
        User user2 = new User("marcel@yahoo.com", "cancel");
        User user3 = new User("sorin@yahoo.com", "cancel");
        List<User> userList = Arrays.asList(user1, user2, user3);
        int command = 0;
        System.out.println("=== Welcome to message board ===");
        System.out.println("=== Login ===");
        User loginedUser = loginFromConsole(userList);
        while (command != -1) {
            System.out.println("=== Choose option ===");
            System.out.println("WRITE MESSAGE : 0");
            System.out.println("CHANGE ACCOUNT : 1");
            System.out.println("DISPLAY MESSAGES : 2");
            System.out.println("ESCAPE : -1");
            command = readFromConsole(scanner::nextInt);
            while (command > 2 || command < -1) {
                System.out.println("=== INVALID OPTION ===");
                System.out.println("=== Choose option ===");
                System.out.println("WRITE MESSAGE : 0");
                System.out.println("CHANGE ACCOUNT : 1");
                System.out.println("DISPLAY MESSAGES : 2");
                System.out.println("ESCAPE : -1");
                command = readFromConsole(scanner::nextInt);
            }
            if (command == 0) {
                System.out.println("=== WRITE A MESSAGE ===");
                System.out.println("Message description : ");
                String description = readFromConsole(scanner::next);
                Message newMessage = new Message(loginedUser.getEmail(), description);
                board.addMessage(newMessage);
            }
            if (command == 1) {
                loginedUser = loginFromConsole(userList);
            }
            if (command == 2) {
                System.out.println(board);
            }

        }
        System.out.println("THANK YOU!");


    }

    private static void PB1() {
        ConsoleBankAccountCommands[] allCommands = ConsoleBankAccountCommands.values();
        BankAccount bankAccount = new BankAccountImpl();
        ConsoleBankAccountCommands command = null;
        int amountToDeposit, amountToRedraw;
        System.out.println("=== Welcome to bank account ===");
        while (command != ConsoleBankAccountCommands.ESCAPE) {
            System.out.println("=== You have " + bankAccount.getMoneyInAccount() + " $ ===");
            System.out.println("Please select one option:");
            ConsoleBankAccountCommands.showAllCommands();
            System.out.print("Option : ");
            command = getCommandFromOrdinal(readFromConsole(scanner::nextInt), allCommands);
            while (command == null) {
                System.out.println("=== Invalid Command ! ===");
                System.out.println("Please select one option:");
                ConsoleBankAccountCommands.showAllCommands();
                System.out.print("Option : ");
                command = getCommandFromOrdinal(readFromConsole(scanner::nextInt), allCommands);
            }
            if (command == ConsoleBankAccountCommands.DEPOSIT) {
                System.out.println("=== DEPOSIT MONEY ===");
                System.out.println("Please insert amount : ");
                amountToDeposit = readFromConsole(scanner::nextInt);
                try {
                    bankAccount.depositMoney(amountToDeposit);
                    System.out.println("You add " + amountToDeposit + " $");
                } catch (NegativeDepositAmountException e) {
                    System.out.println("You can't add negative amount of money");
                }
            }
            if (command == ConsoleBankAccountCommands.WITHDRAW) {
                System.out.println("=== WITHDRAW MONEY ===");
                System.out.println("Please insert amount : ");
                amountToRedraw = readFromConsole(scanner::nextInt);
                try {
                    bankAccount.withdrawMoney(amountToRedraw);
                    System.out.println("You withdraw " + amountToRedraw + " $");
                } catch (InsufficientMoneyException e) {
                    System.out.println("You don't have enough money");
                }

            }
        }
        System.out.println("Thank you!");
    }

    private static void PB2() {
        Product book1 = new Book(200, "NumeDeCarte", 200, "Ion");
        Product book2 = new Book(100, "Giumbo", 250, "Cristi");
        Product candy1 = new Candy(207, "Dulce", 100, 10);
        Product candy2 = new Candy(201, "DulceAmar", 50, 1);
        Basket basket = new Basket();
        basket.addProduct(book1);
        basket.addProduct(book2);
        basket.addProduct(candy1);
        basket.addProduct(candy2);
        Customer myCustomer = new Customer(1000, "Marcel", basket, MembershipType.NO_MEMBERSHIP);
        System.out.println("Customer has to pay : " + basket.getTotalPrice());
        myCustomer.setMembershipType(MembershipType.SILVER);
        System.out.println("Customer with SILVER has to pay : " + basket.getTotalFinalPrice(myCustomer.getMembershipType()));
        myCustomer.setMembershipType(MembershipType.GOLD);
        System.out.println("Customer with GOLD has to pay : " + basket.getTotalFinalPrice(myCustomer.getMembershipType()));

    }

    private static <T> T readFromConsole(Supplier<T> scanFromConsole) {
        return scanFromConsole.get();
    }

    private static ConsoleBankAccountCommands getCommandFromOrdinal(int ordinal, ConsoleBankAccountCommands[] allCommands) {
        if (ordinal < allCommands.length) {
            return allCommands[ordinal];
        }
        return null;
    }

    private static User loginFromConsole(List<User> userList) {
        boolean loginStatus = false;
        User userToLogin = null;
        while (!loginStatus) {
            System.out.println("Email:");
            String email = readFromConsole(scanner::next);
            System.out.println("Password:");
            String password = readFromConsole(scanner::next);
            userToLogin = new User(email, password);
            if (login(userToLogin, userList)) {
                System.out.println("=== Welcome " + userToLogin.getEmail() + " ===");
                loginStatus = true;

            } else {
                System.out.println("=== Login failed ===");
            }
        }
        return userToLogin;
    }

    private static boolean login(User toLogin, List<User> userList) {
        return userList.stream()
                .anyMatch(user -> user.getEmail().equals(toLogin.getEmail()) && user.getPassword().equals(toLogin.getPassword()));

    }

}
