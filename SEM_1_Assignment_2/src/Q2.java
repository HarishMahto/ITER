
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		System.out.print("Enter the distance in km: ");
		double km=abc.nextDouble();
		double m=km*1000;
		double f=km*3280.8399;
		double in=km*39370.0787;
		double cm=km*100000;
		
		System.out.println(km+" km is "+m+" meters");
		System.out.println(km+" km is "+f+" feet");
		System.out.println(km+" km is "+in+" inch");
		System.out.println(km+" km is "+cm+" centimeters");

	}

}
