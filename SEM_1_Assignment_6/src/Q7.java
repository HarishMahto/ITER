import java.util.Scanner;

public class Q7 {

	// isVowel() function returns 1 if the
	// character is a vowel and 0 if it is not
	static int isVowel(char chars)
	{
		if (chars == 'a' || chars == 'e' || chars == 'i'
			|| chars == 'o' || chars == 'u') {
			return 1;
		}
		else {
			return 0;
		}
	}

	// recursive function to return the number
	// of characters in a string
	static int vowelno(String str, int l)
	{
		if (l == 1) {
			return isVowel(str.charAt(l - 1));
		}

		return vowelno(str, l - 1)
			+ isVowel(str.charAt(l - 1));
	}

	public static void main(String[] args)
		
	{
		Scanner  sc=new Scanner(System.in);	      
	 	System.out.print("Enter a string: " );
		String str = sc.nextLine();

		str = str.toLowerCase();

		System.out.print("Total number of vowels in string are:");

		System.out.println(vowelno(str, str.length()));
	}
}
