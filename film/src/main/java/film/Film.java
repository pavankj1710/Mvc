package film;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Film 
{
	@Id
	private  int film_no;
	private String director;
	private String producer;
	private String hero;
	private String villain;
	private double budget;
	
	public int getFilm_no() {
		return film_no;
	}
	public void setFilm_no(int film_no) {
		this.film_no = film_no;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getVillain() {
		return villain;
	}
	public void setVillain(String villain) {
		this.villain = villain;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	

}
