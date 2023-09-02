import java.util.Scanner;
public class amount
{
public static void main(String[] arg)
{
int n1,n2,n3,n4;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no of 2000:");
n1=sc.nextInt();
System.out.print("Enter the no of 500:");
n2=sc.nextInt();
System.out.print("Enter the no of 200:");
n3=sc.nextInt();
System.out.print("Enter the no of 100:");
n4=sc.nextInt();
int total=n1*2000+n2*500+n3*200+n4*100;
System.out.print("total amount:"+total);
}
}