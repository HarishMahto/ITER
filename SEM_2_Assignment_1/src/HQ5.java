
public class HQ5 {

	public static void main(String[] args) {
		int[][]a=new int[4][4];
		for(int i=0;i<4;i++){
		    for(int j=0;j<4;j++){
			a[i][j]=(int)(Math.random()*2);
			System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		int[]rs=new int[4];
		for(int i=0;i<4;i++){
		    int rsum=0;
		    for(int j=0;j<4;j++){
			rsum+=a[i][j];
		    }
		    rs[i]=rsum;
		}
		System.out.println("The largest row index: "+largestIndex(rs));
		int[]cs=new int[4];
		for(int i=0;i<4;i++){
		    int csum=0;
		    for(int j=0;j<4;j++){
			csum+=a[j][i];
		    }
		    cs[i]=csum;
		}
		System.out.println("The largest column index: "+largestIndex(cs));
        

    	}
	
    	public static int largestIndex(int[] a){
		int max=a[0],mi=0;
		for(int i=0;i<4;i++){
		    if(a[i]>max){
			max=a[i];
			mi=i;
		    }
		}
		return mi;
	}
}
