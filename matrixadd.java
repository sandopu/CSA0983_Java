import java.util.Scanner;
import java.util.Arrays;
public class matrixadd {
    public static void main(String[] arg){
        int i,j,m,n;
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of rows and columns:");
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.print("Enter the matrix1 elements:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the matrix2 elements:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.print("Addition of matrix:"+Arrays.deepToString(c));
    }
}
