package Set_Assignment;


import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Ass
{

	public static void main(String[] args) 
	{
		TreeSet <String> S1=new TreeSet <String>();
		Scanner Sc=new Scanner(System.in);
		int ch;
		String pro;
		
		do 
		{
			System.out.println ("Menu");
			System.out.println("1.Add New Product");
			System.out.println("2.Remove a Product");
			System.out.println("3.Display All the Products");
			System.out.println("4.Exist");
			System.out.println ("Please Enter Your choice");
			ch=Sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Product Name:");
				pro=Sc.next();
				if (S1.contains(pro)) 
				{
					System.out.println("Product is already Exits:");
				}
				else 
				{
					S1.add(pro);
					System.out.println(pro+ " Added Sucessfully");
				}
				break;
			case 2:
				System.out.println("Enter the product name to remove");
				String remo = Sc.next();
				S1.remove(remo);
				break;
			case 3:
				System.out.println("All the Products"+S1);
				break;
			case 4:
				System.out.println("Exits");
				Sc.close();
				break;
			}
			
				
			
		}while(ch <4);
		
		
	}

}
