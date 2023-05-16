package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       
       // fetching bean
       // 1						2			3
       //Name of the class	object Name	context.getBean("The bean which we want");
       
       Student student1 =(Student) context.getBean("student1");
       
       Student student2 = (Student) context.getBean("student2");
       System.out.println(student1);
       
       System.out.println(student2);
    }
}
