import java.util.Scanner;
public class Question_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		System.out.print("What is your gender (M or F): ");
		char gen=n.next().charAt(0);
		
		Scanner n1=new Scanner(System.in);
		System.out.print("First name: ");
		String fn=n1.nextLine();
		
		Scanner n2=new Scanner(System.in);
		System.out.print("Last name: ");
		String ln=n2.nextLine();
		
		Scanner x=new Scanner(System.in);
		System.out.print("Age: ");
		int age=x.nextInt();
		
		if ( gen == 'F' || gen == 'f')
		{
			if (age >=20 )
			{
				Scanner m=new Scanner(System.in);
				System.out.print("Are you married, Gita (y or n)? ");
				char st=m.next().charAt(0);
				
				if (st == 'Y' || gen == 'y')
				{
					System.out.println("Then I shall call you Mrs. "+fn+" "+ln);
				}
				else if (st == 'N' || gen == 'n')
				{
					System.out.println("Then I shall call you Ms. "+fn);
				}
			}
			else
			{
				System.out.println("Then I shall call you "+fn+" "+ln);
			}
			
		}
		
		else if (gen == 'M' || gen == 'm')
		{
			if ( age >= 20)
			{
				System.out.println("Then I shall call you Mr. "+fn);
			}
			else
			{
				System.out.println("Then I shall call you "+fn+" "+ln);
			}
		}
		

	}

}
