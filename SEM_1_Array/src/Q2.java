import java.util.Scanner;
public class Q2 {
   public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of element ");
    int n= sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the array elements ");
    for (int i=0; i<n; i++) {
      arr[i]=sc.nextInt();
    }
    boolean isPrime =false;
    for (int i = 0; i <n;i++) {
        for(int j=2; j<n; j++) {
        if (arr[i]%j==0){
           isPrime = false;
        
        }else{
          isPrime=true;
        }
     }
    }

    int count=0;
    for (int i=0; i<n; i++) {
        if (isPrime==true) {
        count++;
    }
    
   }
   System.out.println("the number of elements that are prime are "+count);

}
}