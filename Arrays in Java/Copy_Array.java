import java.util.Scanner;

public class Copy_Array {
    public static void main(String[] args) {
         int a[]=new int[5];

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Array Elements : ");

        for (int i = 0; i < a.length; i++) {
            a[i]=obj.nextInt();
        }

        System.out.println("Array Elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Copy Array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
