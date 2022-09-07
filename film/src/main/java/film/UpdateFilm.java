package film;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateFilm {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Film f2 = new Film();
		
		f2.setFilm_no(1);
		f2.setDirector("Uppi");
		f2.setProducer("soori");
		f2.setHero("punitajkumar");
		f2.setVillain("maarigudi");
		f2.setBudget(800.00);
		
		f2.setFilm_no(3);
		f2.setDirector("Up");
		f2.setProducer("Parvatamma");
		f2.setHero("shivrajkumar");
		f2.setVillain("Jayaraj");
		f2.setBudget(6.00);
		
		
		entityTransaction.begin();
		entityManager.merge(f2);
		entityTransaction.commit();


	}

}
