package ArrayList_Ass;

import java.util.ArrayList;
import java.util.Scanner;
public class To_Do_List {

	

	public static void main(String[] args) 
	{
		
	     int ch;
	     String t1;
		boolean option = true;
		boolean flag =false;
		ArrayList <Object> L1=new ArrayList<Object>();
		do
		{
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Add Task");
		System.out.println("2.Remove Task by using index");
		System.out.println("3.Remove Task by using text");
		System.out.println("4.View All Task");
		System.out.println("5.Exist");
		System.out.println("Enter Your Choice");
		ch=sc.nextInt();
		if (ch==1) 
		{
			System.out.println("Enter the task");
			 t1=sc.nextLine();
			L1.add(t1);
			//System.out.println("Task "+L1.add(t1)+" Added Suessfully");
			
		}
		if (ch==2) 
		{
			System.out.println("Enter the index");
			 int index=sc.nextInt();
			 L1.remove(index);
			 System.out.println("Index removed sucessfully");
			
		}
		if (ch==3) 
		{
			System.out.println("Enter the Task you want to remove");
			 String task=sc.next();
			 if(L1.contains(task))
			 {
				 for(int i=0;i<L1.size();i++) 
				 {
					 L1.remove(i);
					 flag= true;
					 System.out.println("Task remove Sucessfully");
					 break;
				 }
				
			 }
			 if(flag!=true)
			 {
				 System.out.println("Task is not  avaiable ");
			 }
			
		}
		
		if(ch==4) 
		{
			for(int i=0;i<L1.size();i++) 
			 {
				 
				 System.out.println(L1.get(i));
				 
			 }
			 System.out.println(L1);
		}
		
		if(ch==5) 
		{
			System.out.println("Exit Sucessfully,Thank you!!!!");
			break;
			
		}
		}while(ch <6);
		
		
	}

}
