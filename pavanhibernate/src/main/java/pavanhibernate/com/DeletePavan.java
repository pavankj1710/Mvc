 package pavanhibernate.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePavan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Pavan pavan = entityManager.find(Pavan.class,1);
		
		if(pavan != null)
		{
			entityTransaction.begin();
			entityManager.remove(pavan);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("no recoed found");
		}

	}

}
