package Interface_Assignment_Payment;

 
public interface  PayementProcessor 
{
    double MIN_TRANSCATION_AMOUNT=10000;
    double MAX_TRANSCATION_AMOUNT=100000;
    String currency="INR";
    
    public boolean validatePayemnet(double amount) ;
    
    public void processAmount(double amount);
    
    
    public void printRecepit(String transcationId, double amount) ;
    
    
}
