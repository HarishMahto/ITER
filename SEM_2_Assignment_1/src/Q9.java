 import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 4-by-4 matrix row by row: ");
		double arr[][]= new double[4][4];
		
		for(int i= 0;i<4;i++)
		{
			for(int j= 0;j<4;j++)
			{
				arr[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("The elements of 2D array are: ");
		for(int i= 0;i<4;i++)
		{
			for(int j= 0;j<4;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(arr));
	}
	
	public static double sumMajorDiagonal(double arr[][] ) {
		double sum=0;
		for(int i= 0;i<4;i++)
		{
			for(int j= 0;j<4;j++)
			{
				if(i==j)
				{
					sum+=arr[i][j];
				}
			}
		}
		return sum;
	}

}
