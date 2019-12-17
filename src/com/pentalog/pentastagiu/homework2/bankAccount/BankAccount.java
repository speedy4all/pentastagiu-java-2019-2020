package com.pentalog.pentastagiu.homework2.bankAccount;

public class BankAccount {

    private String ownerName;
    private double balance = 0;

    public void depozit(double depozitAmount) {
        if (depozitAmount > 0) {
            balance = balance + depozitAmount;
            System.out.println(this.ownerName + " in your account was added the amount of " + depozitAmount);
            System.out.println(this.ownerName + " Balance of account after this operation is " + balance);
        } else {
            System.out.println("Ilegal operation");
            return;
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0) {
            if (balance < withdrawAmount) {

                System.out.println(this.ownerName + " Insuficient funds. Please insert a sum less than " + balance);
                return;

            } else {
                balance = balance - withdrawAmount;
            }
            System.out.println(this.ownerName + " Your account has been withdrawn " + withdrawAmount);
            System.out.println(this.ownerName + " Balance of account after this operation is " + balance);
        } else {
            System.out.println("ilegal operation");
            return;
        }


    }

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        System.out.println(this.ownerName + " Your account has been created with name " + this.ownerName + " and balance was updatet with " + balance);
    }


}

