package crudemployee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeServices 
{
	HashSet<Employee> empset = new HashSet<Employee>();
	
	Employee emp1 = new Employee(id=101, "Pavan", 22, "former", "mech", 80000);
	Employee emp2 = new Employee(id=102, "Prakruthi", 20, "it" , "ece", 6000);
	Employee emp3 = new Employee(id=103, "Megha", 21, "cogt", "bca", 3000);
	Employee emp4 = new Employee(id=104, "Anusha", 23, "bsoft", "cs", 60000);
	
	Scanner sc = new Scanner(System.in);
	boolean found = false; 
	
	
	int id;
	String name;
	int age;
	String department;
	String designation;
	double salary;
	
	public EmployeeServices()
	{
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
	}
	
	//view all employee
	public void viewAllemp()
	{
		for(Employee emp:empset)
		{
			System.out.println(emp);
		}
	}
	
	
	//view employee based on id
	public void viewEmp()
	{
		System.out.println("enter id: ");
		id = sc.nextInt();
		for(Employee emp:empset)
		{ 
		    if(emp.getId()==id)
		    {
		    	System.out.println(emp);
		    	found=true;
		    }
		}
		if(!found)
		{
			System.out.println("id not present");
		}
	}
	
	
	//update emp
	public void updateEmp()
	{
		System.out.println("enter id: ");
		id = sc.nextInt();
		//boolean found=false; 
		for(Employee emp:empset)
		{
		    if(emp.getId()==id)
		    {
		    	System.out.println("enter name: ");
		    	name=sc.next();
		    	System.out.println("enter new sal");
		    	salary=sc.nextDouble();
		    	emp.setName(name);
		    	emp.setSalary(salary);
		    	System.out.println("updated detail of emp");
		    	System.out.println(emp);
		    	found=true;
		    }
		}
		if(!found)
		{
			System.out.println("emp is not present");
		}
		else
		{
			System.out.println("emp detail update successfully");
		}
	}
	
	//delete emp
	public void deleteemp()
	{
		System.out.println("enter id");
		id = sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset)
		{
			if(emp.getId()==id)
			{
				empdelete=emp;
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("emp is not present");
		}
		else
		{
			empset.remove(empdelete);
			System.out.println("emp deleted successfully");
		}
	 }
	//add emp
	public void addemp()
	{
		System.out.println("enter id");
		id = sc.nextInt();
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter age");
		age = sc.nextInt();
		System.out.println(" enter designation");
		designation = sc.next();
		System.out.println("enter dept");
		department = sc.next();
		System.out.println("enter sal");
		salary = sc.nextDouble();
		
		Employee emp = new Employee(id, name, age, designation, department, salary);
		
		empset.add(emp);
		 System.out.println(emp);
		 
		 System.out.println("emp add successfully");
		
	}
}
