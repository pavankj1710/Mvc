package crudemployee;

import java.util.Scanner;

public class Main
{
	EmployeeServices service = new EmployeeServices();
	 static boolean ordering = true;
	 
	 public static void test()
	 {
		 System.out.println("***Wel Come To Employee Manegement********* "
				 +"\n1.add employee"
				 +"\n2.view employee"
				 +"\n3.update employee"
				 +"\n4.delete employee"
				 +"\n5.view all employee"
				 +"\n6.exist");
	 }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EmployeeServices services = new EmployeeServices();
		
		
		
		do 
		{
			test();
			System.out.println("enter ur choice");
			int choice = sc.nextInt();
			switch (choice) 
			{
			case 1: 
			{
				System.out.println("add employee");
				services.addemp();
				break;
			}
			case 2: 
			{
				System.out.println("view employee");
				services.viewEmp();
				break;
			}
			case 3: 
			{
				System.out.println("update employee");
				services.updateEmp();
				break;
			}
			case 4: 
			{
				System.out.println("delete employee");
				services.deleteemp();
				break;
			}
			case 5: 
			{
				System.out.println("viewall employee");
				
				services.viewAllemp();//2
				
				break;
			}
			case 6: 
			{
				System.out.println("thank u for using application employee");
				System.exit(0);
				
			}
			default:
				System.out.println("please enter valid choice");
				break;
			}
			
		} while (ordering);
	
	}

}
