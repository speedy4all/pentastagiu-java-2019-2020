package com.pentalog.pentastagiu.homework2.shopApp;

public enum Status {

	GOLD("0.2"),
	SILVER("0.1"),
	NO("1");

	private String percent;

	Status(String percent) {
		this.percent = percent;
	}

	public double getValue() {
		return Double.valueOf(percent);

	}

}
