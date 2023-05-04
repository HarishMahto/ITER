import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);	      
 	   System.out.print(" Enter two numbers: " );
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println("1.Addition: "+additionSimple(a,b));
        
        System.out.println("2.Substraction: "+subtractionSimple(a,b));
        
        System.out.println("3.Multiplication: "+multiplicationSimple(a,b));
        
        System.out.println("4.Division: "+divisionSimple(a,b));
        
        System.out.println("5.Remainder: "+remainderSimple(a,b));
        
        System.out.println("6.Square root: "+squareRootSimple(a,b));
        
        
   }

public static int remainderSimple(int x,int y){
	return y%x;
}

public static double divisionSimple(int x, int y) {
	int m;
	if (x!=0)
	m=y/x;
else
	m=0;
return(m);
		
}

public static double squareRootSimple(int x,int y){
	return Math.sqrt(x);
}

public static int multiplicationSimple(int x, int y ){
	return y*x;
}

public static int subtractionSimple(int x, int y) 
{
return y-x;
}

public static int additionSimple(int x,int y)
{
return x+y;
}
}
