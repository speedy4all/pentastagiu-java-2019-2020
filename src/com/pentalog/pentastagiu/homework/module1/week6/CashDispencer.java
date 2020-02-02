package com.pentalog.pentastagiu.homework.module1.week6;

import java.util.HashMap;

public class CashDispencer implements ICashDispencer {
    static HashMap<Integer, Double> clients = new HashMap<>();

    @Override
    public void startSession(Integer account, Double amount) {
        System.out.println("Starting session for " + account + " with " + amount + "$");
        clients.put(account, amount);
    }

    @Override
    public Boolean accountIsValid(Integer account) throws ClientNotFoundException{
        if(!clients.containsKey(account))
            throw new ClientNotFoundException();
        return true;
    }

    @Override
    public void endSession(Integer account) {
        System.out.println("Ending session for " + account);
        clients.remove(account);
    }

    @Override
    public Double getAccountBalance(Integer account) throws ClientNotFoundException {
        accountIsValid(account);
        return clients.get(account);
    }

    @Override
    public void deposit(Integer account, Double amount) throws ClientNotFoundException, NegativeAmountException {
        System.out.println("Depositing " + amount + "$ to " +account);
        accountIsValid(account);
        if(amount < 0)
            throw new NegativeAmountException(true);
        clients.put(account, clients.get(account)+amount);
    }

    @Override
    public void withdraw(Integer account, Double amount) throws ClientNotFoundException, NegativeAmountException, InsufficientFundsException{
        System.out.println("Withdrawing " + amount + "$ from " + account);
        accountIsValid(account);
        if(amount < 0)
            throw new NegativeAmountException(true);
        if(amount > clients.get(account))
            throw new InsufficientFundsException();
        clients.put(account, clients.get(account)-amount);
    }

}
