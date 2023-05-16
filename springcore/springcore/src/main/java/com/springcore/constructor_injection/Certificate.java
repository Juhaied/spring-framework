package com.springcore.constructor_injection;

public class Certificate {
	private String Name;

	public Certificate(String name) {
		super();
		this.Name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String n) {
		this.Name = n;
	}
}
