package Scanner_Assignment;

import java.util.Scanner;

public class Sc_Ass {
	
	String ItemName;
	double price;
	int qunatity;
	
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 double toatal_cost=0;
		double final_to=0;
		String ans;
		do {
			
		System.out.println("Enter the Item Name :");
	    String ItemName=sc.next();
	    
	    System.out.println("Enter the Price of the Item :");
	    double  price=sc.nextDouble();
	    
	    System.out.println("Enter the Quantity Of the Item ");
	    int quanity =sc.nextInt();
	    
	     toatal_cost =price*quanity ;
	    System.out.println("Total For "+ItemName+ ":"+toatal_cost);
	    
	    final_to=toatal_cost+final_to;
	    
	    System.out.println("Do You Want To contionue (yes/no):");
	     ans=sc.next();
		}while(ans.equals("yes"));
		
   	 System.out.println("Final Total Bill is :"+final_to);
	    
	    
	}
}
	    	
         
	


