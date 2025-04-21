package Breakout_Session_Sol2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Breakout_Session3.Doctor;

public class By_Using_Map {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Map <String ,Doctor1> m1= new HashMap<String ,Doctor1>();
		int ch;
		String searchName=null;
		
		Doctor1 d1=new Doctor1("cardiologist","Apollo Hospital",500);
		Doctor1 d2=new Doctor1("Neurologist","Fortis Hospital",700);
		Doctor1 d3=new Doctor1("Orthopedic","Max Hospital",600);
		Doctor1 d4=new Doctor1("Dermatologist","AIMS Hospital",400);
		
		m1.put("Dr.Sharma", d1);
		m1.put("Dr.Meheta", d2);
		m1.put("Dr.kapur", d3);
		m1.put("Dr.Sinha", d4);
		
		do {
			System.out.println("Menu is");
			System.out.println("1.Search the Doctor Name");
			System.out.println("2.Exit");
			System.out.println("Please enter your choice");
			ch=sc.nextInt();
			switch(ch) 
			{
			case 1:
				System.out.println("Please Enter the Doctor name to search the Doctor Deatils");
			     searchName = sc.next();
			    if(m1.equals(searchName)) 
			    {
			    	System.out.println(m1.get(searchName));
			    	break;
			    }
			    ;
			}
			
				
		}while(ch<3);
		
		
	}

}
