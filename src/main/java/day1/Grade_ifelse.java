package day1;

public class Grade_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math=90;
		int science=60;
		int english =90;
		double per;
		
		System.out.println("Marks in maths :"+math);
		System.out.println("Marks in Science :"+science);
		System.out.println("Marks in english :"+english);
		per =(math+science+english) /3.0;
		
		System.out.println("Total Percentage :"+per);
		if (per >= 90 && per < 100) {
			System.out.println("Your grade is A");
			
		}
		else if(per <= 89 && per >= 80){
			System.out.println("Your grade is B");
		}
		else if(per >=70 && per <=79){
			System.out.println("Your grade is C");
		}
		else if (per >= 60 && per <=69 ) {
			System.out.println("Your grade is D");
		}
		else {
			System.out.println("Fail");
		}
		

	}

}
