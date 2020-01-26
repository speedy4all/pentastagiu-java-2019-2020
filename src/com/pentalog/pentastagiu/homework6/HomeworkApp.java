package com.pentalog.pentastagiu.homework6;

import java.lang.reflect.GenericDeclaration;

public class HomeworkApp {
    private static CashDispencer cashDispencer = new CashDispencer();

    public static void main(String[] args) {
        int clientId = 2;
        initialization();

        System.out.println("Client that exists");
        try {
            doesAccountExists(clientId);

            System.out.println("You have " + getBalance(clientId) + " in your account");
            depositMoneyInAccount(clientId, 200.0);
            System.out.println("You have " + getBalance(clientId) + " in your account");

            withdrawMoneyFromAccount(clientId, 200.0);
            System.out.println("You have " + getBalance(clientId) + " in your account");
            withdrawMoneyFromAccount(clientId, 700.0);
            System.out.println("You have " + getBalance(clientId) + " in your account");
        } catch (ClientNotFoundException | InsufficientFoundsException ex) {
            System.out.println(ex.getMessage());
        } finally {
            endSession(clientId);
        }

        System.out.println("Client that does not exists");
        clientId = 4;

        try {
            doesAccountExists(clientId);

            System.out.println("You have " + getBalance(clientId) + " in your account");
            depositMoneyInAccount(clientId, 200.0);
            System.out.println("You have " + getBalance(clientId) + " in your account");

            withdrawMoneyFromAccount(clientId, 200.0);
            System.out.println("You have " + getBalance(clientId) + " in your account");
            withdrawMoneyFromAccount(clientId, 700.0);
            System.out.println("You have " + getBalance(clientId) + " in your account");
        } catch (ClientNotFoundException | InsufficientFoundsException ex) {
            System.out.println(ex.getMessage());
        } finally {
            endSession(clientId);
        }
    }

    public static void initialization() {
        cashDispencer.startSession(1, 200.0);
        cashDispencer.startSession(2, 300.0);
        cashDispencer.startSession(3, 500.0);
    }

    public static void doesAccountExists(Integer account) throws ClientNotFoundException{
        if(!cashDispencer.accountIsValid(account))
            throw new ClientNotFoundException();
    }

    public static Double getBalance(Integer account) {
       return cashDispencer.getAccountBalance(account);
    }

    public static void depositMoneyInAccount(Integer account, Double amount) {
        cashDispencer.deposit(account, amount);
        System.out.println("You have added 200 in your account");
    }

    public static void withdrawMoneyFromAccount(Integer account, Double amount) throws InsufficientFoundsException {
        if(cashDispencer.getAccountBalance(account) < amount)
            throw new InsufficientFoundsException();
        cashDispencer.withdraw(account, amount);
    }

    private static void endSession(Integer account) {
        cashDispencer.endSession(account);
    }
}
