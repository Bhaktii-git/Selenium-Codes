package ArrayList_Ass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_ass {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		List <Integer> m1=new ArrayList<Integer>();
		System.out.println("Enter the 5 Number");
		
		System.out.println("Enter the Interger Number");
		for(int i=0;i<5;i++) 
		{
			int input=sc.nextInt();
			m1.add(input);
		}
       System.out.println("Number in the List is "+m1);
       
       for(int i=0;i<5;i++) 
		{
    	   sum=sum+m1.get(i);
		}
       System.out.println("Sum of the List is "+sum);
       
       int Avg=sum/m1.size();
       System.out.println("Average of the List is "+Avg);
	}

}
