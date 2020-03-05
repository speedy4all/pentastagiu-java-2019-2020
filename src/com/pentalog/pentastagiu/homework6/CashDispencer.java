package com.pentalog.pentastagiu.homework6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CashDispencer implements ICashDispencer {
    private Map<Integer, Double> clients = new HashMap<>();

    @Override
    public void startSession(Integer account, Double amount) {
        clients.put(account, amount);
    }

    @Override
    public Boolean accountIsValid(Integer account) throws ClientNotFoundException{
        Set<Integer> clientsIds =  clients.keySet();
        for (Integer client : clientsIds) {
            if(client.equals(account))
                return true;
        }
        throw new ClientNotFoundException();
    }

    @Override
    public Double getAccountBalance(Integer account) {
        Set<Map.Entry<Integer, Double>> clientsDetails = clients.entrySet();
        for (Map.Entry<Integer, Double> client : clientsDetails) {
            if(client.getKey().equals(account))
                return client.getValue();
        }
        return (double) 0;
    }

    @Override
    public void deposit(Integer account, Double amount) {
        Set<Map.Entry<Integer, Double>> clientsDetails = clients.entrySet();
        for (Map.Entry<Integer, Double> client : clientsDetails) {
            if(client.getKey().equals(account))
                client.setValue(client.getValue()+amount);
        }
    }

    @Override
    public void withdraw(Integer account, Double amount) throws InsufficientFoundsException{
        Set<Map.Entry<Integer, Double>> clientsDetails = clients.entrySet();
        for (Map.Entry<Integer, Double> client : clientsDetails) {
            if(client.getKey().equals(account))
                if(client.getValue() < amount)
                    throw new InsufficientFoundsException();
                else{
                    client.setValue(client.getValue()-amount);
                    return;
                }
        }
    }

    @Override
    public void endSession(Integer account) {
        clients.remove(account);
    }

    public Map<Integer, Double> getClients() {
        return clients;
    }
}
