package student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetStudent {

	public static void main(String[] args) 
	{
		EntityManagerFactory entitiManagerFactory = Persistence.createEntityManagerFactory("uday");
		EntityManager entityManager = entitiManagerFactory.createEntityManager();
		
		Student Student = entityManager.find(Student.class,20);
		
		if(Student != null)
		{
			System.out.println("Student ID = " +  Student.getId());
			System.out.println("Student Name = " + Student.getName());
			System.out.println("Student Percentage = " + Student.getPercentage());
						
		}
		
		else
		{
			System.out.println("No Data Found");
		}

	}

}
