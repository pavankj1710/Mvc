package film;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteFilm {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Film film = entityManager.find(Film.class,5);
				
				if(film != null)
				{
					entityTransaction.begin();
					entityManager.remove(film);
					entityTransaction.commit();
				}
				
				else
				{
					System.out.println("No record to delete");
				}

	}
	


}
