
public class H2 {

	public static void main(String[] args) {
		for (int i=0;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
