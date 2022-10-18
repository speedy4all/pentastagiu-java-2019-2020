package com.pentalog.pentastagiu.homework3.bank.domain;

public class Client {
    private int money;
    private String firstName;
    private String lastName;
    private int accountNumber;

    public int getMoney() {
        return money;
    }

    public int setMoney(int money) {
        this.money = money;
        return money;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "\nClient:" +
                "\nAccount: " + accountNumber +
                "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nAmount: " + money;
    }
}
