package com.pentalog.pentastagiu.homework3.ex1;

public class BankAccount {
    private double sold;

    private void withdraw(double value) {
        if (value > this.sold) {
            System.out.println("Transaction refused! Insufficient funds!");
        } else {
            this.sold -= value;
            System.out.println("Transaction accepted! You withdrew " + value + " lei!");
        }
    }

    private void deposit(double value) {
        this.sold += value;
        System.out.println("Transaction accepted! You deposited " + value + " lei!");
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(500);
        ba.withdraw(300);
        ba.withdraw(201);
        ba.withdraw(200);
    }

}

