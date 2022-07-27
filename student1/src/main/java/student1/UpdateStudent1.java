package student1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudent1 {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student1 student1 = new Student1();
		
		student1.setId(10);
		student1.setName("pavan nayak");
		student1.setPercentage(88.00);
		
		entityTransaction.begin();
		entityManager.merge(student1);
		entityTransaction.commit();

	}

}
