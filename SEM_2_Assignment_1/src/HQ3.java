import java.util.Scanner;
public class HQ3 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int[]a=new int[n];
        int []b=new int[n];
        System.out.println("Enter the elements of both the arrays one by one");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int c[]=new int[n];
        for(int j=0;j<a.length;j++){
            c[j]= a[j]*b[j];

        }
        System.out.println("Dot product=");
        for(int k=0;k<n;k++){
            System.out.println(c[k]);
        }
    }
}
