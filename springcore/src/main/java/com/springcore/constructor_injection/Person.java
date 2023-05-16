package com.springcore.constructor_injection;

import java.util.ArrayList;

public class Person {
	private String name;
	private int personId;
	private double salary;
	private ArrayList<String> courses;
	private Certificate certi;
	public Person(String name,int personId,Certificate certi,ArrayList<String> courses) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.courses = courses;
	}
	
	public Person(String name,double salary) {
		this.name = name;
		this.personId = personId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Name : "+this.name+" ,ID: "+this.personId+" Courses = [ "+this.courses+" ]" +"Degree in "+this.certi.getName();
	}
	
	public String wholeCons() {
		return "Name : "+this.name+" ID= "+"Null"+" Salary: "+this.salary;
	}
}
