package com.springcore.colletions;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Employees {
	private String name;
	private ArrayList<String> phones;
	private Set<String> address;
	private Map<String,String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getPhones() {
		return phones;
	}
	public void setPhones(ArrayList<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employees(String name, ArrayList<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
