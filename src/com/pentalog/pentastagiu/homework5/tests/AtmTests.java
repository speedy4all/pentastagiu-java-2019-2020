package com.pentalog.pentastagiu.homework5.tests;

import com.pentalog.pentastagiu.homework5.CashDispencer;
import com.pentalog.pentastagiu.homework5.ClientNotFoundException;
import com.pentalog.pentastagiu.homework5.InsufficientFoundsException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AtmTests {
    private CashDispencer  dispencer = new CashDispencer();


    @Before
    public void start(){
        dispencer.startSession(1234, 100.00);
    }

    @After
    public void end(){
        dispencer=null;
    }

    @Test(expected=ClientNotFoundException.class)
    public void checkValidClientException(){
         dispencer.accountIsValid(200);
    }

    @Test(expected=InsufficientFoundsException.class)
    public void checkWithdrawException(){
        dispencer.withdraw(1234, 180.00);
    }

    @Test
    public void checkNegativeWithdrawException(){
        dispencer.withdraw(1234, -3.00);
    }

    @Test
    public void checkNegativeDeposit(){
        dispencer.deposit(1234, -5.00);
    }

    @Test
    public void checkDeposit(){
        dispencer.deposit(1234, 5.00);
    }

    @Test
    public void checkBalance(){
        Double balance;
       balance= dispencer.getAccountBalance(1234);
        System.out.println("Balance is " + balance );
    }

    @Test
    public void checkAccountOperations(){
        Double balance;
        dispencer.deposit(1234, 100.00);
        dispencer.withdraw(1234, 50.00);
        balance=dispencer.getAccountBalance(1234);
        System.out.println("\nBalance: " + balance);

        Assert.assertEquals(balance,150.00,0);
    }

}
