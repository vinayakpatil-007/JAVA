import java.util.Scanner;

public class Array_Reverse {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Array :");

        for (int i = 0; i < a.length; i++) {
            a[i]=obj.nextInt();
        }
        System.out.println("Array elements are :");

        for (int i = a.length-1; i >0; i--) {
            System.out.println(a[i]);
        }
    }
}
