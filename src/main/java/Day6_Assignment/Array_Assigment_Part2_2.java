package Day6_Assignment;

public class Array_Assigment_Part2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {15,25,35,45,55};
		int i,sum=0;
		double avg=0;
		System.out.print("Array Element :");
		
		for (i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}

		for(i=0;i<arr.length;i++) {
			sum=arr[i]+sum;
			
		}
		System.out.println();
		System.out.println("Sum of all integer in the array :"+sum);
		
		avg=sum/arr.length; 
		System.out.println("The Average of elemnet :"+avg);
		
	
	}

}
