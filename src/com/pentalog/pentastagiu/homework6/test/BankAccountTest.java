package com.pentalog.pentastagiu.homework6.test;

import com.pentalog.pentastagiu.homework6.account.ICashDispenser;
import com.pentalog.pentastagiu.homework6.account.impl.CashDispenser;
import com.pentalog.pentastagiu.homework6.exceptions.ClientNotFoundException;
import com.pentalog.pentastagiu.homework6.exceptions.InsufficientFoundsException;
import com.pentalog.pentastagiu.homework6.exceptions.InvalidAccountException;
import com.pentalog.pentastagiu.homework6.exceptions.InvalidClientException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
    private ICashDispenser cashDispenser = new CashDispenser();

    @Before
    public void setUp() {
        cashDispenser = new CashDispenser();
        cashDispenser.startSession(100, 20d);
        cashDispenser.startSession(20, 30d);
    }

    @After
    public void tearDown() {
        cashDispenser = null;
    }

    @Test(expected = InvalidClientException.class)
    public void shouldInvalidateClientStartWhenNullAccount() {
        cashDispenser.startSession(null, 10d);
    }

    @Test(expected = InvalidClientException.class)
    public void shouldInvalidateClientStartWhenNullAmount() {
        cashDispenser.startSession(10, null);
    }

    @Test(expected = InvalidClientException.class)
    public void shouldInvalidateClientStartWhenZeroAccount() {
        cashDispenser.startSession(0, 10d);
    }

    @Test(expected = InvalidClientException.class)
    public void shouldInvalidateClientStartWhenNegativeAccount() {
        cashDispenser.startSession(0, 10d);
    }

    @Test(expected = InvalidClientException.class)
    public void shouldInvalidateClientStartWhenNegativeAmount() {
        cashDispenser.startSession(30, -1d);
    }

    @Test(expected = InvalidClientException.class)
    public void shouldInvalidateClientStartWhenAccountAlreadyExisting() {
        cashDispenser.startSession(20, 300d);
    }

    @Test
    public void shouldBeAValidClientStart() {
        int account = 30;
        cashDispenser.startSession(30, 10d);
        Assert.assertEquals(true, cashDispenser.accountIsValid(30));
    }

    @Test(expected = ClientNotFoundException.class)
    public void shouldInvalidateAccountWhenAccountNotExisting() {
        cashDispenser.accountIsValid(40);
    }

    @Test(expected = ClientNotFoundException.class)
    public void shouldInvalidateAccountWhenNullAccount() {
        cashDispenser.accountIsValid(null);
    }

    @Test
    public void shouldBeAnAccountValid() {
        boolean expectedAccountValid = true;
        Assert.assertEquals(expectedAccountValid, cashDispenser.accountIsValid(100));
    }

    @Test(expected = ClientNotFoundException.class)
    public void shouldInvalidateAccountBalanceWhenAccountNotExisting() {
        cashDispenser.getAccountBalance(40);
    }

    @Test(expected = ClientNotFoundException.class)
    public void shouldInvalidateAccountBalanceWhenNullAccount() {
        cashDispenser.getAccountBalance(null);
    }

    @Test
    public void shouldBeAValidAccountBalance() {
        Double expectedBalance = 20d;
        Assert.assertEquals(expectedBalance, cashDispenser.getAccountBalance(100));
    }

    @Test(expected = InvalidAccountException.class)
    public void shouldInvalidateDepositWhenNegativeAmount() {
        cashDispenser.deposit(100, -10d);
    }

    @Test(expected = InvalidAccountException.class)
    public void shouldInvalidateDepositWhenNullAmount() {
        cashDispenser.deposit(100, -10d);
    }

    @Test(expected = InvalidAccountException.class)
    public void shouldInvalidateDepositWhenNullAccount() {
        cashDispenser.deposit(100, -10d);
    }

    @Test(expected = ClientNotFoundException.class)
    public void shouldInvalidateDepositWhenInvalidClientAccount() {
        cashDispenser.deposit(113, 10d);
    }

    @Test
    public void shouldBeAValidClientDeposit() {
        Double expectedBalance = 50d;
        cashDispenser.deposit(100, 30d);
        Assert.assertEquals(expectedBalance, cashDispenser.getAccountBalance(100));
    }

    @Test(expected = InvalidAccountException.class)
    public void shouldInvalidateWithdrawWhenNullAccount() {
        cashDispenser.withdraw(null, 30d);
    }

    @Test(expected = InvalidAccountException.class)
    public void shouldInvalidateWithdrawWhenNullAmount() {
        cashDispenser.withdraw(100, null);
    }

    @Test(expected = InvalidAccountException.class)
    public void shouldInvalidateWithdrawWhenNegativeAmount() {
        cashDispenser.withdraw(100, null);
    }

    @Test(expected = ClientNotFoundException.class)
    public void shouldInvalidateWithdrawWhenAccountInvalidNumber() {
        cashDispenser.withdraw(130, 30d);
    }

    @Test(expected = InsufficientFoundsException.class)
    public void shouldInvalidateWithdrawWhenInsufficientFounds() {
        cashDispenser.withdraw(100, 100d);
    }

    @Test
    public void shouldBeAValidWithdraw() {
        Double expectedBalance = 10d;
        cashDispenser.withdraw(100, 10d);
        Assert.assertEquals(expectedBalance, cashDispenser.getAccountBalance(100));
    }

    @Test(expected = ClientNotFoundException.class)
    public void shouldBeAValidEndSession() {
        cashDispenser.endSession(100);
        cashDispenser.accountIsValid(100);
    }

}
