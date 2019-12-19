package com.pentalog.pentastagiu.homework2.bank;

public class Atm extends Account {

    public double deposit(double amountDeposit){
        balance = balance + amountDeposit;
        System.out.println("You have " + balance + "$ in your account.");
        return balance;
    }

    public void withdraw(double amountWithdraw){
        double newBalance = 0.0f;
        if (amountWithdraw > balance || balance == 0){
            System.out.println("You can't withdraw money. You have " + balance + "$");
        }
        else {
            System.out.println("You withdraw " + amountWithdraw + "$");
            newBalance = balance - amountWithdraw;
            balance = newBalance;
            System.out.println("Your new amount is: " + newBalance + "$");
        }
    }
}
