
import java.util.Scanner;
public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=a.nextInt();
		int sum=0;
		int i=1;
		
		System.out.print("Random numbers generated are: ");
		
		do
		{
			int x=(int)(Math.random()*n);
			System.out.print(x+" ");
			sum+=x;
			i++;
		}
		while(i<=n);
		
		System.out.println();
		double avg=sum/n;
		System.out.println("Average of "+n+" random numbers are: "+ avg);
		

	}

}
