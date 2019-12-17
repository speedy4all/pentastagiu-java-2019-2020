package com.pentalog.pentastagiu.homework2.Exercise1;

import java.text.DecimalFormat;

public class BankAccount {
    private static DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private double balance;
    private String owner;
    private String currency;


    public BankAccount(String owner, String currency, double balance) {
        this.owner = owner;
        this.currency = currency;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful. The balance is " + decimalFormat.format(balance) + " " + currency);
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
