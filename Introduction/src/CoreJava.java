
public class CoreJava {

	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		int c = a+b;
		String website = "Rahul shetty Core Java";
		char letter = 'r';
		double decimal = 0.5;
		boolean flag = true;
		System.out.println(c);
		System.out.println(website);
		System.out.println(letter);
		System.out.println(decimal);
		System.out.println(flag);
		System.out.println("Tutor with name with course " + website + "with rating is" +c);
		System.out.println(website + "is" +flag);
		System.out.println("=======================DATATYPES ENDED=====================================");
		//Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr[3]);
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println(arr2[1]);
		System.out.println("========================ARRAYS ENDED====================================");
		
		//Loops
		//For Loop
		for(int i = 0; i<arr2.length; i++) 
		{
			System.out.println(arr2[i]);
			
		}
		
		String[] name = {"Ravi", "Vijay", "Narendra"};
		for(int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
			
		}
		
		//Enhanced For-Loop Syntax
		
		for( String s: name)
		{
			System.out.println(s);
		}
			
	}

}
