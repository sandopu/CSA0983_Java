import java.util.Scanner;
public class rigtpattern {
    public static void main(String[] arg){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of rows:");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
