
import java.util.Scanner;
public class H5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("W: ");
		int W=sc.nextInt();
		System.out.print("K: ");
		int K=sc.nextInt();
		System.out.print("G: ");
		int G=sc.nextInt();
		System.out.print("A: ");
		int A=sc.nextInt();
		
		System.out.println("W="+W+" G="+G+" K="+K+" A="+A);
		W=W+G;
		G=W-G;
		W=W-G;
		G=G+K;
		K=G-K;
		G=G-K;
		K=K+A;
		A=K-A;
		K=K-A;
		System.out.println("W="+W+" G="+G+" K="+K+" A="+A);
		

	}

}
