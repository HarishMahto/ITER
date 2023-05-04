
public class Q4 {

	public static void main(String[] args) {
		for(int i=2000;i<=2020;i++)
		{
			int year=i;
			System.out.println("Number of days in year "+i+" is :"+numberOfDaysInAYear(year));
		}
	}
	
	public static int numberOfDaysInAYear(int year)
	{
		if ((year%4 == 0 && year%100 !=0 ) || (year%400 == 0))
			return 366;
		else
			return 365;
	}

}
