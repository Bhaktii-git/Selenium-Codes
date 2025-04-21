package Interface_Assignment_Payment;

public class PayPal implements PayementProcessor
{
	public boolean validatePayemnet(double amount) 
    {
		return amount<=MAX_TRANSCATION_AMOUNT && amount >=MIN_TRANSCATION_AMOUNT;
		
		
    	
    }
    public void processAmount(double amount)
    
    {
		if (validatePayemnet(amount)) 
    	{
			System.out.println("Processing PayPal payemnet of :"+amount);
			System.out.println("Transacation is valid"+validatePayemnet(amount));
			System.out.println("PayPal Paymnet sucessful");
			
    	}
		else 
		{
			System.out.println("Transacation Is Invaid please select the amount in between "+MIN_TRANSCATION_AMOUNT+ "to "+MAX_TRANSCATION_AMOUNT);
		}
    }
    
    public void printRecepit(String transcationId, double amount) 
    {
    	transcationId="TXN"+System.currentTimeMillis();
    	System.out.println("Recipt -> Transcantion ID "+transcationId +" |Amount :"+amount+ "|Cureency:"+ currency);
    }
	
		
	

}
