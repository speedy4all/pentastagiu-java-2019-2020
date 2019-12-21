package com.pentalog.pentastagiu.homework2;

public class BankAccount {
    private int id;
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("You don't have enough funds");
        } else {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
