package Oops_Ass_Constructor;

public class Fibonaci_series {

	public static void main(String[] args) {
     int a=0;
     int b=1;
     
      int i,c;
     int n=10;
     System.out.print(+a+ ","+b);
    for(i=3;i<=10;i++) 
    {
    	c=a+b;
    	a=b;
    	b=c;
    	System.out.print(","+c);
    	
    	
    	
    }

	}

}
