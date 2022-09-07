package springconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springs/springconstructor/conf.xml");
		Person p1 = (Person) con.getBean("pavan");
		System.out.println(p1);

	}

}
