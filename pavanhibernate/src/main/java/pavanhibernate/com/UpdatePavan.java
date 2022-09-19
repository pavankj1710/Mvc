package pavanhibernate.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatePavan {

	public static void main(String[] args) {
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		 EntityManager entityManager = entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction = entityManager.getTransaction();
		 
		 Pavan pavan = new Pavan();
		 pavan.setId(2);
		 pavan.setName("Nayak Pavan");
		 pavan.setMob(111111111);
		 
		 entityTransaction.begin();
		 entityManager.merge(pavan);
		 entityTransaction.commit();
		 

	}

}
