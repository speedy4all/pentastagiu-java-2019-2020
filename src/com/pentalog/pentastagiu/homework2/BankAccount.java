package com.pentalog.pentastagiu.homework2;

public class BankAccount {

    private Integer accountId;
    private String bankName;
    private String username;
    private String currency;
    private Double balance;
    private String typeAccount;


    public Integer getAccountId() {
        return accountId;
    }

    public String getBankName() {
        return bankName;
    }

    public String getUsername() {
        return username;
    }

    public String getCurrency() {
        return currency;
    }

    public Double getBalance() {
        return balance;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


    public BankAccount(Integer accountId, String bankName, String username, String currency, Double balance, String typeAccount) {
        this.accountId = accountId;
        this.bankName = bankName;
        this.username = username;
        this.currency = currency;
        this.balance = balance;
        this.typeAccount = typeAccount;
    }
}
