package Breakout_Seesion2;

import java.util.Scanner;

public class GroceryManagemnet {

	public static void main(String[] args) 
	{
		GroceryList list=new GroceryList();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			
			System.out.println("Grocery Managemnet System ");
			System.out.println("1.Add Item ");
			System.out.println("2.Remove Item ");
			System.out.println("3.View Item ");
			System.out.println("4.Clear All Item ");
			System.out.println("5.Exits ");
			System.out.println("Enter Your Choice");
			 ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Item Name to added into your grocery list");
				String Item =sc.next();
				list.addItem(Item);
				break;
				
			case 2:
				list.viewItem();
				System.out.println("Enter Item Name you wanted to remove from the list");
				String re =sc.next();
				list.removeItem(re);
				break;
			case 3:
				System.out.println("Item list");
				list.viewItem();
				break;
			case 4:
				
				list.clearList();
				break;
		
			case 5:
				list.existList();
				sc.close();
				break;
				
			}
			
			
		}while(ch<5);
		
		
		
	}

}
