package com.pentalog.pentastagiu.homeworok6.tests;

import com.pentalog.pentastagiu.homeworok6.cash.app.CashDispenser;
import com.pentalog.pentastagiu.homeworok6.cash.app.ClientNotFoundException;
import com.pentalog.pentastagiu.homeworok6.cash.app.InssuficientFoundException;
import com.pentalog.pentastagiu.week6.InsufficientFoundsException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CashDispenserTest {

    CashDispenser cd = new CashDispenser();
    private  Map<Integer, Double> clients = new HashMap<>();

    @Before
    public void init() {
        clients.put(1, 400.0);
        clients.put(2, 450.0);
        clients.put(3, 600.0);
        clients.put(4, 1400.0);
        clients.put(5, 2400.0);
        clients.put(6, 900.0);
        clients.put(7, 700.0);
        cd.setClients(clients);
    }

    @Test
    public void startSessionNoErrorTest() {
        cd.startSession(1, 200.0);
    }

    @Test
    public void accountIsValidTrue() {
        Boolean result = cd.accountIsValid(1);
        Assert.assertTrue(result);
    }

    @Test(expected = ClientNotFoundException.class)
    public void accountIsValidNotTrue() {
        Boolean result = cd.accountIsValid(12);
    }

    @Test
    public void getAccountBalanceTrue() {
        Double expected = 400.0;
        Double actual = cd.getAccountBalance(1);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getAccountBalanceFalse() {
        Double expected = 200.0;
        Double actual = cd.getAccountBalance(1);
        Assert.assertNotEquals(expected, actual, 0);
    }

    @Test
    public void depositCorrect() {
        cd.deposit(2,300.0);
        double expected = 750;
        double actual = clients.get(2);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void depositNotCorrect() {
        cd.deposit(2,300.0);
        double expected = 450;
        double actual = clients.get(2);
        Assert.assertNotEquals(expected, actual, 0);
    }

    @Test
    public void withdrawCorrect() {
        cd.withdraw(3, 100.0);
        Double expected = 500.0;
        Double actual = clients.get(3);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test( expected = InssuficientFoundException.class)
    public void withdrawWithException() {
        cd.withdraw(3, 1000.0);
    }

    @After
    public void end() {
        cd.endSession(1);
        cd.endSession(2);
        cd.endSession(3);
        cd.endSession(4);
        cd.endSession(5);
        cd.endSession(6);
        cd.endSession(7);
    }
}
