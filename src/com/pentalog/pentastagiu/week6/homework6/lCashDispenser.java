package com.pentalog.pentastagiu.week6.homework6;

public interface lCashDispenser {
    void startSession(Integer account, Double amount);
    Boolean accountIsValid(Integer account);
    Double getAccountBalance(Integer account);
    void deposit(Integer account, Double amount);
    void withdraw(Integer account, Double amount);
    void endSession(Integer account);

}
