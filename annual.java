import java.util.Scanner;
public class annual
{
public static void main(String[] arg)
{
int tax,annualincome,a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the AnnualIncome:");
annualincome=sc.nextInt();
if(annualincome<500000){
System.out.print(annualincome*0/100);
}
else if(annualincome>500000 ||annualincome<750000){
System.out.print(annualincome*5/100);
}
else if(annualincome>750000||annualincome<1000000){
System.out.print(annualincome*10/100);
}
else if(annualincome>1000000||annualincome<150000){
System.out.print(annualincome*12/100);
}
else{
System.out.print(annualincome*20/100);
}
}
}