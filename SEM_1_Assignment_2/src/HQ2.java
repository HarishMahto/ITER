
import java.util.Scanner;
public class HQ2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number eggs you have: ");
		int n=sc.nextInt();
		
		int gross=n/144;
		int dozen=(n%144)/12;
		int left=((n%144)%12);
		System.out.println("Your number of eggs is "+gross+" gross, "+dozen+" dozen, and "+left);

	}

}
