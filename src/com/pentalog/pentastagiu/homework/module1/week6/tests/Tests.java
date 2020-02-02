package com.pentalog.pentastagiu.homework.module1.week6.tests;

import com.pentalog.pentastagiu.homework.module1.week6.CashDispencer;
import com.pentalog.pentastagiu.homework.module1.week6.ClientNotFoundException;
import com.pentalog.pentastagiu.homework.module1.week6.InsufficientFundsException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Tests {
    final double DELTA = 0.00001;
    CashDispencer cashDispencer = new CashDispencer();

    @Before
    public void setUp() {
        cashDispencer.startSession(0, 10.0);
    }

    @After
    public void tearDown() {
        cashDispencer.endSession(0);
    }

    @Test(expected = ClientNotFoundException.class)
    public void verifyAccountValidation() throws ClientNotFoundException {
        cashDispencer.accountIsValid(1);
    }

    @Test
    public void verifyAccountBalanceGetter() {
        double expectedAmount = 10;
        Assert.assertEquals(cashDispencer.getAccountBalance(0), expectedAmount, DELTA);
    }

    @Test
    public void verifyWithdraw() {
        double expectedAmount = 0;
        cashDispencer.withdraw(0, 10.0);
        Assert.assertEquals(cashDispencer.getAccountBalance(0), expectedAmount, DELTA);
    }

    @Test(expected = InsufficientFundsException.class)
    public void verifyWithdrawError() {
        cashDispencer.withdraw(0, 10000.0);
    }

    @Test
    public void verifyDeposit()
    {
        double expectedAmount = 1010;
        cashDispencer.deposit(0, 1000.0);
        Assert.assertEquals(cashDispencer.getAccountBalance(0), expectedAmount, DELTA);
    }
}
