package com.pentalog.pentastagiu.homework2;

public class BankAccount {

    private double money;

    public BankAccount(double money) {
        this.money = money;
    }

    public void withdrawMoney(double money){
        //validate if there are sufficient funds
        if(money > this.money){
            System.out.println("Operation failed! - Insuficient funds!");
            System.out.println("Your balance: " + this.money);
            return;
        }
        this.money -= money;
        System.out.println("Withdraw: " + money + "\nYour new balance: " + this.money);
    }

    public void depositMoney(double money){
        this.money += money;
        System.out.println("Deposit " + money + "\nYour new balance: " + this.money);
    }
}
