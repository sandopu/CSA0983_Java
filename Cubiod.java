import java.util.Scanner;
class Area
{
public void display()
{
double Area = 2 * (L * B + B * H + H * L);
System.out.println("Area of cubiod is:"+Area);
}
}
interface volume
{
public void display1()
{
double Volume = L * B * H;
System.out.println("Area of cubiod is:"+Area);
}
}
class Cuboid extends Area implements volume
{
public void display2()
{
System.out.println("Interface");
}
}
class Cubiod
{
public static void main(String arg[])
{
double L,B,H;
Scanner sc=new Scanner(System.in);
System.out.println("Length of cubiod:");
L=sc.nextDouble();
System.out.println("Breadth of cubiod:");
B=sc.nextDouble();
System.out.println("Height of cubiod:");
H=sc.nextDouble();
Cubiod s=new Cubiod();
s.display();
s.display1();
}
}