
import java.util.Scanner;
public class Question_7 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		System.out.print("No. of units consumed : ");
		double unit=n.nextInt();
		
		Scanner n2=new Scanner(System.in);
		System.out.print("Do you want to pay online(y/n) : ");
		String choice=n2.nextLine();
		

		
		if (unit > 400)
		{
			unit=unit-400;
			double sum=unit*6.20+200*5.80+150*4.80+50*3;
			System.out.println("Total amount : "+ sum);
			
			System.out.print("choice :"+choice);

			
			if (choice == "y")
			{	
				double discount=sum*0.03;
				System.out.println("Discount : "+ discount);
				double amt=sum-discount;
				System.out.println("Amount payable : "+ amt);
				
			}
			else
			{
				System.out.println("Amount payable : "+ sum);
			}
			
			
		}
		
		else if (unit > 200 && unit <= 400)
		{
			unit=unit-200;
			double sum=unit*5.80+150*4.80+50*3;
			System.out.println("Total amount : "+ sum);
			
			if (choice == "y")
			{
				double discount=sum*0.03;
				System.out.println("Discount : "+ discount);
				double amt=sum-discount;
				System.out.println("Amount payable : "+ amt);				
			}
			else
			{
				System.out.println("Amount payable : "+ sum);
			}
			
		}
		
		else if (unit > 50 && unit <= 200)
		{
			unit=unit-50;
			double sum=unit*4.80+50*3;
			System.out.println("Total amount : "+ sum);
			
			if (choice == "y")
			{
				double discount=sum*0.03;
				System.out.println("Discount : "+ discount);
				double amt=sum-discount;
				System.out.println("Amount payable : "+ amt);				
			}
			else
			{
				System.out.println("Amount payable : "+ sum);
			}
			
		}
		
		else
		{
			double sum=unit*3;
			System.out.println("Total amount : "+ sum);
			
			if (choice == "y")
			{
				double discount=sum*0.03;
				System.out.println("Discount : "+ discount);
				double amt=sum-discount;
				System.out.println("Amount payable : "+ amt);				
			}
			else
			{
				System.out.println("Amount payable : "+ sum);
			}
			
		}
		

	}

}
