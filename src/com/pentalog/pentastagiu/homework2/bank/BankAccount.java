package com.pentalog.pentastagiu.homework2.bank;

public class BankAccount {
    private double moneyAmount;

    public BankAccount(double p_moneyAmount) throws NotEnoughMoneyException {
        if (p_moneyAmount < 10) {
            throw new NotEnoughMoneyException("A bank account must be created with at least 5 dollars!");
        }
        moneyAmount = p_moneyAmount;
        System.out.println("A bank account with " + moneyAmount + " has been created!");
    }

    public void displaySold() {
        System.out.println("The account has " + moneyAmount);
    }

    public void withdraw(Double value) {
        if(value <= 0){
            System.out.println("You can withdraw only an amount of money higher than 0");
            return;
        }
        if (moneyAmount - value < 0) {
            System.out.println("Can't withdraw " + value);
            displaySold();
        } else {
            moneyAmount -= value;
            System.out.println("The amount of " + value + " was extracted!");
        }
    }

    public void deposit(Double value) {
        if (value < 0)
            System.out.println("Deposit operation failed. Can't deposit a negative amount!");
        else{
            moneyAmount += value;
            System.out.println("Deposit operation was successful");
            displaySold();
        }
    }

}
