
import java.util.Scanner;
public class HQ1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int min=sc.nextInt();
		
		int year=min/(365*24*60);
		int x=min%(365*24*60);
		int days=x/(24*60);
		System.out.println(min+" minutes is approximately "+year+" years and "+days+" days.");
	}
}
