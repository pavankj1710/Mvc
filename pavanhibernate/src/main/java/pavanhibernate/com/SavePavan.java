package pavanhibernate.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePavan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pavan");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Pavan p1 = new Pavan();
		p1.setId(1);
		p1.setName("Pavan Nayak");
		p1.setMob(988888888);
		
//		entityTransaction.begin();
//		entityManager.persist(p1);
//		entityTransaction.commit();
		
		Pavan p2 = new Pavan();
		p2.setId(8);
		p2.setName("kiccha");
		p2.setMob(987654321);
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2);	
		entityTransaction.commit();
		
		
		
		

	}

}
