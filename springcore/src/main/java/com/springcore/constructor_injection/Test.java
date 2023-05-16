package com.springcore.constructor_injection;

import java.io.PrintWriter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out);

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor_injection/ciconfig.xml");
		
		Person p = (Person) context.getBean("per");
		pw.println(p);
		
		Person salary = (Person) context.getBean("person_salary");
		pw.println(salary.wholeCons());
		
		pw.close();
	}

}
