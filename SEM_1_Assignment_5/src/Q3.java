
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1=a.nextInt();
		System.out.print("Enter second number: ");
		int n2=a.nextInt();
		for (int next=Math.min(n1,n2); next<=Math.max(n1,n2);next++)
		{
			int ctr=0;
			for(int i=2;i<=next/2;i++)
			{
				if(next%i==0)
				{
					ctr+=1;
					break;
				}
					
			}
			if (ctr==0)
				System.out.print(next+" ");	
			
		}
	}

}
