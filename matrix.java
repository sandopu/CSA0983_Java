import java.util.Arrays;
import java.util.Scanner;
public class matrix {
 public static void main(String[] arg){
    int i,j,n,m,k;
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
     int c[][]=new int[3][3];
     int d[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the no.of rows and coloums:");
    n=sc.nextInt();
    m=sc.nextInt();
    System.out.print("Enter the Matrix1 elements:");
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            a[i][j]=sc.nextInt();
        }
    }
    System.out.print("Enter the Matrix2 elements:");
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
System.out.println("Addition of two matrix:"+Arrays.deepToString(c));
  for(i=0;i<3;i++){
for(j=0;j<3;j++){
    for(k=0;k<n;k++){
d[i][j]=a[i][k]*b[k][j];
}
}
}
System.out.println("Addition of two matrix:"+Arrays.deepToString(d));
 }   
}
