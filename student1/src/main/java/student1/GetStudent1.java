package student1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetStudent1 {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student1 student1 = entityManager.find(Student1.class,10);
		
		if(student1!=null)
		{
			System.out.println("sid ="+student1.getId());
			System.out.println("sname ="+student1.getName());
			System.out.println("spercentage ="+student1.getPercentage());
		}
		else
		{
			System.out.println("no data found");
		}

	}

}
