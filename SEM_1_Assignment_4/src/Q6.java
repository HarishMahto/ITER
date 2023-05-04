
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter the base: ");
		int n1=a.nextInt();
		
		Scanner b=new Scanner(System.in);
		System.out.print("Enter the power: ");
		int n2=b.nextInt();
		
		int x=1;
		
		for (int i=1;i<=n2;i++)
		{
			x=x*n1;
		}
		System.out.println(n1+" to the power "+n2+" is: "+x);

	}

}
