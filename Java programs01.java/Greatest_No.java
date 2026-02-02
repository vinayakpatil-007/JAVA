import java.util.Scanner;

public class Greatest_No {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter any two numbers :");
        int a =obj.nextInt();
        int b =obj.nextInt();

        if (a>b) {
            System.out.println("Greatest number is "+ a);
        }
        else{
            System.out.println("Greatest number is "+ b);
        }
    }
}
