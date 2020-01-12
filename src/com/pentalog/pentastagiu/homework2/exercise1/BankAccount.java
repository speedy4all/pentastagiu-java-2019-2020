package com.pentalog.pentastagiu.homework2.exercise1;

import java.text.DecimalFormat;

public class BankAccount {
    private static DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private double balance;
    private String owner;
    private String currency;


    public BankAccount(String owner, String currency, double balance) {
        this.balance = balance > 0 ? balance : 0;
        this.owner = owner;
        this.currency = currency;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful. The balance is " + decimalFormat.format(balance) + " " + currency);
        } else {
            System.out.println("Deposit failed. The amount can not be negative.");
        }
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful. The balance is " + decimalFormat.format(balance) + " " + currency);
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    @Override
    public String toString() {
        return owner + " balance: " + decimalFormat.format(balance) + " " + currency;
    }
}
