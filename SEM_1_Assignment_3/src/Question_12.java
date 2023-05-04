
import java.util.Scanner;
public class Question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Sunday (0), Monday (1), Tuesday (2), Wednesday (3), Thursday(4), Friday (5), Saturday (6).");

		Scanner x=new Scanner(System.in);
		System.out.print("Enter today's day : ");
		int a=x.nextInt();
		
		Scanner y=new Scanner(System.in);
		System.out.print("Enter the number of days elapsed since today : ");
		int b=y.nextInt();
		
		int future=a+(b%7);
		
		switch (future) {
		case (0):
			System.out.println("Today is "+a+" and the future day is Sunday");
		case (1):
			System.out.println("Today is "+a+" and the future day is Monday");
		case (2):
			System.out.println("Today is "+a+" and the future day is Tuesday");
		case (3):
			System.out.println("Today is "+a+" and the future day is Wednesday");
		case (4):
			System.out.println("Today is "+a+" and the future day is Thursday");
		case (5):
			System.out.println("Today is "+a+" and the future day is Friday");
		case (6):
			System.out.println("Today is "+a+" and the future day is Saturday");
		
		break;
		}
	}

}
