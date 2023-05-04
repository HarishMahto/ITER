
public class HQ1 {

	public static void main(String[] args) {
		int s, sum=0;
		System.out.println("The sum of the squares of the first ten natural numbers is: ");
		for(int i=1;i<=10;i++)
		{
			s=i*i;
			
			sum+=s;
			if(i==10)
			{	
		    	System.out.print(s+" = "+sum);
			}
			else
				System.out.print(s+" + ");
		}
		System.out.println();
		sum=0;
		System.out.println("The square of the sum of the first ten natural numbers is: ");
		for(int i=1;i<=10;i++)
		{
			sum+=i;
			
			if(i==10)
			{
				s=sum*sum;
		    	System.out.print(i+" = "+s);
			}
			else
				System.out.print(i+" + ");
		}
		System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is "+(sum-s));
	}

}
