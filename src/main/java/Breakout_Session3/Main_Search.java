package Breakout_Session3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Search  {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		String searchName=null;
		boolean fo=false;
		List <Doctor> o1=new ArrayList<Doctor>();
		
		Doctor d1=new Doctor("Dr.Sharma","cardiologist","Apollo Hospital",500);
		Doctor d2=new Doctor("Dr.Meheta","Neurologist","Fortis Hospital",700);
		Doctor d3=new Doctor("Dr.kapur","Orthopedic","Max Hospital",600);
		Doctor d4=new Doctor("Dr.Sinha","Dermatologist","AIMS Hospital",400);
		
		o1.add(d1);
		o1.add(d2);
		o1.add(d3);
		o1.add(d4);
		
		do 
		{
			System.out.println("Menu is");
			System.out.println("1.Search the Doctor Name");
			System.out.println("2.Exit");
			
			System.out.println("Please enter your choice");
			ch=sc.nextInt();
			
			switch(ch) 
			{
			case 1:
				
				System.out.println("Please Enter the Doctor name to search the Doctor Deatils");
			    searchName=sc.next();
					
				
				for(Doctor se1: o1) 
				{
					if(se1.getName().contains(searchName)) 
					{
						se1.displayDeatils();
						fo=true;
						break;
						
					}
				}
				if(!fo) 
				{
					
					System.out.println("Doctor name is not avaiable ,please enter the valid name");
				}
				
				break;
				
			case 2:
				
				System.out.println("Exit");
				
				break;
			default:
				System.out.println("Inavalid Choice!!please Enter Valid Choice(1-2)");
				break;
			
			}
			
		
		}while(ch<3);
		sc.close();
	}

}
