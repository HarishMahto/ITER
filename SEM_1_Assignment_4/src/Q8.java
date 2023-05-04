
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		int c,u;
		Scanner a=new Scanner(System.in);
		do
		{
			c=(int)(Math.random()*10+1);
			System.out.print("Enter a number between 1 to 10: ");
			u=a.nextInt();
			System.out.println("Computer guess: "+c);
			System.out.println("User guess: "+u);
			if(u>c)
			{
				System.out.println("Too low, try again");
			}
			else if(u<c)
			{
				System.out.println("Too high, try again");
			}
			else
			{
				System.out.println("Good guess");
			}
			
		}
		while(c != u);

	}

}
