package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployee 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("annotation");
		Employee emp = (Employee) context.getBean("myEmployee");
		
		System.out.println("empid ="+emp.getId());
		System.out.println("empname ="+emp.getName());
		System.out.println("empsal ="+emp.getSal());

	}

}
