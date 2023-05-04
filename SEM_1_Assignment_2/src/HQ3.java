
import java.util.Scanner;
public class HQ3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three points ");
		
		System.out.print("x1: ");
		double x1=sc.nextDouble();
		System.out.print("y1: ");
		double y1=sc.nextDouble();
		
		System.out.print("x2: ");
		double x2=sc.nextDouble();
		System.out.print("y2: ");
		double y2=sc.nextDouble();
		
		System.out.print("x3: ");
		double x3=sc.nextDouble();
		System.out.print("y3: ");
		double y3=sc.nextDouble();
		double a=Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
		double b=Math.sqrt((Math.pow((x3-x2), 2))+(Math.pow((y3-y2), 2)));
		double c=Math.sqrt((Math.pow((x1-x3), 2))+(Math.pow((y1-y3), 2)));
		double s=(a+b+c)/2;
		double area=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		
		System.out.println("The area of the triangle is: "+area);

	}

}
