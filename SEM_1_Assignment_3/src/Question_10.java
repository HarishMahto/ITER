
import java.util.Scanner;
public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x=new Scanner(System.in);
		System.out.print("Enter mark secured : ");
		int marks=x.nextInt();
		
		switch (marks/10) {
		case (10):
			System.out.println("Grade : O");
		break;
		case (9):
			System.out.println("Grade : A");
		break;
		case (8):
			System.out.println("Grade : B");
		break;
		case (7):
			System.out.println("Grade : C");
		break;
		case (6):
			System.out.println("Grade : D");
		break;
		case (5):
			System.out.println("Grade : E");
		break;
		case (4):
			System.out.println("Grade : F");
		break;
		 case 3:
	            System.out.println("Your grade is F");
	            break;
	          case 2:
	            System.out.println("Your grade is F");
	            break;
	          case 1:
	            System.out.println("Your grade is F");
	            break;
	          case 0:
	            System.out.println("Your grade is F");
	            break;
	          default:
	           System.out.println("you have entered wrong information");
	            break;
		}
		

	}

}
