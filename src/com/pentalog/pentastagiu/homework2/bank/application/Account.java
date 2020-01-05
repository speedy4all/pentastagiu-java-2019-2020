package com.pentalog.pentastagiu.homework2.bank.application;

public class Account {

    private String accountNumber;
    private Double balance;
    private User user;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Account(String accountNumber, Double balance, User user) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.user = user;
    }

    public boolean checkPin(User user, Integer localPin) {
        if(localPin.equals(user.getPin())){
            return true;
        }
        return false;
    }

    public String displayBalance() {
        return "Your balance is: " + balance + " RON";
    }

    public String deposite(int amount) {
        balance += amount;
        return "Your deposite: " + amount + " Your balance: " + balance + " RON";
    }

    public String withdraw(int amount) {
        balance -= amount;
        return "Your deposite: " + amount + " Your balance: " + balance + " RON";
    }
}
