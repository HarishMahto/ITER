
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int n=Sc.nextInt();
		int idx=0;
		int new_number=0;
		while(n>0) 
		{
		int rem=n%10;
		n=n/10;
		if(rem!=0)
		{
			new_number=new_number+(int) (rem*Math.pow (10,idx));
			idx++;
		}
		}
	    System.out.println("After removing 0 from number "+n+", the new number is "+new_number);

	}

}
