import java.util.Scanner;
class Area{
    int r;
    public void display(int r)
    {
        double c=3.14*r*r;
        System.out.println("Area of Circle:"+c);
    }
}
class Circ{
    int r;
    public void display1(int r)
    {
        double c=2*3.14*r;
        System.out.println("circum of circle:"+c);
    } 
}       
class Circle{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius:");
        int r=sc.nextInt();
        Area a=new Area();
        a.r=r;
        a.display(r);
        Circ b=new Circ();
        b.r=r;
        b.display1(r);


    }
}
