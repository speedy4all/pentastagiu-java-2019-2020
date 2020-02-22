package com.pentalog.pentastagiu.homework6;

import java.util.HashMap;
import java.util.Map;

public class CashDispencer implements ICashDispencer{
    private Map<Integer, Double> clients = new HashMap<>();


    @Override
    public void startSession(Integer account, Double amount) {
        clients.put(account, amount);
    }

    @Override
    public Boolean accountIsValid(Integer account) {
        try {
            if (!clients.containsKey(account)) {
            throw new ClientNotFoundException(account);
        }
        System.out.printf("\nAccount is valid");
            return true;
        }catch (ClientNotFoundException ex){
            System.out.printf("\nAcoount is not valid");
            return false;
        }

    }

    @Override
    public Double getAccountBalance(Integer account) {
        System.out.printf("\nBalance for account %1s is: %2s", account, clients.get(account));
        return clients.get(account);

    }

    @Override
    public void deposit(Integer account, Double amount) {
        double newAmount = clients.get(account) + amount;
        clients.put(account, newAmount);
        System.out.printf("\nDepositing %1s RON to %2s ...", amount, account);
    }

    @Override
    public void endSession(Integer account) {
        clients.remove(account);
        System.out.printf("\nClient %1s disconnected.", account);
    }

    @Override
    public void withdraw(Integer account, Double amount) {
        try{
        if (accountIsValid(account)) {
            if (clients.get(account).compareTo(amount) < 0) {
                throw new InssuficientFoundException(amount - clients.get(account));
            }
            System.out.printf("\nWithdrawing %1s RON", amount);
            double newAmount = clients.get(account) - amount;
            clients.put(account, newAmount);
        }
        }catch (InssuficientFoundException exception){
            System.out.printf(exception.getMessage());
        }
    }
}
