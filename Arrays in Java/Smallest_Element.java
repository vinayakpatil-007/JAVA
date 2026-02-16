import java.util.Scanner;

public class Smallest_Element {
    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter Array Elements :");
        for (int i = 0; i < a.length; i++) {
            a[i]=obj.nextInt();
        }
        int min =a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i]<min) {
                min =a[i];
            }
        }

        System.out.println("Minimum of :"+min);
    }
}
