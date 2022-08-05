package mobile;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MobileSim {

	public static void main(String[] args) 
	{
		Resource resource = new ClassPathResource("MobileSim.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Mobile m =(Mobile) beanFactory.getBean("myMobile");
		m.mob();
		
		System.out.println("----------------------------------------");
		System.out.println("name ="+ m.getName());
		System.out.println("model ="+m.getModel());
		System.out.println("ram ="+ m.getRam());
		System.out.println("price ="+ m.getPrice());
		System.out.println("color ="+m.getColor());
		
		System.out.println("------------------------------------");
		System.out.println(m.getSim().getNetwork());
		System.out.println(m.getSim().getProvider());

	}

}
