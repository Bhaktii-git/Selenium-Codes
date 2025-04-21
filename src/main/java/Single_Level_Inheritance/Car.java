package Single_Level_Inheritance;

public class Car extends Vehicle
{
	   //String Model;
   

   
   
   public void carDeatails(String Model)
   {
	  
	   System.out.println("Car Model :"+Model);
   }

   public static void main(String args[]) 
   {
	   Car c=new Car();
	   c.displayDerails("Maruti",80);
	   c.carDeatails("Swift");
	   
	   
   }
}
