package com.springcore.lifecycle;

public class Burger {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Property");
		this.price = price;
	}

	public Burger() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Burger [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init");
	}
	public void destroy() {
		System.out.println("Inside Destroy");
	}
}
