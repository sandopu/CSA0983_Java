import java.util.Scanner;
public class even
{
public static void main(String[] arg){
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
n=sc.nextInt();
if(n%2==0){
System.out.print("Given number is even");
}
else{
System.out.print("Given number is odd");
}
}
}