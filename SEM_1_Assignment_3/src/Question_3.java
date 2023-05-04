
import java.util.Scanner;
public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.print("Input first number : ");
		int n1=a.nextInt();
		
		Scanner b=new Scanner(System.in);
		System.out.print("Input second number : ");
		int n2=b.nextInt();
		
		Scanner c=new Scanner(System.in);
		System.out.print("Input third number : ");
		int n3=c.nextInt();
		
		if (n1 < n2 && n2 < n3)
		{
			System.out.println("Increasing");
		}
		
		else if (n1 > n2 && n2 > n3)
		{
			System.out.println("Decreasing");
		}
		
		else
		{
			System.out.println("Neither Increasing nor decreasing");
		}
		
		
		

	}

}
