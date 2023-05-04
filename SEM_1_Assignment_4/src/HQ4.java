
import java.util.Scanner;
public class HQ4 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=a.nextInt();
		int m=1;
		int s=0;
		System.out.print("Sum of all even numbers = ");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" + ");
				s+=i;
			}
		}
		System.out.print(" = "+s);
		System.out.println();
		System.out.print("Product of all odd numbers = ");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" * ");
				m=m*i;
			}
		}
		System.out.print(" = "+m);
	}

}
