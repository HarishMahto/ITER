import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a number: ");
		double n=a.nextDouble();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(1/i*i);
			System.out.print(sum+"+");
		}
		System.out.println("Sum: "+sum);
	}

}
