package com.pentalog.pentastagiu.homework2.bankaccount;

import com.pentalog.pentastagiu.homework2.exceptions.InsufficientMoneyException;
import com.pentalog.pentastagiu.homework2.exceptions.NegativeDepositAmountException;

public interface BankAccount {
    void withdrawMoney(int amount) throws InsufficientMoneyException;

    void depositMoney(int amount) throws NegativeDepositAmountException;

    int getMoneyInAccount();
}
