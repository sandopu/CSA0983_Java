import java.util.Scanner;
public class vote {
    public static void main(String[] arg){
        int age,a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the age:");
        age=sc.nextInt();
        if(age>18){
            System.out.print("You are allowed to vote");
        }
        else{
            a=18-age;
            System.out.print("Your are allowed to vote after"+a);
        }
    }
}
