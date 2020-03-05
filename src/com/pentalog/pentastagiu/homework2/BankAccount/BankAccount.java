package com.pentalog.pentastagiu.homework2.BankAccount;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userChoice;
        boolean quit = false;
        double balance = 0f;

        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Quit");
            System.out.println("Your choice: ");
            userChoice = in.nextInt();

            switch (userChoice) {
                case 1:
                    float amount;
                    System.out.println("Enter amount to deposit: ");
                    amount = in.nextFloat();
                    balance += amount;
                    System.out.println("You have deposited: " + amount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    amount = in.nextFloat();
                    if (amount > balance) {
                        System.out.println("Withdraw can't be completed. Not enought money.");
                    } else {
                        balance -= amount;
                        System.out.println("You have withdraw: " + amount);
                    }
                    break;
                case 3:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }
        }while(!quit);
            System.out.println("Have a good day!");
    }
}
