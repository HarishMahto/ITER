
public class HQ4 {

    public static double[][] addMatrix(double[][] a, double[][] b){
        
        double c[][]=new double[a.length][b.length];
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<b[0].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        double[][]a={{2.0,4.5},{1.2,4}};
        double[][]b={{3.0,1.5},{3.5,6}};
        double[][]c=addMatrix(a, b);
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
