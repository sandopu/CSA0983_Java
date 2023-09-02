import java.util.Scanner;
public class leap {
    public static void main(String[] arg){
        int date,month,year;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Date:");
        date=sc.nextInt();
        System.out.print("Enter the month:");
        month=sc.nextInt();
        System.out.print("Enter the year:");
        year=sc.nextInt();
        System.out.print("The entered date:"+date+"/"+month+"/"+year);
        if((date<=31)&&(date>0)&&(month<=12)&&(month>0)){
            if(year%4==0){
                System.out.print("Given year is Leap Year");
            }
            else{
                System.out.print("Given year is Non Leap Year");
            }
        }
        else{
            System.out.print("Enter the valid Date&month");
            }
    }
}
