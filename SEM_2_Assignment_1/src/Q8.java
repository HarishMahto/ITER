import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Row and Columns of 2D-Array: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[][]= new int[a][b];
		int sum=0;
		
		System.out.print("Enter elements of the Array: ");
		for(int i= 0;i<a;i++)
		{
			for(int j= 0;j<b;j++)
			{
				arr[i][j] = sc.nextInt();
				sum+= arr[i][j];
			}
		}
		
		System.out.println("The elements of 2D array are: ");
		for(int i= 0;i<a;i++)
		{
			for(int j= 0;j<b;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("The sum of elements of the 2D-Array is: "+sum);
	}

}
