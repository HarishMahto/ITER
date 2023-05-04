import java.util.Scanner;

public class HQ1 {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);	      
	 	System.out.print("Enter a String: " );    
	 	String string=sc.nextLine();
		int index = 0;
		char fnc = ' ';
		for (char i : string.toCharArray()) {
			if (string.indexOf(i) == string.lastIndexOf(i)) {
				fnc = i;
				break;
			}
			else {
				index += 1;
			}
		}
		if (index == 2) {
			System.out.println("Either all characters are repeating or "
							+ "string is empty");
		}
		else {
			System.out.println("First non-repeating character is " + fnc);
		}
	}
}
