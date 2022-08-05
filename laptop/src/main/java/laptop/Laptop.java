package laptop;

public class Laptop 
{
	private String name;
	private String brand;
	
	private Projector projector;
	
	public void display()
	{
		System.out.println(name);
		System.out.println(brand);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Projector getProjector() {
		return projector;
	}

	public void setProjector(Projector projector) {
		this.projector = projector;
	}
	
	
	
	
	
	

}
