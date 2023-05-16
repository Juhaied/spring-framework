package com.springcore.colletions;

import java.io.PrintWriter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {

		PrintWriter pw = new PrintWriter(System.out);

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/colletions/collections.xml");
		//Class   obj    typecast  context         (bean name)
		Employees emp =(Employees)context.getBean("e1");
	
		pw.println(emp.getName());
		pw.println(emp.getPhones());
		pw.println(emp.getAddress());
		pw.println(emp.getCourses());

		pw.close();
	}

}
