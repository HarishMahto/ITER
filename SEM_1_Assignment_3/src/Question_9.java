
import java.util.Scanner;
public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the value of a, b, c : ");
		double n1, n2, n3;
		n1=x.nextDouble();
		n2=x.nextDouble();
		n3=x.nextDouble();
		
		if (n1 > n2)
		{
			if (n1 > n3)
			{
				System.out.println("Largest number : "+n1);
			}
			else
			{
				System.out.println("2nd largest number : "+n1);
			}
		}
		
		else
		{
			if (n2 > n3)
			{
				System.out.println("Largest number : "+n2);
			}
			else
			{
				System.out.println("2nd largest number : "+n2);
			}
		}

	}

}
