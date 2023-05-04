import java.util.Scanner;

public class HQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of \'a\' : ");
		int a = sc.nextInt();
		System.out.print("Enter value of \'b\' : ");
		int b = sc.nextInt();
		System.out.print("Enter value of \'c\' : ");
		int c = sc.nextInt();
		
		System.out.println("a+b=c : "+isAdd(a,b,c));
		System.out.println("a-b=c : "+isSub(a,b,c));
		System.out.println("a*b=c : "+isMultiple(a,b,c));

	}
	
	public static boolean isAdd(int a,int b,int c)
	{
		if (a+b==c)
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean isMultiple(int a,int b,int c)
	{
		if (a*b==c)
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean isSub(int a,int b,int c)
	{
		if (a-b==c)
		{
			return true;
		}
		
		return false;
	}


}
