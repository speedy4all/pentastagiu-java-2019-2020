package com.pentalog.pentastagiu.homework2.ex1;

public class Bank {
double withdraw;
double value;
    double deposit;
    boolean debit;

    @Override
    public String toString() {
        return "Bank{" +
                "withdraw=" + withdraw +
                ", value=" + value +
                ", deposit=" + deposit +
                ", debit=" + debit +
                '}';
    }

    public Bank(Double withdraw,Double value,Double deposit,Boolean debit) {
        this.withdraw = withdraw;
        this.value = value;
        this.deposit = deposit;
        this.debit = debit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }



    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public boolean isDebit() {
        return debit;
    }

    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    public Double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Double withdraw) {
        this.withdraw = withdraw;
    }
}
