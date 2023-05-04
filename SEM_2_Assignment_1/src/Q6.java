import  java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int s=n;
		System.out.println(n+" is odd: "+isOdd(s));
	}
	
	public static boolean isOdd(int s) {
		
		while (s>=2)
		{
			s=s-2;
		}
		if (s==0)
			return false;
		
		return true;
	}
}
