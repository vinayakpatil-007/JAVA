import java.util.Arrays;
import java.util.Scanner;

public class Arraysclass_Methods02 {
    
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter Array Element :");

        for (int i = 0; i < a.length; i++) {
            a[i]=obj.nextInt();
        }

        System.out.println("Array Elements are :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Arrays.sort(a);

        System.out.println("Sorted Array Elements are :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


        
    }
}
