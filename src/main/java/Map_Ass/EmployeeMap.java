package Map_Ass;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class EmployeeMap {

	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);
		LinkedHashMap <Integer ,String> i1=new LinkedHashMap<Integer, String>();
		int ch;
		int id;
		String name = null;
		
		do 
		{
			System.out.println ("Menu");
			System.out.println("1.Add Employee");
			System.out.println("2.Search Employee Id");
			System.out.println("3.Display All the Employee");
			System.out.println("4.Exist");
			System.out.println ("Please Enter Your choice");
			ch=Sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter the EmployID :");
				id=Sc.nextInt();
				System.out.println("Enter the Employ Name :");
				name=Sc.next();
				if (i1.containsKey(id))
				{
					System.out.println("Employee ID is already Exits:");
				}
				else 
				{
					i1.put(id,name);
					System.out.println("Record Added Sucessfully");
				}
				break;
				
			case 2:
				System.out.println("Enter the Employee id  to search the name");
				int remo = Sc.nextInt();
				
				if (i1.containsKey(remo)) 
				{
					System.out.println("Emaployee name is :"+i1.get(remo));
				}
				
				break;
				
			case 3:
				System.out.println(" Employee Directory :");
				System.out.println(i1);
				
				System.out.println(" ID :"+ i1.keySet() +" Name"+i1.values());
				break;
			case 4:
				System.out.println("Exits");
				Sc.close();
				break;
				
				
		
	      }

      }while(ch<4);
	}
}
      
