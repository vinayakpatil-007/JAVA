import java.util.*;
public class Array_Using_for {
    public static void main(String[] args) {
        int size;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        size =obj.nextInt();
        int a[] = new int[size];

        System.out.println("Enter Array Element :");

        for (int i = 0; i < size; i++) {
            a[i] = obj.nextInt();
        }

        System.out.println("Array Elements :");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}
