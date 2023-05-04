
import java.util.Scanner;
public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x=new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2) : ");
		int user=x.nextInt();
		
		int a=(int)(Math.random()*2);
		System.out.println("The computer is "+a);
		
		if (user == 0)
		{
			if (a == 1)
			{
				System.out.println("The computer is "+a+". You are "+user+". You lose");

			}
			else if (a == 2)
			{
				System.out.println("The computer is "+a+". You are "+user+". You won");

			}
			else
			{
				System.out.println("The computer is "+a+". You are "+user+" too. It is a draw");
			}
		}
		
		
		else if (user == 1)
		{
			if (a == 2)
			{
				System.out.println("The computer is "+a+". You are "+user+". You lose");

			}
			else if (a == 0)
			{
				System.out.println("The computer is "+a+". You are "+user+". You won");

			}
			else
			{
				System.out.println("The computer is "+a+". You are "+user+" too. It is a draw");
			}
		}
		
		else
		{
			if (a == 0)
			{
				System.out.println("The computer is "+a+". You are "+user+". You lose");

			}
			else if (a == 1)
			{
				System.out.println("The computer is "+a+". You are "+user+". You won");

			}
			else
			{
				System.out.println("The computer is "+a+". You are "+user+" too. It is a draw");
			}
		}
		

	}

}
