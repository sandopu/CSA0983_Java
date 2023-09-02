import java.util.Scanner;
public class righttri{
    public static void main(String[] arg){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of rows:");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=2*(n-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}