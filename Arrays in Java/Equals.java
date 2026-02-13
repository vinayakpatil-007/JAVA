import java.util.Arrays;
import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        int a[]=new int[5];
        int a2[]=new int[5];

        Scanner obj =new Scanner(System.in);
        System.out.println("Enter first Array Elements:");

        for (int i = 0; i < a2.length; i++) {
            a[i]= obj.nextInt();
        }

        System.out.println("Enter second Array Elements:");
        for (int i = 0; i < a2.length; i++) {
            a2[i]= obj.nextInt();
        }

        boolean b= Arrays.equals(a,a2);
        System.out.println("Does these arrays are equal :"+b );
    }
}
