package com.pentalog.pentastagiu.homework.module1.week6;

public class Client {
    static CashDispencer cashDispencer = new CashDispencer();
    public static void main(String[] args) {
        try {
            cashDispencer.startSession(1, 10.0);
            cashDispencer.accountIsValid(1);
            cashDispencer.deposit(1, 100.0);
            cashDispencer.withdraw(1, 20.0);
            cashDispencer.withdraw(1, 200.0);
            System.out.println(cashDispencer.getAccountBalance(1));
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        } finally {
            cashDispencer.endSession(1);
        }
    }
}
