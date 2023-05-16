package com.springcore.constructor_injection;

public class Certificate {
	private String name;

	
	public Certificate(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}
}
