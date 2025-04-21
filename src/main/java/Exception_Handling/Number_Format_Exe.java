package Exception_Handling;

import java.util.Scanner;

public class Number_Format_Exe {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		String no1=sc.next();
		System.out.println("Enter the Second Number");
		String  no2=sc.next();
		
		try{
			int n1=Integer.parseInt(no1);
			int n2=Integer.parseInt(no2);
			int n3=n1+n2;
			System.out.println("The Sum of " +n1+ "and "+n2+ "is "+n3);
		}
		catch(NumberFormatException e) 
		{
			System.out.println("Invalid Input !! Plese enter valid input"+e.getMessage());
		}
		
		
	}

}
