package laptop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class LaptopProjector {

	public static void main(String[] args) 
	{
		Resource resource = new ClassPathResource("LaptopProjector.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Laptop l = (Laptop) beanFactory.getBean("myLaptop");
		l.display();
		
	

	}

}
