package com.pentalog.pentastagiu.homework6.business;

import com.pentalog.pentastagiu.homework6.exceptions.ClientNotFoundException;
import com.pentalog.pentastagiu.homework6.exceptions.InsufficientFundsException;

import java.util.*;

public class CashDispenser implements ICashDispenser {

    private HashMap<Integer, Double> clients = new HashMap<>();



    @Override
    public void startSession(Integer account, Double amount) {
        clients.put(account, amount);

    }

    @Override
    public Boolean accountIsValid(Integer account) {
        if (!clients.containsKey(account)){
            throw new ClientNotFoundException(account);
        }

        return true;
    }

    @Override
    public Double getAccountBalance(Integer account) {
        return clients.get(account);
    }

    @Override
    public void deposit(Integer account, Double amount) {
        double newAmount = clients.get(account) + amount;
        clients.put(account, newAmount);
        System.out.printf("\nDepositing %1s RON to client's account number %2s ...", amount, account);
    }

    @Override
    public void withdraw(Integer account, Double amount) {
        if (accountIsValid(account)) {
            if (clients.get(account).compareTo(amount) < 0) {
                throw new InsufficientFundsException(amount - clients.get(account));
            }
            System.out.printf("\nWithdrawing %1s RON", amount);
            double newAmount = clients.get(account) - amount;
            clients.put(account, newAmount);
        }
    }

    @Override
    public void endSession(Integer account) {
        clients.remove(account);
        System.out.printf("\nClient %1s finished transaction.", account);
    }
}