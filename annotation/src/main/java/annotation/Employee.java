package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//variable intialization or j2ee container

@Component(value = "myEmployee")
public class Employee 
{
	@Value(value = "10")
	private int id;
	
	@Value(value = "Tom")
	private String name;
	
	@Value(value = "5000.00")
	private double sal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

}
