import java.util.Scanner;
public class area
{
public static void main(String[] arg)
{
int r;
double pi=3.14,area,circumference;
Scanner sc=new Scanner(System.in);
System.out.print("Enter r:");
r=sc.nextInt();
area=pi*r*r;
circumference=2*pi*r;
System.out.print("Area of circle:"+area);
System.out.print("Area of circumference:"+circumference);
}
}
