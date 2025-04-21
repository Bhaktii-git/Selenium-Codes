package Assignmnet;

public class Array_Declartion2_Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[]=new double[5];
		double sum=0;
		arr[0]=10.0;
		arr[1]=20.0;
		arr[2]=30.0;
		arr[3]=40.0;
		arr[4]=50.0;
		
		System.out.println("Array Values are :"+arr[0]+ ","+arr[1]+"," +arr[2]+","+arr[3]+","+arr[1]);
		
		
		sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		System.out.println("Sum of Array element is  :"+sum);
		
		if (sum <100.0f) {
			System.out.println("The sum is less than 150.0");
		}
		else {
		 System.out.println("The sum is grater than  or equal to 150.0");
		}

	}

}
