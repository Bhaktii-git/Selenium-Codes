package Interface_Assignment_Payment;

import java.util.Scanner;

public interface Payement_Demo extends PayementProcessor
{
	
	public void transcantion ();
   public static void main(String args[] )
   {
	   Scanner sc=new Scanner(System.in);
		
		int no;
		PayementProcessor pa=null;
		do {
		System.out.println("Select the Payment Method:");
		System.out.println("1.Credit Card");
		System.out.println("2.PayPal");
		System.out.println("3.UPI");
		
	
		System.out.println("Enter Your choice (1-3)");
		 no=sc.nextInt();
		 
		 System.out.println("Enter the Tracscantion amount");
		 double amount=sc.nextDouble();
		 String transcationId="TXN"+System.currentTimeMillis();
		 switch(no) 
		 {
		 case 1:
		 pa=new UPI();
		 pa.validatePayemnet(amount);
		 pa.processAmount(amount);
		 pa.printRecepit(transcationId, amount);
		 break;
		
		 case 2:
			 pa=new PayPal();
			 pa.validatePayemnet(amount);
			 pa.processAmount(amount);
			 pa.printRecepit(transcationId, amount);
			 break;
			 
		 case 3:
			 pa=new CreditCardPayemenet();
			 pa.validatePayemnet(amount);
			 pa.processAmount(amount);
			 pa.printRecepit(transcationId, amount);
			 break;
		
			 default :
				 System.out.println("Invalid Transacation ");
		 }
		 
		 
		 
   }while(no>3);
}
}

