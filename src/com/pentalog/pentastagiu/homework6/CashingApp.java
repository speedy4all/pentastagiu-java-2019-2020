package com.pentalog.pentastagiu.homework6;

public class CashingApp {
    public static void main(String[] args) {
        ICashDispencer cashDispenser = new CashDispencer();
        cashDispenser.startSession(100, 400d);
        cashDispenser.startSession(101, 200d);
        //check the balance
        cashDispenser.getAccountBalance(100);
        cashDispenser.getAccountBalance(101);
        //deposit in account 100
        cashDispenser.deposit(100, 600d);
        cashDispenser.getAccountBalance(100);
        //check the account
        cashDispenser.accountIsValid(100);
        cashDispenser.accountIsValid(102);
        //withdraw from account 101
        cashDispenser.withdraw(100, 500d);
        cashDispenser.getAccountBalance(100);
        cashDispenser.withdraw(100,700d);
        cashDispenser.getAccountBalance(100);
        cashDispenser.withdraw(105, 300d);
        cashDispenser.getAccountBalance(101);
        cashDispenser.endSession(101);
        cashDispenser.accountIsValid(101);
    }
}
