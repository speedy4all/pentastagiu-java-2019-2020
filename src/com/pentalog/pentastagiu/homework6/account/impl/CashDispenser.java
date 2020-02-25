package com.pentalog.pentastagiu.homework6.account.impl;

import com.pentalog.pentastagiu.homework6.account.ICashDispenser;
import com.pentalog.pentastagiu.homework6.exceptions.ClientNotFoundException;
import com.pentalog.pentastagiu.homework6.exceptions.InsufficientFoundsException;
import com.pentalog.pentastagiu.homework6.exceptions.InvalidAccountException;
import com.pentalog.pentastagiu.homework6.exceptions.InvalidClientException;

import java.util.HashMap;
import java.util.Map;

public class CashDispenser implements ICashDispenser {

    private Map<Integer, Double> clients = new HashMap<>();

    @Override
    public void startSession(Integer account, Double amount) {
        if (isNewClientInvalid(account, amount)) {
            throw new InvalidClientException();
        }
        clients.put(account, amount);
    }

    @Override
    public Boolean accountIsValid(Integer account) {
        if (!isAccountAlreadyExisting(account)) {
            throw new ClientNotFoundException(account);
        }
        return true;
    }

    @Override
    public Double getAccountBalance(Integer account) {
        if (!isAccountAlreadyExisting(account)) {
            throw new ClientNotFoundException(account);
        }
        return clients.get(account);
    }

    @Override
    public void deposit(Integer account, Double amount) {
        if (isAccountNumbersInvalid(account, amount)) {
            throw new InvalidAccountException();
        }
        if (!isAccountAlreadyExisting(account)) {
            throw new ClientNotFoundException(account);
        }
        double newAmount = clients.get(account) + amount;
        clients.put(account, newAmount);
        System.out.printf("\nDepositing %1s RON to %2s ...", amount, account);
    }

    @Override
    public void withdraw(Integer account, Double amount) {
        if (isAccountNumbersInvalid(account, amount)) {
            throw new InvalidAccountException();
        }
        if (!isAccountAlreadyExisting(account)) {
            throw new ClientNotFoundException(account);
        }
        if (clients.get(account).compareTo(amount) < 0) {
            throw new InsufficientFoundsException(amount - clients.get(account));
        }
        withdrawMoney(account, amount);
    }

    @Override
    public void endSession(Integer account) {
        clients.remove(account);
    }

    private boolean isNewClientInvalid(Integer account, Double amount) {
        return isAccountNumbersInvalid(account, amount) || isAccountAlreadyExisting(account);
    }

    private boolean isAccountAlreadyExisting(Integer account) {
        return clients.containsKey(account);
    }

    private boolean isAccountNumbersInvalid(Integer account, Double amount) {
        return account == null || account <= 0 || amount == null || amount < 0;
    }

    private void withdrawMoney(Integer account, Double amount) {
        System.out.printf("\nWithdrawing %1s RON ", amount);
        double newAmount = clients.get(account) - amount;
        clients.put(account, newAmount);
    }

}
