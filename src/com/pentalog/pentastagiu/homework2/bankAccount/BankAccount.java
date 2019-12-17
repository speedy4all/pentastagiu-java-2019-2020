package com.pentalog.pentastagiu.homework2.bankAccount;

public class BankAccount {

    private String ownerName;
    private double balance = 0;

    public void depozit(double depozitAmount) {
        balance = balance + depozitAmount;
        System.out.println(this.ownerName + " in your account was added the amount of " + depozitAmount);
        System.out.println(this.ownerName + " Balance of account after this operation is " + balance);

    }

    public void withdraw(double withdrawAmount) {
        if (balance < withdrawAmount) {

            System.out.println(this.ownerName + " Insuficient funds. Please insert a sum less than " + balance);
            System.exit(0);

        } else {
            balance = balance - withdrawAmount;
        }
        System.out.println(this.ownerName + " Your account has been withdrawn " + withdrawAmount);
        System.out.println(this.ownerName + " Balance of account after this operation is " + balance);
    }

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        System.out.println(this.ownerName + " Your account has been created with name " + this.ownerName + " and balance " + balance);
    }


}
