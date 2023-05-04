
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.print("Enter Tempeature in Fahreanheit: ");
		double fah=abc.nextDouble();
		double cel=(fah-32)*(5.0/9);
		System.out.println(fah+" Fahrenheit is "+cel+" Celsius");
	}
}
