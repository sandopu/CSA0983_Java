import java.util.Scanner;
import java.util.Arrays;
public class composite
{
public static void main(String[] arg)
{
int i=0,j=1,n,f=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the n:");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(i=0;i<n;i++){
for(j=1;j<a[i];j++){
if(a[i]%j==0){
f=f+1;
}
}
if(f<=2){
System.out.println("prime number:");
}
else{
System.out.println("given is composite");
}
}
}
}