package com.pentalog.pentastagiu.homework6.business;

public interface ICashDispenser {

        void startSession(Integer account, Double amount);

        Boolean accountIsValid(Integer account);

        Double getAccountBalance(Integer account);

        void deposit(Integer account, Double amount);

        void withdraw(Integer account, Double amount);

        void endSession(Integer account);
}
