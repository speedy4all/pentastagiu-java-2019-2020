package com.pentalog.pentastagiu.homeworkWeek6;

import org.junit.Test;

public class CashDispencerAppTests {
    CashDispencer cashDispencer = new CashDispencer();

    @Test(expected = ClientNotFoundException.class)
    public void checkIfAccountIsValid(){
        cashDispencer.startSession(10, 200d);
        cashDispencer.accountIsValid(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createAccountWithNegativeAmount(){
        cashDispencer.startSession(10, -100d);
    }
    @Test(expected = ClientNotFoundException.class)
    public void checkAccountBalanceWithInvalidAccount(){
        cashDispencer.startSession(120, 2000d);
        cashDispencer.getAccountBalance(12);
    }

    @Test(expected = ClientNotFoundException.class)
    public void checkDepositingWithInvalidAccount(){
        cashDispencer.startSession(10, 1000d);
        cashDispencer.deposit(20,200d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDepositingWithNegativeAmount(){
        cashDispencer.startSession(1,100d);
        cashDispencer.deposit(1, -200d);
    }

    @Test(expected = ClientNotFoundException.class)
    public void checkWithdrawingWithInvalidAccount(){
        cashDispencer.startSession(1, 1000d);
        cashDispencer.withdraw(2, 200d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkWithdrawingWithNegativeAmount(){
        cashDispencer.startSession(10,200d);
        cashDispencer.withdraw(10, -100d);
    }

    @Test(expected = InsufficientFoundsExceptions.class)
    public void checkWithdrawingWithGreaterAmountThanAvailable(){
        cashDispencer.startSession(10, 299d);
        cashDispencer.withdraw(10, 400d);
    }
}
