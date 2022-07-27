package student1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent1 {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student1 s1 = new Student1();
		
		s1.setId(10);
		s1.setName("pavankumar");
		s1.setPercentage(99.00);
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityTransaction.commit();

	}

}
