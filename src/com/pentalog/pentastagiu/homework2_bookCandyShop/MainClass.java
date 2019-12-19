package com.pentalog.pentastagiu.homework2_bookCandyShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String userEmail;
        String password;
        String userProduct="";
        Boolean newProduct=true;
        Integer userOption;
        Double totalPrice=0.00;

        //objects created
        Customer bobleanca=new Customer(1001, "bobleanca94", "Bobleanca Dana", "bobleancadana@yahoo.com", MembershipStatus.NO_MEMBERSHIP );

        Product book1=new Book("2001", "Effective Java\t\t\t\t", 50.00, "Joshua Bloch");
        Product book2=new Book("2002", "Java: A Beginner’s Guide\t\t", 72.00, "Herbert Schildt");
        Product book3=new Book("2003", "HTML and CSS:Design and Build Websites\t", 91.00, "John Ducket");
        Product book4=new Book("2004", "Interactive Front-End Web Development\t", 32.00, "John Ducket");

        Product candy1=new Candy("3001", "Candies with white chocolate Casali\t", 6.99, 100.00);
        Product candy2=new Candy("3002", "Candies with taste and aroma of cherries Joy", 4.99, 100.00);
        Product candy3=new Candy("3003", "Candies with chocolate and coffee Ferrero", 17.30, 225.00);
        Basket basket=new Basket();

        //create a list and adding products to list
        List<Product> product=new ArrayList<>();
        product.add(book1);
        product.add(book2);
        product.add(book3);
        product.add(book4);
        product.add(candy1);
        product.add(candy2);
        product.add(candy3);


        //display in the console the list of products
        System.out.println("PRODUCT ID\t\t PRODUCT NAME\t\t\t\t\t PRODUCT PRICE\n");
        for(int i=0;i<product.size();i++) {
            System.out.println(product.get(i).getProductId() +"\t\t"+ product.get(i).getProductName() +"\t\t\t"+  product.get(i).getPrice() );
        }

        //login user to add  products in the basket
        System.out.println("\n\nPlease login if you want to order a product \nEnter your email ------(bobleancadana@yahoo.com)--------");
        userEmail=scan.nextLine();
        System.out.println("Enter your password ------(bobleanca94)------");
        password=scan.nextLine();
        if((userEmail.equals(bobleanca.getEmail()) && password.equals(bobleanca.getPassword()))){
            System.out.println("\n---------------------------------------------------------------------------------------");
            System.out.println("Login successfully");

            //	adding products to the basket
            while(newProduct) {
                System.out.println("Choose your product by entering a PRODUCT ID");
                userProduct=scan.nextLine();

                for(int i=0;i<product.size();i++) {
                    if(product.get(i).getProductId().contains(userProduct)) {
                        basket.setTotalPrice(totalPrice+=product.get(i).getPrice());
                        basket=new Basket(bobleanca, product.get(i), basket.getTotalPrice());
                        //display in the console the product choose and total value from basket
                        System.out.println("\n-----------------------------------YOUR PRODUCT DETAILS--------------------------------");
                        System.out.println("User id\t\tUser Name\t\tProduct Id\tPoduct Price\tTotal Price basket");
                        System.out.println(basket.getCustomer().getIdUser()+"\t\t"+basket.getCustomer().getName()+"\t\t" +product.get(i).getProductId()+"\t\t\t"+product.get(i).getPrice()+"\t\t"+totalPrice);
                    }
                }
                //add more products in the basket
                System.out.println("\nDo you want to add new product in the basket?\n1 - YES\n2 - NO ");
                userOption=scan.nextInt();
                if(userOption==1) {
                    newProduct=true;
                    userProduct=scan.nextLine();
                }else {
                    newProduct=false;
                    //display total price without discount, price with discount and the value of the discount
                    System.out.println("\n-----------------------------------YOUR BASKET DETAILS--------------------------------");
                    System.out.println("TOTAL BASCHET \t\t PRICE WITH DISCOUNT\t\t DISCOUNT BASED ON MEMBERSHIP");
                    System.out.println(basket.getTotalPrice()+"\t\t\t\t"+ basket.getTotalBasketWithDiscount(basket.getTotalPrice())+"\t\t\t\t"+ basket.getDiscountPrice(totalPrice));
                }
            }
        }else {
            System.out.println("Your login details are invalid");
        }

    }
}
