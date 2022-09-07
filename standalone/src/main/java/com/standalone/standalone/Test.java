 package com.standalone.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		  ApplicationContext contaxt= new ClassPathXmlApplicationContext("com/standalone/standalone/configstand.xml");
		  
		  Person p1 = (Person) contaxt.getBean("person1"); 
		  
		  System.out.println(p1);
		  System.out.println(p1.getFriends().getClass().getName());
		  
		  System.out.println("---------------------------------------------");
		  
		  System.out.println(p1.getFeestructre());
	      System.out.println(p1.getFeestructre().getClass().getName());
	      
	      System.out.println("=================================================================");
	      
	      System.out.println(p1.getProperties());
		  
	}

}
