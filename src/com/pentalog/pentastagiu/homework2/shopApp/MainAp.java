package com.pentalog.pentastagiu.homework2.shopApp;

public class MainAp {

	public static void main(String[] args) {
		Product m1=new Candy("trufles", 12.4, 1);
		Product m2=new Book("Dune", 14, "Frank Herbert");




		Basket basketIon = new Basket();
		Customer ion = new Customer("Ion", Status.SILVER, basketIon);
		System.out.println("\nIon - SILVER member : ");
		double ionDiscount = ion.getStatus().getValue();
		System.out.println("Ion Discount = "+ ionDiscount);
		basketIon.addToBasket(m1);
		System.out.println("m1 adaugat in cos, pret: " + Basket.getPrice(basketIon.getBasketProducts(), ionDiscount));
		basketIon.addToBasket(m2);
		System.out.println("m2 adaugat in cos, pret: " + Basket.getPrice(basketIon.getBasketProducts(), ionDiscount));
		System.out.println("Produse Ion : " + basketIon.getBasketProducts().toString());

		Basket basketVasile = new Basket();
		Customer Vasile = new Customer("Vasile", Status.GOLD, basketVasile);
		System.out.println("\nVasile - SILVER member : ");
		double VasileDiscount = Vasile.getStatus().getValue();
		System.out.println("Vasile Discount = "+ VasileDiscount);
		basketVasile.addToBasket(m1);
		System.out.println("m1 adaugat in cos, pret: " + Basket.getPrice(basketVasile.getBasketProducts(), VasileDiscount));
		basketVasile.addToBasket(m2);
		System.out.println("m2 adaugat in cos, pret: " + Basket.getPrice(basketVasile.getBasketProducts(), VasileDiscount));
		System.out.println("Produse Vasile : " + basketVasile.getBasketProducts().toString());


	}
}