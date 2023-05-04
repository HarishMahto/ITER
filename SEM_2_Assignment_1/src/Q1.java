
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
		System.out.println("The positive integer greater than 2 from command line argument is "+x);
		int c = 0 ;
		while(x>2)
		{
			x=x/2;
			c++;
		}
		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+c);

	}

}
