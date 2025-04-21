package Day6_Assignment;

public class Array_Assigment_Part2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[50];
		int even[]=new int[50];
		int odd[]=new int[50];
		int i;
		System.out.println("Orignal Array ");
		for (i =0;i <arr.length;i++) {
			
		    arr[i]=i+1;
		    System.out.print(" "+arr[i]);
		    
		}
		System.out.println("");
		System.out.println("Even number are:");
		for(i=0;i<arr.length;i++) {
			
			
				if(arr[i]%2==0) {
					even[i]=arr[i];
					System.out.print(" "+even[i]);
				}
		}
		System.out.println("");
		System.out.println("odd  number are: ");
		for(i=0;i<arr.length;i++) {
			
			
			if(arr[i]%2!=0) {
				odd[i]=arr[i];
				System.out.print(" "+odd[i]);
			}
	}
			
			
		}
		

	}


