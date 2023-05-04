import java.util.Scanner;
public class H5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.print("Fibonacci Series is: ");
		if (n==1)
			System.out.print(a+"."+b);
		else
			System.out.print(a+","+b+",");
		for(int i=3;i<=n;i++)
		{
			int sum=a+b;
			System.out.print(sum+",");
			a=b;
			b=sum;
		}
	}
}
