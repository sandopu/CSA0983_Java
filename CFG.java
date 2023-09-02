import java.util.Scanner;
class CFG{
static void checkTriangle(int x, int y, int z)
{
if (x == y && y == z )
System.out.println("Equilateral Triangle");
else if (x == y || y == z || z == x )
System.out.println("Isosceles Triangle");
else
System.out.println("Scalene Triangle");
}
public static void main(String[] args)
{
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("x=");
x=sc.nextInt();
System.out.println("y=");
y=sc.nextInt();
System.out.println("z=");
z=sc.nextInt();
	
	checkTriangle(x, y, z);
}
}
