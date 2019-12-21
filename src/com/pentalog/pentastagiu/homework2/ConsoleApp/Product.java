package com.pentalog.pentastagiu.homework2.ConsoleApp;

public class Product {
    private static int Counter=0;
    private int Id;
    private float Price;
    private String Name;


    Product(int Price, String Name)
    {
        Id=Counter++;
        this.Price=Price;
        this.Name=Name;
    }

    public int getId() {
        return Id;
    }



    public float getPrice() {
        return Price;
    }



    public String getName() {
        return Name;
    }


}



