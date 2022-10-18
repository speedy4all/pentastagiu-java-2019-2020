package com.pentalog.pentastagiu.homework6.tests;

import com.pentalog.pentastagiu.homework6.business.CashDispenser;
import com.pentalog.pentastagiu.homework6.exceptions.ClientNotFoundException;
import com.pentalog.pentastagiu.homework6.exceptions.InsufficientFundsException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ATMTests {

        private CashDispenser cashDispenser;

        @Before
        public void initialData(){
            cashDispenser = new CashDispenser();
            cashDispenser.startSession(45, 150d);
        }

        @After
        public void finishWithTesting() {
            cashDispenser = null;
        }

        @Test(expected = ClientNotFoundException.class)
        public void checkIfAccountIsValid(){
            cashDispenser.accountIsValid(2);

        }

        @Test(expected = InsufficientFundsException.class)
        public void checkWithdraw(){
            cashDispenser.withdraw(45,200d);

        }
        @Test
        public void checkDeposit(){
            cashDispenser.deposit(45, 50d);
            Assert.assertEquals(cashDispenser.getAccountBalance(45), 200, 0);
        }
}

