
import java.util.Scanner;
public class Question_5 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.print("Input the year : ");
		int year=x.nextInt();
		
		
		if (year%100 == 0)
		{
			if (year%400 == 0)
			{
				boolean leap=true;
				System.out.println(year+" is a leap year: "+ leap);
				
			}
			else
			{
				boolean leap=false;
				System.out.println(year+" is a leap year: "+ leap);
			}
			
		}
		else
		{
			if (year%4 == 0)
			{
				boolean leap=true;
				System.out.println(year+" is a leap year: "+ leap);
			}
			else
			{
				boolean leap=false;
				System.out.println(year+" is a leap year: "+ leap);
			}
		}
		
	}

}
