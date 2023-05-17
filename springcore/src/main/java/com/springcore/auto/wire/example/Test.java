package com.springcore.auto.wire.example;

import java.io.PrintWriter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.auto.wire.Emp;

public class Test {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/example/config.xml");
		
		Employee e1 = context.getBean("lal",Employee.class);
		
		e1.setEid(1000);
		e1.setName("Juhaied");
		
		pw.println("Student name : "+e1.getName()+" Stduent Fee : "+e1.getEid());
		
		
		pw.close();

	}

}
