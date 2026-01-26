import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = n.nextInt();

        if (age>18) {
            System.out.println("you are Eligible for vote");
        }

        else{
            System.out.println("you are not Eligible for vote");
        }

    }
}
