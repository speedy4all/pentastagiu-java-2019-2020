package com.pentalog.pentastagiu.homework2.bank;

public class BankAccount {
    private double moneyAmount;

    public BankAccount(double moneyAmount) throws NotEnoughMoneyException {
        if (moneyAmount < 10) {
            throw new NotEnoughMoneyException("A bank account must be created with at least 10 dollars!");
        }
        this.moneyAmount = moneyAmount;
        System.out.println("A bank account with " + this.moneyAmount + " has been created!");
    }

    public void displaySold() {
        System.out.println("The account has " + moneyAmount);
    }

    public void amountToWithdraw(Double value) {
        if(value <= 0 ){
            System.out.println("You can withdraw only an amount of money higher than 0");
        }
        else if (moneyAmount - value < 0) {
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
