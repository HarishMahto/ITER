import java.util.Scanner;
public class HQ2 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of lines:");
        int n=sc.nextInt();
        sc.nextLine();
        String s[]=new String[n];
        for(int i=0;i<s.length;i++){
            int temp = i;
            System.out.print("Enter "+(temp+1)+" line: \n");
            s[i]=sc.nextLine();
        }
        System.out.println("The input in reverse order:");
        for(int i=s.length-1;i>=0;i--){
            System.out.println(s[i]);
        }
    }
}
