
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter the value of m: ");
		int m=a.nextInt();
		System.out.print("Enter the value of n: ");
		int n=a.nextInt();
		int x=m;
		for (int next=Math.min(m,n); next<=Math.max(m,n);next++)
		{
			int ctr=1;
			for(int i=1;i<=next;i++)
			{
				ctr*=i;
				
			}
			System.out.println("Factorial of "+m+" is: "+ctr);	
			x+=1;
		}

	}

}
