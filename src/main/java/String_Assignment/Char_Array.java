package String_Assignment;

public class Char_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String input="Selenium WebDriver";
		char[] charArray=input.toCharArray();
		System.out.print("Reverse array ");
		for(i=charArray.length-1;i>=0;i--) 
		{
			System.out.print(charArray[i]);
			
		}
	}
	
}
