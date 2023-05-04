
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.print("Enter basic salary: ");
		
		double salary=abc.nextDouble();
		double da=salary*40/100;
		double hra=salary*20/100;
		double gross=salary+hra+da;
		
		System.out.println("DA is: "+da);
		System.out.println("HRA is: "+hra);
		System.out.println("Gross salary is: "+gross);

	}

}
