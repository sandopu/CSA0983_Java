import java.util.Scanner;

public class fibonacci {

    public static void main(String[] arg) {
        int t1 = 0, t2 = 1, i, n, a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Series till number:");
        n = sc.nextInt();

        for (i = 0; i < n - 1; i++) {
            a = t1 + t2;
            t1 = t2;
            t2 = a;
        }

        System.out.print("Fibonacci Series:" + a);
    }
}
