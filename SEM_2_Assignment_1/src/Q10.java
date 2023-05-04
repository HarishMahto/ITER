import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 3-by-4 matrix row by row: ");
		double arr[][]= new double[3][4];
		int columnIndex=0;
		
		for(int i= 0;i<3;i++)
		{
			for(int j= 0;j<4;j++)
			{
				arr[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("The elements of 2D array are: ");
		for(int i= 0;i<3;i++)
		{
			for(int j= 0;j<4;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		for(int i=0;i<=3;i++)
		{
			columnIndex=i;
			System.out.println("Sum of the elements in the major diagonal is "+sumColumn(arr,columnIndex));
		}
	}
	
	public static double sumColumn(double arr[][], int columnIndex) {
		double sum=0;
		for(int i= 0;i<3;i++)
		{
			for(int j= 0;j<4;j++)
			{
				if(j==columnIndex)
				{
					sum+=arr[i][j];
				}
			}
		}
		return sum;
	}

}
