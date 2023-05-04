
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter time in seconds: ");
        double t=sc.nextDouble();
		double d=0.5*32.174*Math.pow(t,2); 
		System.out.println("Distance travelled: "+d);

	}

}
