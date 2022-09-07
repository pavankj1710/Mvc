package film;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveFilm {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Film f1 = new Film();
		
		f1.setFilm_no(1);
		f1.setDirector("Upendra");
		f1.setProducer("Parvatamma");
		f1.setHero("shivrajkumar");
		f1.setVillain("Jayaraj");
		f1.setBudget(6.00);
		
		f1.setFilm_no(2);
		f1.setDirector("Up");
		f1.setProducer("Parvatamma");
		f1.setHero("shivrajkumar");
		f1.setVillain("Jayaraj");
		f1.setBudget(6.00);
		
		entityTransaction.begin();
		entityManager.persist(f1);
		entityTransaction.commit();

	}

}
