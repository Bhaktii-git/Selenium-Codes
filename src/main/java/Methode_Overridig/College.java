package Methode_Overridig;

import java.util.Scanner;

public class College 
{
    
	public void showDepartmentDetails() 
	{
		System.out.println("This Is genral college with multiple deapartmnet :");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int no;
		do {
		System.out.println("Select a department:");
		System.out.println("1.Engineering");
		System.out.println("2.Medical");
		System.out.println("3.Arts");
		System.out.println("4.Commerce");
		System.out.println("5.Contact Customer Care");
		
		
		System.out.println("Enter the the choice (1-5)");
		 no=sc.nextInt();
		
		EngineeringDepartment c1=new EngineeringDepartment();
		MedicalDepartment c2=new MedicalDepartment();
		ArtsDepartment c3=new ArtsDepartment();
		CommerceDepartment c4=new CommerceDepartment();
		CutomerCare c5=new CutomerCare();
		
		switch(no)
		{
		case 1:
			c1.showDepartmentDetails();
			break ;
		case 2 :
			c2.showDepartmentDetails();
			break ;
		case 3 :
			c3.showDepartmentDetails();
			break ;
		case 4 :
			c4.showDepartmentDetails();
			break ;
		case 5 :
			c5.contactSupport();
			break ;
		}
			
		}while (no<=6);		
	  
		System.out.println("Thanks For Exists");
		
 

	}
	
}
