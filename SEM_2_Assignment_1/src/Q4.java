
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'C','A','R','B','O','N'};
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				for(int k=0;k<ch.length;k++)
				{
					for(int l=0;l<ch.length;l++)
					{
						for(int m=0;m<ch.length;m++)
						{
							for(int n=0;n<ch.length;n++)
							{
								if (i!=j &&  i!=k && i!=l && i!=m && i!=n && j!=k && j!=l && j!=m && j!=n && k!=l && k!=m && k!=n && l!=m && l!=n && m!=n )
								{
									System.out.println(ch[i]+""+ch[j]+""+ch[k]+""+ch[l]+""+ch[m]+""+ch[n]);
								}
							}
						}
					}
				}
			}
		}

	}

}
