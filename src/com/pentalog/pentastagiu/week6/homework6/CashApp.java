package com.pentalog.pentastagiu.week6.homework6;

import java.util.HashMap;
import java.util.Map;

public class CashApp {
    public static void main(String[] args) throws InsufficientFoundsException {
        CashDispenser cashDispenser = new CashDispenser();
        try{
            cashDispenser.startSession(1,1200.0);
        }catch (ClientNotFoundException ex){
            System.out.println(ex.getNegativeMessage());
        }

        try{
            cashDispenser.deposit(1,300.0);
        }catch (ClientNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (InsufficientFoundsException ex){
            System.out.println(ex.getNegativeNumbersMessage());
        }

        try {
            System.out.println(cashDispenser.getAccountBalance(1));
        } catch (ClientNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try{
            cashDispenser.deposit(1,-10.0);
        }catch (ClientNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (InsufficientFoundsException ex){
            System.out.println(ex.getNegativeNumbersMessage());
        }

        try{
            System.out.println(cashDispenser.getAccountBalance(1));
        } catch (ClientNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            cashDispenser.withdraw(1, -1500.0);
        } catch (ClientNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (InsufficientFoundsException ex ){
            System.out.println(ex.getNegativeNumbersMessage()) ;  //cum chemam 2 mesaje din aceeasi exceptie in acest caz? 2 exceptii:
        }
                                                                   // 1. suma negativa 2. suma retrasa mai mare decat soldul
        try {
            System.out.println(cashDispenser.getAccountBalance(1));
        }catch (ClientNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            cashDispenser.withdraw(1, 1100.0);
        } catch (ClientNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (InsufficientFoundsException ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println(cashDispenser.getAccountBalance(1));
        } catch (ClientNotFoundException ex ){
            System.out.println(ex.getMessage());
        }

        try {
            cashDispenser.endSession(1);
        }catch (ClientNotFoundException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("\n-------------------------------------------------");
        try{
            cashDispenser.startSession(2,3250.0);
        }catch (ClientNotFoundException ex){
            System.out.println(ex.getNegativeMessage());
        }

        try{
            cashDispenser.deposit(3,1000.0);
        }catch (ClientNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch (InsufficientFoundsException ex){
            System.out.println(ex.getNegativeNumbersMessage());
        }

        try {
            System.out.println(cashDispenser.getAccountBalance(2));
        }catch (ClientNotFoundException ex){
            System.out.println(ex.getMessage());
        }

        try {
            cashDispenser.withdraw(2, 1500.0);
        } catch (ClientNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch (InsufficientFoundsException ex){
            System.out.println(ex.getMessage());
        }


        try {
            cashDispenser.endSession(2);
        }catch (ClientNotFoundException ex){
            System.out.println(ex.getMessage());
        }


        System.out.println("\n---------------------------------------");
        try{
            cashDispenser.startSession(1,1000.0);
        }catch (ClientNotFoundException ex){
            System.out.println(ex.getNegativeMessage());
        }

        try{
            System.out.println(cashDispenser.getAccountBalance(7));
        } catch (ClientNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public static class CashDispenser implements lCashDispenser{
        private Map<Integer, Double> clients = new HashMap<>();

        @Override
        public void startSession(Integer account, Double amount) {
            if(clients.containsKey(account)){ throw new ClientNotFoundException(account);}
            clients.put(account,amount);
            System.out.printf("Client with account %1s , with amount Ron %1s\n ",account,amount);
        }

        @Override
        public Boolean accountIsValid(Integer account) {
            if (!clients.containsKey(account)) {
                throw new ClientNotFoundException(account);
            }
            //   System.out.printf("Client with account %1s is valid.", account);
            return true;
        }
        @Override
        public Double getAccountBalance(Integer account) {
            if (!accountIsValid(account)) { throw new ClientNotFoundException(account);}

            System.out.printf("\nThe balance of account %1s is: ",account);
            return clients.get(account);
        }

        @Override
        public void deposit(Integer account, Double amount) {
            if (!accountIsValid(account)) { throw new ClientNotFoundException(account);}
            if(amount<0){ throw new InsufficientFoundsException();}

            double newAmount = clients.get(account) + amount;
            clients.put(account,newAmount);
            System.out.printf("Depositing %1s ron to account %2s\n",amount,account);
        }

        @Override
        public void withdraw(Integer account, Double amount) {
            if (!accountIsValid(account)) { throw new ClientNotFoundException(account);}
            if ( amount > clients.get(account)) { throw new InsufficientFoundsException(amount - clients.get(account));}
            if( amount <0 ) { throw new InsufficientFoundsException(amount);}
            System.out.printf("\nWithdrawing %1s RON.", amount);
            double newAmount = clients.get(account) - amount;
            clients.put(account, newAmount);

        }

        @Override
        public void endSession(Integer account) {
            if(!clients.containsKey(account)) throw new ClientNotFoundException(account);
            clients.remove(account);
            System.out.printf("Signing out of %1s account",account);
        }
    }
    static class ClientNotFoundException extends RuntimeException{
        private Integer account;

        public ClientNotFoundException(Integer account) {
            this.account = account;
        }

        public String getMessage() {
            return String.format("\nClient with account %1s not found.",account);
        }
        public String getNegativeMessage() {
            return "\nThere is already  a client with  this number account";
        }

    }
    static class InsufficientFoundsException extends RuntimeException{
        private Double amount;

        public InsufficientFoundsException(Double amount) {
            this.amount = amount;
        }

        public InsufficientFoundsException() {
        }

        public String getMessage() {
            return String.format("\nSorry, but you are short %1s RON", amount);
        }
        public String getNegativeNumbersMessage() {
            return "\nSorry, negative numbers are not allowed.";
        }
    }
}
