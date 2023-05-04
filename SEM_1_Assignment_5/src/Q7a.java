
public class Q7a {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			char ctr='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ctr++ +" ");	
			}
			System.out.println();	
		}
	}
}
