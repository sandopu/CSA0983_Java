public class DecimalToBinary{    
public static void toBinary(int decimal){
int decimal;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the decimal value:");
decimal=sc.nextInt();  
     int binary[] = new int[n];    
     int index = 0;    
     while(decimal > 0){    
       binary[index++] = decimal%2;    
       decimal = decimal/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }     
}    
}      
