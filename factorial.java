import java.util.Scanner;
public class factorial {
    public static void main(String[] arg){
        int fact=1,i,N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num:");
        N=sc.nextInt();
        if(N<=0){
            System.out.print("Enter only positive number:");
        }
        else{
            for(i=1;i<=N;i++){
                fact=fact*i;
            }
            System.out.print("The factorial of given number is:"+fact);
        }
    }
}
