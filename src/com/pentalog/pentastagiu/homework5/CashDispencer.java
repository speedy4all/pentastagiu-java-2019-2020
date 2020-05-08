package com.pentalog.pentastagiu.homework5;

import java.util.HashMap;
import java.util.Map;

public class CashDispencer  implements ICashDispencer {

    private Map<Integer, Double> clients = new HashMap<>();
    private Double balanceAmount;

    @Override
    public void startSession(Integer account, Double amount) {
        clients.put(account, amount);
    }

    @Override
    public Boolean accountIsValid(Integer account){
        if(!clients.containsKey(account)){
            throw new ClientNotFoundException(account);
        }
        return true;
    }

    @Override
    public Double getAccountBalance(Integer account) {
        return  clients.get(account);
    }

    @Override
    public void deposit(Integer account, Double amount)  {
        if(amount<=0){
            System.out.println("Your deposit has to be a positive value, greater than 0!!");
        }else {
            balanceAmount = clients.get(account) + amount;
            clients.put(account, balanceAmount);
            System.out.printf("Depositing %1s RON to account %2s ", amount, account);
        }
    }


    @Override
    public void withdraw(Integer account, Double amount) {
            if (amount > clients.get(account)) {
                throw new InsufficientFoundsException(amount);
            } else {
                if (amount <= 0) {
                    System.out.print("Enter a positive value greater than 0");
                } else {
                    System.out.printf("Withdrawing  %1s RON from account %2s ", amount, account);
                    balanceAmount = clients.get(account) - amount;
                    clients.put(account, balanceAmount);
                }
            }
    }

    @Override
    public void endSession(Integer account) {
        clients.remove(account);
    }
}