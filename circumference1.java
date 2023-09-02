import java.io.*;
class Area
{
public void display()
{
float Area=pi*r*r;
System.out.println("Area of circle:"+Area);
}
}
class circumfernce extends Area
{
public void display1()
{
float circumference=2*pi*r;
System.out.println("circumfernce of circle:"+circumference);
}
}
class Circle
{
public static void main(String[] arg)
{
int r;
float pi,area,circumference;
Scanner sc=new Scanner(System.in);
System.out.print("pi:");
pi=sc.nextFloat();
System.out.print("r:");
r=sc.nextFloat();
circumference b=new circumference();
b.display();
b.display1();
}
}