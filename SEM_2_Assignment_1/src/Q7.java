import  java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements of Array: ");
		int n = sc.nextInt();
		int arr[]= new int[n];
		
		for(int i= 0;i<n;i++)
		{
			System.out.print("Enter elements of the Array: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered elements of array are : ");
		for(int i= 0;i<n;i++)
		{
			System.out.println(arr[i]+"\t");
		}
		int max=arr[0];
		int min=arr[0];
		int maxCnt=0,minCnt=0;
		int maxPos=0,minPos=0;
		for (int i=0;i<n;i++)
		{
			if (arr[i]>max)
			{
				max=arr[i];
			}
			else if (max==arr[i])
			{
				maxCnt++;
				maxPos=i;
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(min==arr[i])
			{
				minCnt++;
				minPos=i;
			}
		}
		
		System.out.println("Maximum element of Array is "+max+" and occurs "+maxCnt+" times.");
		System.out.println("Minimum element of Array is "+min+" and occurs "+minCnt+" times.");
		System.out.println("First occurrence of maximum element is at position "+maxPos+" .");
		System.out.println("First occurrence of minimum element is at position "+minPos+" .");
		
	}

}
