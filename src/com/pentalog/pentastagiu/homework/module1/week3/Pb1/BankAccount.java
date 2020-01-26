package com.pentalog.pentastagiu.homework.module1.week3.Pb1;

public class BankAccount {
    private int money;

    boolean verifyNumber(int nr)
    {
        if(nr < 0) {
            System.out.println("Number can not be negative");
            return false;
        }
        return true;
    }

    int withdrawMoney(int sum) {
        if(!verifyNumber(sum))
            return 0;
        if(sum > money) {
            System.out.println("Operation failed. Not enough money in account.");
            return 0;
        }
        else {
            System.out.println(sum + " money withdrawn from the account");
            money -= sum;
            return sum;
        }
    }

    void depositMoney(int sum) {
        if(!verifyNumber(sum))
            return;
        System.out.println(sum + " money added to the account");
        money += sum;
    }

    public int getMoney() {
        return money;
    }
}
