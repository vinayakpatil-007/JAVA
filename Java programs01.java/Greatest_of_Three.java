import java.util.Scanner;

public class Greatest_of_Three {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter any three numbers :");
        int a =obj.nextInt();
        int b =obj.nextInt();
        int c =obj.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.println("Greatest number is "+ a);
            }
            else{
                System.out.println("Greatest number is "+ c);
            }
        }
        else{
            if (b>c) {
                System.out.println("Greatest number is "+ b);
            }
            else{
                System.out.println("Greatest number is "+ c);
        }
        }
    }
}
