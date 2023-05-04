
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=a.nextInt();
		int sum=0,c=0;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				c+=j;
			}
			sum+=c;
			c=0;
		}
		System.out.println("Sum: "+sum);
	}

}
