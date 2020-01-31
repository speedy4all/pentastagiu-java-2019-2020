package com.pentalog.pentastagiu.homeworok6.cash.app;

import java.util.HashMap;
import java.util.Map;

public class CashDispenser implements ICashDispenser {

    private Map<Integer, Double> clients = new HashMap<>();

    public Map<Integer, Double> getClients() {
        return clients;
    }

    public void setClients(Map<Integer, Double> clients) {
        this.clients = clients;
    }

    @Override
    public void startSession(Integer account, Double amount) {
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
        return clients.get(account);
    }

    @Override
    public void deposit(Integer account, Double amount) {
        double newAmount = clients.get(account) + amount;
        clients.put(account, newAmount);
        System.out.printf("\nDepositing  amount: %1s RON to account: %2s ...", amount, account);
    }

    @Override
    public void withdraw(Integer account, Double amount) {
        if (accountIsValid(account)) {
            if (clients.get(account).compareTo(amount) < 0) {
                throw new InssuficientFoundException(amount - clients.get(account));
            }
            System.out.printf("\nWithdrawing %1s RON", amount);
            double newAmount = clients.get(account) - amount;
            clients.put(account, newAmount);
        }
    }

    @Override
    public void endSession(Integer account) {
        clients.remove(account);
    }
}
