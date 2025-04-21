package Set_Assignment;

import java.util.HashSet;
import java.util.Scanner;

public class Set_Creation {

	public static void main(String[] args) {
		HashSet <String > M1=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		String name;
		
		System.out.println("Enter the number of names");
		int no=sc.nextInt();
		
		for(int i=0;i<no;i++) 
		{
			System.out.println("Names "+(i+1));
			name  =sc.next();
			M1.add(name);
		}
		
		System.out.println(M1);

	}

}
