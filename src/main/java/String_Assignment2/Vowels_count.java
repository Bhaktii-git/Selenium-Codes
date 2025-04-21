package String_Assignment2;

public class Vowels_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;int count = 0;
		int chars=0;
		String input="Selenium WebDriver";
		String input1=input.toLowerCase();
		String input2=input1.replaceAll("\\s","");
		System.out.println("GIven String :"+input);
		char[] array=input2.toCharArray();		
		for(i=0;i<input2.length();i++) {

			if(array[i]=='a' || array[i]=='e' || array[i]=='i'|| array[i]=='o' ||array[i]==                                             'u')
		
			{
			
			 count++;
		
			}  
			
			chars++;
			
		}                       

		System.out.println("Number of Vowels:"+count);
		System.out.println("Number of Characters:"+chars);
	}

}
