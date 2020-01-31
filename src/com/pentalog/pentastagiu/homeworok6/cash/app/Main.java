package com.pentalog.pentastagiu.homeworok6.cash.app;

public class Main {
    public static void main(String[] args) {
        ICashDispenser cashDispenser = new CashDispenser();
        cashDispenser.startSession(100, 400d);
        cashDispenser.startSession(101, 200d);

        if (cashDispenser.getAccountBalance(100) < 1000) {
            cashDispenser.deposit(100, 1000d);
        }

        try {
            cashDispenser.withdraw(100, 100d);
            cashDispenser.withdraw(100, 2000d);
        } catch (InssuficientFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            cashDispenser.endSession(101);
        }
    }
}
