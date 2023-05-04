
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=a.nextInt();
		int sum=0;
		for(int i=1;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
			System.out.println(n+" is a perfect number.");
		else
			System.out.println(n+" is not a perfect number.");
	}

}
