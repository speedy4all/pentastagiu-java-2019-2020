package com.pentalog.pentastagiu.homework6.tests;

import com.pentalog.pentastagiu.homework6.CashDispencer;
import com.pentalog.pentastagiu.homework6.ClientNotFoundException;
import com.pentalog.pentastagiu.homework6.HomeworkApp;
import com.pentalog.pentastagiu.homework6.InsufficientFoundsException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class ExceptionsTests {

    @Before
    public void init(){
        HomeworkApp.initialization();
        HomeworkApp.depositMoneyInAccount(2, 200.0);
    }

    @Test
    public void accountIsValidWithoutException(){
        HomeworkApp.doesAccountExists(2);
    }

    @Test(expected = ClientNotFoundException.class)
    public void accountIsValidWithException(){
        HomeworkApp.doesAccountExists(4);
    }

    @Test
    public void withdrawWithoutException(){
        HomeworkApp.withdrawMoneyFromAccount(2, 200.0);
    }

    @Test(expected = InsufficientFoundsException.class)
    public void withdrawWithException(){
        HomeworkApp.withdrawMoneyFromAccount(2, 700.0);

    }

    @Test
    public void accountBalanceIncorrect(){
        CashDispencer cashDispencer = new CashDispencer();
        Double cashInCashDispencer = cashDispencer.getAccountBalance(2);
        Double cashInHomeworkApp = HomeworkApp.getBalance(2);
        Assert.assertNotEquals(cashInCashDispencer+200, cashInHomeworkApp);
    }

    @Test
    public void endSessionTest(){
        CashDispencer cashDispencer = new CashDispencer();
        Set<Integer> clientsIds =  cashDispencer.getClients().keySet();
        for (Integer client : clientsIds) {
            if(client.equals(2))
                Assert.fail();
        }
    }

}
