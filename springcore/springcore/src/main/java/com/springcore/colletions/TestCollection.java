package com.springcore.colletions;

import java.io.PrintWriter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {

		PrintWriter pw = new PrintWriter(System.out);

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/colletions/collections.xml");
		//Class   obj    typecast  context         (bean name)
		Employees emp1 =(Employees)context.getBean("e1");
	
		pw.println(emp1.getName());
		pw.println(emp1.getPhones());
		pw.println(emp1.getAddress());
		pw.println(emp1.getCourses());

		pw.close();
	}

}
