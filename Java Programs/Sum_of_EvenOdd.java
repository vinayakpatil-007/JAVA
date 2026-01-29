import java.util.Scanner;

public class Sum_of_EvenOdd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = obj.nextInt();

        int i = 1;

        System.out.println("Even Numbers :");
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // reset i
        i = 1;

        System.out.println("Odd Numbers :");
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}


