import java.util.Scanner;
public class Main {
    int z=x+y;
    public static void main(String[] arg){
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the x:");
        x=sc.nextInt();
        System.out.print("Enter the Y:");
        y=sc.nextInt();
        Main obj=new Main();
        System.out.println(obj.z);
    }
}
