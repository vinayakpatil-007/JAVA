import java.util.Arrays;
import java.util.Scanner;

public class Copyoff_Array {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner obj =new Scanner(System.in);

        System.out.println("Enter Array Elements");
        for (int i = 0; i < a.length; i++) {
            a[i]=obj.nextInt();
        }

        System.out.println("Array Elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int a2[]=Arrays.copyOf(a,5);

        System.out.println("After copy :");
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
    }
}
