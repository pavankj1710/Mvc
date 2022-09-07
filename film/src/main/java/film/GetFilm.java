package film;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetFilm {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Film film = entityManager.find(Film.class,1);
		
		if(film != null)
		{
			System.out.println("film_id ="+ film.getFilm_no());
			System.out.println("director ="+ film.getDirector());
			System.out.println("producer ="+ film.getProducer());
			System.out.println("hero ="+ film.getHero());
			System.out.println("villain ="+ film.getVillain());
			System.out.println("budget ="+ film.getBudget());
		}
		
		else
		{
			System.out.println("no data found");
		}
		
		

	}

}
