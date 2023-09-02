import java.io.*;
import java.util.*;
public class reverse{
public static void main(String[] arg){
try{
int n,rem,re=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
n=sc.nextInt();
while(n>0)
{
rem=n%10;
re=re*10+rem;
n=n/10;
}
System.out.print("Reverse number is:"+re);
}
catch(Exception e)
{
System.out.print("Enter a valid number");
}
}
}