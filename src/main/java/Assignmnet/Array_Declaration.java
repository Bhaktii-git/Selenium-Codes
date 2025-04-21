package Assignmnet;

public class Array_Declaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		int sum=0;
		arr[0]=15;
		arr[1]=25;
		arr[2]=35;
		arr[3]=45;
		arr[4]=65;
		
		System.out.println("First Element is :"+arr[0]);
		System.out.println("First Element is :"+arr[1]);
		System.out.println("First Element is :"+arr[2]);
		System.out.println("First Element is :"+arr[3]);
		System.out.println("First Element is :"+arr[4]);
		
		sum=arr[0]+arr[4];
		System.out.println("Sum of first and last element is  :"+sum);
		
		if (sum <100) {
			System.out.println("The sum is less than 100");
		}
		else {
		 System.out.println("The sum is grater or equal to 100");
		}
		}
		
		


}
