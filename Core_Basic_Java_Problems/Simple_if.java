import java.util.Scanner;

public class Simple_if {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = obj.nextInt();

        if (age>=18) {
            System.out.println("Eligible for vote ");
        }
    }
}
