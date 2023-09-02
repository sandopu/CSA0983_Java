import java.util.Scanner;
public class numberMtoN {
    public static void main(String[] arg){
        int M,N,K,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter M:");
        M=sc.nextInt();
        System.out.print("Enter N:");
        N=sc.nextInt();
        System.out.print("Enter K:");
        K=sc.nextInt();
        for(i=M;i<N;i++){
            M+=K+1;
        }
        if(M<N){
        System.out.print(M);
        }
    }
}
