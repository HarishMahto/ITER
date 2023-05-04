import java.util.Scanner;

class Shape{

	static final double PI = Math.PI;

	// Overloaded Area() function to
	// calculate the area of the square
	// It takes one float parameter
	void Cube(double s)
	{
		double V = s * s * s;
		System.out.println("Volume of the Cube: " + V);
	}

	// Overloaded Area() function to
	// calculate the area of the circle
	// It takes one double parameter
	void Sphere(double r)
	{
		double V = (4/3)*PI * r * r * r;
		System.out.println("Area of the Sphere: " + V);
	}

	// Overloaded Area() function to
	// calculate the area of the rectangle
	// It takes two int parameters
	void Cuboid(int l, int b, int h)
	{
		int V = l * b * h;
		System.out.println("Volume of the Cuboid: " + V);
	}
	
}

public class HQ2 {

	// Driver code
	public static void main(String[] args)
	{
		Scanner  sc=new Scanner(System.in);	      
	 	System.out.print("Enter length of Cuboid: " );
	    int l=sc.nextInt();
	    System.out.print("Enter breadth of Cuboid: " );
	    int b=sc.nextInt();
	    System.out.print("Enter height of Cuboid: " );
	    int h=sc.nextInt();
	    System.out.print("Enter side of Cube: " );
	    int s=sc.nextInt();
	    System.out.print("Enter radius of Sphere: " );
	    int r=sc.nextInt();
	    
		// Creating object of Shape class
		Shape obj = new Shape();

		// Calling function
		obj.Cube(s);
		obj.Sphere(r);
		obj.Cuboid(l,b,h);
		
	}
}
