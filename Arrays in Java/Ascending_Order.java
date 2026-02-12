import java.util.Scanner;

public class Ascending_Order {
    public static void main(String[] args) {
        int a[] = new int[5];
        int temp;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Array Elements :");

        for (int i = 0; i < a.length; i++) {
            a[i]=obj.nextInt();
        }

        System.out.println("Elements are :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < a.length; i++) {

            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
            }
        }
        System.out.println("Ascending Order :");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

     
    }
}
