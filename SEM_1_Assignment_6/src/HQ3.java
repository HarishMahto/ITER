import java.util.Scanner;

// Java program for the above approach
class HQ3 {

	// Function that prints the middle
	// character of a string
	public static void
	printMiddleCharacter(String str)
	{
		// Finding string length
		int len = str.length();

		// Finding middle index of string
		int middle = len / 2;

		// Print the middle character
		// of the string
		System.out.println(str.charAt(middle));
	}

	// Driver Code
	public static void
	main(String args[])
	{
		Scanner  sc=new Scanner(System.in);	      
	 	System.out.print("Enter a String: " );    
	 	String str=sc.nextLine();

		// Function Call
		printMiddleCharacter(str);
	}
}
