package com.pentalog.pentastagiu.homeworkWeek6;

import java.util.HashMap;
import java.util.Map;

public class CashDispencer implements ICashDispencer {
    private Map<Integer, Double> clients = new HashMap<>();

    @Override
    public void startSession(Integer account, Double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Only positive numbers!!");
        }
        clients.put(account, amount);
    }

    @Override
    public Boolean accountIsValid(Integer account) {
        if (!clients.containsKey(account)) {
            throw new ClientNotFoundException(account);
        }
        return true;
    }

    @Override
    public Double getAccountBalance(Integer account) {
        Double actualAmount = 0d;
        if (accountIsValid(account)){
            actualAmount = clients.get(account);
            System.out.printf("\nYou have %1s RON in your account %2s", actualAmount, account);
        }

        return actualAmount;
    }

    @Override
    public void deposit(Integer account, Double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Only positive numbers!!");
        }
        if (accountIsValid(account)) {
            Double newAmount = clients.get(account) + amount;
            clients.put(account, newAmount);
            System.out.printf("\nDepositing %1s RON to %2s ...", amount, account);
        }
    }

    @Override
    public void withdraw(Integer account, Double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Only positive numbers!!");
        }
        if (accountIsValid(account)) {
            if (clients.get(account).compareTo(amount) < 0) {
                throw new InsufficientFoundsExceptions(amount - clients.get(account));
            }
            System.out.printf("\nWithdrawing %1s RON", amount);
            Double newAmount = clients.get(account) - amount;
            clients.put(account,newAmount);
        }

    }

    @Override
    public void endSession(Integer account) {
        clients.remove(account);
    }
}
