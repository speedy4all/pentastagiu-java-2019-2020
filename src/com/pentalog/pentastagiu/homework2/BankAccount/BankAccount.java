package com.pentalog.pentastagiu.homework2.BankAccount;

import com.pentalog.pentastagiu.homework2.Exceptions.InsufficientMoneyException;
import com.pentalog.pentastagiu.homework2.Exceptions.NegativeDepositAmountException;

public interface BankAccount {
    void withdrawMoney(int amount) throws InsufficientMoneyException;

    void depositMoney(int amount) throws NegativeDepositAmountException;

    int getMoneyInAccount();
}
