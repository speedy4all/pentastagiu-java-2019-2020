package com.pentalog.pentastagiu.homework2.bank;

public class Account {

    private  Integer balance;

    public Account() {
        this.balance = 0;
    }

    public  Integer getBalance() {
        return this.balance;
    }

    public  void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void depositMoney(int ammount) {
        this.balance += ammount;
        listOperationInfo();
    }

    public  void withdrawMoney(int ammount) {
        if (ammount <= balance) {
            balance -= ammount;
            listOperationInfo();
        } else {
            System.out.println("Your balace is too law. " + "You can not withdraw " + ammount + " You have only " + getBalance() + " left.");
        }
    }

    public  void listOperationInfo() {
        System.out.println("New ammount is: " + getBalance());
    }
}
