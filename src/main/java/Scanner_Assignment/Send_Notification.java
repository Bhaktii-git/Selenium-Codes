package Scanner_Assignment;

public class Send_Notification {
	
	public void sendNotofication(String Message, String ...recepient) {
		System.out.println("Notofication :"+Message);
		
		for(String re :recepient) {
		System.out.println("Send To : "+re);
		}
		
	}

	public static void main(String[] args) {
		
		Send_Notification  sc=new Send_Notification ();
		
		
		sc.sendNotofication("Project Deadline is tommorrow","Ramesh","Sneha");

		sc.sendNotofication("Project ","Ramesh");

	}

}
