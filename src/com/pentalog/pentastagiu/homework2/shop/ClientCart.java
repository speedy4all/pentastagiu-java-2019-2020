package com.pentalog.pentastagiu.homework2.shop;
//
public class ClientCart {

    private ClientsOfShop name;
    ItemsOnSale price;
    int numbersOfProducts;

    double getTotalPrice(double ...price){
        double suma=0;
        for (int i=0; i<numbersOfProducts; i++ ){
            suma=+price[i];
        }
        suma= suma - (suma*name.priceForCostumer()/100);
        return suma;
    }



    public ClientCart(ClientsOfShop name, ItemsOnSale price, int numbersOfProducts) {
        this.name = name;
        this.price = price;
        this.numbersOfProducts = numbersOfProducts;
    }
}
