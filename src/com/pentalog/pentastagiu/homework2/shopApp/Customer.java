package com.pentalog.pentastagiu.homework2.shopApp;

public class Customer {

	private static int id = 0;
	private String name;
	private Status status;
	private Basket basket;

	public Customer(String name, Status status, Basket basket) {
		id++;
		this.name = name;
		this.status = status;
		this.basket = basket;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Customer.id = id;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}
}
