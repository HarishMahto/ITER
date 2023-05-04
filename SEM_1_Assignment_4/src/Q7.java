
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a no. for which you want to find the multiplication table: ");
		int n1=a.nextInt();
		
		System.out.println("The multiplication table of "+n1+" is:");
		for (int i=1;i<=10;i++)
		{
			System.out.println(n1+"x"+i+"="+n1*i);
		}

	}

}
