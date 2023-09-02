import java.util.Scanner;
import java.util.Arrays;
public class matrixmul {
    public static void main(String[] arg){
        int i,j,k,n,m;
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of rows and columns:");
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.print("Enter the elements of Matrix1:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }    
        System.out.print("Enter the elements of Matrix2:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                b[i][j]=sc.nextInt();    
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                for(k=0;k<n;k++){
                    c[i][j]=a[i][i]*b[i][j];
                }
            }
            System.out.print("Multiplication of matrix:"+Arrays.deepToString(c));
        }
    }
}
