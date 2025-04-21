package Object_Assignment;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		int count;
		System.out.println("Prime Number between 1to 100 are :");
		for(i=1;i<=100;i++) {
			count=0;
			for(j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			
			
		     }
			if(count==2) {
				System.out.println(i);
			}
	}

	}
}
			
		

	


