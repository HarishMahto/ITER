import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) 
	{
	   Scanner  sc=new Scanner(System.in);	      
 	   System.out.print(" Enter a number: " );
       int n=sc.nextInt();
	   for(int i=1; i<=n;i++) 
		{
			
			System.out.print(getPentagonalNumber(i)+" ");
			if (i%10==0)
				System.out.println();
		
		}

	}

	private static int getPentagonalNumber(int a)
	{
		   int n=a*(3*a-1)/2;
		   return n;
	}

}
