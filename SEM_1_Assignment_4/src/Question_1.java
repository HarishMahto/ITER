
import java.util.Scanner;
public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=n1.nextInt();
		
		Scanner n2=new Scanner(System.in);
		System.out.print("Enter second number: ");
		int b=n2.nextInt();
		
		Scanner n3=new Scanner(System.in);
		System.out.print("Enter third number: ");
		int c=n3.nextInt();
		
		int i, sum=a;
		int m=0;
		
		for(i=a; sum<=b; i++)
		{
			System.out.print(sum+" ");
			m=m+sum;
			sum=sum+c;
			
		}
		System.out.println();
		System.out.println("The sum of number displayed is "+m);

	}

}
