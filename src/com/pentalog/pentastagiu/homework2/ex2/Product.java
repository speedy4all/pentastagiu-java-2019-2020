package com.pentalog.pentastagiu.homework2.ex2;

public class Product {
    private static int price;
    private int id;
    private  String name;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void modify20(int price)
    {
        this.price=  price+ (int) (price*0.2);
    }
    public void modify10(int price)
    {
        this.price=  price+(int) (price*0.1);
    }

}
