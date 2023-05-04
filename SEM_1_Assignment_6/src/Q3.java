import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: " );
		int num=sc.nextInt();
		int result=reverse(num);
		System.out.println("Reverse of a number is:"+ result );
		if(isPalindrome(num))
		{
			System.out.println(num+" is paleindrome.");
		}
		else
		{
			System.out.println(num+" is not paleindrome.");
		}
	}

	public static boolean isPalindrome(int num) {
		return false;
		
	}

	public static int reverse(int number) 
	{
		int rev=0;
		while(number!=0)
		{
			int digit=number%10;
			rev=rev*10+digit;
			number=number/10;
		}
		return rev;
 
   }
	public static boolean isPalindrome1(int number) 
	{
		if(reverse(number)==number) 
		{
			return true;
		}
		return false;
	}
}
