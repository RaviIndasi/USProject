import java.util.Arrays;

public class RoughWork {

	public static void main(String[] args) {
		//String Literal
		String s = "Welcome to the Java Program";
		String[] splittedString = s.split(" ");
//		System.out.println(splittedString[0]);
//		System.out.println(splittedString[1]);
//		System.out.println(splittedString[2]);
//		System.out.println(splittedString[3]);
//		System.out.println(splittedString[4]);
//		System.out.println(splittedString[5]);
		
		//String obj reference
		String r = new String("This is Ravi Shastri");
		String[] splitCharacters = r.split(" ");
		for(int i = 0; i<r.length(); i++)
		{
			System.out.println(r.charAt(i));
			
		}
		
		//Reverse the String values
		for(int i = r.length()-1; i>=0; i--)
		{
			System.out.println(r.charAt(i));
		}
		
		

	}

}
