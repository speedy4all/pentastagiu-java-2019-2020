package com.pentalog.pentastagiu.week6;

import java.util.HashMap;
import java.util.Map;

public class CashingApp {
    public static void main(String[] args) {
        ICashDispenser cashDispenser = new CashDispenser();
        cashDispenser.startSession(100, 400d);
        cashDispenser.startSession(101, 200d);

        if (cashDispenser.getAccountBalance(100) < 1000) {
            cashDispenser.deposit(100, 1000d);
        }
        cashDispenser.withdraw(100, 100d);
        cashDispenser.endSession(101);
    }

    interface ICashDispenser {
        void startSession(Integer account, Double amount);

        Boolean accountIsValid(Integer account);

        Double getAccountBalance(Integer account);

        void deposit(Integer account, Double amount);

        void endSession(Integer account);

        void withdraw(Integer account, Double amount);
    }

    static class CashDispenser implements ICashDispenser {

        private Map<Integer, Double> clients = new HashMap<>();

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
            System.out.printf("\nDepositing %1s RON to %2s ...", amount, account);
        }

        @Override
        public void endSession(Integer account) {
            clients.remove(account);
            System.out.printf("\nClient %1s disconnected.", account);
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
    }

    static class ClientNotFoundException extends RuntimeException {
        private Integer account;

        public ClientNotFoundException(Integer account) {
            this.account = account;
        }

        @Override
        public String getMessage() {
            return String.format("\nClient %1s was not found", account);
        }
    }

    static class InssuficientFoundException extends RuntimeException {
        private Double amount;

        public InssuficientFoundException(Double amount) {
            this.amount = amount;
        }

        @Override
        public String getMessage() {
            return String.format("\nSorry, but you are short %1s RON", amount);
        }
    }
}
