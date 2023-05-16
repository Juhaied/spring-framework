package com.springcore.constructor_injection;

public class Person {
	private String name;
	private int personId;
	private double salary;
	public Person(String name,int personId) {
		this.name = name;
		this.personId = personId;
	}
	
	public Person(String name,double salary) {
		this.name = name;
		this.personId = personId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name : "+this.name+" ,ID: "+this.personId;
	}
	
	public String wholeCons() {
		return "Name : "+this.name+" ID= "+"Null"+" Salary: "+this.salary;
	}
}
