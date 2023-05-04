
import java.util.Scanner;
public class HQ5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=sc.nextInt();
		String s="";
		for(int i=1;i<=a;i++)
		{
			s=s+i+s;
			System.out.println(s+" ");
		}
	}

}
