package day1;

public class Ass_Switch {
	public static void main (String [] args) {
		
		int m1=90;
		int m2=15;
		int m3=93;
		int m4=73;
		int m5=73;
		int m6=82;
		int m7=51;
		int m8=71;
		int m9=51;
		int m10=81;
		
		double  total;
		int marks;
		total =(m1+m2+m3+m4+m5+m6+m7+m8+m9+m10)/10;
		System.out.println("Total  is "+total);
		
		marks=(int) (total/10);
		System.out.println("Marks is "+marks);
		
		switch(marks) {
		case 10:
			System.out.println("Grade A+");
		break;
		case 9:
			System.out.println("Grade A");
			break;
		case 7:
			System.out.println("Grade B");
			break;
		case 6:
			System.out.println("Grade B+");
			break;
		case 5:
			System.out.println("Grade C");
			break;
		case 4:
			System.out.println("Grade D");
			break;
		default :
			System.out.println("Fail ");
			
		}
		
		
	}

}
