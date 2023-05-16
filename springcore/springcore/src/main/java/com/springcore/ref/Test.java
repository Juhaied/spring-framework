package com.springcore.ref;

import java.io.PrintWriter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		A a = (A)context.getBean("aref");
		
		pw.println(a.getX());
		pw.println(a.getOb().getY());
		
		B b = (B)context.getBean("bref");
		
		pw.println("Object of b : "+b.getY());
		pw.close();
	}

}
