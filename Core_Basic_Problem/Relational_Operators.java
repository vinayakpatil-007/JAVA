import java.util.Scanner;

public class Relational_Operators {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    System.out.println("Enter two number");
    int a = obj.nextInt();
    int b = obj.nextInt();

    System.out.println(a<b);
    System.out.println(a<=b);
    System.out.println(a>b);
    System.out.println(a>=b);
    System.out.println(a==b);
    System.out.println(a!=b);
    }
    
}