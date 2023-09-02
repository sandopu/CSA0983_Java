import java.util.Scanner;
public class username {
    public static void main(String[] arg){
        String str1,str2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the username:");
        str1=sc.nextLine();
        System.out.print("Reenter the username:");
        str2=sc.nextLine();
        if(str1.equals(str2)){
            System.out.print("Username is valid");
        }
        else{
            System.out.print("Username is Invalid");
        }
    }
}
