package com.pentalog.pentastagiu.homework5;

public interface ICacheDispencer {

    void startSession(int account, double amount);

    boolean accountIsValid(int account);

    double getAccountBalance(int account);

    void deposit(int account, double amount);

    void withdraw(int account, double amount);

    void endSession(int account);

}
