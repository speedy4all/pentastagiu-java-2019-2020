package com.pentalog.pentastagiu.homework2.bankaccount.impl;

import com.pentalog.pentastagiu.homework2.bankaccount.BankAccount;
import com.pentalog.pentastagiu.homework2.exceptions.InsufficientMoneyException;
import com.pentalog.pentastagiu.homework2.exceptions.NegativeDepositAmountException;

public class BankAccountImpl implements BankAccount {

    private int moneyInAccount;

    @Override
    public void withdrawMoney(int amount) throws InsufficientMoneyException {
        if (amount > moneyInAccount) {
            throw new InsufficientMoneyException();
        }
        moneyInAccount -= amount;
    }

    @Override
    public void depositMoney(int amount) throws NegativeDepositAmountException {
        if (amount < 0) {
            throw new NegativeDepositAmountException();
        }
        moneyInAccount += amount;
    }

    @Override
    public int getMoneyInAccount() {
        return moneyInAccount;
    }

    @Override
    public String toString() {
        return "Your account has " + moneyInAccount;
    }
}
