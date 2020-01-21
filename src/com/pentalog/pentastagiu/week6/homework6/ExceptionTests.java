package com.pentalog.pentastagiu.week6.homework6;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExceptionTests {
    private CashApp.CashDispenser cashDispenser = new CashApp.CashDispenser();

    @Before
    public void setUp() {
        cashDispenser.startSession(1,1000.0);
        cashDispenser.startSession(2,200.0);
    }
    @After
    public void tearDown(){
       // cashDispenser.startSession(null,0.0);
      //  cashDispenser.startSession(null,0.0);
    }

    @Test(expected = CashApp.ClientNotFoundException.class)
    public void startSessionClientAlreadyExist() throws CashApp.ClientNotFoundException {
        cashDispenser.startSession(1, 1000.0);
        cashDispenser.startSession(1,250.0);
    }

    @Test(expected = CashApp.ClientNotFoundException.class)
    public void accountIsValid() throws CashApp.ClientNotFoundException {
        cashDispenser.startSession(1, 2050.0);
        Assert.assertTrue(cashDispenser.accountIsValid(1));
    }

    @Test(expected = CashApp.ClientNotFoundException.class)
    public void accountIsNotValid() throws CashApp.ClientNotFoundException {
        cashDispenser.startSession(1, 200.0);
        Assert.assertTrue(cashDispenser.accountIsValid(8));
    }

    @Test
    public void getAccountBalance() throws CashApp.ClientNotFoundException {
        cashDispenser.startSession(12, 320.0);
        Double accountBalance = cashDispenser.getAccountBalance(12);
        Assert.assertTrue(cashDispenser.accountIsValid(12));
        System.out.println(accountBalance);
    }

    @Test(expected = CashApp.ClientNotFoundException.class)
    public void getAccountBalanceInvalidClient() throws CashApp.ClientNotFoundException {
        cashDispenser.startSession(12, 320.0);
        Double accountBalance = cashDispenser.getAccountBalance(12);
        Assert.assertTrue(cashDispenser.accountIsValid(13));
        System.out.println(accountBalance);
    }

    @Test
    public void depositInValidAccount() throws CashApp.ClientNotFoundException {
        cashDispenser.startSession(12, 1253.0);
        cashDispenser.deposit(12, 1000.0);
        Assert.assertTrue(cashDispenser.accountIsValid(12));
    }

    @Test(expected = CashApp.ClientNotFoundException.class)
    public void depositInInvalidAccount() throws CashApp.ClientNotFoundException {
        cashDispenser.startSession(12, 1253.0);
        cashDispenser.deposit(12, 1000.0);
        Assert.assertTrue(cashDispenser.accountIsValid(20));
    }

    @Test(expected = CashApp.InsufficientFoundsException.class)
    public void depositNegativeSum() throws CashApp.InsufficientFoundsException{
        cashDispenser.startSession(10,120.0);
        cashDispenser.deposit(10,-120.0);
    }

    @Test(expected = CashApp.ClientNotFoundException.class)
    public void withdrawFromInvalidClient () throws CashApp.ClientNotFoundException{
        cashDispenser.startSession(10,200.0);
        cashDispenser.withdraw(11,20.0);
    }

    @Test(expected = CashApp.InsufficientFoundsException.class)
    public void withdrawMoreThanExistingInAccount()throws CashApp.InsufficientFoundsException{
        cashDispenser.startSession(10,600.0);
        cashDispenser.withdraw(10,700.0);
    }

    @Test(expected = CashApp.InsufficientFoundsException.class)
    public void withdrawNegativeSums () throws CashApp.InsufficientFoundsException{
        cashDispenser.startSession(10,500.0);
        cashDispenser.withdraw(10,-100.0);
    }

    @Test(expected = CashApp.ClientNotFoundException.class)
    public void endSession () throws CashApp.ClientNotFoundException{
        cashDispenser.startSession(12,200.0);
        cashDispenser.endSession(13);
    }

}
