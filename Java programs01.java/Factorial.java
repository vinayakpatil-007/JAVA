import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1,n;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        n = obj.nextInt();
        int i = 1;
        while (i<=n) {
            fact*=i;
            i++;
        }

        System.out.println("Factorial of "+n+" is :"+fact);
    }
}
