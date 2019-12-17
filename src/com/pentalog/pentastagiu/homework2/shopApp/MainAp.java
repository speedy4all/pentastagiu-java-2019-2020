package com.pentalog.pentastagiu.homework2.shopApp;

import java.io.ObjectInputStream.GetField;

public class MainAp {

	public static void main(String[] args) {
		Customer alexNo = new Customer("Alex", Status.NO);
		Customer vasileGold = new Customer("Vasile", Status.GOLD);
		Customer ionSilver = new Customer("Ion", Status.SILVER);
		Basket basketVasileGold = new Basket(vasileGold);
		Basket basketIonSilver = new Basket(ionSilver);
		Basket basketAlexNo = new Basket(alexNo);

		Products m1=new Candy("trufles", 12.4, 100);
		Products m2=new Book("Dune", 14, "Frank Herbert");

		basketAlexNo.AddToBasket(m1);
		System.out.println(basketAlexNo.GetTotalPrice());
		basketAlexNo.AddToBasket(m2);
		System.out.println(basketAlexNo.GetTotalPrice());

		basketVasileGold.AddToBasket(m1);
		System.out.println(basketVasileGold.GetTotalPrice());
		basketVasileGold.AddToBasket(m2);
		System.out.println(basketVasileGold.GetTotalPrice());
		basketIonSilver.AddToBasket(m1);
		System.out.println(basketIonSilver.GetTotalPrice());
		basketIonSilver.AddToBasket(m2);
		System.out.println(basketIonSilver.GetTotalPrice());


	}

}
