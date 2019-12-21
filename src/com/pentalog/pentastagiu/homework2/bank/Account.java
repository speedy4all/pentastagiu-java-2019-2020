package com.pentalog.pentastagiu.homework2.bank;
//
public class Account {

    String fullName;
    int accountNumber;
    private double availableMoney;

    void printAccountInfo(){

        System.out.println("Your account has "+this.availableMoney);
    }

    public double getAvailableMoney() {

        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        if (availableMoney<0){
            System.out.println("Warning: Not a valid balance");
            return;
        }
        this.availableMoney = availableMoney;
    }
}
