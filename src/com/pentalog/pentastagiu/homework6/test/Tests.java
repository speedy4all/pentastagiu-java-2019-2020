package com.pentalog.pentastagiu.homework6.test;

import com.pentalog.pentastagiu.homework6.CashDispencer;
import com.pentalog.pentastagiu.homework6.ClientNotFoundException;
import com.pentalog.pentastagiu.homework6.ICashDispencer;
import com.pentalog.pentastagiu.homework6.InssuficientFoundException;
import com.sun.org.apache.bcel.internal.generic.ATHROW;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Tests {
    ICashDispencer cashDispencer = new CashDispencer();


    @Test
    public void testValidAccount(){
        cashDispencer.startSession(1,100d);
        Assert.assertEquals(cashDispencer.accountIsValid(1), true);
    }

    @Test
    public void testInvalidAccount(){
        cashDispencer.startSession(1,100d);
        Assert.assertNotEquals(cashDispencer.accountIsValid(2), true);
    }

    @Test
    public void checkBalance(){
        cashDispencer.startSession(1,100d);
        Assert.assertEquals(cashDispencer.getAccountBalance(1), 100, 0);
    }

    @Test
    public void checkBalance2(){
        cashDispencer.startSession(1,100d);
        Assert.assertNotEquals(cashDispencer.getAccountBalance(1), 101, 0);
    }

    @Test
    public void checkDeposit(){
        cashDispencer.startSession(1,100d);
        cashDispencer.deposit(1,100d);
        Assert.assertEquals(cashDispencer.getAccountBalance(1), 200, 0);
    }

    @Test
    public void checkDeposit2(){
        cashDispencer.startSession(1,100d);
        cashDispencer.deposit(1,100d);
        Assert.assertNotEquals(cashDispencer.getAccountBalance(1), 201, 0);
    }

    @Test
    public void checkEndSession(){
        cashDispencer.startSession(1,100d);
        Assert.assertEquals(cashDispencer.accountIsValid(1), true);
        cashDispencer.endSession(1);
        Assert.assertEquals(cashDispencer.accountIsValid(1), false);
    }

    @Test
    public void checkEndSession2(){
        cashDispencer.startSession(1,100d);
        Assert.assertEquals(cashDispencer.accountIsValid(1), true);
        cashDispencer.endSession(1);
        Assert.assertNotEquals(cashDispencer.accountIsValid(1), true);
    }

    @Test
    public void withdravFromExistingAccount(){
        cashDispencer.startSession(1,100d);
        cashDispencer.withdraw(1,100d);
        Assert.assertEquals(cashDispencer.getAccountBalance(1), 0,0);
    }

    @Test
    public void withdrawFromNonExistingAccount(){
        try{
            cashDispencer.withdraw(1,100d);
        }
        catch (ClientNotFoundException exception){
            Assert.fail();
        }
    }

    @Test
    public void withdrawMoreThanHave(){
        cashDispencer.startSession(1,100d);
        try{
            cashDispencer.withdraw(1,200d);
        }
        catch (InssuficientFoundException exception){
            Assert.fail();
        }
    }

}
