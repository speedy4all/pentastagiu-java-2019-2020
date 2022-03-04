package com.pentalog.pentastagiu.homework2.shop;

public class ShopApp {

    public static void main(String[] args){



        BooksOfShop book1= new BooksOfShop(52.10, "Harvey Dietel");
        BooksOfShop book2= new BooksOfShop(10.50, "Margaret Mitchell");
        CandyOfShop candy1= new CandyOfShop(35, 600);



        ClientsOfShop client1= new ClientsOfShop("Marin Diana", MembershipStatus.GOLD);




    }
}
