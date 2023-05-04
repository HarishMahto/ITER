import java.util.Scanner;
public class Question_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=x.nextInt();
		
		if (a%5 == 0)
		{
			if (a%6 == 0)
			{
				System.out.println("Is "+a+" divisible by 5 and 6? true");
				System.out.println("Is "+a+" divisible by 5 or 6, but not both? false");
			}
			else
			{
				System.out.println("Is "+a+" divisible by 5 and 6? false");
				System.out.println("Is "+a+" divisible by 5 or 6? true");
				System.out.println("Is "+a+" divisible by 5 or 6, but not both? true");
			}
		}
		else
		{
			if (a%6 == 0)
			{
				System.out.println("Is "+a+" divisible by 5 and 6? false");
				System.out.println("Is "+a+" divisible by 5 or 6? true");
				System.out.println("Is "+a+" divisible by 5 or 6, but not both? true");
		    }
			else
			{
				System.out.println("Is "+a+" divisible by 5 and 6? false");
				System.out.println("Is "+a+" divisible by 5 or 6? false");
				System.out.println("Is "+a+" divisible by 5 or 6, but not both? false");
			}
		}

	}

}
