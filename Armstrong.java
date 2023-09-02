import java.util.Scanner;
public class Armstrong {
   public static void main(String[] arg){
    int i,sum=0,r,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    n=sc.nextInt();
    int temp=n;
    while(n>0){
        r=n%10;
        n=n/10;
        sum=sum+r*r*r;
    }
    if(temp==sum){
    System.out.print("Given number is Armstrong number");
    }
    else{
        System.out.print("Given number is not a Armstrong number");
    }
   } 
}
