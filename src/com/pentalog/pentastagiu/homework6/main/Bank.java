package com.pentalog.pentastagiu.homework6.main;

import com.pentalog.pentastagiu.homework6.business.CashDispenser;
import com.pentalog.pentastagiu.homework6.exceptions.InsufficientFundsException;

public class Bank {
        public static void main(String[] args) {
            CashDispenser cashDispenser = new CashDispenser();
            //adding account numbers and cash
            cashDispenser.startSession(45, 400d);
            cashDispenser.startSession(66, 200d);

            if (cashDispenser.getAccountBalance(45) < 10000) {
                cashDispenser.deposit(45, 1000d);
            }
            cashDispenser.withdraw(45, 20d);
            cashDispenser.endSession(45);
            System.out.println();

            if (cashDispenser.getAccountBalance(66) < 10000) {
                cashDispenser.deposit(66, 1000d);
            }
            try{
                cashDispenser.withdraw(66, 20000d);
            }catch (InsufficientFundsException ex){
                System.out.print(ex.getMessage());
            }

            cashDispenser.endSession(66);

        }
    }
