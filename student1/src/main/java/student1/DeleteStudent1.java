package student1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStudent1 {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		//Student1 student1 = entityManager.find(Student1.class,10);
		Student1 student1 = entityManager.find(Student1.class,20);
		
		if(student1!=null)
		{
			entityTransaction.begin();
			entityManager.remove(student1);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("no record to delete");
		}
	}

}
