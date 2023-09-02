import java.util.Scanner;
public class interest {
    public static void main(String[] arg){
        int PA,time,r,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal amount:");
        PA=sc.nextInt();
        System.out.print("Enter the no.of.years:");
        time=sc.nextInt();
        System.out.print("Is customer senior citizen(y/n):");
        char g=input.next().charAt(0);
        if(g=='Y'||g=='y'){
            r=12;
            i=PA*time*r/100;
            System.out.print("Interest:"+i);
        }
        if(g=='N'||g=='n'){
            r=10;
            i=PA*time*r/100;
            System.out.print("Interest:"+i);
        }
    }
}
