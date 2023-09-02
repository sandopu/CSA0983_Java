import java.util.Scanner;
public class Average
{
public static void main(String[] arg)
{
int Regno,average,m1,m2,bio,chem,english;
char Name,Grade;
Scanner sc=new Scanner(System.in);
Scanner a=new Scanner(System.in);
System.out.print("Enter the Student Name:");
String name=a.nextLine();
System.out.print("Enter the Student Reg.no:");
Regno=sc.nextInt();
System.out.print("Enter the m1 marks:");
m1=sc.nextInt();
System.out.print("Enter the m2 marks:");
m2=sc.nextInt();
System.out.print("Enter the bio marks:");
bio=sc.nextInt();
System.out.print("Enter the chem marks:");
chem=sc.nextInt();
System.out.print("Enter the english marks:");
english=sc.nextInt();
average=(m1+m2+bio+chem+english)/5;
if(m1<=50 && m2<=50 && bio <=50 && chem<=50 &&  english<=50){
if(average>90){
System.out.print("The student obtained S grade");
}
else if(average>81&&average<90){
System.out.print("The student obtained A 
+grade");
}
else if(average>71&&average<80){
System.out.print("The student obtained B grade");
}
else if(average>61&&average<70){
System.out.print("The student obtained C grade");
}
else if(average>50&&average<60){
System.out.print("The student obtained D grade");
}
else{
System.out.print("The student obtained F grade");
}
}
else{
System.out.print("not pass");
}
}
}
