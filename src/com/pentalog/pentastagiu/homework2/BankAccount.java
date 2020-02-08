package com.pentalog.pentastagiu.homework2;

public class BankAccount {
    private double currentAmount;

    BankAccount(double currentAmount) {
        if (currentAmount < 0) {
            throw new IllegalArgumentException("Current amount cannot be less than 0.");
        }
        this.currentAmount = currentAmount;
    }

    public void deposit(double value) {
        if (value > 0) {
            this.currentAmount += value;
            System.out.println("Operation done! Now you have " + currentAmount + " in your bank account.");
        } else {
            System.out.println("Invalid value!");
        }
    }

    public void withdraw(double val) {
        if (val > currentAmount) {
            System.out.println("Operation failed! You have " + currentAmount + " in your account.");
        } else if (val <= 0) {
            System.out.println("Please introduce a value greater than 0!");
        }
        else {
            currentAmount -= val;
            System.out.println("Operation done! You still have " + currentAmount + " in your account.");
        }
    }

}
