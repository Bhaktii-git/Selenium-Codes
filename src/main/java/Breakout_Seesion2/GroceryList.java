package Breakout_Seesion2;

public class GroceryList 
{
   int  Max_Cap=100;
   String item[]=new String[Max_Cap];
   
   public boolean addItem(String Item) 
   {
	   for(int i=0;i<Max_Cap;i++) 
	   {
		   if(item[i]==null) 
		   {
			   item[i]=Item;
			   System.out.println("Item Is sucessfully added into your grocery List");
			   return true;
		   }
		 
          
	   }
	return false;
	   
   }
   
   public void removeItem(String re1) 
   {
	   for(int i=0;i<Max_Cap;i++) 
	   {
		   if(item[i].equals(re1)) 
		   {
			   item[i]=null;
			   System.out.println("Item Remove Sucessfully");
			   break;
			   
		   }
		   
	   }
	  
	   
   }
   
   public void viewItem() 
   {
	   for(int i=0;i<Max_Cap;i++) 
	   {
		   if(item[i]!=null) 
		   {
			   System.out.println(item[i]);
		   }
	    }
		   
	}
   public void clearList() 
   {
	   for(int i=0;i<Max_Cap;i++) 
	   {
		   item[i]=null;
		 
	   }
	   System.out.println("List Clear Sucefully");
   }
   
   
   public void existList() 
   {
	   System.out.println("Exist Sucessfully");
   }
}


  
		   
