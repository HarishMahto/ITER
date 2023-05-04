import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of sides: ");
		int n=sc.nextInt();
		System.out.print("Enter the length of side: ");
		double side=sc.nextDouble();
		
		System.out.print("Area of the polynomial: "+area(n,side));
	}
	
	public static double area(int n, double side) 
	{
		double r;
		r=(n*(Math.pow(side,2))/(4*Math.tan(Math.PI/n)));
		return r;
				
	}

}
