import  java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("N: ");
		int n = sc.nextInt();
		int a=n;
		int s=0;
		int p=1;
		while (n>0)
		{
			n=n%10;
			s+=n;
			p=p*n;
			n=n/10;
		}
		if (s==p)
		{
			System.out.println("So, "+a+" is a spy number.");
		}
		else
		{
			System.out.println("So, "+a+" is not a spy number.");
		}
	}

}
