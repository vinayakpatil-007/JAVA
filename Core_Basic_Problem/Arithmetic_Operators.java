import java.util.Scanner;

public class Arithmetic_Operators {
    public static void main(String[] args) {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two Number :");
        a = obj.nextInt();
        b = obj.nextInt();

        System.out.println("Addition :"+(a+b));
        System.out.println("Substaction :"+(a-b));
        System.out.println("Multiphication :"+(a*b));
        System.out.println("Division :"+(a/b));
        System.out.println("Reminder :"+(a%b));
    }
}
