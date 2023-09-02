import java.util.Scanner;
public class squarepattern {
    public static void main(String[] arg){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of rows to print:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
