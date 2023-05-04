import java.util.Scanner;

class HQ4
{
	
	// Function to count total number
	// of words in the string
	public static int
	countWords(String str)
	{
		
		// Check if the string is null
		// or empty then return zero
		if (str == null || str.isEmpty())
			return 0;
		
		// Splitting the string around
		// matches of the given regular
		// expression
		String[] words = str.split("\\s+");
		
		// Return number of words
		// in the given string
		return words.length;
	}
	
	// Driver Code
	public static void main(String args[])
	{
		
		// Given String str
		Scanner  sc=new Scanner(System.in);	      
	 	System.out.print("Enter a String: " );    
	 	String str=sc.nextLine();
		
		// Print the result
		System.out.println("No of words : " +
		countWords(str));
	}
}

