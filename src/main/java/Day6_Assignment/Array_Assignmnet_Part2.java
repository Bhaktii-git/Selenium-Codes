package Day6_Assignment;

public class Array_Assignmnet_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,30,40,50};
		int i,sum=0;
        System.out.print("Array Element :");
		
		for (i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}

		System.out.print("\n");
		for(i=0;i<arr.length;i++) {
			sum=arr[i]+sum;
			
		}
		System.out.println("Sum of all integer in the array :"+sum);
		
	
	}
}
