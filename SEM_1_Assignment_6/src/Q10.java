import java.util.Scanner;

class Shape {

	static final double PI = Math.PI;

	// Overloaded Area() function to
	// calculate the area of the square
	// It takes one float parameter
	void Square(float s)
	{
		float A = s * s;
		System.out.println("Area of the Square: " + A);
	}

	// Overloaded Area() function to
	// calculate the area of the circle
	// It takes one double parameter
	void Circle(double r)
	{
		double A = PI * r * r;
		System.out.println("Area of the Circle: " + A);
	}

	// Overloaded Area() function to
	// calculate the area of the rectangle
	// It takes two int parameters
	void Rectangle(int a, int b)
	{
		int A = a * b;
		System.out.println("Area of the Rectangle: " + A);
	}
	
	void Triangle(double h, double l)
	{
		double A = 0.5*l*h;
		System.out.println("Area of the Triangle: " + A);
	}
}

public class Q10 {

	// Driver code
	public static void main(String[] args)
	{
		Scanner  sc=new Scanner(System.in);	      
	 	System.out.print("Enter length of Rectangle: " );
	    int a=sc.nextInt();
	    System.out.print("Enter breadth of Rectangle: " );
	    int b=sc.nextInt();
	    System.out.print("Enter side of Square: " );
	    int s=sc.nextInt();
	    System.out.print("Enter radius of Circle: " );
	    int r=sc.nextInt();
	    System.out.print("Enter height of Triangle: " );
	    int h=sc.nextInt();
	    System.out.print("Enter base of Triangle: " );
	    int l=sc.nextInt();
		// Creating object of Shape class
		Shape obj = new Shape();

		// Calling function
		obj.Square(s);
		obj.Circle(r);
		obj.Rectangle(a,b);
		obj.Triangle(h,l);
	}
}
