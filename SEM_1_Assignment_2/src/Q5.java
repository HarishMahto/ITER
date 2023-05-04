
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter radius of hemisphere: ");
        double r=sc.nextDouble();
		double a=3*Math.PI*Math.pow(r,2);
        double v=(2.0/3.0)*Math.PI*Math.pow(r,3);
                
		System.out.println("The radius of hemisphere is : "+r);
        System.out.println("The surface area of the hemisphere is : "+a);
        System.out.println("The volume area of the hemisphere is : "+v);

	}

}
