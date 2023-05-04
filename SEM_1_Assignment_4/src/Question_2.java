
import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=a.nextInt();
		int i=n;
		int rem=0;
		int result=0;
		while(i>0)
		{
			rem=i%10;
			result=result+rem;
			i=i/10;
		}
		if(result%9==0) {
			System.out.println("The number "+n+" is divisible by 9.");
		}
		else
		{
			System.out.println("The number "+n+" is not divisible by 9.");
		}

	}

}
