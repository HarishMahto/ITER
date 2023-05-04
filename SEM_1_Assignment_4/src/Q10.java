
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int power = 0;
		int i=0;
		
		while (Math.pow(3,  i) <= num) {
			power = (int)Math.pow(3, i);
			i++;
		}
		System.out.println("The largest power of 3 less than or equal to "+num+" is: "+ power);
	}

}
