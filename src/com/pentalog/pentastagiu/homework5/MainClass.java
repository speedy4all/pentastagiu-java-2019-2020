package com.pentalog.pentastagiu.homework5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer account;
        Integer userOption;
        Double withdraw;
        Double deposit;
        CashDispencer cashDispencer = new CashDispencer();
        cashDispencer.startSession(1234, 3000.00);
        cashDispencer.startSession(1111, 500.00);

        System.out.println("Hello user! Enter your account ---------1234 OR 1111 ------------");

        try {
            account = scan.nextInt();
            if (cashDispencer.accountIsValid(account)) {
                System.out.println("Choose a option\n1 - Balance\n2 - Deposit\n3 - Withdraw");
                userOption = scan.nextInt();
                if (userOption == 1) {
                    System.out.println("Account balance: " + cashDispencer.getAccountBalance(account));
                } else if (userOption == 2) {
                    System.out.println("Enter the sum you want to deposit");
                    deposit = scan.nextDouble();
                    cashDispencer.deposit(account, deposit);
                    System.out.println("\nAccount balance: " + cashDispencer.getAccountBalance(account));
                } else if (userOption == 3) {
                    System.out.println("Enter the sum you want to withdraw");
                    withdraw = scan.nextDouble();
                    cashDispencer.withdraw(account, withdraw);
                    System.out.println("\nAccount balance: " + cashDispencer.getAccountBalance(account));
                }else{
                    System.out.println("Invalid option");
                }
            }
            cashDispencer.endSession(account);
        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }catch (ClientNotFoundException c) {
            c.printMessage();
        }catch(InsufficientFoundsException i){
            i.printMessage();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
