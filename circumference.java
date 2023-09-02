class Method
{
float area(float pi,int r,int y)
{
return pi*r*y;}
float circumference(int a,float pi,int x)
{
return a*pi*x;}
}
class circumference
{
public static void main(String[] arg)
{
Method m=new Method();
System.out.println(m.area(3.14f,22,22));
System.out.println(m.circumference(2,3.14f,22));
}
}

