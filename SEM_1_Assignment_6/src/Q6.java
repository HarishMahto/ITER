import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) 
	{
		
		Scanner  sc=new Scanner(System.in);	      
	 	System.out.print(" Enter a String: " );    
	 	String str=sc.nextLine();
	 	System.out.print(" Enter a character: " );    
	 	String x=sc.nextLine();
	 	char a=x.charAt(0);
	 	System.out.print("There are "+ count(str,a)+" \'"+a+"\' in \'"+str+"\'." ); 
	 	
	}
	
	public static int count(String str,char a)
 	{
 		int n=0;
 		int c[] = new int[256]; 
 		for(int i=0;i<=str.length();i++)
 		{
 			c[str.charAt(i)]++;
 		}
 		char ch[] = new char[str.length()];  
 		for (int i = 0; i < str.length();i++)   
 		{  
 		ch[i] = str.charAt(i);    
 		for (int j = 0; j <= i; j++)   
 		{  
 		//if any matches found  
 		if (str.charAt(i) == a)  
 		n+=1;  
 		}             
 		return n;
 		}  
 		
 	}

}



