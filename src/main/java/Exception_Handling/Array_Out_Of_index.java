package Exception_Handling;

import java.util.Scanner;

public class Array_Out_Of_index {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30};
		
		try
		{
			System.out.println("Enter the Index");
			int index=sc.nextInt();
			System.out.println(arr[index]);
			
		}
	    
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Invalid Index please inter the valid index betwwen 1-2"+e.getMessage());
		}
		

}
}
