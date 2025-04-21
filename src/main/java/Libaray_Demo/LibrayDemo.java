package Libaray_Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibrayDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		List <Book> library=new ArrayList<Book>();
		
		do {
			
			System.out.println("Menu");
			System.out.println("1.Add Book");
			System.out.println("2.Diasplay All Book");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch) 
			{
			case 1:
				System.out.println("Enter the book Tittle");
				String tittle1=sc.next();
				System.out.println("Enter the book Author");
				String author1=sc.next();
				System.out.println("Enter the book price");
				double price1=sc.nextDouble();
				Book book=new Book(tittle1, author1, price1);
				library.add(book);
				System.out.println("Book Added Sucessfully");
				
				break;
			case 2:
				if(library.isEmpty()) 
				{
					System.out.println("No Book in the Library yet");
				}
				else 
				{
					for(Book b:library ) 
					{
						System.out.println("Book Tittle is "+b.tittle1);
						System.out.println("Book Author is "+b.author1);
						System.out.println("Book Price is "+b.price1);
						System.out.println("--------------");
						
					}
					
				}
				break;
			case 3:
				
				System.out.println("Exitig the aaplcation!!!! Have Nice Day");
				break;
			}
			
		}while(ch<3);
		
		
		
	}

}
