import java.util.Scanner;
public class subject {
    public static void main(String[] arg){
        int python,c,Mathematics,physics,Total;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks in python:");
        python=sc.nextInt();
        System.out.print("Enter the marks in c programming:");
        c=sc.nextInt();
        System.out.print("Enter the marks in mathematics:");
        Mathematics=sc.nextInt();
        System.out.print("Enter the marks in physics:");
        physics=sc.nextInt();
        Total=python+c+Mathematics+physics;
        double argg=Total/400*100;
        System.out.println("Total:"+Total);
        System.out.print("Aggregate:"+argg);
        if(argg>75){
              System.out.println("Distinction");
        }
        else if(argg>=60&&argg<75){
              System.out.println("First division");
        }
        else if(argg>=50&&argg<60){ 
            System.out.println("Second Division"); 
         } 
         else if(argg>=40&&argg<50){ 
            System.out.println("Third Division"); 
         } 
         else{ 
            System.out.println("Fail"); 
         } 
   
    }
}
