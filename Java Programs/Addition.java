import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int a,b,sum;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter two Numbers :");
        a = r.nextInt();
        b = r.nextInt();
        sum = a+b;

        System.out.println("Sum =" +sum);

    }
}
