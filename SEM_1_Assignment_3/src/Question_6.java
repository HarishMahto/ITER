
import java.util.Scanner;
public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		System.out.print("Enter monthly unit consumed : ");
		double unit=n.nextInt();
		
		if (unit > 400)
		{
			unit=unit-400;
			double sum=unit*6.20+200*5.80+150*4.80+50*3;
			System.out.println("Monthly electricity bill : "+ sum);
		}
		
		else if (unit > 200 && unit <= 400)
		{
			unit=unit-200;
			double sum=unit*5.80+150*4.80+50*3;
			System.out.println("Monthly electricity bill : "+ sum);
		}
		else if (unit > 50 && unit <= 200)
		{
			unit=unit-50;
			double sum=unit*4.80+50*3;
			System.out.println("Monthly electricity bill : "+ sum);	
		}
		else
		{
			double sum=unit*3;
			System.out.println("Monthly electricity bill : "+ sum);
		}


	}

}
