
import java.util.Scanner;
public class Question_4 {

	public static void main(String[] args) {
		int a=(int)((Math.random()*9)+1);
		Scanner n1=new Scanner(System.in);
		System.out.print("Input first number : ");

		int n=n1.nextInt();
		
		if (n == a)
		{
			System.out.println("Computer guesses:"+ a);
			System.out.println("You got it right");
		}
		else if (n == a+1 || n == a-1)
		{
			System.out.println("Computer guesses:"+ a);
			System.out.println("Almost got it");
		}
		else
		{
			System.out.println("Computer guesses:"+ a);
			System.out.println("You got it wrong");			
		}


	}

}
