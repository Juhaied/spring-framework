package com.springcore.lifecycle;

import java.io.PrintWriter; 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		Burger br =(Burger) context.getBean("burger");
		
		System.out.print(br);
		
		context.registerShutdownHook();

		
		pw.close();

	}

}
