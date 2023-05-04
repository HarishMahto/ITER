
import java.util.Scanner;
public class Question_4 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1=a.nextInt();
		System.out.print("Enter the second number: ");
		int n2=a.nextInt();
		int x=Math.max(n1, n2);
		int y=Math.min(n1, n2);
		int g;
		
		while(x%y!=0)
		{
			g=x%y;
			x=y;
			y=g;
		}
	System.out.println("GCD of "+n1+" and "+n2+" is: "+y);
	}

}
