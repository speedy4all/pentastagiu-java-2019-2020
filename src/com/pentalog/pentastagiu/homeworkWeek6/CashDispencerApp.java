package com.pentalog.pentastagiu.homeworkWeek6;

public class CashDispencerApp {
    public static void main(String[] args) {
        CashDispencer cashDispencer = new CashDispencer();
        cashDispencer.startSession(1, 1000d);
        cashDispencer.getAccountBalance(1);
        cashDispencer.withdraw(1, 200d);
        cashDispencer.deposit(1, 100d);
        cashDispencer.endSession(1);

        CashDispencer cashDispencer2 = new CashDispencer();
        cashDispencer2.startSession(10, 200d);
        cashDispencer2.getAccountBalance(10);
        cashDispencer2.withdraw(10, 1000d);
        cashDispencer2.withdraw(10,-900d);
        cashDispencer2.deposit(10, -9999d);
        cashDispencer2.endSession(10);

    }
}
