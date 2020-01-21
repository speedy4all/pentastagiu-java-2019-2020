package com.pentalog.pentastagiu.homework5.tests;

import com.pentalog.pentastagiu.homework5.CashDispencer;
import com.pentalog.pentastagiu.homework5.ClientNotFoundException;
import com.pentalog.pentastagiu.homework5.ICacheDispencer;
import com.pentalog.pentastagiu.homework5.InsufficientFoundsException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DispencerTests {
    private ICacheDispencer cashDispenser;
    @Before
    public void init(){
        cashDispenser = new CashDispencer();
        cashDispenser.startSession(100, 150);
    }

    @After
    public void finish() {
        cashDispenser = null;
    }

    @Test(expected = ClientNotFoundException.class)
    public void checkIfAccountIsValid(){
        cashDispenser.accountIsValid(2);

    }

    @Test(expected = InsufficientFoundsException.class)
    public void checkWithdraw(){
        cashDispenser.withdraw(100,200);

    }
    @Test
    public void checkDeposit(){
        cashDispenser.deposit(100, 50);
        Assert.assertEquals(cashDispenser.getAccountBalance(100), 200, 0);
    }
}
