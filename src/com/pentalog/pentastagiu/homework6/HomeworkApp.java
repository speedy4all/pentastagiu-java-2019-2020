package com.pentalog.pentastagiu.homework6;

import com.pentalog.pentastagiu.homework6.account.ICashDispenser;
import com.pentalog.pentastagiu.homework6.account.impl.CashDispenser;

public class HomeworkApp {
    public static void main(String[] args) {
        ICashDispenser cashDispenser = new CashDispenser();

        cashDispenser.startSession(100, 20d);
        cashDispenser.startSession(200, 300d);
        cashDispenser.startSession(20, 10d);

        System.out.println(cashDispenser.accountIsValid(100));

        System.out.println(" BALANCE : " + cashDispenser.getAccountBalance(100));

        cashDispenser.deposit(100, 50d);
        System.out.println(" BALANCE : " + cashDispenser.getAccountBalance(100));

        cashDispenser.withdraw(100, 30d);
        System.out.println(" BALANCE : " + cashDispenser.getAccountBalance(100));

        cashDispenser.endSession(100);

        cashDispenser.endSession(null);

        cashDispenser.withdraw(20, 30d);
    }
}
