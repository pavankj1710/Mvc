package pavanhibernate.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetPavan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Pavan pavan = entityManager.find(Pavan.class, 1);
		if(pavan!=null)
		{
			System.out.println("Person id ="+pavan.getId());
			System.out.println("Person name ="+pavan.getName());
			System.out.println("Person mob ="+pavan.getMob());
		}
		else
		{
			System.out.println("data not found");
		}

	}

}
