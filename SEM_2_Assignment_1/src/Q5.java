import  java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int a=n;
		System.out.println("Sum of digits of "+a+" until the number is a single digit is "+sum_Of_Digits(n));
	}
	
	
	public static int sum_Of_Digits(int n) {
		int s=0;
		n=n%10;
		s+=n;
		n=n/10;	
		while (s>9) {
						
			while (n>0)
			{
							n=n%10;
							s+=n;
							n=n/10;
			}
			
		}
		return s;
	}

}
