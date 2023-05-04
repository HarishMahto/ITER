import java.util.Scanner;
public class H3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		double n=sc.nextDouble();
		double t=n,sum=0;
		int i=1;
		do {
			sum=sum+t;
			i+=2;
			t=-t*n*n/i*(i-1);
		}
		while(Math.abs(1)>0.000001);
		System.out.println(sum);
	}
}
