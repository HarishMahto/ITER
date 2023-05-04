
public class Q4_alternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="CARBON",aux="";
		solve(aux,str);
	}

	static void solve(String str, String aux)
	{
		int n=str.length();
		if(n==0)
		{
			System.out.println(aux);
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				solve(aux+str.charAt(i),str.substring(i+1,n)+str.substring(0, i));
			}
		}
	}
}
