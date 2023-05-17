package com.springcore.lifecycle;

import java.io.PrintWriter; 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
		Burger br =(Burger) context.getBean("burger");
		 
		System.out.print(br);
		

		
		Pepsi pep = (Pepsi)context.getBean("pepsi");
		pw.println(pep);
		
		
		annotations an = (annotations) context.getBean("anno");
		pw.println(an);
		pw.close();

	}

}
