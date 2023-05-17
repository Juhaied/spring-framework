package com.springcore.auto.wire;

import java.io.PrintWriter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.colletions.Employees;

public class Test {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		//Autowiring byName
		Emp emp1=context.getBean("emp1",Emp.class);

		pw.println(emp1);
		
		//Autowiring byType
		
		Emp emp2=context.getBean("emp2",Emp.class);

		pw.println(emp2);
		//Autowiring through constructor
		Emp emp3=context.getBean("emp3",Emp.class);

		pw.println(emp3);
		
		pw.close();
	}

}
