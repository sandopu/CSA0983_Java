import java.util.Scanner;
public class reverseword {
    public static void main(String[] arg){
        String a,b="";
        int d=0;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        a=next();
        d=a.length();
        for(i=d-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.print(b);
    }
}
