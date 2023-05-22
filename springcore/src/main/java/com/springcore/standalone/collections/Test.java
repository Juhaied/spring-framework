package com.springcore.standalone.collections;

import java.io.PrintWriter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		
		Person p1 = context.getBean("person1",Person.class);
		
		pw.println(p1.getFriends());
		
		pw.println(p1.getFeestructure());
		
		pw.print(p1.getProperties());
		
		pw.close();
	}

}
