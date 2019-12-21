package com.pentalog.pentastagiu.homework2.ConsoleApp;

import javax.naming.Name;

public class Candy extends Product {
    private int Quantity;


    Candy(int Price,String Name,int Quantity){
        super(Price,Name);
        this.Quantity=Quantity;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        Quantity = this.Quantity;
    }
}
