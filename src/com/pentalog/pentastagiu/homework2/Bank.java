package com.pentalog.pentastagiu.homework2;

import java.util.*;


public class Bank {

    private double total;


    public Bank (double total) {

        this.total = total;
    }

    public int enterPIN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PIN: ");

        int pin = Integer.parseInt(sc.nextLine());
        return pin;

    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        double withdrawal = Double.parseDouble(sc.nextLine());
        if (withdrawal <= total) {
            total = total - withdrawal;
            System.out.println("You withdrew the amount of " + withdrawal);
            System.out.println("Total amount is: " + total);
        } else {
            System.out.println("Error! There are not enough money!");
        }

        sc.close();

    }

    public void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit:");
        double deposit = Double.parseDouble(sc.nextLine());
        total = total + deposit;
        System.out.println("You have deposited the amount of " + deposit);
        System.out.println("Total amount is: " + total);

        sc.close();
    }
}








