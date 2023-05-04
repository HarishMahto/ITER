
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=a.nextInt();
		int rev=0,temp=num;

		while (num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		int ctr=0;
		for(int i=2;i<=temp || i<rev;i++)
			if(temp%i==0 || rev%i ==0)
				ctr+=1;
		
		if(ctr<=1)
		{
			System.out.println("Twisted Prime");
			
		}
		else
		{
			System.out.println("Not Twisted Prime");
		}

	}

}
