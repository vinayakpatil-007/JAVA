import java.util.Scanner;

public class Array_length {
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

        System.out.println("Array Length is :"+a.length);
    }
}
