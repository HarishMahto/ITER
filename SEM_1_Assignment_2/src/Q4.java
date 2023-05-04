
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number between 0 - 1000: ");
		int num=sc.nextInt();
		int num1=num%10;
		int num2=num/10;
		int num3=num2%10;
		int num4=num2/10;
		
		System.out.print("Sum of all the digits :"+(num1+num3+num4));

	}

}
