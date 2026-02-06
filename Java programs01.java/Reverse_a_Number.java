import java.util.Scanner;

public class Reverse_a_Number {
    public static void main(String[] args) {
        int n,r;
        Scanner o = new Scanner(System.in);
        System.out.println("Enter a Number :");
        n=o.nextInt();

        while (n>0) {
            r=n%10;
            System.out.print(r);
            n=n/10;

        }
    }
}
