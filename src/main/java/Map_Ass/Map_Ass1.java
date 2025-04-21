package Map_Ass;

import java.util.HashMap;
import java.util.Scanner;

public class Map_Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		double grade;
		HashMap <String , Double> d1=new HashMap<String , Double>();
		
		System.out.println("Enter the number of Student");
		int no=sc.nextInt();
		for(int i=0;i<no;i++) 
		{
			System.out.println("Enter the Student" +(i+1)+ " Name:");
			name=sc.next();
			System.out.println("Enter the Student" +(i+1)+ " Grade:");
			grade=sc.nextDouble();
		    d1.put(name, grade);
			
		}
		System.out.println("Enter the number to lool up");
		String lo=sc.next();
		d1.get(lo);
		System.out.println(lo+" Grade are :"+d1.get(lo));

	}

}
