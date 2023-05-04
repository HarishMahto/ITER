
import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter quantity of water in ml, Alice drank today : ");
		int water=a.nextInt();
		if (water >= 5000)
		{
			System.out.println("Yes, Alice is following doctor\'s advice");
		}
		else
		{
			System.out.println("No, Alice is not following doctor\'s advice");
		}
		// TODO Auto-generated method stub

	}

}
