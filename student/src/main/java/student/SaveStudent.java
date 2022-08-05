package student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student s2 = new Student();
		
		s2.setId(20);
		s2.setName("pavan");
		s2.setPercentage(93.00);
		
		entityTransaction.begin();
		entityManager.persist(s2);
		entityTransaction.commit();

	}

}
