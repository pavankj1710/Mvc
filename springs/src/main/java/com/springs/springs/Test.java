package com.springs.springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springs/springs/config.xml");
		Student s1 = (Student) con.getBean("pavan");
		System.out.println(s1);

	}

}
