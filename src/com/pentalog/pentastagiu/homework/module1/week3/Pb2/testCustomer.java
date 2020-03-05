package com.pentalog.pentastagiu.homework.module1.week3.Pb2;

public class testCustomer {
    public static void main(String[] args) {
        Customer Gigel = new Customer("Gigel", MemberShip.NONE);
        ItemForSale chupaChups = new Candy(10, "ChupaChups", 10);
        Gigel.addToBasket(chupaChups);
        Gigel.addToBasket(new Book(20, "Book1", "Gigel2"));
        Gigel.printBasketPrice();
        Gigel.setMyMemberShip(MemberShip.GOLD);
        Gigel.printBasketPrice();
    }
}
