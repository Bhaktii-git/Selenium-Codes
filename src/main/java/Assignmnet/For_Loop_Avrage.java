package Assignmnet;

public class For_Loop_Avrage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		double  avg=0;
		for (i=1;i <=10;i++) {
			
			sum=i+sum;
			
		}
		System.out.println("The Sum of first 10 natural number are:"+sum);
		avg= (double) sum/10;
		System.out.println("The Avreage of first 10 natural number are:"+avg);
		
	}


	}


