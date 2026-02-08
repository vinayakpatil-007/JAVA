import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        int n;
        Scanner o =new Scanner(System.in);
        System.out.println("Enter a Number :");
        n=o.nextInt();

        double s =Math.sqrt(n);
        System.out.println("Square Root of "+n+" is "+s);
    }
}
