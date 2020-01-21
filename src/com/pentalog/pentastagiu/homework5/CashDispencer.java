package com.pentalog.pentastagiu.homework5;

import java.util.HashMap;

public class CashDispencer implements ICacheDispencer {

    private HashMap<Integer, Double> clients = new HashMap<>();



    @Override
    public void startSession(int account, double amount) {
        clients.put(account, amount);

    }

    @Override
    public boolean accountIsValid(int account) {
        if (!clients.containsKey(account)){
            throw new ClientNotFoundException(account);
        }

        return true;
    }

    @Override
    public double getAccountBalance(int account) {
        return clients.get(account);
    }

    @Override
    public void deposit(int account, double amount) {
        double newAmount = clients.get(account) + amount;
        clients.put(account, newAmount);
        System.out.printf("\nDepositing %1s RON to %2s ...", amount, account);
    }

    @Override
    public void withdraw(int account, double amount) {
        if (accountIsValid(account)) {
            if (clients.get(account).compareTo(amount) < 0) {
                throw new InsufficientFoundsException(amount - clients.get(account));
            }
            System.out.printf("\nWithdrawing %1s RON", amount);
            double newAmount = clients.get(account) - amount;
            clients.put(account, newAmount);
        }
    }

    @Override
    public void endSession(int account) {
        clients.remove(account);
        System.out.printf("\nClient %1s finished transaction.", account);
    }
}
