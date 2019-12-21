package com.pentalog.pentastagiu.homework2;

import javax.xml.transform.stream.StreamSource;

public class Account {
    private int amount;
    private String currency;
    private String name;

    public Account(int amount, String currency, String name) {
        this.amount = amount;
        this.currency = currency;
        this.name = name;
    }

    public void printOwnerAndAmount() {
        System.out.println("My name is " + name + " and I'm the owner of this " + amount + currency + " account.");
    }

    public void widthdrawAmount(int amountToWithdraw) {
        if (amount >= amountToWithdraw) {
            amount -= amountToWithdraw;
            System.out.println(amountToWithdraw + " were withdraw from your account! Your balance: " + amount + currency);
        } else {
            System.out.println(amount + currency + " left in your account. Insufficient funds to withdraw " + amountToWithdraw + currency);
        }
    }

    public void depositAmount(int amountToDeposit) {
        this.amount += amountToDeposit;
        System.out.println(amountToDeposit + currency + " were added to your account!");
    }


}
