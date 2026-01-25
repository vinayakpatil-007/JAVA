import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        // int max = (5<10)?10:5;
        // System.out.println(max);

        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Three NO.");
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();

        int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);
    }
}

