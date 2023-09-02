import java.util.Scanner;
public class sqrcub {
    public static void main(String[] arg){
    double n,sq,cb;
    Scanner sc=new Scanner(System.in);
    System.out.print("Given number:");
    n=sc.nextDouble();
    sq=n*n;
    cb=n*n*n;
    System.out.println("Square Number:"+sq);
    System.out.println("Cube Number:"+cb);
    }
}
