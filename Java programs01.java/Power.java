import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int n,p,result=1;

        Scanner obj =new Scanner(System.in);
        System.out.println("Enter Number :");
        n =obj.nextInt();

        System.out.println("Enter Power :");
        p =obj.nextInt();

        for (int i = 1; i <= p; i++) {
            result *= n;
            // System.out.println(result);
        }
        System.out.println(result);
    }
}
