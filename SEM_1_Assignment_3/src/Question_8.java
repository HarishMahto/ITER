
import java.util.Scanner;
public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1=new Scanner(System.in);
		System.out.print("Enter x coordinate : ");
		double x=n1.nextDouble();
		
		Scanner n2=new Scanner(System.in);
		System.out.print("Enter y coordinate : ");
		double y=n2.nextDouble();
		
		if (x < 0)
		{
			if (y < 0)
			{
				System.out.print("("+x+","+y+") is in quadrant III");
			}
			else
			{
				System.out.print("("+x+","+y+") is in quadrant II");
			}
		}
		
		else
		{
			if (y < 0)
			{
				System.out.print("("+x+","+y+") is in quadrant IV");
			}
			else
			{
				System.out.print("("+x+","+y+") is in quadrant I");
			}
		}

	}

}
