import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		int a=0,b=1,c=1,next;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		for(int i=3;i<n;i++)
		{
			next=c+b+a;
			System.out.println(next);
			a=b;
			b=c;
			c=next;
		}
	}
}
